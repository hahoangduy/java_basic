package Baitap32;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        * Bạn cần xây dựng một phần mềm tính cước phí cho một công ty vận chuyển.
        Công ty này có 2 hình thức vận chuyển chính: Đường bộ (Road), Đường biển (Sea)
        Mỗi hình thức có cách tính giá và ràng buộc kỹ thuật hoàn toàn khác nhau.2. Yêu cầu chi tiết về các lớp (Specification)
        A. Lớp trừu tượng ShippingOrder
        Thuộc tính: orderId (Mã đơn),
        weight (Khối lượng - kg),
        distance (Khoảng cách - km).
        Phương thức trừu tượng: calculateFreight() (Tính cước phí).
        Phương thức định nghĩa sẵn: printInvoice() để in thông tin cơ bản.

        B. Lớp RoadOrder (Vận chuyển đường bộ)
        Đặc tính: Có thêm thuộc tính isExpress (Giao hàng nhanh).
        Logic tính giá:
        Giá cơ bản: 15.000 / km.
        Nếu weight > 100kg: Mỗi kg dư ra tính thêm 2.000 / km.
        Nếu isExpress là true: Tổng chi phí tăng thêm 20%.
        Phí cầu đường cố định: 500.000 (không nhân với khoảng cách).
5
        C. Lớp SeaOrder (Vận chuyển đường biển)
        Đặc tính: Có thuộc tính containerType (SMALL hoặc LARGE).
        Logic tính giá:
        Giá thuê container: SMALL là 5.000.000,
        LARGE là 10.000.000.
        Nếu distance > 1000km: Giảm giá 10% trên tiền thuê container.
        Thuế cập cảng: 2% trên tổng giá trị sau giảm giá.
        Lưu ý: Hình thức này không tính theo kg lẻ mà tính theo đơn vị container.
        * Tính cước cho một đơn hàng Đường Bộ (RoadOrder)
        Thông số: Nặng 120kg, quãng đường 10km, có Giao hàng nhanh (isExpress = true).
        Các bước tính toán:
        Giá cơ bản: 15.000 * 10 = 150.000.
        Phí quá tải (vượt 20kg): 20(kg) * 2.000 * 10(km) = 400.000đ.
        Tổng trước phí nhanh: 150.000 + 400.000 = 550.000.
        Phí giao nhanh (20%): 550.000 * 0.2 = 110.000.
        Cộng phí cầu đường: 500.000đ.
        Thành tiền: 550.000 + 110.000 + 500.000 = 1.160.000đ.*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn chọn phương thức vận chuyển: ");
        System.out.println("1. Đường bộ | 2. Đường biển");
        int id = sc.nextInt();
        System.out.println("Khoảng cách vận chuyển: ");
        int distance = sc.nextInt();
        switch (id) {
            case 1:
                System.out.println("Hàng hóa của bạn bao nhiêu kg?");
                int weight = sc.nextInt();
                System.out.println("Bạn muốn chọn dịch vụ giao hàng nhanh của chúng tôi không?");
                System.out.println("1. Có | 2. Không");
                int express = sc.nextInt();
                ShippingOrder ship = new RoadOrder(id, weight, distance, express);
                ship.printInvoice();
            case 2:
                System.out.println("Mời bạn chọn kiểu container: ");
                System.out.println("1. Small | 2. Large");
                int containerType = sc.nextInt();
                ShippingOrder ship1 = new SeaOrder(id, distance, containerType);
                ship1.printInvoice();
        }
    }
}
