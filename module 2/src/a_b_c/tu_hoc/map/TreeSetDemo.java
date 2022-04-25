package a_b_c.tu_hoc.map;

import a_b_c.tu_hoc.set_sap_xep.Circle;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TreeSetDemo {

    public static void main(String[] args) {
        Map<Circle,Integer> map= new HashMap<Circle,Integer>();

        map.put( new Circle(1,"blue"),1);
        map.put(new Circle(1,"blue"),1);
        map.put(new Circle(3,"blue"),1);
        Set<Circle> setKey= map.keySet();
        for (Circle c:setKey) {
            System.out.println(c+" "+map.get(c));
        }
//        Set<Map.Entry<Circle,Integer>>entries= map.entrySet();
//        for (Map.Entry<Circle,Integer> e:entries){
//            System.out.println(e.getKey().getColor()+"   "+e.getValue());
//        }






//        Set<Circle>circleSet= new TreeSet<>();
//        Circle circle1 = new Circle(3, "blue");
//        Circle circle2 = new Circle(2, "red");
//        Circle circle3 = new Circle(3, "trang");
//
//        circleSet.add(circle1);
//        circleSet.add(circle2);
//        circleSet.add(circle3);
//
//        for (Circle c : circleSet) {
//            System.out.println(c);
//        }



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
