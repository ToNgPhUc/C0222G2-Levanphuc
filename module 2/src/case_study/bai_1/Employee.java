package case_study.bai_1;

public class Employee extends HeThongQuanLy{
    int id;
    String name;
    int Date;
    String gender;
    int cMND;
    int sDT;
    String email;
    String trinhDo;
    String chucVu;
    int luong;
public Employee(){

}
    public Employee(int id, String name, int date, String gender, int cMND, int sDT, String email, String trinhDo, String chucVu, int luong) {
        this.id = id;
        this.name = name;
        Date = date;
        this.gender = gender;
        this.cMND = cMND;
        this.sDT = sDT;
        this.email = email;
        this.trinhDo = trinhDo;
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getcMND() {
        return cMND;
    }

    public void setcMND(int cMND) {
        this.cMND = cMND;
    }

    public int getsDT() {
        return sDT;
    }

    public void setsDT(int sDT) {
        this.sDT = sDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Date=" + Date +
                ", gender='" + gender + '\'' +
                ", cMND=" + cMND +
                ", sDT=" + sDT +
                ", email='" + email + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", chucVu='" + chucVu + '\'' +
                ", luong=" + luong +
                '}';
    }
}
