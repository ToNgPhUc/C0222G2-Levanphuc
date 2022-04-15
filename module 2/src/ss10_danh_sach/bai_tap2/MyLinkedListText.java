package ss10_danh_sach.bai_tap2;

import java.util.Arrays;

public class MyLinkedListText {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
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

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1=new Student(1,"phuc1");
        Student student2=new Student(2,"phuc2");
        Student student3=new Student(3,"phuc3");
        Student student4=new Student(4,"phuc4");

        myLinkedList.addFist(student1);
        myLinkedList.addFist(student2);
        myLinkedList.addLast(student3);
       myLinkedList.add(1,student1);
       myLinkedList.remove(2);
        System.out.println(myLinkedList.size());
        myLinkedList.remove(student1);

//          copy mang hien tai:
        System.out.println(myLinkedList.clone());
        for (int i = 0; i < myLinkedList.clone().size(); i++) {
            Student student= (Student) myLinkedList.clone().get(i);
            System.out.println(myLinkedList.clone().get(i));
        }


        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student= (Student) myLinkedList.get(i);
            System.out.println(student.getName());

        }


    }
}
