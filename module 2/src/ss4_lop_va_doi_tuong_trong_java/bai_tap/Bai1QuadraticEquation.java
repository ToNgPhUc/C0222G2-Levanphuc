package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import ss4_lop_va_doi_tuong_trong_java.thuc_hanh.Bai1RectangularClass;

import java.util.Scanner;

//phuong trinh bac hai
    public class Bai1QuadraticEquation {
        double a;
        double b;
        double c;
        public Bai1QuadraticEquation(){

        }
    public Bai1QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
            return b*b-4*a*c;
    }public double getRoot1(){

        return   (Math.sqrt(getDiscriminant())-b)/(2*a);
    }
    public  double getRoot2(){
           return  (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }
    public String Display(){
            return " value a: "+a+"\n"+
                    " value b: "+b+"\n"+
                    " value c: "+c+"\n";
    }
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
