package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ShowHello {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter name");
        String name = scanner.nextLine();
        System.out.print("hello "+name);
    }
}
