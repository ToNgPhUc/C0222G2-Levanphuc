package phuc.com.shoponline.model.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import phuc.com.shoponline.model.oder.Oder;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

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
    @Column(columnDefinition = "double default 0")
    private Double discountPercent;
    @ManyToOne
    @JoinColumn(name = "id_type_product",referencedColumnName = "id")
    private TypeProduct typeProduct;
    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private  List<Oder> oderList;


}
