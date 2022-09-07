package phuc.com.shoponline.model.product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    private Double price;
    private String email;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;
    @ManyToOne
    @JoinColumn(name = "id_type_product",referencedColumnName = "id")
    private TypeProduct typeProduct;
}
