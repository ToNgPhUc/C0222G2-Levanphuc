package phuc.com.shoponline.model.oder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import phuc.com.shoponline.model.bill.Bill;
import phuc.com.shoponline.model.customer.Customer;
import phuc.com.shoponline.model.product.Product;

import javax.persistence.*;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Oder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quantity;
    private String code;
    @ManyToOne
    @JoinColumn(name = "id_bill",referencedColumnName = "id")
    private Bill bill;
    @ManyToOne
    @JoinColumn(name = "id_customer",referencedColumnName = "id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "id_product",referencedColumnName = "id")
    private Product product;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;
}
