package case_study.bai_1.common.read_writer;

import case_study.bai_1.model.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriterToFileVilla {
    List<Villa> villaList = new ArrayList<>();

    public void writerToFileVilla(List<Villa> villaList) {
        try {
            FileWriter fileWriter = new FileWriter("case_study/bai_1/common/data/villa.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Villa villa : villaList) {
                bufferedWriter.write(villa.getInFor1());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Villa> readToFileVilla() {
        villaList= new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("case_study/bai_1/common/data/villa.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line==null){
                    break;
                }
                String[] arr = line.split(",");

                villaList.add(new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                        Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]),Integer.parseInt(arr[8])));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }
}
