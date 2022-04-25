package a_b_c.tu_hoc.map;

import ss6_ke_thua.bai_tap.Circle;

import java.util.Objects;

public class TreeSetCylinder extends Circle {
    private double height = 1.0;

    public TreeSetCylinder() {

    }

    public TreeSetCylinder(double height) {
        this.height = height;
    }

    public TreeSetCylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getV() {
        return (Math.PI * height * Math.pow(getRadius(), 2));
    }


    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "V= " + getV() +
                super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TreeSetCylinder that = (TreeSetCylinder) o;
        return Double.compare(that.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}



