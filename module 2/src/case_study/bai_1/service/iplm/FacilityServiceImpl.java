package case_study.bai_1.service.iplm;

import case_study.bai_1.model.Facility;
import case_study.bai_1.model.House;
import case_study.bai_1.model.Room;
import case_study.bai_1.model.Villa;
import case_study.bai_1.service.IFacilityService;
import case_study.bai_1.service.InterfaceService;
import com.sun.jdi.Value;

import java.security.Provider;
import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedHashMap<Facility, Integer> facilityHashMap = new LinkedHashMap<>();

    static {
        facilityHashMap.put(new House(), 0);
        facilityHashMap.put(new Villa(), 1);
        facilityHashMap.put(new Room(), 2);
    }

    @Override
    public void display() {
        Set<Facility> keySet = facilityHashMap.keySet();
        for (Facility key : keySet) {
            System.out.println(key + " " + facilityHashMap.get(key));
        }
    }

    @Override
    public void add() {
//        facilityHashMap.
        facilityHashMap.put(new House(), 10);

    }

    @Override
    public void edit() {

    }
}
