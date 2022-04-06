package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class Bai3Fan {
    private int speed ;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;


    public Bai3Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public Bai3Fan() {

    }

    @Override
    public String toString() {
        if (on) {
            return "fan is of: " +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'';
        }else {
            return "fan is on: " +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'';
        }


    }
}