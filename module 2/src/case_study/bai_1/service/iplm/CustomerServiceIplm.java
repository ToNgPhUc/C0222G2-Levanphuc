package case_study.bai_1.service.iplm;

import case_study.bai_1.common.check_try_catch.CheckTryCatch;
import case_study.bai_1.common.read_writer.ReadWriterToFileCustomer;
import case_study.bai_1.model.Customer;
import case_study.bai_1.model.IdComparator;
import case_study.bai_1.model.NameComparator;
import case_study.bai_1.service.ICustomerService;

import java.util.*;

public class CustomerServiceIplm implements ICustomerService {
    private static ReadWriterToFileCustomer readWriterToFileCustomer = new ReadWriterToFileCustomer();
    private static Scanner scanner = new Scanner(System.in);
    public static List<Customer> customerList = new LinkedList<>();

    @Override
    public void display() {
        System.out.println("-----DANH SÁCH KHÁCH HÀNG-----");

        customerList = readWriterToFileCustomer.readToFileCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
        System.out.println("chon sap xeeps");
        boolean flag = true;
        while (flag) {
            System.out.println(" 1 sap xep theo ten\n" +
                    "2.sapws xeeps theo id");
            System.out.println(" nhap lua chon");
            int chon = CheckTryCatch.getChoiceInteger();
            switch (chon) {
                case 1:
                    Collections.sort(customerList, new NameComparator());
                    System.out.println(" sau khi sap xep theo ten");

                    for (Customer customer : customerList) {
                        System.out.println(customer);
                    }
                    break;
                case 2:
//                    Collections.sort(customerList);
                    Collections.sort(customerList, new IdComparator());
                    System.out.println(" sau khi sap xep id");

                    for (Customer customer : customerList) {
                        System.out.println(customer.getInFor());
                    }
                    break;
                case 3:flag= false;
                break;
                default:
                    System.out.println("nhaapj ngu nhaapj laij");
                    break;
            }
        }



    }

    @Override
    public void add() {
        customerList = readWriterToFileCustomer.readToFileCustomer();

        System.out.println("-----ADD NEW CUSTOMER-------");

        System.out.println(" xin mời thêm mới họ tên ");
        String name = scanner.nextLine();
        System.out.println(" xin mời thêm mới ngày sinh ");
        String dateOfBirth = scanner.nextLine();
        System.out.println(" xin mời thêm mới giới tính ");
        String gender = scanner.nextLine();

        System.out.println("xin mời thêm mới chứng minh nhân dân");
        Integer identityCardNumber = CheckTryCatch.getChoiceInteger();


        System.out.println("xin mời thêm mới số điện thoại");
        Integer phoneNumber = CheckTryCatch.getChoiceInteger();

        System.out.println("xin mời thêm mới email");
        String email = scanner.nextLine();
        System.out.println("xin mời thêm mới mã khách hàng");
        String customerCode = scanner.nextLine();
        System.out.println("xin mời thêm mới loại khách");
        String typeOfGuest = scanner.nextLine();
        System.out.println("xin mời thêm mới địa chỉ");
        String address = scanner.nextLine();
        Customer customer = new Customer(name, dateOfBirth, gender, identityCardNumber, phoneNumber, email,
                customerCode, typeOfGuest, address);
        customerList.add(customer);
        readWriterToFileCustomer.writerToFileCustomer(customerList);
    }

    @Override
    public void edit() {
        customerList = readWriterToFileCustomer.readToFileCustomer();
        System.out.println("---- EDIT CUSTOMER----");
        System.out.println("nhập mã khách hàng để kiểm tra");
        String customerCode = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerCode.equals(customerList.get(i).getCustomerCode())) {
                flag = true;

                System.out.println("xin mời sửa lại họ tên");
                customerList.get(i).setName(scanner.nextLine());

                System.out.println("xin mời sửa lại ngày sinh");
                customerList.get(i).setDateOfBirth(scanner.nextLine());

                System.out.println("xin mời sửa lại giới tính");
                customerList.get(i).setGender(scanner.nextLine());

                System.out.println("xin mời sửa lại chứng minh nhân dân");
                Integer IdentityCardNumber = CheckTryCatch.getChoiceInteger();
                customerList.get(i).setIdentityCardNumber(IdentityCardNumber);


                System.out.println("xin mời sửa lại số điện thoại");
                Integer phoneNumber = CheckTryCatch.getChoiceInteger();
                customerList.get(i).setPhoneNumber(phoneNumber);

                System.out.println("xin mời sửa lại email");
                customerList.get(i).setEmail(scanner.nextLine());

                System.out.println("xin mời sửa lại mã khách hàng");
                customerList.get(i).setCustomerCode(scanner.nextLine());

                System.out.println("xin mời sửa lại loại khách");
                customerList.get(i).setTypeOfGuest(scanner.nextLine());

                System.out.println("xin mời sửa lại địa chỉ");
                customerList.get(i).setAddress(scanner.nextLine());

                readWriterToFileCustomer.writerToFileCustomer(customerList);

            }
        }
        if (flag) {
            System.out.println("không có mã khách hàng " + customerCode + " ở trong danh sách");
        }

    }
}
