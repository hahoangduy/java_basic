package Baitap35;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*1. Mô tả bài toán
        Xây dựng hệ thống quản lý các đơn hàng vận chuyển cho một công ty Logistics.
        Hệ thống cần tính toán chính xác Cước phí vận chuyển (Shipping Fee) và Thời gian giao hàng dự kiến (Estimated Days)
        dựa trên loại hình dịch vụ, khoảng cách, khối lượng và các quy tắc đặc thù của từng loại hình vận chuyển.

        2. Yêu cầu chi tiết về các lớp
        A. Lớp trừu tượng ShippingOrder
        Thuộc tính:
        String orderId: Mã đơn hàng.
        String senderName: Tên người gửi.
        double distance: Khoảng cách vận chuyển (đơn vị: km).
        double weight: Trọng lượng hàng hóa (đơn vị: kg).
        double baseRate: Mức giá cơ bản trên 1 km (ví dụ: 5.000 VNĐ/km).

        Phương thức trừu tượng:
        double calculateShippingFee(): Tính tổng cước phí vận chuyển.
        int calculateEstimatedDays(): Tính số ngày giao hàng dự kiến.

        Phương thức chung:
        void displayInfo(): In ra thông tin cơ bản của đơn hàng (Mã ĐH, Người gửi, Khoảng cách, Trọng lượng).

        B. Lớp StandardShipping (Giao hàng tiêu chuẩn - Kế thừa ShippingOrder)
        Quy tắc tính Phí (Shipping Fee):
        Công thức cơ bản: (distance * baseRate) + (weight * 2.000).
        Phụ phí vùng xa: Nếu khoảng cách (distance) > 100 km, tổng cước phí sẽ bị cộng thêm 20% (nhân với 1.2).

        Quy tắc Thời gian (Estimated Days):
        Mặc định là 3 ngày.
        Nếu khoảng cách > 100 km, cộng thêm 2 ngày (thành 5 ngày).

        C. Lớp ExpressShipping (Giao hàng hỏa tốc - Kế thừa ShippingOrder)
        Thuộc tính riêng:
        boolean isFragile (Hàng dễ vỡ hay không).

        Quy tắc tính Phí (Shipping Fee):
        Do là hỏa tốc, mức phí theo km sẽ đắt hơn: (distance * baseRate * 1.5) + (weight * 5.000).
        Phí bảo hiểm: Nếu isFragile là true, cộng thêm một khoản phí cố định là 50.000 VNĐ vào tổng tiền.

        Quy tắc Thời gian (Estimated Days):
        Mặc định giao trong 1 ngày.
        Trường hợp ngoại lệ: Nếu khoảng cách > 300 km thì thời gian giao hàng là 2 ngày.

        D. Lớp InternationalShipping (Giao hàng quốc tế - Kế thừa ShippingOrder)
        Thuộc tính riêng:
        String destinationCountry: Quốc gia đến.
        double importTax: Thuế nhập khẩu (tỷ lệ phần trăm, ví dụ 0.1 tương đương 10%).

        Quy tắc tính Phí (Shipping Fee):
        Phí vận chuyển quốc tế là một khoản cố định 500.000 VNĐ + phụ phí cân nặng (weight * 20.000). Lớp này không sử dụng baseRate hay distance.
        Thuế: Tổng tiền khách phải trả = Phí vận chuyển + (Phí vận chuyển * importTax).

        Quy tắc Thời gian (Estimated Days):
        Mặc định là 7 ngày.
        Nếu destinationCountry là "USA" hoặc "Europe", thời gian giao hàng sẽ là 15 ngày.

        3. Lớp quản lý ShippingManager
        Xây dựng lớp này để quản lý danh sách các đối tượng ShippingOrder bằng ArrayList. Cung cấp các hàm sau:
        void addOrder(ShippingOrder order): Thêm một đơn hàng mới vào hệ thống.
        double getTotalExpectedRevenue(): Sử dụng tính Đa hình để duyệt qua danh sách và tính tổng cước phí thu được từ tất cả các đơn hàng.
        void processOrder(String orderId):
        Tìm đơn hàng theo orderId.
        Tính cước phí (X) và số ngày giao dự kiến (Y).
        In kết quả ra màn hình với định dạng: "Order ID: ..., Phí vận chuyển: X VNĐ, Thời gian dự kiến: Y ngày".

        4. Ví dụ minh họa (Test Cases)

        Case 1: StandardShipping
        Đơn hàng A: 50 km, 2 kg, baseRate = 5.000 VNĐ/km.
        Phí: (50 * 5.000) + (2 * 2.000) = 254.000 VNĐ.
        Thời gian: 3 ngày.

        Đơn hàng B: 150 km, 10 kg, baseRate = 5.000 VNĐ/km.
        Phí cơ bản: (150 * 5.000) + (10 * 2.000) = 770.000 VNĐ.
        Vì > 100km, cộng thêm 20%: 770.000 * 1.2 = 924.000 VNĐ.
        Thời gian: 5 ngày.

        Case 2: ExpressShipping
        Đơn hàng C: 50 km, 1 kg, baseRate = 5.000 VNĐ/km, isFragile = true.
        Phí: (50 * 5.000 * 1.5) + (1 * 5.000) + 50.000 = 375.000 + 5.000 + 50.000 = 430.000 VNĐ.
        Thời gian: 1 ngày.

        Case 3: InternationalShipping
        Đơn hàng D: Đi "USA", 5 kg, thuế importTax = 0.1 (10%).
        Phí vận chuyển ban đầu: 500.000 + (5 * 20.000) = 600.000 VNĐ.
        Phí bao gồm thuế: 600.000 + (600.000 * 0.1) = 660.000 VNĐ.
        Thời gian: 15 ngày (Do quốc gia đến là USA).*/

        Scanner sc = new Scanner(System.in);
        ShippingManager sm = new ShippingManager();
        int choice;
        do {
            System.out.println("1. Thêm đơn hàng | 2. Tổng doanh thu | 3. Tìm đơn hàng | 4. Xem tất cả đơn hàng | 5. Xem chi tiết đơn hàng | 6. Thoát chương trình");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mời nhập mã đơn hàng: ");
                    String id = sc.next();
                    System.out.println("Mời nhập tên người gửi: ");
                    String name = sc.next();
                    System.out.println("Mời nhập khoảng cách: ");
                    double distance = sc.nextDouble();
                    if (distance <= 0) {
                        System.out.println("Lỗi!");
                        break;
                    }
                    System.out.println("Mời nhập cân nặng đơn hàng: ");
                    double weight = sc.nextDouble();
                    if (weight <= 0) {
                        System.out.println("Lỗi!");
                        break;
                        Exception InvalidPhoneNumberException
                    }
                    System.out.println("Base Rate mặc định là 5.000VNĐ nhé");
                    double baseRate = 5000;
                    System.out.println("Bạn muốn sử dụng dịch vụ nào?");
                    System.out.println("1. StandardShipping | 2. ExpressShipping | 3. InternationalShipping");
                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1:
                            sm.addOrder(new StandardShipping(id, name, distance, weight, baseRate));
                            break;
                        case 2:
                            System.out.println("Bạn có hàng dễ vỡ không?");
                            System.out.println("1. Có | 2. Không");
                            int isFragile = sc.nextInt();
                            sm.addOrder(new ExpressShipping(id, name, distance, weight, baseRate, isFragile));
                            break;
                        case 3:
                            System.out.println("Bạn muốn gửi hàng đến đất nước nào?");
                            String country = sc.next();
                            System.out.println("Mời bạn nhập thuế importTax");
                            double it = sc.nextDouble();
                            sm.addOrder(new InternationalShipping(id, name, distance, weight, baseRate, country, it));
                            break;
                    }
                case 2:
                    sm.getTotalExpectedRevenue();
                    break;
                case 3:
                    System.out.println("Mời nhập id của đơn hàng: ");
                    String id1 = sc.next();
                    sm.processOrder(id1);
                    break;
                case 4:
                    sm.display();
                    break;
                case 5:
                    System.out.println("Mời nhập id của đơn hàng: ");
                    String id2 = sc.next();
                    sm.detail(id2);
                    break;
                case 6:
                    System.out.println("Đã thoát chương trình!");
                    break;
            }
        }while (choice != 6);
    }
}
