package a_b_c.tu_hoc.set_sap_xep;

import ss6_ke_thua.bai_tap.Circle;

public class TreeSetCylinder extends Circle implements Comparable<TreeSetCylinder> {
   private double height =1.0;

    public TreeSetCylinder(){

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
//    public String getColor1(){
//        String s = this.getColor().trim();
//        if (s.indexOf(" ")>=0){
//            int vitri= s.lastIndexOf(" ");                   //so sanh theo kieu string neu muon chon ten cuoi cung
//
//            return s.substring(vitri+1);
//        }else {
//            return s;
//        }
//    }

    @Override
    public int compareTo(TreeSetCylinder o) {
        // so sanh theo string neu muon chon ten cuoi cung
//
//        String colerthis= this.getColor1();
//        String color0= o.getColor1();
//        return colerthis.compareTo(color0);



        // so sanhs theo heigt..kieeur soo
            return (int) (this.height-o.getHeight());
        }
    }


