package ss7_abstract_class_interface.thuc_hanh3;

import ss6_ke_thua.thuc_hanh.Circle;

import java.util.Arrays;

public class CircleComparatorText {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("red", false, 5.5);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);

        }
    }
}
