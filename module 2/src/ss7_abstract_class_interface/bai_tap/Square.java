package ss7_abstract_class_interface.bai_tap;

public class Square extends Shape  {
     private int width =5;
public Square(){

}

    public Square(int width) {
        this.width = width;
    }

    public Square(String color, boolean filled, int width) {
        super(color, filled);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public double getArea(){
    return this.width*this.width;
    }
    public double getPerimeter(){
    return this.width*4;
    }

    @Override
    public void resize(double percent) {
       this.width*=percent;
    }

    @Override
    public String toString() {
        return "Square  " +
                "width=" + width +"\n"+
                "Area Square= "+getArea()+"\n"+
                "Perimeter Square= "+getPerimeter();
    }
}
