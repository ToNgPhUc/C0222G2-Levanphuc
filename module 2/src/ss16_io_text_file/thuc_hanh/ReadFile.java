package ss16_io_text_file.thuc_hanh;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("ss16_io_text_file/thuc_hanh/data.txt2");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            boolean flag = true;
            String line = "";
            while (flag) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("file ko tông tại");
        }

    }
}
