package ss6_ke_thua.bai_tap;

import java.util.LinkedHashSet;
import java.util.Set;

public class CylinderCircleText {
    public static void main(String[] args) {
        Set<Cylinder> set = new LinkedHashSet<>();
        Cylinder cylinder = new Cylinder(1, "blue", 1);
        Cylinder cylinder1 = new Cylinder(2, "red", 2);
        Cylinder cylinder2 = new Cylinder(1, "blue", 1);
        set.add(cylinder);
        set.add(cylinder1);
        set.add(cylinder2);
        for (Cylinder c:set) {
            System.out.println(c.getHeight());
        }
        System.out.println("sau khi xoa");
        set.remove(new Cylinder(1,"blue",1));
        for (Cylinder c:set) {
            System.out.println(c.getHeight());
        }

//        Circle circle1= new Circle();
//        System.out.println(circle1);
//        System.out.println("-------------------");
//        circle1= new Circle(3.0,"green");
//        System.out.println(circle1);
//        System.out.println("--------------------");
//
//
//
//        Cylinder cylinder1=new Cylinder();
//        System.out.println(cylinder1);
//        System.out.println("---------------------");
//        cylinder1= new Cylinder(3.0,"blue",3.0);
//        System.out.println(cylinder1);
//
//        System.out.println(circle1.getColor());
//
    }
}
