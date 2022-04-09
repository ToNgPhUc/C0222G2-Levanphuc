package ss6_ke_thua.thuc_hanh;
//           hinh chu nhat
public class RectangleText {
    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle();
        System.out.println(rectangle1);

        rectangle1= new Rectangle(2.0,3.0);
        System.out.println(rectangle1+"Area: "+rectangle1.getArea()+" Perimeter: "+rectangle1.getPerimeter());
        rectangle1= new Rectangle("red",true,3.0,4.0 );
        System.out.println(rectangle1);
    }
}
