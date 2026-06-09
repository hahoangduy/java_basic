package Baitap48;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*1. Bối cảnh nghiệp vụ
        Một tòa nhà văn phòng cần hệ thống tự động hóa cho bãi gửi xe. Hệ thống phải nhận diện được xe vào/ra,
        tự động phân luồng xe vào các khu vực bãi đỗ riêng biệt, đồng thời tính toán chính xác mức phí phải thu dựa
        trên loại phương tiện, thời gian gửi và đặc quyền của người sở hữu Thẻ giữ xe.

        2. Yêu cầu quản lý dữ liệu (Nghiệp vụ)

        * Phân hệ Phương tiện (Vehicle):
        Bất kỳ phương tiện nào cũng cần lưu trữ: Biển số xe (String - Đối với xe đạp không có biển số,
        mặc định là "Không có") và Loại xe (String/Enum). Hệ thống phân loại 3 nhóm:
        - Xe Đạp: Phân luồng vào Khu vực 2 bánh.
        - Xe Máy: Phân luồng vào Khu vực 2 bánh.
        - Ô Tô: Phân luồng vào Khu vực 4 bánh.

        * Phân hệ Thẻ xe (Parking Pass):
        Mỗi lần xe vào bãi, hệ thống sẽ gán cho xe một Thẻ xe. Có 2 loại thẻ:
        - Thẻ Vãng Lai (Visitor Pass): Phát cho khách vãng lai. Chỉ lưu trữ ID thẻ. Khách sẽ thanh toán tiền mặt
        lúc lấy xe ra dựa theo thời gian thực tế.
        - Thẻ Tháng (Monthly Pass): Dành cho nhân viên tòa nhà. Thẻ này được đăng ký cứng với MỘT Biển số xe duy nhất,
        Tên nhân viên, và Số dư tài khoản (Ví dụ: nạp sẵn tiền gia hạn). Khách dùng thẻ tháng KHÔNG cần trả tiền mặt
        mỗi lần ra/vào, miễn là thẻ còn hiệu lực và đi đúng biển số đã đăng ký.

        * Quy tắc Tính phí (Chỉ áp dụng cho Thẻ Vãng Lai):
        Khi xe ra, hệ thống nhận vào tham số là: Số giờ đã gửi (int) và Trạng thái gửi qua đêm (boolean isOvernight).
        - Xe Đạp: Thu phí đồng giá 3.000 VNĐ / lượt (Bất kể số giờ hay qua đêm).
        - Xe Máy:
          + Gửi dưới 12 giờ và KHÔNG qua đêm: 5.000 VNĐ.
          + Nếu số giờ gửi >= 12 giờ HOẶC có qua đêm: 15.000 VNĐ.
        - Ô Tô:
          + Block 2 giờ đầu tiên: 20.000 VNĐ.
          + Từ giờ thứ 3 trở đi: Mỗi giờ cộng thêm 15.000 VNĐ. (Ví dụ: gửi 4 giờ = 20k + 15k*2 = 50k).
          + Nếu gửi qua đêm, cộng thêm "Phụ thu đêm" cố định 100.000 VNĐ vào tổng tiền.

        * Phân hệ Khu vực bãi đỗ (Parking Zone):
        Bãi xe có 2 khu vực:
        - Khu 2 bánh: Sức chứa 100 chỗ.
        - Khu 4 bánh: Sức chứa 5 chỗ.
        Khi xe Check-in, hệ thống phải kiểm tra xem Khu vực tương ứng với loại xe đó còn chỗ trống hay không.
        Nếu hết, thanh chắn không mở.

        * Phân hệ Quản lý Bãi xe (Parking System):
        - Cung cấp hàm checkIn(PhuongTien xe, TheXe the):
          + Kiểm tra sức chứa.
          + NẾU là Thẻ Tháng: Phải kiểm tra Biển số xe thực tế có KHỚP với Biển số đăng ký trong thẻ không.
          Nếu sai biển số -> Báo động mượn thẻ, không cho vào.
          + NẾU hợp lệ: Ghi nhận xe vào bãi, trừ đi 1 chỗ trống ở khu vực tương ứng.
        - Cung cấp hàm checkOut(TheXe the, int soGioGui, boolean isOvernight):
          + Nếu là Thẻ Vãng Lai: Gọi logic tính tiền, in hóa đơn.
          + Nếu là Thẻ Tháng: In câu chào "Hẹn gặp lại [Tên nhân viên]", thu 0 đồng.
          + Giải phóng chỗ: Cộng lại 1 chỗ trống cho khu vực tương ứng.

        3. Kịch bản mô phỏng (Test Cases)

        Bước 1: Khởi tạo bãi xe và Phát hành Thẻ tháng
        - Cài đặt Khu 2 bánh (100 chỗ), Khu 4 bánh (5 chỗ).
        - Tạo Thẻ tháng 1: ID "M01", Chủ thẻ "Nhân viên A", Biển số đăng ký "29A-123.45" (Ô tô).
        - Tạo Thẻ tháng 2: ID "M02", Chủ thẻ "Nhân viên B", Biển số đăng ký "29B-999.99" (Xe máy).

        Bước 2: Giả lập lưu lượng Check-in
        - Khách vãng lai 1 đi Ô tô (Biển: 30A-111.11) lấy thẻ vãng lai "V01" -> Check-in thành công.
        - Nhân viên B đi Xe máy (Biển: 29B-999.99) dùng thẻ tháng "M02" -> Check-in thành công.
        - Một kẻ gian đi Xe máy (Biển: 29C-000.00) nhặt được thẻ tháng "M02" của Nhân viên B và quẹt thử -> Hệ
        thống BÁO ĐỘNG sai biển số, từ chối Check-in.

        Bước 3: Giả lập lưu lượng Check-out
        - Khách vãng lai 1 (Thẻ V01 - Ô tô) ra về. Gửi 5 tiếng, không qua đêm.
          -> Kỳ vọng: Tính tiền = 20.000 (2h đầu) + 3*15.000 = 65.000 VNĐ. Khu 4 bánh trống lại 1 chỗ.
        - Nhân viên B (Thẻ M02 - Xe máy) ra về.
          -> Kỳ vọng: In câu chào "Hẹn gặp lại Nhân viên B", thu 0 VNĐ. Khu 2 bánh trống lại 1 chỗ.

        4. Thử thách Thiết kế (Dành cho Lập trình viên)
        - Thiết kế chức năng check in và check out.
        - Tính tổng tiền đã thu được từ tất cả các lượt gửi xe vãng lai.
        - Tính tổng số lượt gửi xe đã được phục vụ (bao gồm cả vãng lai và tháng).
        - Tính tổng số lượt gửi xe đã được phục vụ cho từng loại phương tiện (Xe đạp, Xe máy, Ô tô).*/

        Scanner sc = new Scanner(System.in);
        ParkingManager parkingManager = new ParkingManager(100, 5);
        MonthlyPass pass1 = new MonthlyPass("101", "Duc", "48A-12345", 0);
        MonthlyPass pass2 = new MonthlyPass("102", "Duy", "48A-67890", 0);
        MonthlyPass pass3 = new MonthlyPass("103", "Long", "48A-55555", 0);
        parkingManager.addRegisterMonthlyPass(pass1);
        parkingManager.addRegisterMonthlyPass(pass2);
        parkingManager.addRegisterMonthlyPass(pass3);
        int choice;
        do {
            System.out.println("-----  Bãi đỗ xe Ocean Park 2  ------");
            System.out.println("1. Check-In |2. Check-Out |3. Xem báo cáo thống kê |4. Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại xe (1. Xe Đạp |2. Xe Máy |3. Ô Tô): ");
                    int chooseVehicleType = sc.nextInt();
                    Vehicle vehicle = null;
                    if (chooseVehicleType == 1) {
                        vehicle = new Bicycle();
                    } else if (chooseVehicleType == 2) {
                        System.out.println("Nhập biển số xe máy: ");
                        String plate = sc.next();
                        vehicle = new Motorbike(plate);
                    } else if (chooseVehicleType == 3) {
                        System.out.println("Nhập biển số ô tô: ");
                        String plate = sc.next();
                        vehicle = new Car(plate);
                    } else {
                        System.out.println("Không có loại xe này!");
                        break;
                    }
                    System.out.println("Nhập ID thẻ: ");
                    String passIdInput = sc.next();
                    ParkingPass passInput = parkingManager.getMonthlyPass(passIdInput);
                    if (passInput == null) {
                        passInput = new VisitorPass(passIdInput);
                    }
                    parkingManager.checkIn(vehicle, passInput);
                    break;
            }
        }while (choice != 4);

    }
}
