package string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final String VALIDATE = "^[CAP]+[0-9]{4}+[GHIKLM]$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(VALIDATE);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("enter class: ");
            String lop = scanner.nextLine();
            if(pattern.matcher(lop).find()){
                System.out.println("exactly");
                break;
            }else{
                System.out.println("no exactly");
            }
        }
    }
}
