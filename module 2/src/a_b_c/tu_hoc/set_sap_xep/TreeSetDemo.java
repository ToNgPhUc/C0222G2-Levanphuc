package a_b_c.tu_hoc.set_sap_xep;

import java.util.*;

public class TreeSetDemo {

    public static void main(String[] args) {
        Set<Circle>circleSet= new TreeSet<>();
        Circle circle1 = new Circle(3, "blue");
        Circle circle2 = new Circle(2, "red");
        Circle circle3 = new Circle(3, "trang");

        circleSet.add(circle1);
        circleSet.add(circle2);
        circleSet.add(circle3);

        for (Circle c : circleSet) {
            System.out.println(c);
        }



//        Set<TreeSetCylinder> treeSet = new TreeSet<>();
//        TreeSetCylinder treeSetCylinder1 = new TreeSetCylinder(5, "mau xanh", 7);
//        TreeSetCylinder treeSetCylinder2 = new TreeSetCylinder(6, "mau do", 6);
//        TreeSetCylinder treeSetCylinder3 = new TreeSetCylinder(7, "trang", 8);
//        TreeSetCylinder treeSetCylinder4 = new TreeSetCylinder(6, "mau nau", 6);
//
////        System.out.println(treeSetCylinder1.compareTo(treeSetCylinder2));
//
//        treeSet.add(treeSetCylinder1);
//        treeSet.add(treeSetCylinder2);
//        treeSet.add(treeSetCylinder3);
//        treeSet.add(treeSetCylinder4);
//
//        for (TreeSetCylinder tr : treeSet) {
//            System.out.println(tr.getHeight());
//        }
//


    }
}
