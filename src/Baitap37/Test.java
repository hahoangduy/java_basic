package Baitap37;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        1. Bối cảnh nghiệp vụ
        Một nhà mạng viễn thông cần xây dựng phần mềm để quản lý khách hàng đăng ký Internet
        và tự động tính toán hóa đơn hàng tháng dựa trên mức độ sử dụng thực tế của họ.

        2. Yêu cầu quản lý dữ liệu
        Tất cả các khách hàng sử dụng dịch vụ đều cần được lưu trữ các thông tin cơ bản để liên hệ và lập hóa đơn,
         bao gồm: Mã số hợp đồng, Tên người đứng tên, Địa chỉ lắp đặt, và Tổng dung lượng dữ liệu (Data) đã sử dụng trong tháng qua (đơn vị: Gigabyte - GB).

        Hiện tại, nhà mạng cung cấp 3 loại gói cước dành cho các nhóm đối tượng khác nhau:

        - Gói Cước Sinh Viên (Student Package):
        Gói này có giá rẻ, thiết kế cho nhu cầu cơ bản. Giá cước cố định hàng tháng là 120.000 VNĐ, miễn phí 30GB đầu tiên.
         Nếu người dùng sử dụng vượt quá 30GB, mỗi 1 GB phát sinh sẽ bị tính thêm 5.000 VNĐ.

        - Gói Cước Gia Đình (Family Package):
        Gói này cho phép nhiều thiết bị truy cập với tốc độ ổn định. Giá cước cố định là 250.000 VNĐ, bao gồm 100GB tốc độ cao miễn phí.
         Phí phát sinh khi vượt định mức là 3.000 VNĐ/GB. Đặc biệt, gói này cung cấp dịch vụ cộng thêm là "Safe Web" (Chặn nội dung độc hại).
          Khách hàng có thể chọn đăng ký hoặc không đăng ký dịch vụ này. Nếu đăng ký, hóa đơn sẽ cộng thêm phụ phí cố định 40.000 VNĐ/tháng.

        - Gói Cước Doanh Nghiệp (Business Package):
        Được thiết kế cho các công ty cần đường truyền cáp quang quốc tế.
        Gói này có cước phí trọn gói là 1.500.000 VNĐ/tháng và hoàn toàn KHÔNG giới hạn dung lượng Data (không có phí phát sinh).
        Tuy nhiên, vì là khách hàng doanh nghiệp, hệ thống bắt buộc phải lưu trữ thêm Mã số thuế của công ty.
        Ngoài ra, nếu doanh nghiệp thuộc nhóm "Khách hàng đối tác chiến lược" (có một trạng thái đánh dấu),
        họ sẽ được chiết khấu giảm giá 10% trên tổng hóa đơn thanh toán.

        3. Yêu cầu về chức năng hệ thống
        Bạn hãy thiết kế các lớp (classes) theo chuẩn OOP và viết một chương trình (hàm main) thực hiện các công việc sau:

        Chức năng 1: Khởi tạo danh sách và nhập thông tin (hoặc hardcode sẵn một danh sách)
        gồm ít nhất 5 khách hàng thuộc các gói cước khác nhau vào CÙNG MỘT danh sách quản lý.

        Chức năng 2: Tính toán và in ra màn hình Bảng kê chi tiết hóa đơn của tất cả khách hàng.
        Thông tin in ra cần đầy đủ: Mã hợp đồng, Tên khách hàng, Loại gói cước đang dùng, Dung lượng đã dùng, và Tổng tiền phải thanh toán.

        Chức năng 3: Tìm và in ra thông tin của khách hàng có hóa đơn tiền mạng cao nhất trong tháng.

        Chức năng 4: Thống kê xem có bao nhiêu khách hàng đang dùng gói Gia Đình mà có đăng ký dịch vụ "Safe Web".*/

        Scanner sc = new Scanner(System.in);
        ViettelManager vm = new ViettelManager();
        ViettelManager vm1 = new ViettelManager();
        ViettelManager vm2 = new ViettelManager();
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
                            isSuccess = vm1.addPack(new FamilyPackage(id1, name, address, 100, 250000, hasSafeWeb));
                            if (isSuccess) {
                                do {
                                    System.out.println("Bạn muốn làm gì?");
                                    System.out.println("1. Xem truyền hình | 2. Xem EPL | 3. Xem Netflix | 4. Tính tiền tháng này | 5. Thoát");
                                    Viettel obj2 = new FamilyPackage();
                                    for (Viettel k : vm1.getList()) {
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
                            isSuccess = vm2.addPack(new BusinessPackage(id2, name, address, 999999999, 1500000, idCom));
                            if (isSuccess) {
                                switch (idCom) {
                                    case "1234":
                                        for (Viettel x : vm2.getList()) {
                                            if (x.getContractNumber().equals(id2)) {
                                                vm2.display();
                                                x.calculateCapacity("1234");
                                            }
                                        }
                                        break;
                                    case "4321":
                                        for (Viettel x : vm2.getList()) {
                                            if (x.getContractNumber().equals(id2)) {
                                                vm2.display();
                                                x.calculateCapacity("4321");
                                            }
                                        }
                                        break;
                                    case "12345":
                                        for (Viettel x : vm2.getList()) {
                                            if (x.getContractNumber().equals(id2)) {
                                                vm2.display();
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
                    System.out.println("1. Student Package | 2. Family Package | 3. Business Package");
                    int choice4 = sc.nextInt();
                    if (choice4 == 1) {
                        System.out.println("Danh sách các khách hàng Student Package trong tháng này: ");
                        vm.totalBill();
                    }
                    if (choice4 == 2) {
                        System.out.println("Danh sách các khách hàng Family Package trong tháng này: ");
                        vm1.totalBill();
                    }
                    if (choice4 == 3) {
                        System.out.println("Danh sách các khách hàng Business Package trong tháng này: ");
                        vm2.totalBill();
                    }
                    break;
                case 3:
                    System.out.println("Danh sách khách hàng sử dụng gói Family có dịch vụ Safe Web: ");
                    vm1.hasSafeWeb();
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