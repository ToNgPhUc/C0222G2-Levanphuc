package ss7_abstract_class_interface.bai_tap1;

import java.util.Arrays;

public class ColorableText {
    public static void main(String[] args) {
        Shape[]shapes=new Shape[3];
        shapes[0]= new Circle(3.0);
        shapes[1]=new Rectangle(4.0,5.0);
        shapes[2]=new Square(5);
        for (Shape shape1:shapes){
            if (shape1 instanceof Circle){
                System.out.println( " Area Circle= "+ ((Circle) shape1).getArea());
            }
            if (shape1 instanceof Rectangle){
                System.out.println( " Area Rectangle= "+((Rectangle) shape1).getArea());
            }if (shape1 instanceof Square){
                System.out.println( "Area Square= "+((Square) shape1).getArea());
                ((Square) shape1).howToColor();
            }
        }

    }
}
