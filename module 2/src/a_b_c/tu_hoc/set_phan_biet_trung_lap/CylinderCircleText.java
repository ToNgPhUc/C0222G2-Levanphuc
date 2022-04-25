package a_b_c.tu_hoc.set_phan_biet_trung_lap;

import ss6_ke_thua.bai_tap.Cylinder;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CylinderCircleText {
    public static void main(String[] args) {
        Set<ss6_ke_thua.bai_tap.Cylinder> set = new HashSet<>();
        ss6_ke_thua.bai_tap.Cylinder cylinder = new ss6_ke_thua.bai_tap.Cylinder(1, "blue", 1);
        ss6_ke_thua.bai_tap.Cylinder cylinder1 = new ss6_ke_thua.bai_tap.Cylinder(2, "red", 2);
        ss6_ke_thua.bai_tap.Cylinder cylinder2 = new ss6_ke_thua.bai_tap.Cylinder(1, "blue", 1);
        set.add(cylinder);
        set.add(cylinder1);
        set.add(cylinder2);
        System.out.println("truoc khi xoa");
        // do đối tượng 1 với đối tượng 3 giông nhau ..nhờ có equals và hashcode nên
        // mới phân biệt được 2 đối tượng giống nhau và chỉ in ra 1 đối tượng
        for (Cylinder c : set) {
            System.out.println(c.getHeight());
        }


        System.out.println("sau khi xoa");
        set.remove(new Cylinder(1, "blue", 1));
        for (Cylinder c : set) {
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
