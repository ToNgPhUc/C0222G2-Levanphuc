package ss17_io_binary_file_serialization.bai_tap.common;

import ss17_io_binary_file_serialization.bai_tap.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRead {
    public static void writerFile(List<Product> list) {
        try {
            FileOutputStream fos = new FileOutputStream("ss17_io_binary_file_serialization/bai_tap/common/Product.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFile() {
        List<Product> products = new ArrayList<>();
        try {

            FileInputStream fis = new FileInputStream("ss17_io_binary_file_serialization/bai_tap/common/Product.csv");
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
