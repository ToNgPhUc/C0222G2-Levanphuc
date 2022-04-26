package ss16_io_text_file.bai_tap2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    private static final String SOURCE_FILE = "ss16_io_text_file/bai_tap2/sourcefile.csv";
    private static final String TATGET_FILE = "ss16_io_text_file/bai_tap2/targetfile.csv";

    public List<String> readFile(String source) {
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(source);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                stringList.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public void writeFile(String sourceFile, String tatgetFile) {
        List<String> list = readFile(sourceFile);
        try {
            BufferedWriter bW = new BufferedWriter(new FileWriter(tatgetFile, true));
            for (String s : list) {
                bW.write(s);
                bW.newLine();
            }
            bW.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        CopyFileText copyFileText= new CopyFileText();
        copyFileText.writeFile(SOURCE_FILE,TATGET_FILE);
    }


}
