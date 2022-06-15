package service.customer.iplm;

import model.customer.Customer;
import model.customer.CustomerType;
import repository.customer.ICustomerRepository;
import repository.customer.iplm.CustomerRepositoryIplm;
import service.customer.ICustomerService;

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

    @Override
    public void edit(Customer customer) {
        iCustomerRepository.edit(customer);
    }

    @Override
    public void delete(int customerId) {
        iCustomerRepository.delete(customerId);
    }

    @Override
    public List<CustomerType> getAllCustomerType() {
        return iCustomerRepository.getAllCustomerType();
    }

    @Override
    public List<Customer> searchCustomerByName(String customerSearch) {

        return iCustomerRepository.SearchCustomerByName(customerSearch);
    }

    @Override
    public Customer FindById(int customerId) {
        return iCustomerRepository.FindById( customerId);
    }

}
