package phuc.com.shoponline.model.product;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class TypeProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    @OneToMany(mappedBy = "typeProduct")
    private List<Product>productList;
}
