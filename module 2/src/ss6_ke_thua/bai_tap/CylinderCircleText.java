package ss6_ke_thua.bai_tap;

public class CylinderCircleText {
    public static void main(String[] args) {
        Circle circle1= new Circle();
        System.out.println(circle1);
        System.out.println("-------------------");
        circle1= new Circle(3.0,"green");
        System.out.println(circle1);
        System.out.println("--------------------");



        Cylinder cylinder1=new Cylinder();
        System.out.println(cylinder1);
        System.out.println("---------------------");
        cylinder1= new Cylinder(3.0,"blue",3.0);
        System.out.println(cylinder1);

    }
}
