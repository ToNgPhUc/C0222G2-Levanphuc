package phuc.com.shoponline.service.oderCart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import phuc.com.shoponline.dto.ErrorDto;
import phuc.com.shoponline.dto.PaymentDto;
import phuc.com.shoponline.model.bill.Bill;
import phuc.com.shoponline.model.customer.Customer;
import phuc.com.shoponline.model.oder.Oder;
import phuc.com.shoponline.model.product.Product;
import phuc.com.shoponline.repository.bill.IBillRepository;
import phuc.com.shoponline.repository.oderCart.IOderCartRepository;
import phuc.com.shoponline.repository.product.IProductRepository;

import java.sql.Date;
import java.util.List;

@Service
public class OderCartService implements IOderCartService{
    @Autowired
    private IOderCartRepository iOderCartRepository;
    @Autowired
    private IBillRepository billRepository;

    @Autowired
    private IProductRepository productRepository;
    @Override
    public Page<Oder> getAllOderCartByCustomer(Pageable pageable) {
        return this.iOderCartRepository.getAllOderCartByCustomer(pageable);
    }
    @Override
    public List<Oder> getProductInCardByCustomer(Customer customer) {
        return this.iOderCartRepository.getProductInCardByCustomer(customer);
    }

        @Override
    public ErrorDto saveOrder(Oder productOrder) {
            ErrorDto errorDto = new ErrorDto();
            productOrder.setIsDeleted(false);
        Oder po = this.iOderCartRepository.findProductOrderListByCustomerAndProduct(productOrder);
        if (po == null) {
            if (productOrder.getQuantity() > productOrder.getProduct().getQuantity()) {
                errorDto.setMessage("quantity");
                errorDto.setOder(po);
                return errorDto;
            } else {
                this.iOderCartRepository.save(productOrder);
            }
        } else {
            if ((po.getQuantity() + productOrder.getQuantity()) > productOrder.getProduct().getQuantity()) {
                errorDto.setMessage("quantity");
                errorDto.setOder(po);
                return errorDto;
            } else {
                po.setQuantity(productOrder.getQuantity() + po.getQuantity());
                this.iOderCartRepository.save(po);
            }
        }
        return errorDto;
    }

    @Override
    public Boolean minusQuantity(Oder productOrder) {
        if (productOrder.getQuantity() > 1) {
            productOrder.setQuantity(productOrder.getQuantity() - 1);
            this.iOderCartRepository.save(productOrder);
            return true;
        }
        return false;
    }

    @Override
    public Boolean plusQuantity(Oder productOrder) {
        if (productOrder.getQuantity() < productOrder.getProduct().getQuantity()) {
            productOrder.setQuantity(productOrder.getQuantity() + 1);
            this.iOderCartRepository.save(productOrder);
            return true;
        }
        return false;
    }

    @Override
    public Boolean findProductOrder(Oder productOrder) {
        Oder po = this.iOderCartRepository.findById(productOrder.getId()).orElse(null);
        if (po != null) {
            this.iOderCartRepository.delete(productOrder);
            return true;
        }
        return false;
    }

    @Transactional
    @Override
    public PaymentDto goPayment(Customer customer) {
        List<Oder> productOrderList = this.iOderCartRepository.getProductInCardByCustomer(customer);
        List<Bill> billList = this.billRepository.findAll();
        int randomCode = this.getRandomNumber(billList);
        Bill bill = new Bill();
        bill.setCode(String.valueOf(randomCode));
        bill.setOderList(productOrderList);
        bill.setIsDeleted(false);
        bill.setCreationDate(new Date(System.currentTimeMillis()));
        this.billRepository.save(bill);
        Bill billReturn = this.billRepository.getBillByCode(randomCode);
        this.iOderCartRepository.setBill(customer.getId(), billReturn.getId());
        PaymentDto paymentDto = new PaymentDto();
        paymentDto.setBill(billReturn);
        paymentDto.setProductOrderList(productOrderList);
        paymentDto.setCustomer(customer);
        for (Oder productOrder: productOrderList) {
            this.productRepository.updateQuantity(productOrder.getQuantity(), productOrder.getProduct().getId());
            Product product = this.productRepository.getById(productOrder.getProduct().getId());
            if (product.getQuantity() <= 1) {
                this.productRepository.updateIsDeleted(product.getId());
            }
        }
        return paymentDto;
    }



    private int getRandomNumber(List<Bill> billList) {
        int randomNumber = 10000;
        while (checkExists(billList, randomNumber)) {
            randomNumber = (int) ( (Math.random() * 89999) + 10001);
        }
        return randomNumber;
    }

    private boolean checkExists(List<Bill> billList, int randomNumber) {
        for (Bill bill : billList) {
            if (Integer.parseInt(bill.getCode()) == randomNumber) {
                return true;
            }
        }
        return false;
    }
//    @Override
//    public Oder save(Oder oder) {
//        return this.iOderCartRepository.saveOder(oder);
//    }

}
