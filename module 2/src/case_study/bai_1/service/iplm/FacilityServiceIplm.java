package case_study.bai_1.service.iplm;

import case_study.bai_1.common.check_try_catch.CheckTryCatch;
import case_study.bai_1.common.read_writer.ReadWriterToFileHouse;
import case_study.bai_1.common.read_writer.ReadWriterToFileRoom;
import case_study.bai_1.common.read_writer.ReadWriterToFileVilla;
import case_study.bai_1.common.validata.ValidataFacility;
import case_study.bai_1.model.Facility;
import case_study.bai_1.model.House;
import case_study.bai_1.model.Room;
import case_study.bai_1.model.Villa;
import case_study.bai_1.service.IFacilityService;

import java.util.*;


public class FacilityServiceIplm implements IFacilityService {

    Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilityHashMap = new LinkedHashMap<>();

    private static ReadWriterToFileHouse readWriterToFileHouse = new ReadWriterToFileHouse();
    private static ReadWriterToFileVilla readWriterToFileVilla = new ReadWriterToFileVilla();
    private static ReadWriterToFileRoom readWriterToFileRoom = new ReadWriterToFileRoom();

    private static List<Facility> facilityListManagement = new ArrayList<>();
    private static List<Villa> villaList = new ArrayList<>();
    private static List<Room> roomList = new ArrayList<>();
    private static List<House> houseList = new ArrayList<>();


//    static {
//        House house = new House("SVHO-1234", "House", 100.0, 1000.0, 100, "theo tháng", "5 sao", 5);
//        Villa villa = new Villa("SVVL-1234", "Villa", 1000.0, 1000000.0, 10, "theo tháng", "5 sao", 100.0, 10);
//        Room room = new Room("SVRO-1234", "Room", 100.0, 100000.0, 10, "theo tháng", "miễn phí ăn sáng");
//        houseList.add(house);
//        villaList.add(villa);
//        roomList.add(room);
//
//        readWriterToFileHouse.writerToFileHouse(houseList);
//        readWriterToFileVilla.writerToFileVilla(villaList);
//        readWriterToFileRoom.writerToFileRoom(roomList);
//
//        facilityHashMap.put(house, 1);
//        facilityHashMap.put(villa, 4);
//        facilityHashMap.put(room, 1);
//
//    }

    @Override
    public void display() {
        for (Facility facility : facilityHashMap.keySet()) {
            System.out.println(facility + " value: " + facilityHashMap.get(facility));
        }

    }

    @Override
    public void add() {

        boolean flag = true;
        while (flag) {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            System.out.println("xin mời chọn thêm loại dịch vụ");

            int chon = CheckTryCatch.getChoiceInteger();

            switch (chon) {

                case 1:
                    addNewVilla();

                    break;
                case 2:
                    addNewHouse();
                    break;

                case 3:
                    addNewRoom();
                    break;

                case 4:
                    flag = false;
                default:
                    System.out.println("xin hãy chọn lại");
            }
        }
    }

    private void addNewRoom() {
        roomList = readWriterToFileRoom.readToFileRoom();

        System.out.println("----ADD NEW ROOM----");
        System.out.println("xin mời thêm mã dịch vụ ");
        String serviceCodeRoom = scanner.nextLine();

        while (!ValidataFacility.matchesServiceCodeRoom(serviceCodeRoom)) {
            System.out.println("mã dịch vụ không đúng");
            serviceCodeRoom = scanner.nextLine();
        }

        System.out.println("xin mời thêm tên dịch vụ");
        String serviceNameRoom = scanner.nextLine();

        while (!ValidataFacility.matchesServiceName(serviceNameRoom)) {
            System.out.println("tên dịch vụ không đúng");
            serviceNameRoom = scanner.nextLine();
        }

        System.out.println("xin mời thêm diện tích");
        Double areaRoom = CheckTryCatch.getChoiceDouble();

        while (!ValidataFacility.matchesArea(String.valueOf(areaRoom))) {
            System.out.println("diện tích không phù hợp");
            areaRoom = CheckTryCatch.getChoiceDouble();
        }

        System.out.println("xin mời thêm chi phí thuê");
        double rentalCostsRoom = CheckTryCatch.getChoiceDouble();

        while (!ValidataFacility.matchesRentalCosts(String.valueOf(rentalCostsRoom))) {
            System.out.println("nhập chi phí thuê không phù hợp");
            rentalCostsRoom = CheckTryCatch.getChoiceDouble();
        }

        System.out.println("xin mời thêm số lượng người tối đa");
        int maximumNumberOfPeopleRoom = CheckTryCatch.getChoiceInteger();

        while (!ValidataFacility.matchesPeopleMax(String.valueOf(maximumNumberOfPeopleRoom))) {
            System.out.println("nhập số người không phù hợp");
            maximumNumberOfPeopleRoom = CheckTryCatch.getChoiceInteger();
        }

        System.out.println("xin mời thêm kiểu thuê");
        String rentalTypeRoom = scanner.nextLine();

        while (!ValidataFacility.matchesRentalType(rentalTypeRoom)) {
            System.out.println("nhập kiểu thuê không phù hợp");
            rentalTypeRoom = scanner.nextLine();
        }
        System.out.println(" xin mời thêm dịch vụ miễn phí ");
        String freeServiceRoom = scanner.nextLine();
        Room room = new Room(serviceCodeRoom, serviceNameRoom, areaRoom, rentalCostsRoom, maximumNumberOfPeopleRoom,
                rentalTypeRoom, freeServiceRoom);

        addListFacility(room);

        roomList.add(room);
        readWriterToFileRoom.writerToFileRoom(roomList);

    }

    private void addNewHouse() {
        houseList = readWriterToFileHouse.readToFileHouse();
        System.out.println("----ADD NEW HOUSE----");
        System.out.println("xin mời thêm mã dịch vụ");
        String serviceCodeHouse = scanner.nextLine();

        while (!ValidataFacility.matchesServiceCodeHouse(serviceCodeHouse)) {
            System.out.println("mã dịch vụ không đúng định dạng");
            serviceCodeHouse = scanner.nextLine();
        }

        System.out.println("xin mời thêm tên dịch vụ");
        String serviceNameHouse = scanner.nextLine();

        while (!ValidataFacility.matchesServiceName(serviceNameHouse)) {
            System.out.println("tên dịch vụ không đúng định dạng");
            serviceNameHouse = scanner.nextLine();
        }

        System.out.println("xin mời thêm diện tích");
        double areaHouse = CheckTryCatch.getChoiceDouble();

        while (!ValidataFacility.matchesArea(String.valueOf(areaHouse))) {
            System.out.println("diện tích không đúng định dạng");
            areaHouse = CheckTryCatch.getChoiceDouble();
        }

        System.out.println("xin mời thêm chi phí thuê");
        Double rentalCostsHouse = CheckTryCatch.getChoiceDouble();


        while (!ValidataFacility.matchesRentalCosts(String.valueOf(rentalCostsHouse))) {
            System.out.println("nhập chi phí thuê không đúng định dạng");
            rentalCostsHouse = CheckTryCatch.getChoiceDouble();
        }

        System.out.println("xin mời thêm số lượng người tối đa");
        Integer maximumNumberOfPeopleHouse = CheckTryCatch.getChoiceInteger();

        while (!ValidataFacility.matchesPeopleMax(String.valueOf(maximumNumberOfPeopleHouse))) {
            System.out.println("nhập số người không đúng định dạng");
            maximumNumberOfPeopleHouse = CheckTryCatch.getChoiceInteger();
        }

        System.out.println("xin mời thêm kiểu thuê");
        String rentalTypeHouse = scanner.nextLine();

        while (!ValidataFacility.matchesRentalType(rentalTypeHouse)) {
            System.out.println("nhập kiểu thuê không đúng định dạng");
            rentalTypeHouse = scanner.nextLine();
        }

        System.out.println("xin mời thêm tiêu chuẩn phòng");
        String roomStandardHouse = scanner.nextLine();

        while (!ValidataFacility.matchesRoomStandard(roomStandardHouse)) {
            System.out.println("nhập tiêu chuẩn phòng không đúng định dạng");
            roomStandardHouse = scanner.nextLine();
        }
        System.out.println("xin mời thêm số tầng");
        Integer numberOfFloorsHouse = CheckTryCatch.getChoiceInteger();

        while (!ValidataFacility.matchesNumberOfFloors(String.valueOf(numberOfFloorsHouse))) {
            System.out.println("nhập số tầng không đúng định dạng");
            numberOfFloorsHouse = CheckTryCatch.getChoiceInteger();
        }
        House house = new House(serviceCodeHouse, serviceNameHouse, areaHouse, rentalCostsHouse
                , maximumNumberOfPeopleHouse, rentalTypeHouse, roomStandardHouse, numberOfFloorsHouse);
        addListFacility(house);
        houseList.add(house);
        readWriterToFileHouse.writerToFileHouse(houseList);

    }

    private void addNewVilla() {
        villaList = readWriterToFileVilla.readToFileVilla();

        System.out.println("----ADD NEW VILLA----");

        System.out.println("xin mời thêm mã dịch vụ");
        String serviceCodeVilla = scanner.nextLine();

        while (!ValidataFacility.matchesServiceCodeVilla(serviceCodeVilla)) {
            System.out.println("nhập mã dịch vụ không phù hợp");
            serviceCodeVilla = scanner.nextLine();
        }

        System.out.println("xin mời thêm tên dịch vụ");
        String serviceNameVilla = scanner.nextLine();

        while (!ValidataFacility.matchesServiceName(serviceNameVilla)) {
            System.out.println("nhập tên dịch vụ không phù hợp");
            serviceNameVilla = scanner.nextLine();
        }

        System.out.println("xin mời thêm diện tích");
        Double areaVilla = CheckTryCatch.getChoiceDouble();

        while (!ValidataFacility.matchesArea(String.valueOf(areaVilla))) {
            System.out.println("nhập diện tích không phù hợp");
            areaVilla = CheckTryCatch.getChoiceDouble();
        }

        System.out.println("xin mời thêm chi phí thuê");
        Double rentalCostsVilla =CheckTryCatch.getChoiceDouble();

        while (!ValidataFacility.matchesRentalCosts(String.valueOf(rentalCostsVilla))) {
            System.out.println("nhập chi phí thuê không phù hợp");
            rentalCostsVilla = CheckTryCatch.getChoiceDouble();
        }

        System.out.println("xin mời thêm số lượng người tối đa");
        Integer peopleMaxVilla = CheckTryCatch.getChoiceInteger();

        while (!ValidataFacility.matchesPeopleMax ( String.valueOf(peopleMaxVilla) )) {
            System.out.println("nhập số người không phù hợp");
            peopleMaxVilla = CheckTryCatch.getChoiceInteger();
        }

        System.out.println("xin mời thêm kiểu thuê");
        String rentalTypeVilla = scanner.nextLine();

        while (!ValidataFacility.matchesRentalType(rentalTypeVilla)) {
            System.out.println("nhập kiểu thuê không phù hợp");
            rentalTypeVilla = scanner.nextLine();
        }

        System.out.println("xin mời thêm tiêu chuẩn phòng");
        String roomStandardVilla = scanner.nextLine();

        while (!ValidataFacility.matchesRoomStandard(roomStandardVilla)) {
            System.out.println("nhập tiêu chuẩn phòng không phù hợp");
            roomStandardVilla = scanner.nextLine();
        }

        System.out.println("xin mời thêm diện tích hồ bơi");
        Double swimmingPoolAreaVilla = CheckTryCatch.getChoiceDouble();

        while (!ValidataFacility.matchesArea(String.valueOf(swimmingPoolAreaVilla))) {
            System.out.println("nhập diện tích không phù hợp");
            swimmingPoolAreaVilla = CheckTryCatch.getChoiceDouble();
        }

        System.out.println(" xin mời thêm số tầng");
        Integer numberOfFloorsVilla =CheckTryCatch.getChoiceInteger();

        while (!ValidataFacility.matchesNumberOfFloors(String.valueOf(numberOfFloorsVilla))) {
            System.out.println("nhập số tầng không phù hợp");
            numberOfFloorsVilla = CheckTryCatch.getChoiceInteger();
        }

        Villa villa = new Villa(serviceCodeVilla, serviceNameVilla, areaVilla, rentalCostsVilla, peopleMaxVilla,
                rentalTypeVilla, roomStandardVilla, swimmingPoolAreaVilla, numberOfFloorsVilla);

        addListFacility(villa);

        villaList.add(villa);
        readWriterToFileVilla.writerToFileVilla(villaList);

    }

    @Override
    public void displayFacilityManagement() {
        if (!facilityListManagement.isEmpty()) {
            for (Facility facility : facilityListManagement) {
                System.out.println(facility);
            }
        } else {
            System.err.println("danh sách đang trống !");
        }
    }

    @Override
    public void addListFacility(Facility facility) {

        if (facilityHashMap.isEmpty()) {
            facilityHashMap.put(facility, 1);
        } else {
            boolean flag = true;
            for (Facility key : facilityHashMap.keySet()) {
                if (facility.equals(key)) {
                    facilityManagementCheck(key);
                    facilityHashMap.put(key, facilityHashMap.get(key) + 1);
                    flag = false;
                }
            }
            if (flag) {
                facilityHashMap.put(facility, 1);
            }
        }
    }

    @Override
    public void facilityManagementCheck(Facility facility) {
        if (facilityHashMap.get(facility) >= 2) {
            System.err.println("dịch vụ đang bảo trì !");
            facilityListManagement.add(facility);
            facilityHashMap.put(facility, 0);
        }
    }

    @Override

    public void edit() {
    }

}
