package phuc.com.shoponline.repository.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import phuc.com.shoponline.model.customer.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select c.* from customer c join app_user on c.user_id = app_user.id " +
            " where user_name = :userName",nativeQuery = true)
    Customer getCustomerByUsername(@Param("userName") String username);
}
