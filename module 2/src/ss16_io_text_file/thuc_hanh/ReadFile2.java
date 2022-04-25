package ss16_io_text_file.thuc_hanh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile2 {
    public static void main(String[] args) {
        ReadFile2 readFile2 = new ReadFile2();
        List<Student>list=readFile2.readFromFile();
        for (Student s:list) {
            System.out.println(s);
        }
    }
    public List<Student> readFromFile(){
        List<Student>studentList= new ArrayList<>();

        try {
            FileReader fd = new FileReader("ss16_io_text_file/thuc_hanh/data.txt2");
            BufferedReader br= new BufferedReader(fd);
            String line = "";
            while (true){
                line = br.readLine();
//                System.out.println(" ấddsf:" + line);//xem line trước khi split
                if (line==null){
                    break;
                }
                String[] txt = line.split(";");
//                for (int i = 0; i < txt.length; i++) {
//                    System.out.println(Arrays.toString(txt));
//                }
                String name= txt[0];
                int age = Integer.parseInt(txt[1]);
                double mark= Double.parseDouble(txt[2]);
                studentList.add(new Student(name,age,mark));
            }
        }catch (Exception e){

        }
        return studentList;
    }
//      try {
//            FileReader fd = new FileReader("ss16_io_text_file/thuc_hanh/data.txt2");
//            BufferedReader br= new BufferedReader(fd);
//            String line = "";
//            while (true){
//                line = br.readLine();
//                if (line==null){
//                    break;
//                }
//                System.out.println(line);
//            }
//        }catch (Exception e){
//
//        }
}
