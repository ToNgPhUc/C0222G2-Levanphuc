package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import ss4_lop_va_doi_tuong_trong_java.thuc_hanh.Bai1RectangularClass;

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

}
