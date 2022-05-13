package quan_li_phuong_tien.common.read_writer;

import quan_li_phuong_tien.model.XeOto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriterToFileXeOto {
List<XeOto>xeOtoList= new ArrayList<>();
    public void writerToFileXeOto(List<XeOto> list) {

        try {
            FileWriter fW = new FileWriter("quan_li_phuong_tien/common/data/xeoto.csv");
            BufferedWriter bW = new BufferedWriter(fW);
            for (XeOto xeOto : list) {
                bW.write(xeOto.inForPhuongTien());
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

    public List<XeOto> readToFileXeOto() {

        xeOtoList = new ArrayList<>();
        try {
            FileReader fd = new FileReader("quan_li_phuong_tien/common/data/xeoto.csv");
            BufferedReader br = new BufferedReader(fd);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split(",");
//                String bienKiemSoat, String hangSanXuat, Integer namSanXuat, String chuSoHuu, Integer congSuat) {

                xeOtoList.add(new XeOto(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4]), arr[5]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        return xeOtoList;
    }
}
