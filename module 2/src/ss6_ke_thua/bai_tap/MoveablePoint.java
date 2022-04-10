package ss6_ke_thua.bai_tap;

public class MoveablePoint extends Point1{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public MoveablePoint(){

    }
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
float[]arr2= {this.xSpeed,this.ySpeed};
return arr2;
    }

    @Override
    public String toString() {
        return "MoveablePoint: " +"\n"+
                "xSpeed= " + xSpeed +
                ", ySpeed= " + ySpeed +"\n"+
                super.toString()+"\n"
                +"  address arr= "+getSpeed()+"\n";
    }

}
