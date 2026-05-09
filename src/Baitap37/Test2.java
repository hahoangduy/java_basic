package Baitap37;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ViettelManager vm = new ViettelManager();
        int choice;
        do {
            System.out.println("                           ----- NHÀ MẠNG VIETTEL -----");
            System.out.println("1. Đăng ký mạng | 2. Hiển thị danh sách khách hàng theo gói | 3. Family Package with 'Safe Web' | 4. Tắt chương trình");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mời bạn chọn gói cước đăng ký: ");
                    System.out.println("1. Student Package - 120.000 VNĐ/month| 2. Family Package - 250.000 VNĐ/month| 3. Business Package - 1.500.000 VNĐ/month");
                    int choice1 = sc.nextInt();
                    System.out.println("Mời nhập tên: ");
                    String name = sc.next();
                    System.out.println("Mời nhập địa chỉ: ");
                    String address = sc.next();
                    switch (choice1) {
                        case 1:
                            int choice2;
                            System.out.println("Mời nhập mã số hợp đồng: ");
                            String id = sc.next();
                            boolean isSuccess = vm.addPack(new StudentPackage(id, name, address, 30, 120000));
                            if (isSuccess) {
                                do {
                                    System.out.println("Bạn muốn làm gì?");
                                    System.out.println("1. Xem YTB | 2. Xem Tiktok | 3. Lướt FB | 4. Tính tiền tháng này | 5. Thoát");
                                    Viettel obj1 = new StudentPackage();
                                    for (Viettel k : vm.getList()) {
                                        if (k.getContractNumber().equals(id)) {
                                            obj1 = k;
                                        }
                                    }
                                    choice2 = sc.nextInt();
                                    switch (choice2) {
                                        case 1:
                                            obj1.calculateCapacity("1");
                                            break;
                                        case 2:
                                            obj1.calculateCapacity("2");
                                            break;
                                        case 3:
                                            obj1.calculateCapacity("3");
                                            break;
                                        case 4:
                                            obj1.display();
                                            break;
                                        case 5:
                                            System.out.println("Đang thoát...");
                                            break;
                                        default:
                                            System.out.println("Không có chức năng này!");
                                            break;
                                    }
                                } while (choice2 != 5);
                            }
                            break;
                        case 2:
                            int choice3;
                            System.out.println("Mời nhập mã số hợp đồng: ");
                            String id1 = sc.next();
                            System.out.println("Bạn muốn đăng ký dịch vụ Safe Web không?");
                            System.out.println("Đây là dịch vụ chặn nội dung độc hại - 40.000 VNĐ/month");
                            System.out.println("YES | NO");
                            String hasSafeWeb = sc.next();
                            isSuccess = vm.addPack(new FamilyPackage(id1, name, address, 100, 250000, hasSafeWeb));
                            if (isSuccess) {
                                do {
                                    System.out.println("Bạn muốn làm gì?");
                                    System.out.println("1. Xem truyền hình | 2. Xem EPL | 3. Xem Netflix | 4. Tính tiền tháng này | 5. Thoát");
                                    Viettel obj2 = new FamilyPackage();
                                    for (Viettel k : vm.getList()) {
                                        if (k.getContractNumber().equals(id1)){
                                            obj2 = k;
                                        }
                                    }
                                    choice3 = sc.nextInt();
                                    switch (choice3) {
                                        case 1:
                                            obj2.calculateCapacity("1");
                                            break;
                                        case 2:
                                            obj2.calculateCapacity("2");
                                            break;
                                        case 3:
                                            obj2.calculateCapacity("3");
                                            break;
                                        case 4:
                                            obj2.display();
                                            break;
                                        case 5:
                                            System.out.println("Đang thoát...");
                                            break;
                                        default:
                                            System.out.println("Không có chức năng này!");
                                            break;
                                    }
                                }while (choice3 != 5);
                            }
                            break;
                        case 3:
                            System.out.println("Mời nhập mã số hợp đồng: ");
                            String id2 = sc.next();
                            System.out.println("Xin mời nhập mã số thuế của công ty");
                            String idCom = sc.next();
                            isSuccess = vm.addPack(new BusinessPackage(id2, name, address, 999999999, 1500000, idCom));
                            if (isSuccess) {
                                switch (idCom) {
                                    case "1234":
                                        for (Viettel x : vm.getList()) {
                                            if (x.getContractNumber().equals(id2)) {
                                                x.calculateCapacity("1234");
                                            }
                                        }
                                        break;
                                    case "4321":
                                        for (Viettel x : vm.getList()) {
                                            if (x.getContractNumber().equals(id2)) {
                                                x.calculateCapacity("4321");
                                            }
                                        }
                                        break;
                                    case "12345":
                                        for (Viettel x : vm.getList()) {
                                            if (x.getContractNumber().equals(id2)) {
                                                x.calculateCapacity("12345");
                                            }
                                        }
                                    default:
                                        System.out.println("Không có mã thuế này!");
                                        break;
                                }
                            }
                    }
                    break;
                case 2:
                    vm.display();
                    break;
                case 3:
                    System.out.println("Danh sách khách hàng sử dụng gói Family có dịch vụ Safe Web: ");
                    vm.hasSafeWeb();
                    break;
                case 4:
                    System.out.println("Đang tắt...");
                    break;
                default:
                    System.out.println("Không có chức năng này!");
                    break;
            }
        }while (choice != 4) ;
    }
}
