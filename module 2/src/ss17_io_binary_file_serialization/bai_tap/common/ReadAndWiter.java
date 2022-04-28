package ss17_io_binary_file_serialization.bai_tap.common;

import ss17_io_binary_file_serialization.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWiter {
    private static List<Product> product = new ArrayList<>();
    private final static String FILE = "ss17_io_binary_file_serialization/bai_tap/common/Product.csv";

    private static void writerToFile( List<Product> product) {
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

    public List<Product> readDataFromFile() {
        List<Product> productList= new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);
            product = (List<Product>)ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return product;
    }

}
