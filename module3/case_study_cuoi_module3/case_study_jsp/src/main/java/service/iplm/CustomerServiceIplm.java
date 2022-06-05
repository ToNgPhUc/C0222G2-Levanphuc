package service.iplm;

import model.Customer;
import repository.ICustomerRepository;
import repository.iplm.CustomerRepositoryIplm;
import service.ICustomerService;

import java.util.List;

public class CustomerServiceIplm implements ICustomerService {
    ICustomerRepository iCustomerRepository= new CustomerRepositoryIplm();
    @Override
    public List<Customer> getAllCustomer() {
        return iCustomerRepository.getAllCustomer();
    }

    @Override
    public void create(Customer customer) {
        iCustomerRepository.create(customer);
    }
}
