package service.impl;

import model.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceIplm implements ICustomerService {
    private static Map<Integer, Customer> customers;
    ICustomerRepository customerRepository = new CustomerRepository();

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(2, "phúc1", "p@", "quảng bình"));
        customers.put(2, new Customer(4, "phúc2", "p@", "quảng bình"));
        customers.put(3, new Customer(6, "phúc3", "p@", "quảng bình"));
        customers.put(4, new Customer(8, "phúc4", "p@", "quảng bình"));
        customers.put(5, new Customer(10, "phúc5", "p@", "quảng bình"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
customers.remove(id);
    }
}
