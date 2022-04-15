package ss10_danh_sach.bai_tap;

import ss6_ke_thua.quan_li_hoc_sinh.Student;

import java.util.Arrays;

public class MyListText {
    public static void main(String[] args) {
        Student student1 = new Student(1, "phuc1", 25, "Code gym");
        Student student2 = new Student(2, "phuc2", 26, "Code gym");
        Student student3 = new Student(3, "phuc3", 27, "Code gym");
        Student student4 = new Student(4, "phuc4", 28, "Code gym");
        Student student5 = new Student(5, "phuc5", 29, "Code gym");
        Student student6 = new Student(6, "phuc6", 30, "Code gym");


        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newStudentMyList;
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);

//        studentMyList.add(2,student5);

//        System.out.println(studentMyList.size());
//        System.out.println(studentMyList.get(4).getName());
        System.out.println(studentMyList.index0f(student3));

        newStudentMyList = studentMyList.clone();
        for (int i = 0; i < newStudentMyList.size(); i++) {
            System.out.println(newStudentMyList.get(i).getName());
        }


        // them phan tu st5 vao vij tri 1

        // kiem tra do dai cua size cua mang,(so luong pt trong mang
//        studentMyList.size();


//        //lay ten phan o vi tri 2

        // in ra cac phan tu student
//        for (int i = 0; i < studentMyList.size(); i++) {
//            Student st = (Student) studentMyList.elements[i];
//            System.out.println(st);
//        }
//        System.out.println(studentMyList.contains(student1));


    }
}
