package a_text_sap_xep.set_phan_biet_trung_lap;

import java.util.Comparator;
import java.util.Objects;

//hinh tron
public class CircleText implements Comparator<CircleText> {
    private double radius =3.0;
    private String color = "blue";
    private  double area;
    public CircleText(){

    }

    public CircleText(double radius, String color) {
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
        return "CircleText: " +
                "radius: " + radius +
                ", color: '" + color +
                ", area: " + area ;
    }

    @Override
    public int compare(CircleText o1, CircleText o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircleText that = (CircleText) o;
        return Double.compare(that.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
