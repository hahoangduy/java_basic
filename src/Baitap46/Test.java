package Baitap46;

public class Test {
    public static void main(String[] args) {
        /*
        1. Bối cảnh nghiệp vụ
        Hãng hàng không "VietSky" cần xây dựng hệ thống phần mềm quản lý mạng lưới đường bay của hãng.
        Hệ thống không chỉ phải tính toán chính xác giá vé, phí hành lý và phí hủy vé cho từng cá nhân,
        mà còn phải giám sát chặt chẽ sức chứa (Capacity) của từng chuyến bay để đảm bảo không xảy ra tình trạng bán khống vé (Overbooking),
        đồng thời cung cấp báo cáo doanh thu toàn hệ thống.

        2. Yêu cầu quản lý dữ liệu (Nghiệp vụ)

        * Phân hệ Khách hàng (Passenger):
        Lưu trữ thông tin người bay: Số Hộ chiếu/CCCD, Họ và tên, Năm sinh.

        * Phân hệ Vé máy bay (Ticket):
        Mỗi vé đại diện cho một ghế của một khách hàng. Có 3 hạng vé:
    - Hạng Phổ thông (Economy):
        + Giá bán = 100% Giá cơ sở của chuyến bay.
        + Hành lý: Miễn phí 20kg. Vượt mức thu 50.000 VNĐ/kg.
        + Hủy vé: Phí phạt bằng 30% Giá bán. Khách được hoàn 70% tiền vé (không hoàn phí hành lý).
    - Hạng Thương gia (Business):
        + Giá bán = 250% Giá cơ sở.
        + Hành lý: Miễn phí 40kg. Vượt mức thu 50.000 VNĐ/kg.
        + Hủy vé: Phí phạt cố định 200.000 VNĐ. Khách được hoàn (Giá bán - 200.000 VNĐ).
    - Hạng Khuyến mãi (Promo):
        + Giá bán = 50% Giá cơ sở.
        + Hành lý: 0kg miễn phí. Thu phí 100.000 VNĐ/kg ngay từ kg đầu tiên.
        + Hủy vé: KHÔNG hỗ trợ hoàn/hủy. (Phí phạt = 100%).

        Lưu ý: Vé cần có một trạng thái (ví dụ: boolean isCancelled) để biết vé này đã bị hủy hay chưa.
        Nếu bị hủy, nó không được tính vào số lượng ghế đang chiếm dụng, nhưng vẫn phải lưu lại để kế toán tính doanh thu phí phạt.

        * Phân hệ Chuyến bay (Flight):
        - Thuộc tính: Mã chuyến bay (Duy nhất), Hành trình, Giá vé cơ sở, Sức chứa tối đa (Max Capacity), và Danh sách các vé đã bán ra của riêng chuyến bay đó.

        3. Kịch bản mô phỏng (Test Cases)

        Bước 1: Khởi tạo mạng lưới bay
        - Chuyến bay 1: Mã "VS111", SGN-HAN, Giá cơ sở: 1.000.000 VNĐ, Sức chứa: 2 ghế.
        - Chuyến bay 2: Mã "VS222", SGN-DAD, Giá cơ sở: 800.000 VNĐ, Sức chứa: 50 ghế.

        Bước 2: Giao dịch Đặt vé (Booking)
        - Khách A (CCCD: "001") mua 1 Vé Phổ thông, 25kg hành lý -> Đặt vào chuyến "VS111".
        (Kỳ vọng: Thành công. Thu 1.250.000 VNĐ).
        - Khách B (CCCD: "002") mua 1 Vé Thương gia, 10kg hành lý -> Đặt vào chuyến "VS111".
        (Kỳ vọng: Thành công. Thu 2.500.000 VNĐ).
        - Khách C (CCCD: "003") mua 1 Vé Khuyến mãi, 0kg hành lý -> Đặt vào chuyến "VS111".
        (Kỳ vọng: THẤT BẠI. Hệ thống báo "Chuyến bay VS111 đã hết chỗ").
        - Khách C (CCCD: "003") chuyển sang mua 1 Vé Phổ thông -> Đặt vào chuyến "VS333".
        (Kỳ vọng: THẤT BẠI. Hệ thống báo "Chuyến bay VS333 không tồn tại").
        - Khách C (CCCD: "003") chuyển sang mua 1 Vé Khuyến mãi, 5kg hành lý -> Đặt vào chuyến "VS222".
        (Kỳ vọng: Thành công. Thu 400.000đ vé + 500.000đ hành lý = 900.000 VNĐ).

        Bước 3: Giao dịch Hủy vé (Cancellation)
        - Khách A yêu cầu hủy vé chuyến "VS111".
        (Kỳ vọng: Hủy thành công. Hoàn lại 700.000 VNĐ. Phí phạt thu được là 300.000 VNĐ. Phí hành lý không hoàn. Chuyến bay VS111 hiện tại trống 1 chỗ).
        - Khách C yêu cầu hủy vé chuyến "VS222".
        (Kỳ vọng: THẤT BẠI. Hệ thống từ chối vì vé Khuyến mãi không được hủy).

        Bước 4: Xuất báo cáo tổng hợp
        - Duyệt qua toàn bộ danh sách chuyến bay của hãng, in ra:
        + Mã chuyến bay.
        + Số lượng khách chuẩn bị bay thực tế (Số vé còn hiệu lực).
        + Doanh thu của chuyến bay đó.
        - Tính và in ra TỔNG DOANH THU của toàn bộ Hãng hàng không.*/


    }
}
