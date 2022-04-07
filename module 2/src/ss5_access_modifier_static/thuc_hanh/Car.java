package ss5_access_modifier_static.thuc_hanh;

public class Car {
    private String name;
    private int speed;
    public static int numberOfCars;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        numberOfCars++;
    }
}
