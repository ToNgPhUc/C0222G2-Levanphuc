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
    public static boolean ngoaiLe = true;
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Facility, Integer> facilityHashMap = new LinkedHashMap<>();

    private static List<House> houseList = new ArrayList<>();
    private static List<Villa> villaList = new ArrayList<>();
    private static List<Room> roomList = new ArrayList<>();


    static {
        villaList.add(new Villa("SVVL-1234", " Khu nghỉ dưỡng ", 1000, 1000000, 10, "theo tháng", "5 sao", 100, 10));
        roomList.add(new Room("SVRO-1234", "Cho thuê", 100, 100000, 10, "theo tháng", "miễn phí ăn sáng"));
        houseList.add(new House("SVHO-1234", "Cho Thuê ", 100, 100000, 10, "theo tháng", "5 sao", 5));
    }

    static {
        House house = new House("SVHO-1234", "Cho Thuê ", 100, 100000, 10, "theo tháng", "5 sao", 5);
        Villa villa = new Villa("SVVL-1234", " Khu nghỉ dưỡng ", 1000, 1000000, 10, "theo tháng", "5 sao", 100, 10);
        Room room = new Room("SVRO-1234", "Cho thuê", 100, 100000, 10, "theo tháng", "miễn phí ăn sáng");


        facilityHashMap.put(house, 6);
        facilityHashMap.put(villa, 3);
        facilityHashMap.put(room, 1);
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
        while (ngoaiLe) {
            try {

                System.out.println("----CHƯƠNG TRÌNH THÊM MỚI ROOM----");
                System.out.println("xin mời thêm mã dịch vụ");
                String maDichVuRoom = scanner.nextLine();

                while (!ValidataFacility.soSanhMaDichVuRoom(maDichVuRoom)) {
                    System.out.println("mã dịch vụ không đúng");
                    maDichVuRoom = scanner.nextLine();
                }

                System.out.println("xin mời thêm tên dịch vụ");
                String tenDichVuRoom = scanner.nextLine();

                while (!ValidataFacility.soSanhTenDichVu(tenDichVuRoom)) {
                    System.out.println("mã dịch vụ không đúng");
                    tenDichVuRoom = scanner.nextLine();
                }

                System.out.println("xin mời thêm diện tích");
                Double areaRoom = Double.parseDouble(scanner.nextLine());

                while (!ValidataFacility.soSanhDienTichSuDungVaHoBoi(String.valueOf(areaRoom))) {
                    System.out.println("diện tích không phù hợp");
                    areaRoom = Double.parseDouble(scanner.nextLine());
                }

                System.out.println("xin mời thêm chi phí thuê");
                double chiPhiThueRoom = Double.parseDouble(scanner.nextLine());

                while (!ValidataFacility.soSanhChiPhiThue(String.valueOf(chiPhiThueRoom))) {
                    System.out.println("nhập chi phí thuê không phù hợp");
                    chiPhiThueRoom = Double.parseDouble(scanner.nextLine());
                }

                System.out.println("xin mời thêm số lượng người tối đa");
                int soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());

                while (!ValidataFacility.soSanhsoNguoiToiDa(String.valueOf(soLuongNguoiToiDa))) {
                    System.out.println("nhập số người không phù hợp");
                    soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());

                }

                System.out.println("xin mời thêm kiểu thuê");
                String kieuThueRoom = scanner.nextLine();

                while (!ValidataFacility.soSanhKieuThue(kieuThueRoom)) {
                    System.out.println("nhập kiểu thuê không phù hợp");
                    kieuThueRoom = scanner.nextLine();
                }


                System.out.println(" xin mời thêm dịch vụ miễn phí đi kèm");
                String dichVuMienPhi = scanner.nextLine();
                Room room = new Room(maDichVuRoom, tenDichVuRoom, areaRoom, chiPhiThueRoom, soLuongNguoiToiDa, kieuThueRoom, dichVuMienPhi);
                facilityHashMap.put(room, 1);

                ngoaiLe = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("bạn nhập không hợp lệ, vui lòng nhập lại từ đầu");
                ngoaiLe = true;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("bạn nhập không hợp lệ, vui lòng nhập lại từ đầu");
                ngoaiLe = true;
            }
        }
    }

    private void addNewHouse() {
        while (ngoaiLe) {
            try {

                System.out.println("----CHƯƠNG TRÌNH THÊM MỚI HOUSE----");
                System.out.println("xin mời thêm mã dịch vụ");
                String maDichVuHouse = scanner.nextLine();
////
                while (!ValidataFacility.soSanhMaDichVuHouse(maDichVuHouse)) {
                    System.out.println("mã dịch vụ không đúng");
                    maDichVuHouse = scanner.nextLine();
                }

                System.out.println("xin mời thêm tên dịch vụ");
                String tenDichVuHouse = scanner.nextLine();

                while (!ValidataFacility.soSanhTenDichVu(tenDichVuHouse)) {
                    System.out.println("mã dịch vụ không đúng");
                    tenDichVuHouse = scanner.nextLine();
                }


                System.out.println("xin mời thêm diện tích");
                double dienTichHouse = Double.parseDouble(scanner.nextLine());

                while (!ValidataFacility.soSanhDienTichSuDungVaHoBoi(String.valueOf(dienTichHouse))) {
                    System.out.println("diện tích không phù hợp");
                    dienTichHouse = Double.parseDouble(scanner.nextLine());
                }


                System.out.println("xin mời thêm chi phí thuê");
                Double chiPhiThueHouse = Double.parseDouble(scanner.nextLine());


                while (!ValidataFacility.soSanhChiPhiThue(String.valueOf(chiPhiThueHouse))) {
                    System.out.println("nhập chi phí thuê không phù hợp");
                    chiPhiThueHouse = Double.parseDouble(scanner.nextLine());
                }

                System.out.println("xin mời thêm số lượng người tối đa");
                Integer soNguoiToiDaHouse = Integer.parseInt(scanner.nextLine());

                while (!ValidataFacility.soSanhsoNguoiToiDa(String.valueOf(soNguoiToiDaHouse))) {
                    System.out.println("nhập số người không phù hợp");
                    soNguoiToiDaHouse = Integer.parseInt(scanner.nextLine());

                }

                System.out.println("xin mời thêm kiểu thuê");
                String kieuThueHouse = scanner.nextLine();

                while (!ValidataFacility.soSanhKieuThue(kieuThueHouse)) {
                    System.out.println("nhập kiểu thuê không phù hợp");
                    kieuThueHouse = scanner.nextLine();
                }

                System.out.println("xin mời thêm tiêu chuẩn phòng");
                String tieuChuanPhongHouse = scanner.nextLine();

                while (!ValidataFacility.soSanhTieuChuanPhong(tieuChuanPhongHouse)) {
                    System.out.println("nhập tiêu chuẩn phòng không phù hợp");
                    tieuChuanPhongHouse = scanner.nextLine();
                }
                System.out.println("xin mời thêm số tầng");
                Integer soTangHouse = Integer.parseInt(scanner.nextLine());

                while (!ValidataFacility.soSanhSoTang(String.valueOf(soTangHouse))) {
                    System.out.println("nhập số tầng không phù hợp");
                    soTangHouse = Integer.parseInt(scanner.nextLine());
                }

                House house = new House(maDichVuHouse, tenDichVuHouse, dienTichHouse, chiPhiThueHouse, soNguoiToiDaHouse, kieuThueHouse, tieuChuanPhongHouse, soTangHouse);
                facilityHashMap.put(house, 1);

                ngoaiLe = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("bạn nhập không hợp lệ, vui lòng nhập lại từ đầu");
                ngoaiLe = true;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("bạn nhập không hợp lệ, vui lòng nhập lại từ đầu");
                ngoaiLe = true;
            }
        }
    }

    private void addNewVilla() {
        while (ngoaiLe) {
            try {

                System.out.println("----CHƯƠNG TRÌNH THÊM MỚI VILLA----");
                System.out.println("xin mời thêm mã dịch vụ");
                String maDichVuVilla = scanner.nextLine();

                while (!ValidataFacility.soSanhMaDichVuVilla(maDichVuVilla)) {
                    System.out.println("nhập mã dịch vụ không phù hợp");
                    maDichVuVilla = scanner.nextLine();
                }

                System.out.println("xin mời thêm tên dịch vụ");
                String tenDichVuVilla = scanner.nextLine();

                while (!ValidataFacility.soSanhTenDichVu(tenDichVuVilla)) {
                    System.out.println("nhập tên dịch vụ không phù hợp");
                    tenDichVuVilla = scanner.nextLine();
                }

                System.out.println("xin mời thêm diện tích");
                Double areaVilla = Double.parseDouble(scanner.nextLine());

                while (!ValidataFacility.soSanhDienTichSuDungVaHoBoi(String.valueOf(areaVilla))) {
                    System.out.println("nhập diện tích không phù hợp");
                    areaVilla = Double.valueOf(scanner.nextLine());
                }

                System.out.println("xin mời thêm chi phí thuê");
                Double chiPhiThueVilla = Double.parseDouble(scanner.nextLine());

                while (!ValidataFacility.soSanhChiPhiThue(String.valueOf(chiPhiThueVilla))) {
                    System.out.println("nhập chi phí thuê không phù hợp");
                    chiPhiThueVilla = Double.parseDouble(scanner.nextLine());
                }

                System.out.println("xin mời thêm số lượng người tối đa");
                Integer peoplemaxVilla = Integer.parseInt(scanner.nextLine());

                while (!ValidataFacility.soSanhsoNguoiToiDa(String.valueOf(peoplemaxVilla))) {
                    System.out.println("nhập số người không phù hợp");
                    peoplemaxVilla = Integer.parseInt(scanner.nextLine());

                }
                System.out.println("xin mời thêm kiểu thuê");
                String kieuThueVilla = scanner.nextLine();

                while (!ValidataFacility.soSanhKieuThue(kieuThueVilla)) {
                    System.out.println("nhập kiểu thuê không phù hợp");
                    kieuThueVilla = scanner.nextLine();
                }

                System.out.println("xin mời thêm tiêu chuẩn phòng");
                String tieuChuanPhongVilla = scanner.nextLine();

                while (!ValidataFacility.soSanhTieuChuanPhong(tieuChuanPhongVilla)) {
                    System.out.println("nhập tiêu chuẩn phòng không phù hợp");
                    tieuChuanPhongVilla = scanner.nextLine();
                }

                System.out.println("xin mời thêm diện tích hồ bơi");
                Double dienTicHoBoiVilla = Double.parseDouble(scanner.nextLine());
//
                while (!ValidataFacility.soSanhDienTichSuDungVaHoBoi(String.valueOf(dienTicHoBoiVilla))) {
                    System.out.println("nhập diện tích không phù hợp");
                    dienTicHoBoiVilla = Double.parseDouble(scanner.nextLine());
                }

                System.out.println(" xin mời thêm số tầng");
                Integer soTangVilla = Integer.parseInt(scanner.nextLine());
//
                while (!ValidataFacility.soSanhSoTang(String.valueOf(soTangVilla))) {
                    System.out.println("nhập số tầng không phù hợp");
                    soTangVilla = Integer.parseInt(scanner.nextLine());
                }

                Villa villa = new Villa(maDichVuVilla, tenDichVuVilla, areaVilla, chiPhiThueVilla, peoplemaxVilla, kieuThueVilla, tieuChuanPhongVilla, dienTicHoBoiVilla, soTangVilla);
                facilityHashMap.put(villa, 1);
                System.out.println(villa);

                ngoaiLe = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("bạn nhập không hợp lệ, vui lòng nhập lại từ đầu");
                ngoaiLe = true;
            }catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("bạn nhập không hợp lệ, vui lòng nhập lại từ đầu");
                ngoaiLe = true;
            }
        }
    }

    @Override
    public void displayFacilityManagement() {

        Set<Facility> keySet = facilityHashMap.keySet();
        for (Facility key : keySet) {
            if (facilityHashMap.get(key) > 4) {
                System.out.println(key + " " + facilityHashMap.get(key));
            }

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
