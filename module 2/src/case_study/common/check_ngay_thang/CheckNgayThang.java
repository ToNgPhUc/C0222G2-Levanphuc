package case_study.common.check_ngay_thang;

import javafx.scene.input.DataFormat;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CheckNgayThang {
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static long doiNgayThang(String dateString) {
        Date data = null;
        int demSoNgay = 0;
        try {
            data = simpleDateFormat.parse(dateString);
            demSoNgay = Math.toIntExact(data.getTime() / (1000 * 60 * 60 * 24));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return demSoNgay;
    }

    public static boolean checkNgayHopLe(String dateString) {
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            LocalDate localDate = LocalDate.parse(dateString,formatter);
            String date= String.valueOf(localDate);
            String[] dateArray= date.split("-");
            String kiemTraNgayThang= dateArray[2]+"/"+dateArray[1]+"/"+dateArray[0];
            if (dateString.equals(kiemTraNgayThang)){
                return true;
            }else {
                System.out.println("ngày này không tồn tại");
                return false;
            }
        }catch (Exception e){
            System.out.println("nhập ngày không phù hợp");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkNgayHopLe("29/02/2022"));
    }

}
