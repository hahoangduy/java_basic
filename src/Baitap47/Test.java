package Baitap47;

import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        /*
        1. Bối cảnh nghiệp vụ
        Một nhà hàng cao cấp cần hệ thống phần mềm để quản lý sơ đồ bàn ăn, tiếp nhận order của khách và thanh toán hóa đơn.
        Hệ thống cần xử lý linh hoạt các loại món ăn khác nhau (món thường, món đặc biệt của bếp trưởng, và các set combo)
        cùng với quy trình tính thuế, giảm giá phức tạp.

        2. Yêu cầu quản lý dữ liệu (Nghiệp vụ)

        * Phân hệ Sơ đồ Bàn ăn (Table):
        Nhà hàng có nhiều bàn ăn. Mỗi bàn cần quản lý: Mã bàn (Ví dụ: B01), Sức chứa tối đa (Số người ngồi), và Trạng thái hiện tại (Đang trống / Đang phục vụ).
        Quy tắc mở bàn: Khách chỉ được xếp vào bàn nếu bàn đó "Đang trống" và Số lượng khách không được vượt quá Sức chứa tối đa của bàn.
        Khi khách ngồi vào, trạng thái bàn chuyển thành "Đang phục vụ".

        * Phân hệ Thực đơn (Menu Item):
        Mọi món ăn trong thực đơn đều có: Mã món, Tên món, và Đơn giá gốc. Có 3 phân loại món ăn trong nhà hàng:
        - Món Tiêu chuẩn (Standard Item):
          + Giá bán ra bằng đúng Đơn giá gốc.
        - Món Đặc biệt (Chef's Special):
          + Là những món cần chế biến cầu kỳ (VD: Bò Wagyu nướng đá). Do đó, giá bán ra của món này luôn bị cộng thêm 15% "Phí phục vụ đặc biệt" tính trên Đơn giá gốc.
        - Set Combo (Combo Meal):
          + Một Combo không có giá gốc cố định. Bản thân Combo bao gồm MỘT DANH SÁCH các Món Tiêu chuẩn đi kèm (VD: Combo Trưa gồm 1 Phở + 1 Nước ngọt).
          + Giá bán ra của Combo = Tổng giá bán của các món thành phần bên trong NHÂN VỚI 0.9 (Tức là rẻ hơn 10% so với việc gọi lẻ từng món).

        * Phân hệ Đơn hàng (Order):
        Mỗi khi một bàn được mở, hệ thống sẽ tạo một Đơn hàng (Order) gắn với bàn đó.
        - Đơn hàng sẽ lưu trữ Danh sách các món khách đã gọi (Lưu ý: Khách có thể gọi một món nhiều lần, hệ thống cần quản lý Số lượng của từng món).
        - Quy tắc Thanh toán (Checkout):
          + Tính Tổng tiền món ăn (Subtotal) = Số lượng * Giá bán ra của từng món trong Đơn hàng.
          + Chính sách Khuyến mãi: Nếu Tổng tiền món ăn (Subtotal) vượt mức 2.000.000 VNĐ, khách được giảm giá thẳng 10% trên tổng số tiền đó.
          (Nếu không đạt, không giảm giá).
          + Thuế VAT: Bắt buộc cộng thêm 8% Thuế VAT vào số tiền cuối cùng sau khi đã trừ khuyến mãi.
          + Giải phóng bàn: Sau khi in hóa đơn thanh toán thành công, Trạng thái bàn phải tự động chuyển về "Đang trống" để đón khách mới.
          Đơn hàng này được lưu vào Lịch sử Doanh thu của nhà hàng.

        * Phân hệ Quản lý Nhà hàng (Restaurant Manager):
        Quản lý danh sách Bàn ăn, danh sách Thực đơn, và Lịch sử các Hóa đơn đã thanh toán để tính doanh thu cuối ngày.

        3. Kịch bản mô phỏng (Test Cases)

        Bước 1: Khởi tạo dữ liệu
        - Tạo Bàn ăn: Bàn "T01" (Sức chứa: 2 người), Bàn "T02" (Sức chứa: 10 người). Cả hai đều Đang trống.
        - Tạo Thực đơn:
          + Món tiêu chuẩn 1: "Phở Bò" - 100.000 VNĐ.
          + Món tiêu chuẩn 2: "Trà Đá" - 10.000 VNĐ.
          + Món đặc biệt 1: "Bò Wagyu" - 1.000.000 VNĐ.
          + Combo 1: "Combo Bữa Sáng" (Bao gồm 1 Phở Bò + 1 Trà Đá). -> Giá bán kỳ vọng: (100k + 10k) * 0.9 = 99.000 VNĐ.

        Bước 2: Vận hành nhà hàng
        - Nhóm 3 khách yêu cầu ngồi bàn "T01".
          -> Hệ thống từ chối vì vượt sức chứa.
        - Nhóm 3 khách yêu cầu chuyển sang bàn "T02".
          -> Thành công. Bàn T02 đổi trạng thái thành "Đang phục vụ".
        - Bàn T02 gọi món: 2 "Combo Bữa Sáng", 2 "Bò Wagyu".

        Bước 3: Thanh toán và Giải phóng bàn
        - Bàn T02 gọi tính tiền.
          -> Logic tính toán kỳ vọng:
             + 2 Combo = 2 * 99.000 = 198.000 VNĐ.
             + 2 Bò Wagyu = 2 * (1.000.000 * 1.15) = 2.300.000 VNĐ.
             + Subtotal (Tổng tiền món) = 2.498.000 VNĐ.
             + Áp dụng Khuyến mãi (Vì > 2 triệu): Giảm 10% -> Số tiền còn: 2.248.200 VNĐ.
             + Áp dụng Thuế VAT (8%): 2.248.200 * 1.08 = 2.428.056 VNĐ.
        - In biên lai chi tiết cho bàn T02.
        - Bàn T02 tự động trở về trạng thái "Đang trống".

        Bước 4: Báo cáo
        - In ra Tổng doanh thu thực tế nhà hàng thu được (Bao gồm cả thuế).
        */
        RestaurantManager manager = new RestaurantManager();
        Scanner sc = new Scanner(System.in);
        manager.addTable(new Table("B01", 4));
        manager.addTable(new Table("B02", 2));
        manager.addTable(new Table("B03", 8));
        StandardItem pho = new StandardItem("ST01", "Phở Bò Kobe", 100000);
        StandardItem coca = new StandardItem("ST02", "Coca Cola", 25000);
        ChefSpecialItem wagyu = new ChefSpecialItem("CS01", "Bò Wagyu Nướng Đá", 1800000);
        SetCombo combo = new SetCombo("CB01", "Combo Trưa Tiết Kiệm");
        combo.addComponent(pho);
        combo.addComponent(coca);
        manager.addMenuItem(pho);
        manager.addMenuItem(coca);
        manager.addMenuItem(wagyu);
        manager.addMenuItem(combo);
        int choice;
        do {
            System.out.println("===== HỆ THỐNG QUẢN LÝ NHÀ HÀNG =====");
            System.out.println("1. Xem sơ đồ trạng thái bàn ăn |2. Đón khách vào bàn |3. Gọi món ăn cho bàn |4. Thanh toán hóa đơn |5. Xem tổng doanh thu |6. Món best seller |7. Thoát chương trình");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("--- SƠ ĐỒ TRẠNG THÁI BÀN ---");
                    for (Table t : manager.getTables()) {
                        System.out.println("Bàn: " + t.getTableId() + " |Chỗ ngồi: " + t.getMaxCapacity() + " chỗ |Trạng thái: " + t.getStatus());
                    }
                    break;
                case 2:
                    System.out.println("--- ĐÓN KHÁCH ---");
                    System.out.print("Nhập mã bàn muốn mở: ");
                    String tId = sc.next();
                    System.out.print("Nhập số lượng khách vào ngồi: ");
                    int count = sc.nextInt();
                    manager.checkInTable(tId,count, "O01");
                    break;
                case 3:
                    System.out.println("--- GỌI MÓN ---");
                    System.out.print("Nhập mã bàn muốn gọi món: ");
                    String orderTableId = sc.next();
                    Order currentOrder = manager.getActiveOrderOfTable(orderTableId);
                    if (currentOrder == null) {
                        System.out.println("Bàn này đang trống, hãy làm thủ tục Check-in đón khách trước!");
                        break;
                    }
                    System.out.println("--- MENU NHÀ HÀNG ---");
                    for (Menu item : manager.getMenu()) {
                        item.display();
                    }
                    System.out.println("Nhập mã món ăn khách chọn: ");
                    String mId = sc.next();
                    Menu pickedItem = manager.findMenuItem(mId);
                    if (pickedItem == null) {
                        System.out.println("Mã món ăn không chính xác!");
                        break;
                    }
                    System.out.println("Nhập số lượng phần muốn mua: ");
                    int qty = sc.nextInt();
                    sc.nextLine();
                    currentOrder.addMenuItem(pickedItem, qty);
                    System.out.println("Đã thêm " + qty + " phần " + pickedItem.getName() + " vào đơn hàng của bàn " + orderTableId);
                    break;
                case 4:
                    System.out.println("--- THANH TOÁN ---");
                    System.out.print("Nhập mã bàn cần thanh toán: ");
                    String checkoutTableId = sc.next();
                    manager.processCheckout(checkoutTableId);
                    break;
                case 5:
                    manager.calculateTotalRevenue();
                    break;
                case 6:
                    manager.mostOrderItem();
                    break;
                case 7:
                    System.out.println("Đang thoát...");
                    break;
                default:
                    System.out.println("Không có chức năng này!");
            }
        }while (choice != 7);
    }
}
