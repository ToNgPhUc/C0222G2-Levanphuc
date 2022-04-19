package ss12_java_collection_framwork.bai_tap.service;

import ss12_java_collection_framwork.bai_tap.model.Product;

import java.util.*;

public class ProductManager implements IProductManager {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> listProduct = new ArrayList<>();

    static {
        listProduct.add(new Product(7, "PHUC1", 55));
        listProduct.add(new Product(2, "PHUC2", 555));
        listProduct.add(new Product(3, "PHUC3", 568));
        listProduct.add(new Product(4, "PHUC4", 575));
    }

    @Override
    public void addProduct() {
        System.out.print("enter id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println("enter weight");
        double weight = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, weight);
        listProduct.add(product);
    }

    @Override
    public void editProductOfId() {
        boolean flag = false;
        System.out.println("enter id");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("enter id");
            int id1 = Integer.parseInt(scanner.nextLine());
            System.out.println("enter name");
            String name = scanner.nextLine();
            System.out.println("enter weight");
            double weight = Double.parseDouble(scanner.nextLine());
            Product product = new Product(id1, name, weight);
            for (int i = 0; i < listProduct.size(); i++) {
                if (id == listProduct.get(i).getId()) {
                    listProduct.set(i, product);
                    break;
                }
            }
        }
    }

    @Override
    public void deleteProductById() {
        System.out.println("enter id");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == (listProduct.get(i).getId())) {
                listProduct.remove(i);
                System.out.print(listProduct);
                System.out.println("xoas thanh cong");
                break;
            }
        }
    }

    @Override
    public void displayProduct() {
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {
        System.out.println("enter name");
        String name = scanner.nextLine();
        for (int i = 0; i < listProduct.size(); i++) {
            if (name.contains(listProduct.get(i).getName())) {
                System.out.println(listProduct.get(i));
            }
            System.out.println("name: " + name + " no of listProduct");
            break;
        }
    }
    
    @Override
    public void sortProduct() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                return product1.getId() - product2.getId();
            }
        });
    }
}
