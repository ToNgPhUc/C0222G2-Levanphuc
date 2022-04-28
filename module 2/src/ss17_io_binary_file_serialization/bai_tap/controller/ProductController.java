package ss17_io_binary_file_serialization.bai_tap.controller;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productManager = new ProductService();

//    public void diplayProductController() {
//
//        while (true) {
//            System.out.println("danh sách menu");
//            System.out.println("1.add" + "\n"
//                    + "2.display" + "\n"
//                    + "3.search" + "\n");
//            System.out.println("mời mọi người chọn: ");
//            int choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1:
//                    productManager.add();
//                    break;
//                case 2:
//                    productManager.display();
//                    break;
//                case 3:
//                    productManager.search();
//                    break;
//            }
//            System.out.println();
//        }
//
//    }
}
