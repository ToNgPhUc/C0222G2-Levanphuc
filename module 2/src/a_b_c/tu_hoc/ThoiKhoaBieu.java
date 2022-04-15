package a_b_c.tu_hoc;

public class ThoiKhoaBieu {
    private Day thu;
    private String cacMonHoc;
    private int soBuoihoc;


    public ThoiKhoaBieu(Day thu, String cacMonHoc, int soBuoihoc) {
        this.thu = thu;
        this.cacMonHoc = cacMonHoc;
        this.soBuoihoc = soBuoihoc;
    }

    public Day getThu() {
        return thu;
    }

    public void setThu(Day thu) {
        this.thu = thu;
    }

    public String getCacMonHoc() {
        return cacMonHoc;
    }

    public void setCacMonHoc(String cacMonHoc) {
        this.cacMonHoc = cacMonHoc;
    }

    public int getSoBuoihoc() {
        return soBuoihoc;
    }

    public void setSoBuoihoc(int soBuoihoc) {
        this.soBuoihoc = soBuoihoc;
    }

    @Override
    public String toString() {
        return "ThoiKhoaBieu{" +
                "thu=" + thu +
                ", cacMonHoc='" + cacMonHoc + '\'' +
                '}';
    }
}
