package ss7_abstract_class_interface.bai_tap;

public class Rectangle extends Shape {
    private double width = 2.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public void resize(double percent) {
       this.width*=percent;
       this.length*=percent;
    }

    @Override
    public String toString() {
        return
               " width= " + getWidth()
                + " length= " + getLength()+"\n"
                +" Area Rectangle= "+ getArea()+
                " Perimeter Rectangle= "+getPerimeter()+"\n"+
                super.toString()
                ;
    }


}