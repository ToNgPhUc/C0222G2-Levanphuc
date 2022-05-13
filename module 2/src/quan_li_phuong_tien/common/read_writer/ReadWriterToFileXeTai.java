package quan_li_phuong_tien.common.read_writer;

import quan_li_phuong_tien.model.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriterToFileXeTai {
List<XeTai>xeTaiList= new ArrayList<>();
    public void writerToFileXeOto(List<XeTai> list) {

        try {
            FileWriter fW = new FileWriter("quan_li_phuong_tien/common/data/xetai.csv");
            BufferedWriter bW = new BufferedWriter(fW);
            for (XeTai xeTai : list) {
                bW.write(xeTai.inForPhuongTien());
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

    public List<XeTai> readToFileXeTai() {

        xeTaiList = new ArrayList<>();
        try {
            FileReader fd = new FileReader("quan_li_phuong_tien/common/data/xetai.csv");
            BufferedReader br = new BufferedReader(fd);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split(",");
//                String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, Integer congSuat) {
//public XeTai(String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, double trongTai) {
                xeTaiList.add(new XeTai(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Double.parseDouble(arr[4])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        return xeTaiList;
    }
}
