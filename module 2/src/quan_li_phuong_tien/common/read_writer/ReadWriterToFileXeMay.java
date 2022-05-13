package quan_li_phuong_tien.common.read_writer;

import quan_li_phuong_tien.model.XeMay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriterToFileXeMay {
List<XeMay>xeMayList= new ArrayList<>();
    public void writerToFileXeMay(List<XeMay> list) {

        try {
            FileWriter fW = new FileWriter("quan_li_phuong_tien/common/data/xemay.csv");
            BufferedWriter bW = new BufferedWriter(fW);
            for (XeMay xeMay : list) {
                bW.write(xeMay.inForPhuongTien());
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

    public List<XeMay> readToFileXeMay() {

        xeMayList = new ArrayList<>();
        try {
            FileReader fd = new FileReader("quan_li_phuong_tien/common/data/xemay.csv");
            BufferedReader br = new BufferedReader(fd);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split(",");
//                String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, Integer congSuat) {

                xeMayList.add(new XeMay(arr[0], arr[1],Integer.parseInt( arr[2]), arr[3], Integer.parseInt(arr[4])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        return xeMayList;
    }
}
