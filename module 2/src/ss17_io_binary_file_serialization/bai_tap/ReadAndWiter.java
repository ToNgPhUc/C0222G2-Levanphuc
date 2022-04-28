package ss17_io_binary_file_serialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWiter {
    private static List<Product> product = new ArrayList<>();
    private final static String FILE = "ss17_io_binary_file_serialization/bai_tap/Product.csv";

    private static void writerToFile(String file, List<Product> product) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readDataFromFile(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            product = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return product;
    }

    public static void main(String[] args) {
        ReadAndWiter readAndWiter = new ReadAndWiter();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("1.Display Product \n" +
                    "2.Add new Product \n" +
                    "3.Search Product\n" +
                    "4.Exit \n" +
                    "Enter Choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    product = readAndWiter.readDataFromFile(FILE);
                case 2:
                case 3:
                case 4:
                    System.exit(0);
            }
        }
    }
}
