package ss17_io_binary_file_serialization.bai_tap.service;

import ss17_io_binary_file_serialization.bai_tap.common.WriteAndRead;
import ss17_io_binary_file_serialization.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProduct {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();

    static {
        Product product1= new Product(1,"xeOto1","toyota",1000);
//        Product product2= new Product(2,"xeOto2","toyota",10000);
//        Product product3= new Product(5,"xeOto3","toyota",100000);


        products.add(product1);
//        productList.add(product2);
//        productList.add(product3);
        System.out.println(products);
        WriteAndRead.writerFile(products);
    }


    @Override
    public void add() {

        System.out.println("nhập mã sản phẩm: ");
        int maSanPham1 = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm: ");
        String tenSanPham1 = scanner.nextLine();
        System.out.println("nhập hãng sản xuất: ");
        String hangSanXuat1 = scanner.nextLine();
        System.out.println("nhập giá sản phẩm: ");
        Integer gia1 = Integer.valueOf(scanner.nextLine());

        Product product = new Product(maSanPham1,tenSanPham1,hangSanXuat1,gia1);
        products.add(product);

        WriteAndRead.writerFile(products);


    }

    @Override
    public void display() {
        products =WriteAndRead.readFile();
        for (Product s : products) {
            System.out.print(s);
        }
    }
    @Override
    public void search() {

            products =WriteAndRead.readFile();
            System.out.println("nhập mã sản phẩm: ");
            int maSanPham = Integer.valueOf(scanner.nextLine());

            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getMaSanPham() == maSanPham) {
                    System.out.println(products.get(i));

                }
            }


    }

}