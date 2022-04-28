package case_study.bai_1.common.validata;

public class ValidataFacility {

    private static final String MA_DICH_VU = "^(SV)[VLHOR]{2}-[0-9]{4}";

    public static boolean isMatChesMaDichVu(String maDichVu) {
        return maDichVu.matches(MA_DICH_VU);
    }

    private static final String TEN_DICH_VU = "^[A-Z][a-z]{1,}$";
    public static Boolean isMatChesTenDichVu(String tenDichVu){
        return tenDichVu.matches(TEN_DICH_VU);
    }
    private static final String DIEN_TICH_SU_DUNG ="^[1-9][0-9]{1,}$";
    public static boolean isMatChesDienTichSuDung(String dienTich){
        return dienTich.matches(DIEN_TICH_SU_DUNG);
    }
    private static final String DIEN_TICH_HO_BOI ="^[1.0-9.0][0.0-9.0]{1,}";
    public static boolean isMatChesDienTichHoBoi(String dienTich){
        return dienTich.matches(DIEN_TICH_HO_BOI);
    }
    private static final String CHI_PHI_THUE ="";



    public static void main(String[] args) {
        System.out.println(("100").matches(DIEN_TICH_SU_DUNG));
    }
}
