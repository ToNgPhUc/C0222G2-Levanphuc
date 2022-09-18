package phuc.com.shoponline.service.customer;

import phuc.com.shoponline.model.customer.Customer;

public interface ICustomerService {
    Customer getCustomerByUsername(String username);
}
