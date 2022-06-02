package repository.iplm;

import model.Product;
import repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryIplm implements IProductRepository {
    private static final List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1, "xe máy", 100.0, "màu trắng", "toyota"));
        products.add(new Product(2, "xe tải", 200.0, "màu vàng", "honda"));
        products.add(new Product(3, "xe ô tô", 300.0, "màu xanh", "yamaha"));
        products.add(new Product(4, "xe đạp", 400.0, "màu tím", "toyota"));
    }

    @Override
    public List<Product> getAllProduct() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public void edit(Integer id, Product product) {
        int index=0;
        for (int i = 0; i < products.size(); i++) {
            if (id==products.get(i).getId()){
                index=i;
            }
        }
        products.set(index,product);
//        for (int i = 0; i < products.size(); i++) {
//            if (id==products.get(i).getId()){
//                products.get(i).setName(product.getName());
//                products.get(i).setPrince(product.getPrince());
//                products.get(i).setDescribe(product.getDescribe());
//                products.get(i).setManufacturer(product.getManufacturer());
//            }
//        }

    }

    @Override
    public Product findById(Integer id) {
        for (Product product:products) {
            if (id==product.getId()){
                return product;
            }
        }
        return null;
    }

}
