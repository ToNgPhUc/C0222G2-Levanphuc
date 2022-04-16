package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class InvertElement<T> {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n= scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter number "+(i+1));
            arr[i]= scanner.nextInt();
            stack.push(arr[i]);
        }
        System.out.println(stack);
        System.out.println("-----------------");
        Stack<Integer>wstack=new Stack<>();
        for (int i = 0; i < stack.size();) {
            wstack.push(stack.pop());
        } System.out.println(wstack);



        Stack <String>stackchuoi=new Stack<>();
        String chuoi;
        Scanner scanner1= new Scanner(System.in);
        System.out.println("enter string");
        chuoi=scanner1.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
            stackchuoi.push(chuoi.charAt(i)+"");
        }
        System.out.println("---------------");
        for (int i = 0; i < chuoi.length(); i++) {
            System.out.print(stackchuoi.pop());
        }













    }
}
