package case_study.bai_1.model;

import java.util.Objects;

public class Room extends Facility {
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public Room(String maDichVu, String tenDichVu, double dienTich, double chiPhiThue, int soNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(maDichVu, tenDichVu, dienTich, chiPhiThue, soNguoiToiDa, kieuThue);
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
        return "Room: " + super.toString() +
                "dichVuMienPhiDiKem: " + dichVuMienPhiDiKem + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(dichVuMienPhiDiKem, room.dichVuMienPhiDiKem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dichVuMienPhiDiKem);
    }
}
