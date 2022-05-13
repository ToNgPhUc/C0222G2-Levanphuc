package a_text_sap_xep.set_phan_biet_trung_lap;

import ss6_ke_thua.bai_tap.Circle;

public class CylinderText extends Circle implements Comparable<CylinderText> {
   private double height =5.0;

    public CylinderText(){

    }
    public CylinderText(double height) {
        this.height = height;
    }

    public CylinderText(double radius, String color, double height) {
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
        return "CylinderText: " +super.toString() +","+
                "height: " + height ;
    }


    @Override
    public int compareTo(CylinderText o) {
        return (int) (this.getHeight()-this.getHeight());
    }
}
