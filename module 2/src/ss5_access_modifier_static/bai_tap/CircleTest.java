package ss5_access_modifier_static.bai_tap;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {


        Circle circle1 = new Circle();
        circle1.setRadius(10);
        circle1.setColor("blue");

        System.out.println(circle1+"\n"+" Area "+  circle1.getArea());

    }
}
