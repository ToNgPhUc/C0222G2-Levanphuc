package a_b_c.tu_hoc;

public enum SoTietHocTrongNgay {
    Monday(4),
    Tuesday(4),
    Wednesday(4),
    Thursday(4),
    Friday(5),
    Saturday(5),
    Sunday(5);
    private final int soTietHoc;
    SoTietHocTrongNgay(int soTietHoc){
        this.soTietHoc=soTietHoc;
    }
    public int soTietHoc(){
       return soTietHoc;
    }
}
