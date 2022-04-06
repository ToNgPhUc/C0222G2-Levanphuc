package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

//lop hinh chu nhat
public class Student {
    private String name; // name có giá trị mặc định là null
    private int age; // age có giá trị mặc định là 0
    private boolean isScienceMajor; // isScienceMajor có giá trị mặc định là false
    private String gender; // gender có giá trị mặc định là '\u0000'
public Student(){

}
    public Student(String name, int age, boolean isScienceMajor, String gender) {
        this.name = name;
        this.age = age;
        this.isScienceMajor = isScienceMajor;
        this.gender = gender;
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

    public boolean isScienceMajor() {
        return isScienceMajor;
    }

    public void setScienceMajor(boolean scienceMajor) {
        isScienceMajor = scienceMajor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public String Display() {
        return "Name: " + this.name +"\n"+
                "age: " + this.age +"\n"
                +"sa: " + this.isScienceMajor +"\n"
                +"gender: " + this.gender +"\n";
    }
}
