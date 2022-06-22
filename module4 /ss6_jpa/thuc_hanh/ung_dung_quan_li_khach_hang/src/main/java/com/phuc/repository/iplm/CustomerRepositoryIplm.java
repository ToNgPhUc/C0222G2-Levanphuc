package com.phuc.repository.iplm;

import com.phuc.model.Customer;
import com.phuc.repository.BaseRepository;
import com.phuc.repository.ICustomerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class CustomerRepositoryIplm implements ICustomerRepository {

    @Override
    public List findAll() {
        TypedQuery<Customer> typedQuery =
                BaseRepository.entityManager.createQuery("select c from Customer c", Customer.class);
        return typedQuery.getResultList();
    }

    @Override
    public Object findById(Long id) {
        return null;
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public void remove(Long id) {

    }
}
