package ss5_access_modifier_static.bai_tap;

public class Circle {
    private double radius= 1.0;
    private String color = "Red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(double radius){

    }
    public Circle(){

    }

     protected double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*3.14;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle " +
                "radius= " + radius +
                ", color=' " + color ;
    }
}
