package service.customer;

import model.customer.Customer;
import model.customer.CustomerType;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomer();

    void create(Customer customer);

    void edit(Customer customer);

    void delete(int customerId);

    List<CustomerType> getAllCustomerType();

    List<Customer> searchCustomerByName(String customerSearch);

    Customer FindById(int customerId);
}
