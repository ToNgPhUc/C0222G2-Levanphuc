package ss6_ke_thua.bai_tap;

public class Point1 {
float x = 0.0f;
float y = 0.0f;

    public Point1() {
    }

    public Point1(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){

    }
    public double [] getXY(){
        double []arr = {this.x,this.y};
                return arr;
    }

    @Override
    public String toString() {
        return "Point1 " +
                "x= " + x + "\n"+
                ", y= " + y;
    }
}
