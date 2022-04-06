package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
            student.setName("Phuc");
            student.setAge(16);
            student.setGender("nam");
            student.setScienceMajor(false);

        System.out.println(student.Display());
        System.out.println("----------------");

        Student student1 = new Student();
        student1.setName("Hoa ");
        student1.setAge(19);
        student1.setGender("nam");
        student1.setScienceMajor(true);

        System.out.println(student1.Display());
    }
}
