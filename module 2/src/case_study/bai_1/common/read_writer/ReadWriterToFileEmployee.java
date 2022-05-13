package case_study.bai_1.common.read_writer;

import case_study.bai_1.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriterToFileEmployee {
List<Employee>employeeList= new ArrayList<>();

    public void writerToFileEmployee(List<Employee> list) {
        try {
            FileWriter fW = new FileWriter("case_study/bai_1/common/data/employee.csv",false);
            BufferedWriter bW = new BufferedWriter(fW);
            for (Employee employee : list) {
                bW.write(employee.getInFor());
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

    public List<Employee> readToFileEmployee() {
        employeeList = new ArrayList<>();

        try {
            FileReader fd = new FileReader("case_study/bai_1/common/data/employee.csv");
            BufferedReader br = new BufferedReader(fd);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split(",");

                employeeList.add(new Employee(arr[0], arr[1], arr[2],
                        Integer.parseInt(arr[3]), Integer.parseInt(arr[4]),
                        arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

}
