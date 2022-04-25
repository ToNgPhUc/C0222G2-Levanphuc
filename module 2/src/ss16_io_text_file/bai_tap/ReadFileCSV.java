package ss16_io_text_file.bai_tap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFileCSV {
    private static List<Country> countryList = new ArrayList<>();
    public List<Country> copyReaderFile(String filePath) {


        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split(",");
                int id = Integer.parseInt(arr[0]);
                String code = arr[1];
                String name = arr[2];
                countryList.add(new Country(id, code, name));
            }
//            for (Country country:countryList) {
//                System.out.println(country.toString());
//            }

        } catch (Exception e) {

        }
        return countryList;
    }

    public static void main(String[] args) {
        ReadFileCSV readFileCSV= new ReadFileCSV();
        countryList= readFileCSV.copyReaderFile("ss16_io_text_file/bai_tap/CSV");
        for (Country country:countryList) {
            System.out.println(country.toString());
        }
//        System.out.println("enter filePath");
//        Scanner scanner= new Scanner(System.in);
//        String filePath= scanner.nextLine();
//
//        ReadFileCSV readFileCSV= new ReadFileCSV();
//        countryList=readFileCSV.copyReaderFile(filePath);

    }
}
