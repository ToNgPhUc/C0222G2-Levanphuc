package a_text_sap_xep.set_phan_biet_trung_lap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<CylinderText> set = new HashSet<>();
        CylinderText cylinder1 = new CylinderText(1, "blue", 3);
        CylinderText cylinder2 = new CylinderText(2, "blue", 5);
        CylinderText cylinder3 = new CylinderText(3, "blue", 1);

        set.add(cylinder1);
        set.add(cylinder2);
        set.add(cylinder3);



        for (CylinderText c : set) {
            System.out.println(c);
        }

//        Map<CircleText,Integer>cylinderTextHashMap= new LinkedHashMap<>();
//        CircleText circleText1= new CircleText(5,"blue");
//        CircleText circleText2= new CircleText(1,"blue");
//        CircleText circleText3= new CircleText(1,"blue");
//        cylinderTextHashMap.put(circleText1,1);
//        cylinderTextHashMap.put(circleText2,1);
//        cylinderTextHashMap.put(circleText3,5);
//
//        for (CircleText key:cylinderTextHashMap.keySet()) {
//            System.out.println(key+" "+ cylinderTextHashMap.get(key));
//        }


    }

}
