package case_study_luyen_tap.service.Iplm;

import case_study_luyen_tap.model.Facility1;
import case_study_luyen_tap.service.IFacilityService1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FacilityServiceImpl1 implements IFacilityService1 {
private static Scanner scanner= new Scanner(System.in);
private static List<Facility1>facility1List= new LinkedList<>();
    @Override
    public void display() {
        for (Facility1 facility1:facility1List) {
            System.out.println(facility1);
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
