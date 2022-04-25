package ss16_io_text_file.thuc_hanh1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class ReadFileExample {

    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            boolean flag = true;
            while (flag) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("tổng= " + sum);
        } catch (Exception e) {
            System.out.println("file không tồn tại or nội dung lỗi");
        }

    }

    public static void main(String[] args) {
        System.out.println("nhập đường dẫn file");
        Scanner scanner = new Scanner(System.in);
        String duongDan = scanner.nextLine();

        ReadFileExample readFileExp = new ReadFileExample();
        readFileExp.readFileText(duongDan);
    }
}
