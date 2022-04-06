package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

public class Bai1RectangularClass {
    double width;
    double height;

    public Bai1RectangularClass() {

    }

    public Bai1RectangularClass(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {

        return (this.width + this.height) * 2;
    }
    public void setHeight(double height) {

        this.height = height;
    }

    public String Display() {
        return "width = " + width + "\n" +
                "height= " + height + "\n";

    }
}
