package ss6_ke_thua.bai_tap;

import java.util.Arrays;

public class MoveablePointPoint1Text {
    public static void main(String[] args) {
        MoveablePoint moveablePoint1= new MoveablePoint();
        System.out.println("----------------------");
moveablePoint1=new MoveablePoint(4f,5f,6f,7f);
        System.out.println(moveablePoint1+"arr = "+ Arrays.toString(moveablePoint1.getSpeed()));
}
}
