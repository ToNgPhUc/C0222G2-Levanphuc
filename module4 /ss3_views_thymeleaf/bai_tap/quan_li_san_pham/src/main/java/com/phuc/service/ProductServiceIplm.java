package com.phuc.service;

import com.phuc.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceIplm implements IProductService{
private static final Map<Integer,Product> productList;
static {
    productList= new HashMap<>();
    productList.put(1,new Product(1,"xe máy",10000.0,"màu tím","yamaha"));
    productList.put(2,new Product(2,"xe đạp",1000.0,"màu hồng","toyota"));
    productList.put(3,new Product(3,"máy bay",10000.0,"màu nâu","mercedes"));
    productList.put(4,new Product(4,"ô tô",100.0,"màu vàng","aaaaa"));
    productList.put(5,new Product(5,"tàu điện",100.0,"màu đỏ","yamaha"));
}

    @Override
    public Product findById(int idProduct) {
        return productList.get(idProduct);
    }

    @Override
    public List<Product> finAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getIdProduct(),product);
    }

    @Override
    public void edit(Integer idProduct, Product product) {
        productList.put(idProduct,product);
    }

    @Override
    public void delete(Integer idProduct) {
        productList.remove(idProduct);
    }

    @Override
    public List<Product> searchByName(String nameProduct) {
List<Product>productList1= new ArrayList<>();
        for (Product product:productList.values()) {
            if (nameProduct.contains(product.getNameProduct())){
           productList1.add(product);
            }
        }
        return productList1;
    }


}
//    private Integer idProduct;
//    private String nameProduct;
//    private Double priceProduct;
//    private String describeProduct;
//    private String producerProduct;
