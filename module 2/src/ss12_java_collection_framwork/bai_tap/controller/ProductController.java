package ss12_java_collection_framwork.bai_tap.controller;

import ss12_java_collection_framwork.bai_tap.service.ProductManager;

import java.util.Scanner;

public class ProductController {
    Scanner scanner = new Scanner(System.in);
    ProductManager productManager = new ProductManager();

    public void Display() {

        while (true) {
            System.out.println("please choose\n" +
                    "1.add product\n" +
                    "2.edit Product of id\n" +
                    "3.Delete Product of id\n" +
                    "4.display product\n" +
                    "5.searchProduct of name\n" +
                    "6.sortProduct \n " +
                    "7.exit");
            System.out.println("please choose");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.editProductOfId();
                    break;
                case 3:
                    productManager.deleteProductById();
                    break;
                case 4:
                    productManager.displayProduct();
                    break;
                case 5:
                    productManager.searchProduct();
                    break;
                case 6:
                    productManager.sortProduct();
                    break;
                case 7:
                    System.exit(0);


            }

        }
    }
}
