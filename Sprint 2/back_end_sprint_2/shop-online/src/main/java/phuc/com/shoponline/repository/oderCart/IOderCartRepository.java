package phuc.com.shoponline.repository.oderCart;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import phuc.com.shoponline.model.customer.Customer;
import phuc.com.shoponline.model.oder.Oder;

import java.util.List;

public interface IOderCartRepository extends JpaRepository<Oder, Integer> {


    @Query(value = "select  o.* from oder o " +
            " join customer c on c.id = o.id_customer " +
            " join product p on p.id = o.id_product where o.id_customer = c.id ", nativeQuery = true,
    countQuery = "select count(*) from (select  o.* from oder o " +
            " join customer c on c.id = o.id_customer " +
            " join product p on p.id = o.id_product where o.id_customer = c.id ) as abc")
    Page<Oder> getAllOderCartByCustomer(Pageable pageable);


    /**
     * phương thức thêm product vào bảng oder
     * @param productOrder
     * @return
     */

    @Query(value = " select o.* from oder o " +
            " join customer c on c.`id` = o.id_customer " +
            " join product p on p.`id` = o.id_product " +
            " where o.id_customer = :#{#productOrder.customer.id} and o.id_product = :#{#productOrder.product.id}" +
            " and o.id_bill is null ", nativeQuery = true)
    Oder findProductOrderListByCustomerAndProduct(Oder productOrder);


    /**
     * lấy danh sách oder dựa vào customer
     * @param customer
     * @return
     */

    @Query(value = " select o.* from oder o " +
            " join customer c on c.id = o.id_customer " +
            " join product p on p.id = o.id_product " +
            " where o.id_customer = :#{#customer.id} and id_bill is null ", nativeQuery = true)
    List<Oder> getProductInCardByCustomer(Customer customer);

    @Modifying
    @Transactional
    @Query(value = " UPDATE `oder` SET `id_bill` = :billId WHERE (`id_customer` = :customerId) and `id_bill` is null ", nativeQuery = true)
    void setBill(@Param("customerId") Integer customerId, @Param("billId") Integer billId);

}

