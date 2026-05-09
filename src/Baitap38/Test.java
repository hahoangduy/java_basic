package Baitap38;

import java.io.BufferedReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        1. Bối cảnh nghiệp vụ
        Một khu vui chơi giải trí (Theme Park) cần xây dựng phần mềm để quản lý việc bán vé vào cổng cho khách hàng.
        Hệ thống cần tính toán chính xác số tiền khách phải trả dựa trên loại vé, độ tuổi, số lượng người và các dịch vụ đi kèm,
         đồng thời hỗ trợ ban quản lý thống kê doanh thu và lượng khách thực tế.

        2. Yêu cầu quản lý dữ liệu
        Tất cả các loại vé được phát hành đều phải lưu trữ các thông tin chung: Mã vé, Tên người mua (hoặc người đại diện),
         và Giá vé cơ bản của khu vui chơi (hiện tại đang áp dụng mức chung là 300.000 VNĐ/người).

        Khu vui chơi hiện đang phát hành 3 loại vé chính:

        - Vé Cá Nhân (Individual Ticket):
        Dành cho khách đi lẻ. Hóa đơn của khách sẽ phụ thuộc vào độ tuổi của người đi. Hệ thống cần lưu lại Tuổi của khách.
        Quy tắc tính tiền: Nếu khách là trẻ em (Dưới 12 tuổi), giá vé bằng 50% Giá vé cơ bản.
        Nếu khách là người cao tuổi (Từ 60 tuổi trở lên), giá vé bằng 70% Giá vé cơ bản. Các trường hợp còn lại thanh toán 100% Giá vé cơ bản.

        - Vé VIP (VIP Ticket):
        Dành cho khách hàng muốn trải nghiệm dịch vụ cao cấp và không phải xếp hàng (Fast-pass).
        Quy tắc tính tiền: Giá vé VIP luôn bằng Giá vé cơ bản cộng thêm một khoản phụ thu dịch vụ Fast-pass là 200.000 VNĐ.
        Đặc biệt, khách mua vé VIP có thể chọn thêm dịch vụ "Buffet trưa". Nếu khách có đăng ký Buffet, vé sẽ bị cộng thêm 150.000 VNĐ.

        - Vé Nhóm (Group Ticket):
        Dành cho các cơ quan, trường học hoặc gia đình đi đông người để hưởng ưu đãi. Hệ thống cần lưu lại Số lượng thành viên trong đoàn.
        Quy tắc tính tiền: Tiền vé ban đầu = Giá vé cơ bản * Số lượng thành viên.
        Chính sách chiết khấu:
        + Nếu đoàn có từ 5 đến dưới 15 người: Giảm giá 10% trên tổng tiền.
        + Nếu đoàn có từ 15 người trở lên: Giảm giá 20% trên tổng tiền.

        3. Yêu cầu về chức năng hệ thống
        Bạn hãy thiết kế các lớp đối tượng theo chuẩn OOP và xây dựng lớp QuanLyBanVe (hoặc làm trực tiếp trong hàm main) để thực hiện các công việc sau:

        Chức năng 1: Khởi tạo một danh sách vé và thêm vào ít nhất 5 vé với đầy đủ các loại (Cá nhân, VIP, Nhóm) với các thông số tùy chọn.
        Chức năng 2: In ra bảng kê chi tiết các vé đã bán. Thông tin hiển thị gồm: Mã vé, Tên người đại diện, Loại vé, và Số tiền thanh toán.
        Chức năng 3: Tính toán và in ra Tổng doanh thu mà khu vui chơi thu được từ danh sách vé trên.
        Chức năng 4: Tính và in ra Tổng số lượt người (khách) thực tế đã vào khu vui chơi.
        (Lưu ý: 1 Vé Cá Nhân hoặc 1 Vé VIP chỉ tính là 1 người, nhưng 1 Vé Nhóm phải tính bằng đúng số lượng thành viên của đoàn đó).*/

        Scanner sc = new Scanner(System.in);
        ThemeParkManager tpm = new ThemeParkManager();
        int totalGuessInAll = 0;
        int choice;
        do {
            System.out.println("----- WELCOME TO DISNEY THEME PARK -----");
            System.out.println("Khách hàng muốn?");
            System.out.println("1. Mua vé | 2. Danh sách tất cả các vé đã bán | 3. Tổng doanh thu | 4. Tổng số lượng khách đã mua vé | 5. Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mời khách hàng chọn loại vé: ");
                    System.out.println("1. Individual Ticket | 2. VIP Ticket | 3. Group Ticket");
                    int choice1 = sc.nextInt();
                    System.out.println("Mời khách hàng điền tên của mình: ");
                    String name = sc.next();
                    switch (choice1) {
                        case 1:
                            System.out.println("Mời khách hàng nhập mã vé: ");
                            String id = sc.next();
                            System.out.println("Mời khách hàng nhập tuổi của mình: ");
                            int age = sc.nextInt();
                            boolean isSuccess = tpm.addTicket(new IndividualTicket(id, name,300000, age));
                            if (isSuccess) {
                                totalGuessInAll++;
                                System.out.println("Giá vé là 300.000 VNĐ nhé!");
                                ThemePark obj1 = new IndividualTicket();
                                for (ThemePark x : tpm.getList()) {
                                    if (x.getTicketid().equals(id)) {
                                        obj1 = x;
                                    }
                                }
                                obj1.calculateBill();
                            }
                            break;
                        case 2:
                            System.out.println("Mời khách hàng nhập mã vé: ");
                            String id1 = sc.next();
                            System.out.println("Vì là vé VIP nên bạn sẽ được trải nghiệm dịch vụ cao cấp và không phải xếp hàng (Fast-pass).\n" +
                                    "Giá vé: 300.000 VNĐ + 200.000 VNĐ(phí Fast-pass) = 500.000 VNĐ.\n" +
                                    "Chúng tôi còn dịch vụ 'Buffet trưa' với giá đăng ký là 150.000 VNĐ.\n" +
                                    "Bạn có muốn đăng ký gói dịch vụ này không?\n" +
                                    "\t\t\tYES | NO");
                            String isLunchBuffet = sc.next();
                            isSuccess = tpm.addTicket(new VIPTicket(id1, name, 300000, isLunchBuffet));
                            if (isSuccess) {
                                totalGuessInAll++;
                                ThemePark obj2 = new VIPTicket();
                                for (ThemePark x : tpm.getList()) {
                                    if (x.getTicketid().equals(id1)) {
                                        obj2 = x;
                                    }
                                }
                                obj2.calculateBill();
                            }
                            break;
                        case 3:
                            System.out.println("Mời khách hàng nhập mã vé: ");
                            String id2 = sc.next();
                            System.out.println("Nhóm của bạn có bao nhiêu thành viên?");
                            int totalGuess = sc.nextInt();
                            System.out.println("Giá vé: 300.000 VNĐ * số lượng thành viên của nhóm nhé!");
                            isSuccess = tpm.addTicket(new GroupTicket(id2, name, 300000, totalGuess));
                            if (isSuccess){
                                totalGuessInAll += totalGuess;
                                ThemePark obj3 = new GroupTicket();
                                for (ThemePark x : tpm.getList()) {
                                    if (x.getTicketid().equals(id2)) {
                                        obj3 = x;
                                    }
                                }
                                obj3.calculateBill();
                            }
                            break;
                    }
                    break;
                case 2:
                    tpm.display();
                    break;
                case 3:
                    tpm.totalRevenue();
                    break;
                case 4:
                    System.out.println("Tổng số lượng khách đã mua vé là: " + totalGuessInAll + " khách");
                    break;
                case 5:
                    System.out.println("Đang thoát...");
                    break;
                default:
                    System.out.println("Không có chức năng này!");
                    break;
            }
        }while (choice != 5);
    }
}
