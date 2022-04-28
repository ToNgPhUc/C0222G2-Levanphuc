package string_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String VALIDATE_PHONE ="^(84)-[0-9]{9}$";
//    "^(0)|(\\+84)^[0-9]{9}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile(VALIDATE_PHONE);
        while (true){
            System.out.print("enter number: ");
            String phone = scanner.nextLine();
            if(pattern.matcher(phone).find()){
                System.out.println("exactly");
                break;
            }else{
                System.out.println("no exactly");
            }
        }
    }
}
