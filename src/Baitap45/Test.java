package Baitap45;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
         1. Bối cảnh
        Một ngân hàng thương mại cần phát triển hệ thống Core Banking để quản lý tài khoản của khách hàng và tự động hóa
        quá trình xử lý giao dịch. Hệ thống phải đảm bảo tính toàn vẹn dữ liệu: tiền bị trừ ở tài khoản này thì phải được
        cộng đúng vào tài khoản kia, đồng thời áp dụng chính xác các biểu phí và quy tắc bảo mật của từng loại tài khoản.

        2. Yêu cầu quản lý dữ liệu (Nghiệp vụ)

        * Phân hệ Khách hàng (Customer):
        Mỗi khách hàng được cấp một Mã định danh (CIF), Họ và tên, và Số điện thoại.
                Một khách hàng có thể mở và sở hữu NHIỀU tài khoản ngân hàng khác nhau.

                * Phân hệ Tài khoản (Account):
        Tất cả các tài khoản đều có chung các thông tin cơ bản: Số tài khoản (duy nhất) và Số dư khả dụng (Balance).
                Hệ thống cung cấp 3 loại tài khoản:

        - Tài khoản Thanh toán (Checking Account):
        + Dùng để chi tiêu hàng ngày.
                + Số dư không bao giờ được phép âm (nhỏ hơn 0).
                + Quy tắc giao dịch: Được phép rút tiền và chuyển tiền thoải mái. Tuy nhiên, ngân hàng thu
        "Phí bảo trì hệ thống" cố định là 10.000 VNĐ cho mỗi lần thực hiện giao dịch chuyển tiền ra ngoài.

        - Tài khoản Tiết kiệm (Savings Account):
        + Dùng để sinh lời. Có thêm thuộc tính "Lãi suất năm" (Ví dụ: 6% / năm).
        + Số dư bắt buộc phải luôn giữ lại tối thiểu 50.000 VNĐ (Không được rút cạn tiền).
                + Quy tắc giao dịch: Tài khoản tiết kiệm tuyệt đối KHÔNG ĐƯỢC PHÉP dùng để chuyển tiền cho tài khoản của người khác.
                Nó chỉ có thể rút tiền mặt hoặc tính lãi. (Lưu ý: Nếu vi phạm quy tắc này, hệ thống phải từ chối giao dịch).

        - Tài khoản Tín dụng (Credit Account):
        + Dùng để tiêu xài trước, trả tiền sau. Có thêm thuộc tính "Hạn mức tín dụng" (Credit Limit).
        + Số dư của thẻ tín dụng có thể bị âm (biểu thị số tiền đang nợ ngân hàng). Tuy nhiên, tổng số tiền nợ tuyệt đối
        không được vượt quá Hạn mức tín dụng.
        + Quy tắc giao dịch: Được phép thanh toán/chuyển tiền. Nhưng vì đây là tiền đi vay, mỗi lần thực hiện giao dịch,
                khách hàng sẽ bị tính "Phí ứng tiền" bằng 3% tổng giá trị giao dịch đó. Phí này sẽ bị cộng dồn vào khoản nợ (trừ thêm vào số dư).

                * Phân hệ Giao dịch (Transaction):
        Cơ chế Chuyển tiền (Transfer) từ Tài khoản A sang Tài khoản B với số tiền X:
        - Hệ thống phải kiểm tra xem Tài khoản A có vi phạm quy tắc của loại tài khoản đó không (Có phải là thẻ tiết kiệm không?
                Số dư sau khi trừ X và các loại Phí có bị âm hoặc vượt hạn mức không?).
                - Nếu tất cả quy tắc đều hợp lệ: Tài khoản A bị trừ (X + Phí giao dịch nếu có), và Tài khoản B được cộng đúng X đồng.
        - Phải in ra biên lai ghi rõ: Trạng thái (Thành công/Thất bại), Tài khoản nguồn, Tài khoản đích, Số tiền chuyển,
        Phí giao dịch phải chịu, và Số dư còn lại của Tài khoản nguồn.
        3. Kịch bản mô phỏng chi tiết (Test Cases)

        ---------------------------------------------------------
                BƯỚC 1: KHỞI TẠO HỆ THỐNG (Trạng thái ban đầu)
        ---------------------------------------------------------
                1. Khách hàng: Nguyễn Văn A (CIF: A100) sở hữu 2 tài khoản:
        - Tài khoản Thanh toán (Số TK: TK_A1) -> Số dư ban đầu: 5.000.000 VNĐ
                - Tài khoản Tín dụng   (Số TK: TK_A2) -> Số dư ban đầu: 0 VNĐ, Hạn mức: 20.000.000 VNĐ

        2. Khách hàng: Trần Thị B (CIF: B200) sở hữu 1 tài khoản:
        - Tài khoản Tiết kiệm  (Số TK: TK_B1) -> Số dư ban đầu: 100.000.000 VNĐ, Lãi suất: 6%/năm

                ---------------------------------------------------------
                BƯỚC 2: NHẬT KÝ THỰC HIỆN GIAO DỊCH
        ---------------------------------------------------------

        [PHÂN ĐOẠN 1: CÁC GIAO DỊCH CỦA ANH NGUYỄN VĂN A]

        * Giao dịch 1: Anh A dùng tài khoản thanh toán TK_A1 chuyển 1.000.000 VNĐ cho chị B (TK_B1).
                - Phân tích logic: Số tiền cần trừ = 1.000.000 (gốc) + 10.000 (phí cố định) = 1.010.000 VNĐ. Số dư 5tr đủ để trừ.
        - Kết quả hệ thống phải in ra: "GIAO DỊCH THÀNH CÔNG".
                - Trạng thái sau GD:
        + TK_A1 (Anh A) còn: 3.990.000 VNĐ.
                + TK_B1 (Chị B) tăng lên: 101.000.000 VNĐ.

                * Giao dịch 2: Anh A dùng tài khoản tín dụng TK_A2 chuyển tiếp 5.000.000 VNĐ cho chị B (TK_B1).
                - Phân tích logic: Phí ứng tiền tín dụng là 3% của 5tr = 150.000 VNĐ. Tổng số nợ phát sinh = 5.150.000 VNĐ. Số nợ này nằm trong hạn mức cho phép (20tr).
                - Kết quả hệ thống phải in ra: "GIAO DỊCH THÀNH CÔNG".
                - Trạng thái sau GD:
        + TK_A2 (Anh A) có số dư âm: -5.150.000 VNĐ.
                + TK_B1 (Chị B) tăng lên: 106.000.000 VNĐ.

                * Giao dịch 3: Anh A cố gắng dùng tài khoản tín dụng TK_A2 chuyển thêm 15.000.000 VNĐ nữa cho chị B.
                - Phân tích logic: Phí 3% của 15tr là 450.000 VNĐ. Tổng nợ mới nếu thành công sẽ là: 5.150.000 (nợ cũ) + 15.000.000 (gốc mới) + 450.000 (phí mới) = 20.600.000 VNĐ. Số tiền này vượt quá hạn mức 20tr của thẻ.
                - Kết quả hệ thống phải in ra: "GIAO DỊCH THẤT BẠI: Vượt quá hạn mức tín dụng".
                - Trạng thái sau GD: Số tiền các bên giữ nguyên, không thay đổi.

        -----------------------------

        [PHÂN ĐOẠN 2: CÁC GIAO DỊCH CỦA CHỊ TRẦN THỊ B]

        * Giao dịch 4: Chị B dùng tài khoản tiết kiệm TK_B1 chuyển ngược 2.000.000 VNĐ cho anh A (TK_A1).
                - Phân tích logic: Tài khoản tiết kiệm bị cấm chuyển khoản theo quy định hệ thống.
                - Kết quả hệ thống phải in ra: "GIAO DỊCH THẤT BẠI: Tài khoản tiết kiệm không hỗ trợ chuyển khoản".
                - Trạng thái sau GD: Số tiền các bên giữ nguyên.

        * Giao dịch 5: Chị B ra quầy yêu cầu rút tiền mặt 105.970.000 VNĐ từ tài khoản tiết kiệm TK_B1.
                - Phân tích logic: Số dư hiện tại là 106tr. Nếu rút 105.970.000 VNĐ thì số dư còn lại chỉ là 30.000 VNĐ, vi phạm quy định phải giữ lại tối thiểu 50.000 VNĐ của tài khoản tiết kiệm.
        - Kết quả hệ thống phải in ra: "GIAO DỊCH THẤT BẠI: Số dư còn lại không đủ để duy trì tài khoản tối thiểu".
                - Trạng thái sau GD: Số tiền giữ nguyên.

        * Giao dịch 6: Cuối tháng, chị B yêu cầu hệ thống tính lãi và cộng dồn cho tài khoản tiết kiệm TK_B1 sau 6 tháng gửi.
        - Phân tích logic: Tiền lãi = 106.000.000 * (0.06 / 12) * 6 = 3.180.000 VNĐ. Tiền lãi này được cộng thẳng vào số dư hiện tại.
                - Kết quả hệ thống phải in ra: "TÍNH LÃI THÀNH CÔNG: Cộng thêm 3.180.000 VNĐ".
                - Trạng thái sau GD:
        + TK_B1 (Chị B) tăng lên: 109.180.000 VNĐ.

                ---------------------------------------------------------
                BƯỚC 3: XUẤT BÁO CÁO VÀ LỊCH SỬ GIAO DỊCH
        ---------------------------------------------------------
                Hệ thống duyệt qua từng khách hàng, in ra số dư hiện tại của các tài khoản và liệt kê toàn bộ "vết" giao dịch đã thực hiện trong phiên:

        Ví dụ định dạng hiển thị kỳ vọng:
        === KHÁCH HÀNG: NGUYỄN VĂN A ===
                - TK Thanh toán TK_A1. Số dư: 3.990.000 VNĐ
                * LỊCH SỬ GIAO DỊCH:
            [GD1][Thành công] Chuyển khoản: 1.000.000 VNĐ | Phí: 10.000 VNĐ | Đến: TK_B1
                - TK Tín dụng TK_A2. Số dư: -5.150.000 VNĐ (Hạn mức còn lại: 14.850.000 VNĐ)
        * LỊCH SỬ GIAO DỊCH:
            [GD2][Thành công] Chuyển khoản: 5.000.000 VNĐ | Phí: 150.000 VNĐ | Đến: TK_B1
                [GD3][Thất bại] Chuyển khoản: 15.000.000 VNĐ | Lý do: Vượt hạn mức tín dụng.

                === KHÁCH HÀNG: TRẦN THỊ B ===
                - TK Tiết kiệm TK_B1. Số dư: 109.180.000 VNĐ
                * LỊCH SỬ GIAO DỊCH:
            [GD1][Thành công] Nhận tiền từ TK_A1: +1.000.000 VNĐ
                [GD2][Thành công] Nhận tiền từ TK_A2: +5.000.000 VNĐ
                [GD4][Thất bại] Chuyển khoản: 2.000.000 VNĐ | Lý do: Tính năng bị cấm.
            [GD5][Thất bại] Rút tiền mặt: 105.970.000 VNĐ | Lý do: Không đủ số dư tối thiểu.
            [GD6][Thành công] Cộng tiền lãi 6 tháng: +3.180.000 VNĐ*/

        Customer A = new Customer("A100", "Nguyen Van A", 124221);
        Customer B = new Customer("B200", "Tran Thi B", 125151);
        A.addAccount(new CheckingAccount("A1", 5000000));
        A.addAccount(new CreditAccount("A2", 0, 2000000));
        B.addAccount(new SavingsAccount("B1", 500000, 0.06));
        BankManager bankManager = new BankManager();
        bankManager.addCustomer(A);
        bankManager.addCustomer(B);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("===== NGÂN HÀNG VIETCOMBANK =====");
            System.out.println("1. Xem số dư |2. Rút tiền |3. Chuyển tiền |4. Xem lịch sử |5. Xem lãi thẻ tiết kiệm |6. Thoát");
            System.out.println("Chọn chức năng: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập STK: ");
                    String num = sc.next();
                    Account acc = bankManager.searchAccount(num);
                    if (acc != null) {
                        acc.display();
                    } else {
                        System.out.println("Không tìm thấy tài khoản.");
                    }
                    break;
                case 2:
                    System.out.println("Nhập STK rút: ");
                    String wNum = sc.next();
                    System.out.println("Số tiền rút: ");
                    int wAmount = sc.nextInt();
                    bankManager.withdraw(wNum, wAmount);
                    break;
                case 3:
                    System.out.println("Nhập STK chuyển: ");
                    String fNum = sc.next();
                    System.out.println("Nhập STK nhận: ");
                    String tNum = sc.next();
                    System.out.print("Số tiền chuyển: ");
                    int tAmount = sc.nextInt();
                    bankManager.transfer(fNum, tNum, tAmount);
                    break;
                case 4:
                    for (Transfer t : bankManager.getTransferList()) {
                        t.display();
                    }
                    break;
                case 5:
                    System.out.print("Nhập STK: ");
                    String inputAcc = sc.next();
                    System.out.print("Nhập số tháng đã gửi tiết kiệm: ");
                    int inputMonths = sc.nextInt();
                    bankManager.calculateInterest(inputAcc, inputMonths);
                    break;
                case 6:
                    System.out.println("Đang thoát...");
                    break;
                default:
                    System.out.println("Không có chức năng này!");
            }
        } while (choice != 6);
    }
}
