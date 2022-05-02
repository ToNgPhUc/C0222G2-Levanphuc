package case_study.bai_1.common.validata;

public class ValidataFacility {

    private static final String MA_DICH_VU_VILLA = "^(SV)[VL]{2}-[0-9]{4}";
    private static final String MA_DICH_VU_HOUSE = "^(SV)[HO]{2}-[0-9]{4}";
    private static final String MA_DICH_VU_ROOM = "^(SV)[RO]{2}-[0-9]{4}";

    public static boolean soSanhMaDichVuVilla(String maDichVu) {
        return maDichVu.matches(MA_DICH_VU_VILLA);
    }
    public static boolean soSanhMaDichVuHouse(String maDichVu) {
        return maDichVu.matches(MA_DICH_VU_HOUSE);
    }
    public static boolean soSanhMaDichVuRoom(String maDichVu) {
        return maDichVu.matches(MA_DICH_VU_ROOM);
    }

    private static final String TEN_DICH_VU = "^[A-Z][a-z]{1,}$";
    public static Boolean soSanhTenDichVu(String tenDichVu){
        return tenDichVu.matches(TEN_DICH_VU);
    }

    private static final String DIEN_TICH_HO_BOI_VA_HO_BOI = "^((([3-9][0-9])|([1-9][0-9]{2,}))\\.[0-9]{1,})$";
    public static boolean soSanhDienTichSuDungVaHoBoi(String dienTich){
        return dienTich.matches(DIEN_TICH_HO_BOI_VA_HO_BOI);
    }

    private static final String CHI_PHI_THUE = "^[0-9]+\\.[0-9]+$"; //
    public static boolean soSanhChiPhiThue(String chiPhiThue){
        return chiPhiThue.matches(CHI_PHI_THUE);
    }
    private static final String SO_NGUOI_TOI_DA= "^(([1-9])|([1][0-9])|[2][0])$";
//    private static final String SO_NGUOI_TOI_DA= "^((([1-9])|([1][0-9])|([2][0-9]))\\.[0-9]|([3][0])\\.[0])$";
    //các số nhỏ hơn 30.0

    public static boolean soSanhsoNguoiToiDa(String soNguoiToiDa){
        return soNguoiToiDa.matches(SO_NGUOI_TOI_DA);
    }
    private static final String SO_TANG="^[0-9]+$";
    public static boolean soSanhSoTang(String soTang){
        return soTang.matches(SO_TANG);
    }

    private static final String TIEU_CHUAN_PHONG = "^[A-Z][a-z]{1,}$";
    public static boolean soSanhTieuChuanPhong(String tieuChuanPhong){
        return tieuChuanPhong.matches(TIEU_CHUAN_PHONG);
    }

    private static final String KIEU_THUE = "^[A-Z][a-z]{1,}$";
    public static boolean soSanhKieuThue(String kieuThue){
        return kieuThue.matches(KIEU_THUE);
    }


}
