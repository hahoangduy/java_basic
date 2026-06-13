package Baitap50;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*1. Bối cảnh nghiệp vụ
        Một nền tảng Thương mại điện tử cần xây dựng Module "Giỏ hàng" (Cart) và "Thanh toán" (Checkout). Khách hàng có thể thêm
        nhiều loại sản phẩm khác nhau vào giỏ. Điều làm nên sự phức tạp của hệ thống này là cơ chế tính giá động của từng loại mặt
        hàng và khả năng áp dụng chồng (stack) nhiều loại mã giảm giá (Voucher) lên cùng một đơn hàng.

        2. Yêu cầu quản lý dữ liệu (Nghiệp vụ)

        * Phân hệ Sản phẩm (Product):
        Tất cả các sản phẩm đều có: Mã sản phẩm, Tên sản phẩm, và Đơn giá gốc. Mọi sản phẩm đều phải có khả năng tự
        tính "Giá bán thực tế" của chính nó. Nền tảng kinh doanh 3 nhóm hàng:
        - Hàng Tiêu chuẩn (Standard): Giá bán thực tế bằng đúng Đơn giá gốc.
        - Hàng Điện tử (Electronics): Bắt buộc phải chịu thêm 10% thuế VAT. Giá bán thực tế = Đơn giá gốc * 1.1.
        - Thực phẩm Tươi sống (Fresh Food): Rất nhạy cảm về thời gian. Có thêm thuộc tính "Số ngày còn hạn sử dụng" (int).
          + Quy tắc xả hàng: Nếu thực phẩm còn <= 2 ngày là hết hạn, hệ thống tự động giảm giá 20% cho sản phẩm đó
          (Giá bán thực tế = Đơn giá gốc * 0.8). Nếu > 2 ngày, bán bằng Đơn giá gốc bình thường.

        * Phân hệ Khuyến mãi (Voucher):
        Hệ thống cung cấp các loại Mã giảm giá áp dụng trên TỔNG GIÁ TRỊ ĐƠN HÀNG. Mọi Voucher đều có Mã Code (VD: "SALE10").
        - Voucher Trừ thẳng (Fixed Discount): Giảm một số tiền cố định (VD: Giảm 50.000 VNĐ). Lưu ý: Nếu số tiền giảm lớn hơn tổng giá trị đơn hàng,
         tổng tiền chỉ giảm về 0đ (không có chuyện âm tiền).
        - Voucher Phần trăm (Percent Discount): Có 2 thông số là "Tỷ lệ giảm" (VD: 15%) và "Mức giảm tối đa" (VD: Tối đa 100.000 VNĐ).
          + Quy tắc: Tính số tiền được giảm theo tỷ lệ phần trăm. Nếu số tiền đó vượt quá "Mức giảm tối đa", thì khách chỉ được giảm đúng bằng "Mức giảm tối đa".

        * Phân hệ Giỏ hàng (Cart):
        Mỗi Giỏ hàng đại diện cho một lần mua sắm của khách.
        - Thuộc tính: Danh sách các Sản phẩm đã chọn, và MỘT Danh sách các Voucher được áp dụng.
        (Giả định nền tảng cho phép áp dụng tối đa 2 Voucher trên 1 đơn hàng).
        - Quy tắc Thanh toán (Checkout):
          + Bước 1: Tính [Tổng tiền hàng] = Tổng "Giá bán thực tế" của tất cả sản phẩm trong giỏ.
          + Bước 2: Phí vận chuyển mặc định cho mọi đơn hàng là 30.000 VNĐ.
          + Bước 3: Tính [Số tiền Voucher hỗ trợ]. Duyệt qua các Voucher khách đã nhập và trừ dần vào [Tổng tiền hàng].
          + Bước 4: [Số tiền khách phải trả] = ([Tổng tiền hàng] - [Số tiền Voucher hỗ trợ]) + Phí vận chuyển.

        3. Kịch bản mô phỏng (Test Cases)

        Bước 1: Khởi tạo dữ liệu
        - Sản phẩm 1 (Hàng Tiêu chuẩn): "Áo thun" - Đơn giá gốc: 150.000 VNĐ.
        - Sản phẩm 2 (Hàng Điện tử): "Chuột Logitech" - Đơn giá gốc: 500.000 VNĐ.
        - Sản phẩm 3 (Thực phẩm): "Thịt bò Kobe" - Đơn giá gốc: 1.000.000 VNĐ. Còn 5 ngày hết hạn.
        - Sản phẩm 4 (Thực phẩm): "Sữa tươi" - Đơn giá gốc: 50.000 VNĐ. Còn 1 ngày hết hạn (Cận date).

        - Voucher 1 (Trừ thẳng): Mã "TRU50K", giảm thẳng 50.000 VNĐ.
        - Voucher 2 (Phần trăm): Mã "GIAM20", giảm 20%, tối đa 200.000 VNĐ.

        Bước 2: Giả lập Giỏ hàng 1
        - Khách hàng thêm "Áo thun" và "Sữa tươi" vào giỏ.
          -> Tính nhẩm Giá bán thực tế:
             Áo thun = 150.000 VNĐ.
             Sữa tươi (cận date giảm 20%) = 40.000 VNĐ.
          -> Tổng tiền hàng: 190.000 VNĐ.
        - Khách áp dụng Voucher "TRU50K".
          -> Số tiền Voucher hỗ trợ: 50.000 VNĐ.
          -> Tổng thanh toán: (190.000 - 50.000) + 30.000 phí ship = 170.000 VNĐ.

        Bước 3: Giả lập Giỏ hàng 2
        - Khách hàng thêm "Chuột Logitech" và "Thịt bò Kobe" vào giỏ.
          -> Tính nhẩm Giá bán thực tế:
             Chuột (+10% VAT) = 550.000 VNĐ.
             Thịt bò (> 2 ngày) = 1.000.000 VNĐ.
          -> Tổng tiền hàng: 1.550.000 VNĐ.
        - Khách áp dụng đồng thời cả 2 Voucher: "TRU50K" và "GIAM20".
          -> Logic áp dụng tuần tự:
             Áp dụng GIAM20 trước: 20% của 1.550.000 là 310.000 VNĐ. Nhưng vượt mức giảm tối đa (200k), nên chỉ được giảm 200.000 VNĐ.
             Áp dụng TRU50K tiếp: Giảm thêm 50.000 VNĐ.
             Tổng Voucher hỗ trợ: 250.000 VNĐ.
          -> Tổng thanh toán: (1.550.000 - 250.000) + 30.000 phí ship = 1.330.000 VNĐ.


        - In chi tiết các sản phẩm trong giỏ, mức giá từng món, tổng tiền hàng, danh sách voucher áp dụng, phí ship và tổng tiền cuối cùng phải trả.
        - Tính tổng doanh thu cửa hàng
        - Hiện danh sách khách hàng đã chi tiền (từ cao -> thấp)*/
        Scanner sc = new Scanner(System.in);
        ShopManager manager = new ShopManager();
        Product aoThun = new StandardProduct("SP01", "Áo thun", 150000);
        Product chuotLogitech = new ElectronicsProduct("SP02", "Chuột Logitech", 500000);
        Product thitBoKobe = new FreshFoodProduct("SP03", "Thịt bò Kobe", 1000000, 5);
        Product suaTuoi = new FreshFoodProduct("SP04", "Sữa tươi", 50000, 1);
        Voucher vTru50K = new FixedDiscount("TRU50K");
        Voucher vGiam20 = new PercentDiscount("GIAM20");
        int choice;
        do {
            System.out.println("------ Menu ------");
            System.out.println("1. Mua sắm |2. Doanh thu |3. Danh sách hóa đơn |4. Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên khách hàng mua sắm: ");
                    String name = sc.next();
                    Cart cart = new Cart(name);
                    int itemChoose;
                    do {
                        System.out.println("Mời chọn sản phẩm: ");
                        System.out.println("1. Áo thun | Giá gốc: " + aoThun.getBasePrice());
                        System.out.println("2. Chuột Logitech | Giá gốc: " + chuotLogitech.getBasePrice());
                        System.out.println("3. Thịt bò Kobe | Giá gốc: " + thitBoKobe.getBasePrice());
                        System.out.println("4. Sữa tươi | Giá gốc: " + suaTuoi.getBasePrice());
                        System.out.println("0. Dừng mua sản phẩm.");
                        itemChoose = sc.nextInt();
                        if (itemChoose == 1) cart.addProduct(aoThun);
                        else if (itemChoose == 2) cart.addProduct(chuotLogitech);
                        else if (itemChoose == 3) cart.addProduct(thitBoKobe);
                        else if (itemChoose == 4) cart.addProduct(suaTuoi);
                    }while (itemChoose != 0);

                    int voucherChoose;
                    do {
                        System.out.println("Danh sách Voucher đang có: ");
                        System.out.println("1. TRU50K - Giảm thẳng 50.000 VNĐ");
                        System.out.println("2. GIAM20% - Giảm 20% (Tối đa 200.000 VNĐ)");
                        System.out.println("Chọn Voucher muốn áp dụng (Tối đa 2 mã, ấn số 0 để bỏ qua): ");
                        voucherChoose = sc.nextInt();
                        if (voucherChoose == 1) cart.addVoucher(vTru50K);
                        else if (voucherChoose == 2) cart.addVoucher(vGiam20);
                        if (cart.getVoucherList().size() >= 2) {
                            System.out.println("Đã áp dụng tối đa 2 Voucher cho đơn hàng này!");
                            break;
                        }
                    }while (voucherChoose != 0);
                    manager.addCart(cart);
                    System.out.println("");
                    System.out.println("--- THANH TOÁN ---");
                    manager.calculateBill(cart);
                    break;
                case 2:
                    manager.saleReport();
                    break;
                case 3:
                    manager.arrange();
                    break;
                case 4:
                    System.out.println("Đang thoát...");
                default:
                    System.out.println("Không có chức năng này!");
            }
        }while (choice != 4);
    }
}
