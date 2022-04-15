package a_b_c.tu_hoc;

public class text {
    public static void main(String[] args) {
        ThoiKhoaBieu thoiKhoaBieu1=new ThoiKhoaBieu(Day.Monday, "toan li hoa",4);
        ThoiKhoaBieu thoiKhoaBieu2=new ThoiKhoaBieu(Day.Tuesday, "van su dia",4);
        ThoiKhoaBieu thoiKhoaBieu3=new ThoiKhoaBieu(Day.Wednesday, "li hoa sinh",3);
        ThoiKhoaBieu thoiKhoaBieu4=new ThoiKhoaBieu(Day.Thursday, "tin hoc the duc",4);
        System.out.println(thoiKhoaBieu3);




        int x= SoTietHocTrongNgay.Monday.soTietHoc();// thuoc enum so tiet hoc trong ngay
        System.out.println("so tiet hoc trong ngay la "+x);
    }

}
