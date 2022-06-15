package repository.customer;

import model.customer.Customer;
import model.customer.CustomerType;

import java.util.List;

public interface ICustomerRepository {
    
    List<Customer> getAllCustomer();

    void create(Customer customer);

    void edit(Customer customer);

    void delete(int customerId);

    List<CustomerType> getAllCustomerType();

    List<Customer> SearchCustomerByName(String customerSearch);

    Customer FindById(int customerId);
}
