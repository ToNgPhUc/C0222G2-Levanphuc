package case_study.common.read_writer;

import case_study.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriterToFileCustomer {
List<Customer>customerList= new ArrayList<>();
    public void writerToFileCustomer(List<Customer> list) {

        try {
            FileWriter fW = new FileWriter("case_study/common/data/customer.csv");
            BufferedWriter bW = new BufferedWriter(fW);
            for (Customer customer : list) {
                bW.write(customer.getInFor());
                bW.newLine();
            }
            bW.close();
            fW.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public List<Customer> readToFileCustomer() {

        customerList = new ArrayList<>();
        try {
            FileReader fd = new FileReader("case_study/common/data/customer.csv");
            BufferedReader br = new BufferedReader(fd);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split(",");

                customerList.add(new Customer(arr[0], arr[1], arr[2],
                        Integer.parseInt(arr[3]), Integer.parseInt(arr[4]),
                        arr[5], arr[6], arr[7], arr[8]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        return customerList;
    }
}
