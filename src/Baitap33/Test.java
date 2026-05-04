package Baitap33;

import PizzaStoreProject.GreekPizza;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*1. Mô tả bài toán
        Xây dựng hệ thống quản lý các gói bảo hiểm cho khách hàng. Hệ thống cần tính toán chính xác mức phí đóng hàng tháng (Premium)
        dựa trên đặc điểm khách hàng và số tiền công ty bảo hiểm sẽ chi trả (Claim) dựa trên các quy tắc nghiệp vụ khắt khe của từng gói.

        2. Yêu cầu chi tiết về các lớp
        A. Lớp trừu tượng InsurancePlan
        Thuộc tính:

        String planId: Mã gói bảo hiểm.

        String policyHolder: Tên người chủ hợp đồng.

        int age: Tuổi.

        double baseRate: Mức phí nền (ví dụ: 1.000.000 VNĐ).

        Phương thức trừu tượng:

        double calculateMonthlyPremium(): Tính phí bảo hiểm đóng mỗi tháng.

        double calculateClaim(double billAmount, String serviceType): Tính số tiền bảo hiểm chi trả cho một hóa đơn.

        Phương thức chung:

        void displayInfo(): In ra thông tin cơ bản của gói và chủ sở hữu.

        B. Lớp BasicPlan (Kế thừa InsurancePlan)
        Quy tắc tính Phí (Premium): Bằng đúng baseRate.

        Quy tắc bồi thường (Claim):

        Chi trả 70% giá trị hóa đơn.

        Hạn mức (Cap): Số tiền chi trả tối đa cho một hóa đơn không được vượt quá 2.000.000 VNĐ.

        Ưu đãi người già: Nếu khách hàng trên 60 tuổi, tỷ lệ chi trả tăng thêm 5% (thành 75%), nhưng hạn mức tối đa vẫn giữ nguyên 2.000.000 VNĐ.

        C. Lớp GoldPlan (Kế thừa InsurancePlan)
        Thuộc tính riêng: boolean hasPreCondition (Có bệnh nền hay không).

        Quy tắc tính Phí (Premium): baseRate * 1.5. Nếu hasPreCondition là true, phí tăng thêm 20% trên tổng tiền.

        Quy tắc bồi thường (Claim):

        Chi trả 90% giá trị hóa đơn cho các dịch vụ thông thường.

        Dịch vụ đặc biệt: Nếu serviceType là "Dental" (Nha khoa), chi trả 100% giá trị hóa đơn nhưng tối đa không quá 1.000.000 VNĐ.

        D. Lớp PlatinumPlan (Kế thừa InsurancePlan)
        Quy tắc tính Phí (Premium): baseRate * 3.0.

        Quy tắc bồi thường (Claim):

        Mức khấu trừ (Deductible): Khách hàng phải tự thanh toán 500.000 VNĐ đầu tiên cho mỗi hóa đơn.

        Bảo hiểm chi trả 100% số tiền còn lại sau khi đã trừ mức khấu trừ.

        Lưu ý: Nếu hóa đơn nhỏ hơn hoặc bằng 500.000 VNĐ, bảo hiểm chi trả 0 VNĐ.
        3. Lớp quản lý InsuranceManager
        Xây dựng lớp này để quản lý danh sách các đối tượng InsurancePlan bằng ArrayList. Cung cấp các hàm sau:

        void addPlan(InsurancePlan plan): Thêm một gói bảo hiểm mới.

        double getTotalMonthlyRevenue(): Sử dụng tính Đa hình để tính tổng doanh thu phí bảo hiểm từ tất cả các khách hàng trong danh sách.

        void processClaimReport(String planId, double billAmount):

        Tìm gói bảo hiểm theo ID.

        Tính số tiền bảo hiểm trả (X) và số tiền khách hàng phải tự trả (Y).

        In kết quả ra màn hình: "Plan ID: ..., BHTQ chi trả: X VNĐ, Khách tự trả: Y VNĐ".
        4. Ví dụ minh họa (Test Cases)
        Case 1: Kiểm tra tính Đa hình & Doanh thu
        Khách A: BasicPlan, baseRate 1tr -> Phí: 1.000.000 VNĐ.

        Khách B: GoldPlan, baseRate 1tr, có bệnh nền -> Phí: (1tr * 1.5) * 1.2 = 1.800.000 VNĐ.

        Khách C: PlatinumPlan, baseRate 1tr -> Phí: 3.000.000 VNĐ.

        Tổng doanh thu: 5.800.000 VNĐ.

        Case 2: Kiểm tra logic Bồi thường (Claim)
        Khách A (Basic, 65 tuổi) khám hóa đơn 4.000.000 VNĐ:

        Tính theo tỷ lệ 75%: 3.000.000 VNĐ.

        Do vượt hạn mức (2.000.000 VNĐ) nên bảo hiểm chỉ trả 2.000.000 VNĐ.

        Khách B (Gold) khám Nha khoa (serviceType = "Dental") hóa đơn 1.500.000 VNĐ:

        Tính theo tỷ lệ 100%: 1.500.000 VNĐ.

        Do vượt hạn mức nha khoa (1.000.000 VNĐ) nên bảo hiểm trả 1.000.000 VNĐ.

        Khách C (Platinum) khám hóa đơn 1.200.000 VNĐ:

        Lấy hóa đơn trừ mức khấu trừ: 1.200.000 - 500.000 = 700.000 VNĐ.*/
        InsuranceManager im = new InsuranceManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Mời chọn dịch vụ: ");
            System.out.println("1. Mua gói bảo hiểm | 2. Xem danh sách gói bảo hiểm | 3. Xem doanh thu của công ty | 4. Bồi thường | 5. Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. B01 | 2. G01 | 3. P01");
                    System.out.println("Mời nhập mã gói bảo hiểm: ");
                    String a = sc.next();
                    switch (a) {
                        case "B01":
                            System.out.println("Mời nhập tên: ");
                            String b = sc.next();
                            System.out.println("Mời nhập tuổi: ");
                            int c = sc.nextInt();
                            System.out.println("Mời nhập UserId của bạn: ");
                            String d = sc.next();
                            System.out.println("Mời nhập mức phí nền: ");
                            double e = sc.nextDouble();
                            im.addPlan(new BasicPlan(a, b, c, d, e));
                            break;
                        case "G01":
                            System.out.println("Mời nhập tên: ");
                            String f = sc.next();
                            System.out.println("Mời nhập tuổi: ");
                            int g = sc.nextInt();
                            System.out.println("Mời nhập UserId của bạn: ");
                            String i = sc.next();
                            System.out.println("Mời nhập mức phí nền: ");
                            double h = sc.nextDouble();
                            System.out.println("Bạn có bệnh nền không?");
                            System.out.println("1. Có | 2. Không");
                            int k = sc.nextInt();
                            im.addPlan(new GoldPlan(a, f, g, i, h, k));
                            break;
                        case "P01":
                            System.out.println("Mời nhập tên: ");
                            String z = sc.next();
                            System.out.println("Mời nhập tuổi: ");
                            int x = sc.nextInt();
                            System.out.println("Mời nhập UserId của bạn: ");
                            String p = sc.next();
                            System.out.println("Mời nhập mức phí nền: ");
                            double v = sc.nextDouble();
                            im.addPlan(new PlatinumPlan(a, z, x, p, v));
                            break;
                    }
                    break;
                case 2:
                    im.display();
                    break;
                case 3:
                    im.getTotalMonthlyRevenue();
                    break;
                case 4:
                    System.out.println("Gói bảo hiểm của bạn: ");
                    String planId = sc.next();
                    System.out.println("UserId của bạn: ");
                    String id = sc.next();
                    System.out.println("Hóa đơn của bạn: ");
                    double bill = sc.nextDouble();
                    System.out.println("Bạn có khám nha khoa không?");
                    System.out.println("1. Có | 2. Không");
                    int st = sc.nextInt();
                    im.processClaimReport(planId, id, bill, st);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Không có lựa chọn này!");
                    break;
            }
        }while (choice != 5);
    }
}
