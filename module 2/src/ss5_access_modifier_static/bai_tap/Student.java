package ss5_access_modifier_static.bai_tap;

public class Student {
     private String name = "john";
     private String classes = " C02";

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    Student(){

}

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student: " +
                "name= '" + name + '\n' +
                ", classes= '" + classes + '\n';
    }
}
