package Baitap41;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        1. Bối cảnh
        Công ty công nghệ "GoTech" cần xây dựng hệ thống lõi để quản lý đội xe và tự động tính toán cước phí cho khách hàng.
        Hệ thống phải hỗ trợ nhiều loại phương tiện, xử lý các phụ phí phức tạp (thời tiết, giờ cao điểm)
        và phân tách cực kỳ rõ ràng giữa dịch vụ "Chở khách" và dịch vụ "Giao hàng".

        2. Yêu cầu nghiệp vụ

        * Dữ liệu quản lý chung:
        Bất kỳ tài xế hay phương tiện nào tham gia mạng lưới đều cần lưu trữ Biển số xe, Tên tài xế, và Trạng thái hiện tại (Đang rảnh / Đang bận).
         Mọi phương tiện đều phải có khả năng tính toán cước phí cho một chuyến đi (dựa trên quãng đường km).

        * Dịch vụ Chở khách (Ride):
        Hệ thống cung cấp 3 loại phương tiện chở khách với các biểu giá khác nhau:
        - Xe Máy: Lựa chọn cơ bản. Cước phí = 10.000 VNĐ (giá mở cửa) + 5.000 VNĐ cho mỗi km tiếp theo.
        Nếu khách hàng đặt xe trong điều kiện "Trời mưa", chuyến đi sẽ bị cộng thêm một khoản phụ phí cố định là 10.000 VNĐ.
        - Ô tô Tiêu chuẩn (Car 4 chỗ): Cước phí = 20.000 VNĐ + 12.000 VNĐ/km.
        Nếu chuyến đi diễn ra trong "Giờ cao điểm", hệ thống sẽ tự động tăng thêm 20% trên tổng cước phí của chuyến đó.
        - Ô tô Hạng sang (Luxury Car): Cước phí = 30.000 VNĐ + 20.000 VNĐ/km.
        Do là dịch vụ cao cấp, khách hàng luôn phải trả thêm "Phí dịch vụ VIP" cố định là 50.000 VNĐ cho mỗi chuyến.
        Dòng xe này giữ giá cố định, tuyệt đối không bị áp dụng phụ phí thời tiết hay giờ cao điểm.

        * Dịch vụ Giao hàng (Express Delivery):
        Kinh doanh chở hàng có đặc thù khác hoàn toàn chở người. Công ty quy định: Chỉ có Xe Máy và Ô tô Tiêu chuẩn mới được phép nhận các đơn giao hàng.
         Ô tô Hạng sang tuyệt đối KHÔNG cung cấp dịch vụ này.
        Cơ chế tính phí giao hàng (Độc lập với biểu giá chở khách):
        - Phí giao hàng tiêu chuẩn = 15.000 VNĐ + 8.000 VNĐ/km.
        - Hàng hóa cồng kềnh: Nếu kiện hàng có khối lượng nặng trên 5kg, hệ thống sẽ cộng thêm 20.000 VNĐ phụ phí bốc vác vào tổng tiền.

        3. Kịch bản mô phỏng (Test Cases)
        Hãy thiết kế kiến trúc hệ thống và giả lập kịch bản sau trong hàm main():

        - Quản lý đội xe: Tạo một danh sách duy nhất để chứa cả 3 tài xế đang rảnh rỗi:
            1. Nguyễn Văn A - chạy Xe Máy.
            2. Trần Văn B - chạy Ô tô Tiêu chuẩn.
            3. Lê Thị C - chạy Ô tô Hạng sang.

        - Xử lý các chuyến đi trong ngày (Hệ thống cần in ra: Loại dịch vụ, Tên tài xế tiếp nhận, Quãng đường, Các điều kiện phụ, và Tổng tiền thu của khách):
            + Chuyến 1 (Chở khách): Khách đi 10 km bằng Ô tô Hạng sang, thời tiết bình thường.
            + Chuyến 2 (Chở khách): Khách đi 5 km bằng Xe Máy, điều kiện trời đang mưa.
            + Chuyến 3 (Chở khách): Khách đi 8 km bằng Ô tô Tiêu chuẩn, hệ thống ghi nhận đang là Giờ cao điểm.
            + Chuyến 4 (Giao hàng): Khách cần giao kiện hàng nặng 8kg, khoảng cách 12 km. Hãy điều động Ô tô Tiêu chuẩn (hoặc Xe Máy) thực hiện.
                Thử gọi chức năng giao hàng từ Ô tô Hạng sang để xem hệ thống của bạn có ngăn chặn lỗi (compile error hoặc báo lỗi nghiệp vụ) hay không.*/

        GoTechManager gtm = new GoTechManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----   GO TECH   ------");
            System.out.println("Mời chọn dịch vụ");
            System.out.println("1. Thuê xe chở khách | 2. Thuê xe chở hàng");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Bạn muốn thuê tài xế nào?");
                    System.out.println("1. Nguyễn Văn A - chạy xe máy.\n" +
                            "2. Trần Văn B - chạy Ôtô tiêu chuẩn.\n" +
                            "3. Lê Thị C - chạy Ôtô hạng sang.");
                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.println("Bạn đi bao nhiêu km?");
                            int km = sc.nextInt();
                            gtm.addVehicle(new Motorbike("1234", "Nguyễn Văn A", 10000, km, "Trời mưa"));
                            gtm.ride();
                            break;
                        case 2:
                            System.out.println("Bạn đi bao nhiêu km?");
                            int km1 = sc.nextInt();
                            gtm.addVehicle(new Car("1234", "Trần Văn B", 20000, km1, "Giờ cao điểm"));
                            gtm.ride();
                            break;
                        case 3:
                            System.out.println("Bạn đi bao nhiêu km?");
                            int km2 = sc.nextInt();
                            gtm.addVehicle(new LuxuryCar("1234", "Lê Thị C ", 30000, km2));
                            gtm.ride();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Xe oto hạng sang không vận chuyển hàng hóa nên không thể chọn");
                    System.out.println("Bạn muốn thuê tài xế nào?");
                    System.out.println("1. Nguyễn Văn A - chạy xe máy.\n" +
                            "2. Trần Văn B - chạy Ôtô tiêu chuẩn.");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("Hàng hóa của bạn nặng bao nhiêu kg?");
                            int kg = sc.nextInt();
                            System.out.println("Bạn vận chuyển đi bao nhiêu km?");
                            int km = sc.nextInt();
                            gtm.addVehicle(new Motorbike("12345", "Nguyễn Văn A", 10000, km, "Không mưa"));
                            gtm.expressDelivery(kg);
                            break;
                        case 2:
                            System.out.println("Hàng hóa của bạn nặng bao nhiêu kg?");
                            int kg1 = sc.nextInt();
                            System.out.println("Bạn vận chuyển đi bao nhiêu km?");
                            int km1 = sc.nextInt();
                            gtm.addVehicle(new Car("12345", "Trần Văn B", 20000, km1, "Không cao điểm"));
                            gtm.expressDelivery(kg1);
                            break;
                    }
                    break;
            }

        }while (choice != 4);
    }
}
