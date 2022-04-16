//package ss0_bai_tap_oop.view;
//
//import ss0_bai_tap_oop.service.DanhSachXeMay;
//import ss0_bai_tap_oop.service.DanhSachXetai;
//import ss0_bai_tap_oop.model.XeMay;
//import ss0_bai_tap_oop.model.XeTai;
//
//import java.util.Scanner;
//
//public class text {
//    public static void main(String[] args) {
//DanhSachXeMay danhSachXeMay= new DanhSachXeMay();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("chon chuc nang \n" +
//                "1. them phuong tien moi \n" +
//                "2. Hien thi phuong tien \n" +
//                "3. Xoa phuong tien \n" +
//                "4. tim kiem theo bien kiem soat \n" +
//                "5. thoat \n");
//        int chon;
//        chon = scanner.nextInt();
//        scanner.nextLine();
//
//        do {
//            switch (chon) {
//                case 1:
//                    System.out.println(" chon: " +
//                            "1. them xe tai\n" +
//                            "2.them o to\n" +
//                            "3.them xe may");
//
//                    int chon1;
//                    chon1 = scanner.nextInt();
//                    scanner.nextLine();
//                    do {
//                        switch (chon1) {
//                            case 1:
//                                Scanner scanner1 = new Scanner(System.in);
//                                DanhSachXetai danhSachXetai = new DanhSachXetai();
//
//                                System.out.println("nhap bks");
//                                int bksXt = scanner1.nextInt();
//                                System.out.println("nhap ten hang sx");
//                                String tenHangSxXt = scanner1.nextLine();
//                                System.out.println("nhap nam sx");
//                                int namSxXt = scanner1.nextInt();
//                                System.out.println("nhap chu so huu");
//                                String chuSoHuuXt = scanner1.nextLine();
//                                System.out.println("nhap trong tai");
//                                double trongTaiXt = scanner1.nextInt();
//                                XeTai xeTai = new XeTai(bksXt, tenHangSxXt, namSxXt, chuSoHuuXt, trongTaiXt);
//                                danhSachXetai.themXeTai(xeTai);
//                            case 3:
//                                Scanner scanner3 = new Scanner(System.in);
//                                DanhSachXeMay danhSachXeMay1 = new DanhSachXeMay();
//
//                                System.out.println("nhap bks");
//                                int bksXm = scanner3.nextInt();
//                                System.out.println("nhap ten hang sx");
//                                String tenHangSxXm = scanner3.nextLine();
//                                System.out.println("nhap nam sx");
//                                int namSxXm = scanner3.nextInt();
//                                System.out.println("nhap chu so huu");
//                                String chuSoHuuXm = scanner3.nextLine();
//                                System.out.println("nhap cong suat");
//                                int congSuatXm = scanner3.nextInt();
//                                XeMay xeMay = new XeMay(bksXm, tenHangSxXm, namSxXm, chuSoHuuXm, congSuatXm);
//                                danhSachXeMay1.themXeMay(xeMay);
//                                break;
//                            case 0:
//                                System.exit(chon1);
//
//
//                        }
//
//                    } while (chon1 != 0);
//                    break;
//                case 2:
//                    danhSachXeMay.inDanhSachXeMay();
//            }
//
//
//        } while (chon != 0);
//    }
//}
