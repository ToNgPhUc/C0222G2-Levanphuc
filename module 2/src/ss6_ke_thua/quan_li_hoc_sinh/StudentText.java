package ss6_ke_thua.quan_li_hoc_sinh;

import java.util.Scanner;

public class StudentText {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("menu"+"\n"+
                    "1: display \n"+
                    "2: add \n"+
                    "3: update \n"+
                    "4: delete \n"+
                    "5:  search\n"+
                    "6: exit ");
            System.out.println("please choose");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu){
                case 1:
                    Student student1=new Student(1,"phuc1",25,"code gym1");
                    System.out.println(student1);
                    Student student2=new Student(2,"phuc2",26,"code gym2");
                    System.out.println(student2);
                    Student student3=new Student(3,"phuc3",27,"code gym3");
                    System.out.println(student3);
                    Student student4=new Student(4,"phuc4",28,"code gym4");
                    System.out.println(student4);


                case 2:
                    Student student= new Student();
                    student.input();
                    System.out.println(student);
            }

        }while (false);


    }
}
