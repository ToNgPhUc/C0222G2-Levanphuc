package ss6_ke_thua.thuc_hanh;
//            hinh tron
public class CircleText {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        System.out.println(circle1);

        circle1= new Circle("blue",true,2.0);
        System.out.println(circle1+"Area: "+circle1.getArea()+"getPerimeter: "+circle1.getPerimeter());
    }
}
