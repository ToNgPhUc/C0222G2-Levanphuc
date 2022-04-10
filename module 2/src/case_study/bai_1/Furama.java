package case_study.bai_1;

public class Furama extends HeThongQuanLy{
    String tenDichVu;
    double area;
    double chiPhiThue;
    int peopleMax;
    int kieuThueNam;

    public Furama() {
    }

    public Furama(String tenDichVu, double area, double chiPhiThue, int peopleMax, int kieuThueNam) {
        this.tenDichVu = tenDichVu;
        this.area = area;
        this.chiPhiThue = chiPhiThue;
        this.peopleMax = peopleMax;
        this.kieuThueNam = kieuThueNam;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getPeopleMax() {
        return peopleMax;
    }

    public void setPeopleMax(int peopleMax) {
        this.peopleMax = peopleMax;
    }

    public int getKieuThueNam() {
        return kieuThueNam;
    }

    public void setKieuThueNam(int kieuThueNam) {
        this.kieuThueNam = kieuThueNam;
    }
}
