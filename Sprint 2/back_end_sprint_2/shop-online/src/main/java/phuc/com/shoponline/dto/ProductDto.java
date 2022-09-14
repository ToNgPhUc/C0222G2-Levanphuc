package phuc.com.shoponline.dto;

import lombok.Data;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import phuc.com.shoponline.model.product.Product;
import phuc.com.shoponline.model.product.TypeProduct;


import java.sql.Date;
import java.util.List;

@Data
public class ProductDto implements Validator {

    private Integer id;
    private String code;
    private String name;
    private Double price;
    private Boolean isDeleted;
    private String image;
    private String specification;
    private String productDescription;
    private String origin;
    private Integer quantity;
    private Date creationDate;
    private TypeProduct typeProduct;
    private List<Product> productList;

    public ProductDto() {
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ProductDto productDto = (ProductDto) target;
        List<Product> productList = this.getProductList();

        if (!productList.isEmpty()) {
            for (Product product : productList) {
                if (product.getCode().equals(productDto.getCode())) {
                    errors.rejectValue("code", "", "codeExists");
                    break;
                }
            }
        }
    }
}
