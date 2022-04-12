package ss7_abstract_class_interface.thuc_hanh2;

import ss6_ke_thua.thuc_hanh.Circle;

// vòng tròn có thể so sánh
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {//ke thừa tu Circle tư thực hanh ss6

    public ComparableCircle() {

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
