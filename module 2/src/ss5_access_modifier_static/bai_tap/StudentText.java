package ss5_access_modifier_static.bai_tap;

public class StudentText {
    public static void main(String[] args) {

        Student student1=new Student();

        student1.setName("PHUC");
        student1.setClasses("C0222G2");
        System.out.println(student1);
        Student student2 = new Student("PHUC2","C0222g3");
        System.out.println(student2);
    }
}

