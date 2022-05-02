package ss16_io_text_file.thuc_hanh2;

import java.util.List;

public class FindMaxValue {

    public static int finMax(List<Integer>number){
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i)>max){
                max= number.get(i);
            }
        }return max;

    }

    public static void main(String[] args) {
        ReadAndWriterFile readAndWriterFile= new ReadAndWriterFile();
        List<Integer>numbers= readAndWriterFile.readFile("ss16_io_text_file/thuc_hanh2/numbers.txt");
        int maxValue= finMax(numbers);
        readAndWriterFile.writerFile("ss16_io_text_file/thuc_hanh2/result.txt",maxValue);
    }

}
