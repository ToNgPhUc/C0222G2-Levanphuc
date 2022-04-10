package case_study.bai_1;

public class Room extends Furama{
    String dichVuMienPhi;

    public Room(){

    }
    public Room(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public Room(String tenDichVu, double area, double chiPhiThue, int peopleMax, int kieuThueNam, String dichVuMienPhi) {
        super(tenDichVu, area, chiPhiThue, peopleMax, kieuThueNam);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }
}
