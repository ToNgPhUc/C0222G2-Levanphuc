package ss6_ke_thua.quan_liHocSinh;

import java.util.Scanner;

public class StudentText {

    public static void main(String[] args) {
        Student student1=new Student();
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

                    student1 = new Student(1,"phuc1",25,"code gym");
                    System.out.println(student1);
                    Student student2= new Student(2,"Phuc2",26,"DTan");
                case 2:
                    student1.input();
            }

        }while (false);


    }
}
