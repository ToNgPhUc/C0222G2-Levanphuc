package ss6_ke_thua.thuc_hanh;

public class GeometricObjectText extends GeometricObject {
public String classes;

    public GeometricObjectText(int id, String name, double height, double weight, String classes) {
        super(id, name, height, weight);
        this.classes = classes;
    }


    @Override
    public void getInFor() {
        super.getInFor();
        System.out.println("classes"+this.classes);
    }

    @Override
    public String toString() {
        return "Bai1GeometricObjectText{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", classes='" + classes + '\'' +
                '}';
    }
}
