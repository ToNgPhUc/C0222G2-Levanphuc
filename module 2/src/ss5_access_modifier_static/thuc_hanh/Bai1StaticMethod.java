package ss5_access_modifier_static.thuc_hanh;

public class Bai1StaticMethod {

    private int id;
    private String name;
    private static String school = "CODE GYM";

    public Bai1StaticMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }
    static void changer(){
        school = "DAI HOC QUOC GIA HA NOI";
    }
    void Display(){
        System.out.println("id= "+id+"name= "+name+"school= "+school);

    }
}
