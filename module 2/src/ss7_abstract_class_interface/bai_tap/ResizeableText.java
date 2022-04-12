package ss7_abstract_class_interface.bai_tap;

import java.util.Arrays;

public class ResizeableText {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        System.out.println("before size increase ");
        System.out.println(Arrays.toString(shapes));
        System.out.println("------------------------------");
int random= (int) ((Math.random()*99)+1);
        System.out.println("random= "+random);
        for (int i = 0; i < shapes.length; i++) {
                shapes[i].resize(random);

        }
        System.out.println("after size increase ");
        System.out.println(Arrays.toString(shapes));



//        Circle circle = new Circle();
//
//        System.out.println("before size increase");//trước khi tăng kích thước
//        System.out.println(circle);
//        System.out.println("after size increase ");//sau khi tăng kích thước
//        int random = (int) (Math.random() * 100);
//        circle.resize(random);
//        System.out.println("Random= " + random);
//        System.out.println(circle);
//
//        System.out.println("-----------------------------");
//
//        Square square = new Square();
//        System.out.println("before size increase");
//        System.out.println(square);
//        System.out.println("after size increase");
//        square.resize(random);
//        System.out.println("Randum= " + random);
//        System.out.println(square);
//
//        System.out.println("--------------------------------");
//
//        Rectangle rectangle = new Rectangle();
//        System.out.println("before size increase");
//        System.out.println(rectangle);
//        System.out.println();
//        System.out.println("after size increase");
//        rectangle.resize(random);
//        System.out.println("random= "+random);
//        System.out.println(rectangle);

    }
}
