package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class Bai1Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        double a= Double.parseDouble(sc.nextLine());
        System.out.println("enter b");
        double b= Double.parseDouble(sc.nextLine());
        System.out.println("enter c");
        double c= Double.parseDouble(sc.nextLine());
        Bai1QuadraticEquation quadraticEquation= new Bai1QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.Display());

        if (quadraticEquation.getDiscriminant()>0){//nếu delta > 0
            System.out.println(quadraticEquation.getRoot1());//xuất ra 2 nghiệm root1 và root 2
            System.out.println(quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){//nếu delta = 0
            System.out.println(quadraticEquation.getRoot1());//xuất ra 1 nghiệm

        }else {
            System.out.println("The equation has no roots");//delta <0 phương trình vô ngiệm

        }
    }
}
