package phuc.com.shoponline.service.oderCart;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import phuc.com.shoponline.dto.ErrorDto;
import phuc.com.shoponline.dto.PaymentDto;
import phuc.com.shoponline.model.customer.Customer;
import phuc.com.shoponline.model.oder.Oder;

import java.util.List;

public interface IOderCartService {
    Page<Oder> getAllOderCartByCustomer(Pageable pageable);

    List<Oder> getProductInCardByCustomer(Customer customer);

    ErrorDto saveOrder(Oder productOrder);


    Boolean minusQuantity(Oder productOrder);

    Boolean plusQuantity(Oder productOrder);

    Boolean findProductOrder(Oder productOrder);

    PaymentDto goPayment(Customer customer);

    Page<Oder> getHistoryOder(Pageable pageable ,Customer customer);


    //    Oder save(Oder oder);

//    ErrorDto saveOrder(Oder productOrder);
}
