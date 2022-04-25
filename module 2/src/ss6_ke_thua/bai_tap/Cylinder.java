package ss6_ke_thua.bai_tap;

import java.util.Objects;

public class Cylinder  extends  Circle{
   private double height =1.0;

    public Cylinder(){

    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getV(){
        return (Math.PI*height*Math.pow(getRadius(),2));
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "V= "+getV()+
                super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cylinder cylinder = (Cylinder) o;
        return Double.compare(cylinder.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
