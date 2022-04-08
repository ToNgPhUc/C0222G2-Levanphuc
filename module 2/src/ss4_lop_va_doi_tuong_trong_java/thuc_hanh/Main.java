package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter width");
        double width = Double.parseDouble(sc.nextLine());
        System.out.println(" enter height");
        double height= Double.parseDouble(sc.nextLine());
        RectangularClass rectangular= new RectangularClass(width,height);
        System.out.println("rectangular width : "+rectangular.Display());
        System.out.println("Area in the rectangular: "+rectangular.getArea());
        System.out.println("Perimeter: "+rectangular.getPerimeter());
        System.out.println("-----------------");

        RectangularClass rectangular1=new RectangularClass();
        rectangular1.setWidth(5);
        rectangular1.setHeight(10);
        System.out.println("width and height rectangular1*:  "+ rectangular1.Display());

    }
}
