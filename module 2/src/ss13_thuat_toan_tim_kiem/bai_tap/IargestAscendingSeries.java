package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// tìm chuỗi tăng dần lớn nhất
public class IargestAscendingSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

   
        for (int i = 0; i < string.length(); i++) {

            LinkedList<Character> list = new LinkedList<>();

            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {

                if (string.charAt(j) > list.getLast()) {

                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()) {

                max.clear();
                max.addAll(list);
            }
            list.clear();
        }


        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
