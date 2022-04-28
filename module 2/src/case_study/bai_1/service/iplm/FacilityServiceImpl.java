package case_study.bai_1.service.iplm;

import case_study.bai_1.common.validata.ValidataFacility;
import case_study.bai_1.model.Facility;
import case_study.bai_1.model.House;
import case_study.bai_1.model.Room;
import case_study.bai_1.model.Villa;
import case_study.bai_1.service.IFacilityService;

import java.util.*;

import static java.lang.String.valueOf;

public class FacilityServiceImpl implements IFacilityService {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilityHashMap = new LinkedHashMap<Facility,Integer>();

    static {
        facilityHashMap.put(new House("SVHO-1234", "Cho Thuê ", 100, 100000, 10, "theo tháng", "5 sao", 5), 6);
        facilityHashMap.put(new Villa("SVVL-1234", " Khu nghỉ dưỡng ", 1000, 1000000, 10, "theo tháng", "5 sao", 100, 10), 3);
        facilityHashMap.put(new Room("SVRO-1234", "Cho thuê", 100, 100000, 10, "theo tháng", "miễn phí ăn sáng"), 1);
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
        boolean flag = true;
        while (flag) {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            System.out.println("xin mời chọn thêm loại dịch vụ");
            int chon;
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("----CHƯƠNG TRÌNH THÊM MỚI VILLA----");
                    System.out.println("xin mời thêm mã dịch vụ");
                    String maDichVuVilla = scanner.nextLine();

//                    while (!ValidataFacility.isMatChesMaDichVu(maDichVuVilla)) {
//                        System.out.println("mã dịch vụ không đúng");
//                        maDichVuVilla = scanner.nextLine();
//                    }

                    System.out.println("xin mời thêm tên dịch vụ");
                    String tenDichVuVilla = scanner.nextLine();
//
//                    while (!ValidataFacility.isMatChesTenDichVu(tenDichVuVilla)) {
//                        System.out.println("tên dịch vụ không đúng");
//                        tenDichVuVilla = scanner.nextLine();
//                    }
                    System.out.println("xin mời thêm diện tích");
                    Double areaVilla = Double.parseDouble(scanner.nextLine());
//
//                    while (!ValidataFacility.isMatChesDienTichSuDung(String.valueOf(areaVilla))) {
//                    System.out.println("diện tích không phù hợp");
//                    areaVilla = Double.parseDouble(scanner.nextLine());
//                }

                System.out.println("xin mời thêm chi phí thuê");
                Double chiPhiThueVilla = Double.parseDouble(scanner.nextLine());

                System.out.println("xin mời thêm số lượng người tối đa");
                Integer peoplemaxVilla = Integer.parseInt(scanner.nextLine());

                System.out.println("xin mời thêm kiểu thuê");
                String kieuThueVilla = scanner.nextLine();

                System.out.println("xin mời thêm tiêu chuẩn phòng");
                String tieuChuanPhongVilla = scanner.nextLine();

                System.out.println("xin mời thêm diện tích hồ bơi");
                Double dienTicHoBoi = Double.parseDouble(scanner.nextLine());
//
//                while (!ValidataFacility.isMatChesDienTichHoBoi(String.valueOf(dienTicHoBoi))) {
//                    System.out.println("diện tích không phù hợp");
//                    dienTicHoBoi = Double.parseDouble(scanner.nextLine());
//                }

                System.out.println(" xin mời thêm số tầng");
                Integer soTangVilla = Integer.parseInt(scanner.nextLine());

                Villa villa = new Villa(maDichVuVilla, tenDichVuVilla, areaVilla, chiPhiThueVilla, peoplemaxVilla, kieuThueVilla, tieuChuanPhongVilla, dienTicHoBoi, soTangVilla);
                facilityHashMap.put(villa, 1);
                System.out.println(facilityHashMap);

                break;
                case 2:
                    System.out.println("----CHƯƠNG TRÌNH THÊM MỚI HOUSE----");
                    System.out.println("xin mời thêm mã dịch vụ");
                    String maDichVuHouse = scanner.nextLine();
//
//                    while (!ValidataFacility.isMatChesMaDichVu(maDichVuHouse)) {
//                        System.out.println("mã dịch vụ không đúng");
//                        maDichVuHouse = scanner.nextLine();
//                    }

                    System.out.println("xin mời thêm tên dịch vụ");
                    String tenDichVuHouse = scanner.nextLine();

//                    while (!ValidataFacility.isMatChesTenDichVu(tenDichVuHouse)) {
//                        System.out.println("mã dịch vụ không đúng");
//                        tenDichVuHouse = scanner.nextLine();
//                    }


                    System.out.println("xin mời thêm diện tích");
                    Double areaHouse = Double.parseDouble(scanner.nextLine());

//                    while (!ValidataFacility.isMatChesDienTichSuDung(String.valueOf(areaHouse))) {
//                        System.out.println("diện tích không phù hợp");
//                        areaHouse = Double.parseDouble(scanner.nextLine());
//                    }

                    System.out.println("xin mời thêm chi phí thuê");
                    Double chiPhiThue = Double.parseDouble(scanner.nextLine());

                    System.out.println("xin mời thêm số lượng người tối đa");
                    Integer peoplemax = Integer.parseInt(scanner.nextLine());

                    System.out.println("xin mời thêm kiểu thuê");
                    String kieuThue = scanner.nextLine();

                    System.out.println("xin mời thêm tiêu chuẩn phòng");
                    String tieuChuanPhong = scanner.nextLine();

                    System.out.println("xin mời thêm số tầng");
                    Integer soTang = Integer.parseInt(scanner.nextLine());
                    House house = new House(maDichVuHouse, tenDichVuHouse, areaHouse, chiPhiThue, peoplemax, kieuThue, tieuChuanPhong, soTang);
                    facilityHashMap.put(house, 1);
                    break;
                case 3:
                    System.out.println("----CHƯƠNG TRÌNH THÊM MỚI ROOM----");
                    System.out.println("xin mời thêm mã dịch vụ");
                    String maDichVuRoom = scanner.nextLine();

                    while (!ValidataFacility.isMatChesMaDichVu(maDichVuRoom)) {
                        System.out.println("mã dịch vụ không đúng");
                        maDichVuRoom = scanner.nextLine();
                    }

                    System.out.println("xin mời thêm tên dịch vụ");
                    String tenDichVuRoom = scanner.nextLine();
                    while (!ValidataFacility.isMatChesTenDichVu(tenDichVuRoom)) {
                        System.out.println("mã dịch vụ không đúng");
                        tenDichVuRoom = scanner.nextLine();
                    }

                    System.out.println("xin mời thêm diện tích");
                    Double areaRoom = Double.valueOf(scanner.nextLine());
                    while (!ValidataFacility.isMatChesDienTichSuDung(String.valueOf(areaRoom))) {
                    System.out.println("diện tích không phù hợp");
                    areaRoom = Double.valueOf(scanner.nextLine());
                }

                System.out.println("xin mời thêm chi phí thuê");
                double chiPhiThueRoom = Double.parseDouble(scanner.nextLine());

                System.out.println("xin mời thêm số lượng người tối đa");
                int peoplemaxRoom = Integer.parseInt(scanner.nextLine());

                System.out.println("xin mời thêm kiểu thuê");
                String kieuThueRoom = scanner.nextLine();

                System.out.println(" xin mời thêm dịch vụ miễn phí đi kèm");
                String dichVuMienPhi = scanner.nextLine();
                Room room = new Room(maDichVuRoom, tenDichVuRoom, areaRoom, chiPhiThueRoom, peoplemaxRoom, kieuThueRoom, dichVuMienPhi);
                facilityHashMap.put(room, 1);

                break;
                case 4:
                    flag = false;
                default:
                    System.out.println("xin hãy chọn lại");
            }
        }

    }

    @Override
    public void displayFacilityManagement() {

        Set<Facility> keySet = facilityHashMap.keySet();
        for (Facility key : keySet) {
            if (facilityHashMap.get(key) > 4) ;
            System.out.println(key +" "+ facilityHashMap.get(key));

        }
    }
    @Override

    public void edit() {
//        System.out.println("nhập mã dịch vụ");
//        String maDichVu = scanner.nextLine();
//
//        Set<Facility> keySet = facilityHashMap.keySet();
//        List<Facility> facilityList = new ArrayList<>(keySet);
//        boolean flag = false;
//        for (int i = 0; i < facilityList.size(); i++) {
//            if (maDichVu.equals(facilityList.get(i).getMaDichVu())) {
//                flag = true;
//
//            }
//        }
//        if (flag == false) {
//            System.out.println(" không có mã [ "+maDichVu+" ] ở trong danh sách");
//        }

    }
}

//    Set<String> keySet = studentPerformanceMap.keySet();
//
//    // Creating an ArrayList of keys
//    List<String> listOfKeys = new ArrayList<String>(keySet);
//
//        System.out.println("ArrayList Of Keys :");
//        for (String key : listOfKeys) {
//        System.out.println(key);
//    }
//
//        System.out.println("--------------------------");
