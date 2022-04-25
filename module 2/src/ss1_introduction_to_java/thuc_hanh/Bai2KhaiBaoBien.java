package ss1_introduction_to_java.thuc_hanh;

import java.util.HashSet;

public class Bai2KhaiBaoBien {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<>();
        setA.add("Java");
        setA.add("Python");
        setA.add("Java");
        setA.add("PHP");
        HashSet<String> setB = new HashSet<>();
        System.out.println("setA có trống không? " + setA.isEmpty());
        System.out.println("setB có trống không? " + setB.isEmpty());
    }

//        int i = 10;
//        float f = 20.5f;
//        double d = 20.5;
//        boolean b = true;
//        char c = 'a';
//        String s = "Japan";
//        System.out.println("kieu so nguyen i = " + i);
//        System.out.println("kieu so thuc f = " + f);
//        System.out.println("kieu so thuc lon =" + d);
//        System.out.println("kieu logic =" + b);
//        System.out.println("kieu ki tu = " + c);
//        System.out.println(" kieu chuoi = " + s);

    }

