package ss7_abstract_class_interface.thuc_hanh2;

import java.util.Arrays;

public class ComparableCircleText {
    public static void main(String[] args) {
        ComparableCircle[]circles1= new ComparableCircle[3];
        circles1[0]= new ComparableCircle(3.6);
        circles1[1]=new ComparableCircle(3.4);
        circles1[2]=new ComparableCircle("blue",false,3.5);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle:circles1) {
            System.out.println(circle);
        }
        Arrays.sort(circles1);
        System.out.println("After-sorted:");
        for (ComparableCircle circle:circles1) {
            System.out.println(circle);
        }
    }
}
