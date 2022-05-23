package case_study.common.read_writer;

import case_study.model.House;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadWriterToFileHouse {
    List<House> houseList = new ArrayList<>();

    public void writerToFileHouse(List<House> houseList) {
        try {
            FileWriter fileWriter = new FileWriter("case_study/common/data/house.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (House house : houseList) {
                bufferedWriter.write(house.getInFor1());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<House> readToFileHouse() {
        houseList=new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("case_study/common/data/house.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line==null){
                    break;
                }
                String[] arr = line.split(",");

                houseList.add(new House(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                        Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7])));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

}
