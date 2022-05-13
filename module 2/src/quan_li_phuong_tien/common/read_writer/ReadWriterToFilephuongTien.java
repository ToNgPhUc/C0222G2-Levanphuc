package quan_li_phuong_tien.common.read_writer;

import quan_li_phuong_tien.model.PhuongTien;
import quan_li_phuong_tien.model.XeMay;
import quan_li_phuong_tien.model.XeOto;
import quan_li_phuong_tien.model.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriterToFilephuongTien {
    List<PhuongTien> phuongTienList = new ArrayList<>();

    public void writerToFilePhuongTien(List<PhuongTien> list) {

        try {
            FileWriter fW = new FileWriter("src/quan_li_phuong_tien/common/data/phuongtien.csv");
            BufferedWriter bW = new BufferedWriter(fW);
            for (PhuongTien phuongTien : list) {
                bW.write(phuongTien.inForPhuongTien());
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

    public List<PhuongTien> readToFilePhuongTien(List<PhuongTien> phuongTienList) {

        this.phuongTienList = new ArrayList<>();
        try {
            FileReader fd = new FileReader("src/quan_li_phuong_tien/common/data/phuongtien.csv");
            BufferedReader br = new BufferedReader(fd);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split(",");

                this.phuongTienList.add(new XeMay(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4])));
                this.phuongTienList.add(new XeOto(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4]), arr[5]));
                this.phuongTienList.add(new XeTai(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Double.parseDouble(arr[4])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        return this.phuongTienList;
    }
}
