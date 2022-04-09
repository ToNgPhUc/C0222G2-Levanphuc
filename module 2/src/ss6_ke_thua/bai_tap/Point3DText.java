package ss6_ke_thua.bai_tap;

import java.util.Arrays;

public class Point3DText {
    public static void main(String[] args) {
        Point3D point3D1 = new Point3D();

        System.out.println("----------------------");
        point3D1 = new Point3D(3.9f, 46f, 5f);

        System.out.println("My array: " + Arrays.toString(point3D1.getXYZ()));

        for (float a : point3D1.getXYZ()) {
            System.out.println(a);
        }

    }
}
