package phuc.com.shoponline.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import phuc.com.shoponline.model.bill.Bill;
import phuc.com.shoponline.model.customer.Customer;
import phuc.com.shoponline.model.oder.Oder;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class PaymentDto {
    private List<Oder> productOrderList;
    private Customer customer;
    private Bill bill;
}
