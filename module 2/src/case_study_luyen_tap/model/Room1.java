package case_study_luyen_tap.model;

public class Room1 extends Facility1 {
private String dichVuMienPhi;

    public Room1() {
    }

    public Room1(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room1(String tenDichVu, Double dienTich, Double chiPhi, Integer soLuongNguoiToiDa, String kieuThue, String dichVuMienPhi) {
        super(tenDichVu, dienTich, chiPhi, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuMienPhi='" + dichVuMienPhi + '\'' +
                '}';
    }

    @Override
    public String getInFor() {
        return super.getInFor()+","+this.dichVuMienPhi;
    }
}
