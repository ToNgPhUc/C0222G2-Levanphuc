package phuc.com.shoponline.model.product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "text")
    private String image;
    private String code;
    private String name;
    private Double price;
    @Column(columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;
    @Column(columnDefinition = "text")
    private String specification;
    @Column(columnDefinition = "text")
    private String productDescription;
    private String origin;
    private Integer quantity;
    private Date creationDate;
    @ManyToOne
    @JoinColumn(name = "id_type_product",referencedColumnName = "id")
    private TypeProduct typeProduct;
}
