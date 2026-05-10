package Baitap39;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Test {
    public static void main(String[] args) {
        /*1. Bối cảnh nghiệp vụ
        Một bệnh viện đa khoa cần số hóa hệ thống tính toán viện phí.
        Mỗi bệnh nhân khi đến khám và điều trị sẽ phát sinh các khoản chi phí khác nhau tùy thuộc vào hình thức điều trị.
        Đồng thời, hệ thống phải tính toán chính xác số tiền mà Bảo hiểm Y tế (BHYT) sẽ chi trả (nếu có),
         từ đó suy ra số tiền thực tế bệnh nhân phải tự thanh toán (Mức tự chi trả).

        2. Yêu cầu thiết kế hệ thống
        Hệ thống cần định nghĩa một Interface mang tên 'IBaoHiem' chứa phương thức:
        - double tinhTienBaoHiemTra(): Tính số tiền BHYT hỗ trợ.

        Tất cả các hồ sơ bệnh án (BenhAn) đều phải lưu trữ thông tin cơ bản:
        - Mã bệnh án (String).
        - Tên bệnh nhân (String).
        - Có thẻ BHYT hay không (boolean).
        - Phí khám bệnh ban đầu (double).
        - Tiền thuốc (double).

        Hệ thống có 3 loại bệnh án cụ thể:

        A. Bệnh án Ngoại trú (Outpatient - Kế thừa BenhAn, thực thi IBaoHiem)
        Là những bệnh nhân chỉ đến khám, lấy thuốc và về trong ngày.
        - Tổng viện phí = Phí khám bệnh + Tiền thuốc.
        - Quy tắc Bảo hiểm: Nếu bệnh nhân CÓ thẻ BHYT, bảo hiểm sẽ chi trả 80% (Tổng viện phí). Nếu KHÔNG có thẻ, bảo hiểm trả 0 đồng.

        B. Bệnh án Nội trú (Inpatient - Kế thừa BenhAn, thực thi IBaoHiem)
        Là những bệnh nhân phải nhập viện nằm lại điều trị. Cần quản lý thêm:
        - Số ngày nằm viện (int).
        - Loại phòng (String hoặc Enum): Chỉ nhận 3 giá trị "A", "B", "C". Trong đó phòng A giá 1.000.000đ/ngày, phòng B giá 500.000đ/ngày, phòng C giá 200.000đ/ngày.
        - Phí phẫu thuật/Thủ thuật (double).
        - Tổng viện phí = Phí khám bệnh + Tiền thuốc + (Số ngày * Giá loại phòng tương ứng) + Phí phẫu thuật.
        - Quy tắc Bảo hiểm: BHYT không hỗ trợ tiền phòng. Nếu CÓ thẻ BHYT, bảo hiểm chi trả 100% (Phí khám bệnh + Tiền thuốc) và 70% Phí phẫu thuật.

        C. Bệnh án VIP (Kế thừa từ Bệnh án Nội trú)
        Là những bệnh nhân chọn dịch vụ chăm sóc đặc biệt (phòng riêng, y tá trực 24/7).
        - Cần quản lý thêm: Phí dịch vụ gia tăng (double).
        - Tổng viện phí = Tổng viện phí của Nội trú (như mục B) + Phí dịch vụ gia tăng.
        - Quy tắc Bảo hiểm: BHYT hỗ trợ giống hệt mục B (Nội trú). Bảo hiểm tuyệt đối KHÔNG chi trả cho Phí dịch vụ gia tăng.

        * Công thức chung bắt buộc cho mọi bệnh án:
        Số tiền bệnh nhân tự thanh toán = Tổng viện phí - Số tiền Bảo hiểm chi trả.

        3. Yêu cầu chức năng (Xây dựng lớp QuanLyBenhVien)
        Chức năng 1: Thêm một hồ sơ bệnh án mới vào danh sách. Hệ thống không giới hạn số lượng bệnh án.

        Chức năng 2: Xuất danh sách toàn bộ bệnh án. Thông tin mỗi dòng hiển thị cần có:
        Mã bệnh án, Tên bệnh nhân, Hình thức điều trị (Ngoại trú/Nội trú/VIP), Tổng viện phí, Tiền bảo hiểm trả, Tiền bệnh nhân tự thanh toán.

        Chức năng 3: Thống kê tổng số tiền mà Bệnh viện sẽ phải làm hồ sơ yêu cầu cơ quan Bảo hiểm Y tế thanh toán
        (Tính tổng tất cả các khoản tinhTienBaoHiemTra của toàn bộ bệnh nhân).

        Chức năng 4: NÂNG CAO - Sắp xếp và in ra danh sách bệnh án theo thứ tự giảm dần của "Số tiền bệnh nhân tự thanh toán".*/

        Scanner sc = new Scanner(System.in);
        QuanLyBenhVien qlbv = new QuanLyBenhVien();
        int choice;

        do {
            System.out.println("-----   HOSPITAL SERVICE    -----");
            System.out.println("1. Thêm bệnh án | 2. Danh sách bệnh án | 3. BHYT chi trả | 4. Danh sách bệnh án giảm dần theo số tiền bệnh nhân tự thanh toán | 5. Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Khách hàng đang khám theo dịch vụ nào?");
                    System.out.println("1. Outpatient | 2. Inpatient | 3. VIP");
                    int type = sc.nextInt();
                    System.out.println("Mời nhập mã bệnh án: ");
                    String id = sc.next();
                    System.out.println("Mời nhập tên: ");
                    String name = sc.next();
                    System.out.println("Tiền khám bệnh của khách hàng: ");
                    double phiKham = sc.nextInt();
                    System.out.println("Tiền thuốc của khách hàng: ");
                    double tienThuoc = sc.nextInt();
                    System.out.println("Bệnh nhân có BHYT không?");
                    System.out.println("\tYES | NO");
                    String hasBHYT = sc.next();
                    boolean isHasBHYT = hasBHYT.equalsIgnoreCase("YES");
                    switch (type) {
                        case 1:
                            qlbv.addBenhAn(new Outpatient(id, name, isHasBHYT, phiKham, tienThuoc));
                            break;
                        case 2:
                            System.out.println("Phí phẫu thuật của khách hàng: ");
                            double phiPhauThuat = sc.nextInt();
                            System.out.println("Khách hàng ở phòng bệnh nào?");
                            System.out.println("\tA | B | C");
                            String roomType = sc.next();
                            System.out.println("Khách hàng đã nhập viện tổng bao nhiêu ngày?");
                            int days = sc.nextInt();
                            if (roomType.equals("A")) {
                                qlbv.addBenhAn(new Inpatient(id, name, isHasBHYT, phiKham, tienThuoc, days, roomType, phiPhauThuat));
                            }
                            if (roomType.equals("B")) {
                                qlbv.addBenhAn(new Inpatient(id, name, isHasBHYT, phiKham, tienThuoc, days, roomType, phiPhauThuat));
                            }
                            if (roomType.equals("C")) {
                                qlbv.addBenhAn(new Inpatient(id, name, isHasBHYT, phiKham, tienThuoc, days, roomType, phiPhauThuat));
                            }
                            break;
                        case 3:
                            System.out.println("Phí phẫu thuật của khách hàng: ");
                            double phiPhauThuatVip = sc.nextInt();
                            System.out.println("Khách hàng ở phòng bệnh nào?");
                            System.out.println("\tA | B | C");
                            String roomTypeVip = sc.next();
                            System.out.println("Khách hàng đã nhập viện tổng bao nhiêu ngày?");
                            int daysVip = sc.nextInt();
                            if (roomTypeVip.equals("A")) {
                                qlbv.addBenhAn(new VIP(id, name, isHasBHYT, phiKham, tienThuoc, daysVip, roomTypeVip, phiPhauThuatVip, 1000000));
                            }
                            if (roomTypeVip.equals("B")) {
                                qlbv.addBenhAn(new VIP(id, name, isHasBHYT, phiKham, tienThuoc, daysVip, roomTypeVip, phiPhauThuatVip, 1000000 ));
                            }
                            if (roomTypeVip.equals("C")) {
                                qlbv.addBenhAn(new VIP(id, name, isHasBHYT, phiKham, tienThuoc, daysVip, roomTypeVip, phiPhauThuatVip, 1000000 ));
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Danh sách tất cả bệnh án ở bệnh viện: ");
                    qlbv.display();
                    break;
                case 3:
                    qlbv.hoaDonBHYT();
                    break;
                case 4:
                    qlbv.danhSachTuTra();
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
