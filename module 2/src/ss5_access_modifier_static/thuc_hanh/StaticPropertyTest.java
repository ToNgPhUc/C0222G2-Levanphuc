package ss5_access_modifier_static.thuc_hanh;

public class StaticPropertyTest {
    public static void main(String[] args) {
        Car car1= new Car("toyota",112);
        System.out.println("so luong car khoi tao la: "+Car.numberOfCars);
        Car car2= new Car("toyota",112);
        System.out.println("so luong car khoi tao la: "+Car.numberOfCars);
    }

}
