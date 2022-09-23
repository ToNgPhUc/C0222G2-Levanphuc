
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LayPhanTu {
    public static void main(String[] args) {

        List<String>B = new ArrayList<String>();

        List<String> A = new ArrayList<>();
        Boolean check = true;
        A.add("A");
        A.add("BCDEF");
        A.add("A");
        A.add("AAAAAANBB");
        System.out.println(A);
        for (String a:A) {
            if (a.equals("A")){
                check= true;
                B.add(a);
            }

        }if (check){
            System.out.println(B);
        }

    }

}
