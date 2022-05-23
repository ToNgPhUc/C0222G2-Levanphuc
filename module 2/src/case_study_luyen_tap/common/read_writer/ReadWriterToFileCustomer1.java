package case_study_luyen_tap.common.read_writer;

import case_study_luyen_tap.model.Customer1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriterToFileCustomer1 {
    List<Customer1> customerList1 = new ArrayList<>();
    private static final String CUSTOMER_1 = "case_study_luyen_tap/common/data/customer1.csv";

    public void writerToFileCustomer1(List<Customer1> list) {

        try {
            FileWriter fW = new FileWriter(CUSTOMER_1);
            BufferedWriter bW = new BufferedWriter(fW);
            for (Customer1 customer1 : list) {
                bW.write(customer1.getInFor1());
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

    public List<Customer1> readToFileCustomer1() {

        customerList1 = new ArrayList<>();
        try {
            FileReader fd = new FileReader(CUSTOMER_1);
            BufferedReader br = new BufferedReader(fd);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split(",");

                customerList1.add(new Customer1(arr[0], arr[1], arr[2],
                        Integer.parseInt(arr[3]), Integer.parseInt(arr[4]),
                        arr[5], arr[6], arr[7], arr[8]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        return customerList1;
    }
}
