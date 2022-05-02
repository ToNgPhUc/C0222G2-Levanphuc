package ss17_io_binary_file_serialization.bai_tap.controller;

import ss17_io_binary_file_serialization.bai_tap.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productManager = new ProductService();

    public void diplayProductController() {

        while (true) {
            System.out.println(" menu");
            System.out.println("1.add product" + "\n"
                    + "2.display product" + "\n"
                    + "3.search product" + "\n");
            System.out.println("xin mời chọn: ");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.display();
                    break;
                case 3:
                    productManager.search();
                    break;
            }
            System.out.println();
        }

    }
}
