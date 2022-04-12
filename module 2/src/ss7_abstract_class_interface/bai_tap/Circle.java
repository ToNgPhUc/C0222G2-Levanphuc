package ss7_abstract_class_interface.bai_tap;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
       this.radius*=percent;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius() + "\n" +
                "Area Circle: " + getArea() + "\n" +
                "Perimeter Circle: " + getPerimeter() + "\n"
                +super.toString();
    }


}