package ss6_ke_thua.bai_tap;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

//hinh tron
public class Circle {
    private double radius =2.0;
    private String color = "blue";
    private  double area;
    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        this.area = Math.pow(radius,2)*Math.PI;
        return this.area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Double.compare(circle.area, area) == 0 && Objects.equals(color, circle.color);
    }

    @Override
    public int hashCode() {
        return (int) this.radius;
    }

}
