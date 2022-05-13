package bai_thi_ket_thuc_module.common.read_writer;

import bai_thi_ket_thuc_module.moder.DienThoaiChinhHang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteDienThoaiChinhHang {
    List<DienThoaiChinhHang> dienThoaiChinhHangList= new ArrayList<>();
    public void writerToFileDienThoaiChinhHang(List<DienThoaiChinhHang> list) {

        try {
            FileWriter fW = new FileWriter("src/bai_thi_ket_thuc_module/common/data/dien_thoai_chinh_hang.csv");
            BufferedWriter bW = new BufferedWriter(fW);
            for (DienThoaiChinhHang dienThoaiChinhHang : list) {
                bW.write(dienThoaiChinhHang.getDienThoai());
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

    public List<DienThoaiChinhHang> readToFileDIenThoaiChinhHang() {

       List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
        try {
            FileReader fd = new FileReader("src/bai_thi_ket_thuc_module/common/data/dien_thoai_chinh_hang.csv");
            BufferedReader br = new BufferedReader(fd);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split(",");

                dienThoaiChinhHangList.add(new DienThoaiChinhHang(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),
                        Integer.parseInt(arr[3]),arr[4],Integer.parseInt(arr[5]),arr[6] ));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        return dienThoaiChinhHangList;
    }
}
