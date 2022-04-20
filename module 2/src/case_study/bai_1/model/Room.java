package case_study.bai_1.model;

public class Room extends Facility {
    private String dichVuMienPhiDiKem;

    public Room(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public Room(String tenDichVu, double area, double chiPhiThue, int peopleMax, int kieuThue, String dichVuMienPhiDiKem) {
        super(tenDichVu, area, chiPhiThue, peopleMax, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return "DichVuRoom: " + super.toString() +
                "dichVuMienPhiDiKem: " + dichVuMienPhiDiKem ;
    }
}
