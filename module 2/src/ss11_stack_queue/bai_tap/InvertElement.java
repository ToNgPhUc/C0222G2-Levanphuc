package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class InvertElement<T> {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        //đảo mãng;
        System.out.println("Invert Element");
        int element;
        System.out.println("enter element");
        element= scanner.nextInt();
        int []arr=new int[element];
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
        } System.out.println("after invert element "+wstack);

        // đảo chuỗi
        System.out.println("chain island ");
        Stack <String>stringStack=new Stack<>();
        String strings;
        Scanner scanner1= new Scanner(System.in);
        System.out.println("enter strings");
        strings=scanner1.nextLine();

        for (int i = 0; i < strings.length(); i++) {
            stringStack.push(strings.charAt(i)+"");
        }
        System.out.println("---------------");
        for (int i = 0; i < strings.length(); i++) {
            System.out.print(stringStack.pop());
        }













    }
}
