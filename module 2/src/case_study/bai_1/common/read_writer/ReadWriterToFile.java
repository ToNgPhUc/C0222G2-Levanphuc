package case_study.bai_1.common.read_writer;

import case_study.bai_1.model.Employee;
import ss16_io_text_file.thuc_hanh.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static case_study.bai_1.service.iplm.EmployeeServiceIplm.employeeList;

public class ReadWriterToFile {
    public static ReadWriterToFile readWriterToFile = new ReadWriterToFile();

    public void writerToFileEmployee(List<Employee> list){
        try {
            FileWriter fW= new FileWriter("case_study/bai_1/common/data/employee.csv");
            BufferedWriter bW= new BufferedWriter(fW);
            for (Employee employee:employeeList) {
                bW.write(employee.displayEmployee());
                bW.newLine();
            }
            bW.close();
            fW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Employee> readToFileEmployee (){

            try {
                FileReader fd = new FileReader("case_study/bai_1/common/data/employee.csv");
                BufferedReader bR= new BufferedReader(fd);
                String line ="";
                while (true){
                    line= bR.readLine();
                    if (line==null){
                        break;
                    }
                    String [] csv= line.split(";");

                  for (int i = 0;i<csv.length;i++){
                      System.out.println(Arrays.toString(csv));
                      break;
                  }

                    String hoTen= csv[0];
                    String ngaySinh= csv[1];
                    String gioiTinh= csv[2];
                    Integer soChungMinhNhanDan= Integer.parseInt(csv[3]);
                    Integer soDienThoai= Integer.parseInt(csv[4]);
                    String email= csv[5];
                    String maNhanVien= csv[6];
                    String trinhDo= csv[7];
                    String viTri= csv[8];
                    Double luong= Double.parseDouble(csv[9]);
                    employeeList.add(new Employee(hoTen,ngaySinh,gioiTinh,soChungMinhNhanDan,soDienThoai,email,maNhanVien,trinhDo,viTri,luong));
                }
                bR.close();
                fd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return employeeList;
    }
}
//    public List<Student> readFromFile() {
//        List<Student> studentList = new ArrayList<>();
//
//        try {
//            FileReader fd = new FileReader("ss16_io_text_file/thuc_hanh/data.txt2");
//            BufferedReader br = new BufferedReader(fd);
//            String line = "";
//            while (true) {
//                line = br.readLine();
////                System.out.println(" ấddsf:" + line);//xem line trước khi split
//                if (line == null) {
//                    break;
//                }
//                String[] txt = line.split(";");
////                for (int i = 0; i < txt.length; i++) {
////                    System.out.println(Arrays.toString(txt));
////                }
//                String name = txt[0];
//                int age = Integer.parseInt(txt[1]);
//                double mark = Double.parseDouble(txt[2]);
//                studentList.add(new Student(name, age, mark));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return studentList;
//    }
