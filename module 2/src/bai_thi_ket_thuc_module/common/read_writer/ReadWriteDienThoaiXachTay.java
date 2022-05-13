package bai_thi_ket_thuc_module.common.read_writer;

import bai_thi_ket_thuc_module.moder.DienThoaiXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteDienThoaiXachTay {
    List<DienThoaiXachTay> dienThoaiXachTayList= new ArrayList<>();
    public void writerToFileDienThoaiXachTay(List<DienThoaiXachTay> list) {

        try {
            FileWriter fW = new FileWriter("src/bai_thi_ket_thuc_module/common/data/dien_thoai_xach_tay.csv");
            BufferedWriter bW = new BufferedWriter(fW);
            for (DienThoaiXachTay dienThoaiXachTay : list) {
                bW.write(dienThoaiXachTay.getDienThoai());
                bW.newLine();
            }
            bW.close();
            fW.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public List<DienThoaiXachTay> readToFileDIenThoaixachTay() {

        dienThoaiXachTayList = new ArrayList<>();
        try {
            FileReader fd = new FileReader("src/bai_thi_ket_thuc_module/common/data/dien_thoai_xach_tay.csv");
            BufferedReader br = new BufferedReader(fd);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split(",");

                dienThoaiXachTayList.add(new DienThoaiXachTay(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),arr[4],arr[5],arr[6] ));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        return dienThoaiXachTayList;
    }
}
