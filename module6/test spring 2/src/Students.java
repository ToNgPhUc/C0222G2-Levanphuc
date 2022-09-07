import java.util.Locale;

public class Students {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("Tài")) {
            System.out.println("Ido của lớp");
        } else {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Students students= new Students();
        students.setName("Tài");
        System.out.println(students.getName());

    }
}
