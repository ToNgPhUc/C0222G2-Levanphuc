package ss6_ke_thua.bai_tap;

public class Cylinder  extends  Circle{
    double height =1.0;

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
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", height=" + height +
                "V= "+getV()+
                super.toString();
    }
}
