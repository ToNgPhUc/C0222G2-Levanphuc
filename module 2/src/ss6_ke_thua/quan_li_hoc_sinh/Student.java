package ss6_ke_thua.quan_li_hoc_sinh;

import java.util.Scanner;

public class Student {
    int id ;
    String name;
    int age;
    String school;

    public Student() {
    }

    public Student(int id, String name, int age, String school) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    public void input(){

        System.out.println("enter id");
        this.id= Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println("enter name");
        this.name= new Scanner(System.in).nextLine();

        System.out.println("enter age");
        this.age= Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println("enter id");
        this.school= new Scanner(System.in).nextLine();



    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}
