package ss16_io_text_file.thuc_hanh;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private static List<Student> studentList = new ArrayList<>();
    public static void main(String[] args) {

        Student student1 = new Student("phuc1", 18, 1);
        Student student2 = new Student("phuc1", 19, 2);
        Student student3 = new Student("phuc1", 29, 3);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        WriteFile writeFile= new WriteFile();
        writeFile.writerToFile(studentList);

    }public void writerToFile(List<Student>list){
        try {
            FileWriter fW = new FileWriter("ss16_io_text_file/thuc_hanh/data.txt2",true);
            BufferedWriter bW = new BufferedWriter(fW);
            for (Student s : studentList) {
                bW.write(s.toString());
                bW.newLine();
            }
            bW.close();
            fW.close();

        } catch (Exception e) {
            System.out.println("is not a file");
        }
    }

}
