package case_study.bai_1.model;

import java.util.Comparator;

public class IdComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getIdentityCardNumber() - o2.getIdentityCardNumber();
    }
}
