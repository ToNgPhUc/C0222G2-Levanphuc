package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class Bai3TestFan {
    public static void main(String[] args) {
        Bai3Fan fan = new Bai3Fan();

        Bai3Fan fan1 = new Bai3Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());


        System.out.println(" ");

        Bai3Fan fan2 = new Bai3Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}