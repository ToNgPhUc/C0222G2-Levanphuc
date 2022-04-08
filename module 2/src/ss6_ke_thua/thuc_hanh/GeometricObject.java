package ss6_ke_thua.thuc_hanh;
//hệ các đối tượng hình học
public class GeometricObject {
    int id;
    String name;
    double height;
    double weight;
    double h =1;

    public GeometricObject(int id, String name, double height, double weight) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    GeometricObject(){

    }
    public void  getInFor(){
        System.out.println("id: "+this.id);
        System.out.println("name: "+this.name);
        System.out.println("height: "+this.height);
        System.out.println("weight: "+this.weight);

    }
}
