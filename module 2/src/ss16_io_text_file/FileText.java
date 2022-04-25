package ss16_io_text_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileText {


    public static void main(String[] args) {
        FileText fileText= new FileText();
        List<Student>list= fileText.readFromFile();
        for (Student s:list) {
            System.out.println(s);
        }
    }

    public List<Student> readFromFile(){
        List<Student>list= new ArrayList<>();


        try {
            FileReader fd = new FileReader("data.txt");
            BufferedReader bR = new BufferedReader(fd);
            String line = " ";
            while (true) {
                line = bR.readLine();
                if (line == null) {
                    break;
                }
                String str[] = line.split(";");
                String name= str[0];
                int age= Integer.parseInt(str[1]);
                Double mark= Double.parseDouble(str[2]);
                list.add(new Student(name,age,mark));

            }
        } catch (Exception e) {

        }return list;
    }



    private static void writeToFile(List<Student> studentList) {
        try {
            FileWriter fW = new FileWriter("data.txt");
            BufferedWriter bW = new BufferedWriter(fW);
            for (Student s :
                    studentList) {
                bW.write(s.toString());
                bW.newLine();
            }
            bW.close();
            fW.close();
        } catch (Exception e) {

        }
    }

}
