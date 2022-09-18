package phuc.com.shoponline.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import phuc.com.shoponline.model.bill.Bill;
import phuc.com.shoponline.model.customer.Customer;
import phuc.com.shoponline.model.product.Product;

@Getter
@Setter
@RequiredArgsConstructor
public class OderDto {
    private Integer quantity;
    private String code;
    private Bill bill;
     private Customer customer;
     private Product product;
}
