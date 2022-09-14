package phuc.com.shoponline.repository.oderCart;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import phuc.com.shoponline.model.oder.Oder;

public interface IOderCartRepository extends JpaRepository<Oder, Integer> {
    @Query(value = "select  oder.* from oder join bill b on b.`id` = oder.id_bill " +
            " join customer c on c.id = oder.id_customer " +
            " join product p on p.id = oder.id_product ",nativeQuery = true,
            countQuery = "select count(*) from (select  oder.* from oder join bill b on b.id = oder.id_bill" +
                    " join customer c on c.id = oder.id_customer " +
                    " join product p on p.id = oder.id_product) as oderCart")
    Page<Oder> getAllOderCart(Pageable pageable);
}
