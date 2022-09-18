package phuc.com.shoponline.service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phuc.com.shoponline.model.customer.Customer;
import phuc.com.shoponline.repository.customer.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public Customer getCustomerByUsername(String username) {
        return this.iCustomerRepository.getCustomerByUsername(username);
    }
}
