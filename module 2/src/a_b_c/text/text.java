package a_b_c.text;

import a_b_c.mainBai61.DanhSachSinhVien;
import a_b_c.mainBai61.SinhVien;

import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon;
        do {
            System.out.println("MENU------------");
            System.out.println("vui long lua chon chuc nang");
            System.out.println("1.thêm dssv.\n" +
                    "2. in dssv\n" +
                    "3.kiểm tra danh sách có rỗng hay ko\n" +
                    "4.lấy ra số lượng sinh viên trong danh sách\n" +
                    "5.làm rỗng danh sách sinh viên\n" +
                    "6.Kiểm tra sv có tồn tại trong danh sách hay không/dựa vào mã sv\n" +
                    "7.xóa 1 sv ra khoi danh sách/mã sinh viên\n" +
                    "8.tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phímn\n" +
                    "9.xuất ra danh sách sinh viên có điểm từ cao đến thấp\n" +
                    "0.thoát ra màn hình");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.println("nhap mã sinh viên");
                    String maSinhVien = sc.nextLine();
                    System.out.println("nhaapj hoj teen");
                    String hoVaTen = sc.nextLine();
                    System.out.println("nhap nam sinh");
                    int namSinh = sc.nextInt();
                    System.out.println("nhap diem trung binh");
                    float diemTrungBinh = sc.nextFloat();
                    SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                    dssv.themSinhVien(sv);

                case 2:
                    dssv.inDanhSachSinhVien();
                case 3:

                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:

            }
        } while (luaChon != 0);
    }
}
