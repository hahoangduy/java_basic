package Baitap44;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*1. Bối cảnh
        Một chuỗi siêu thị điện máy cần xây dựng phần mềm quản lý kho hàng và xử lý giao dịch bán hàng.
        Hệ thống cần phân loại chính xác các dòng sản phẩm để tính thêm các khoản phụ phí (phí bảo hành,
        phí vận chuyển cồng kềnh) và áp dụng chính sách giảm giá cho khách hàng thân thiết.

        2. Yêu cầu quản lý dữ liệu (Nghiệp vụ)

        * Phân hệ Sản phẩm (Kho hàng):
        Mọi sản phẩm trong siêu thị đều có: Mã sản phẩm, Tên sản phẩm, Đơn giá gốc, và Số lượng tồn kho.
        Siêu thị kinh doanh 2 nhóm mặt hàng chính:
        - Thiết bị điện tử (Laptop, Điện thoại...): Có thêm thuộc tính "Thời gian bảo hành" (tính bằng tháng).
            + Ràng buộc phụ phí: Nếu sản phẩm có thời gian bảo hành lớn hơn 12 tháng, hệ thống bắt buộc thu thêm
        "Phí bảo hành mở rộng" bằng 5% Đơn giá gốc của sản phẩm đó. Nếu <= 12 tháng, không thu phí này.
        - Hàng điện gia dụng (Tủ lạnh, Máy giặt...): Có thêm thuộc tính "Khối lượng" (tính bằng kg).
            + Ràng buộc phụ phí: Do tính chất cồng kềnh, siêu thị thu "Phí giao hàng" là 10.000 VNĐ cho mỗi kg khối lượng.

        * Phân hệ Khách hàng:
        Tất cả khách hàng đều cần lưu trữ: Mã khách hàng, Họ tên, Số điện thoại. Có 2 nhóm khách hàng:
        - Khách hàng Tiêu chuẩn: Mua hàng thanh toán đúng 100% giá trị.
        - Khách hàng Thành viên (VIP): Nhóm này được hưởng ưu đãi giảm giá 10% trên TỔNG ĐƠN GIÁ GỐC của các sản phẩm họ mua.
        Lưu ý cực kỳ quan trọng: Chiết khấu VIP chỉ áp dụng trên giá gốc của hàng hóa, tuyệt đối KHÔNG được giảm giá
        trên các khoản phụ phí (Phí giao hàng, Phí bảo hành mở rộng).

        * Phân hệ Hóa đơn (Giao dịch):
        Mỗi Hóa đơn (Order) là một lần mua sắm của khách hàng. Một hóa đơn phải bao gồm:
        - Mã hóa đơn, Ngày lập.
        - MỘT Đối tượng Khách hàng (Người đứng tên mua).
        - MỘT Danh sách các "Chi tiết hóa đơn" (Order Line). Mỗi Chi tiết hóa đơn sẽ lưu trữ thông tin về: MỘT Sản phẩm được mua và Số lượng mua của sản phẩm đó.

        Quy trình xử lý một Hóa đơn hợp lệ:
        Khi thêm một Sản phẩm vào Hóa đơn với số lượng X:
        - Hệ thống phải kiểm tra xem Số lượng tồn kho của Sản phẩm đó có >= X hay không.
        - Nếu không đủ tồn kho: Thông báo lỗi và không cho thêm vào hóa đơn.
        - Nếu đủ tồn kho: Thêm thành công vào hóa đơn, và NGAY LẬP TỨC trừ đi X sản phẩm trong kho hàng (Cập nhật tồn kho).

        Tính Tổng tiền hóa đơn = (Tổng tiền giá gốc của các sản phẩm sau khi đã trừ chiết khấu khách hàng nếu có) + (Tổng tiền các loại phụ phí phát sinh từ sản phẩm).

        * Phân hệ Cửa hàng (Quản lý tổng):
        Cửa hàng sẽ quản lý một Danh sách toàn bộ Sản phẩm (Kho hàng) và một Danh sách các Hóa đơn đã xuất.

        3. Kịch bản mô phỏng (Test Cases)
        Hãy thiết kế hệ thống và giả lập kịch bản trong hàm main():

        Bước 1: Nhập kho (Khởi tạo sản phẩm)
        - Nhập 10 chiếc "Laptop Dell" (Thiết bị điện tử): Giá 20.000.000 VNĐ/chiếc, bảo hành 24 tháng.
        - Nhập 5 chiếc "Tivi Sony" (Thiết bị điện tử): Giá 10.000.000 VNĐ/chiếc, bảo hành 12 tháng.
        - Nhập 8 chiếc "Tủ lạnh LG" (Điện gia dụng): Giá 15.000.000 VNĐ/chiếc, nặng 50kg.

        Bước 2: Khởi tạo Khách hàng
        - Tạo Khách hàng Tiêu chuẩn: "Nguyễn Văn A".
        - Tạo Khách hàng VIP: "Trần Thị B".

        Bước 3: Giao dịch bán hàng
        - Tạo Hóa đơn 1 cho Khách A. Khách A mua 1 Laptop Dell và 1 Tủ lạnh LG.
        -> Mức giá kỳ vọng (Bạn cần code để hệ thống tự tính ra số này):
            + Laptop: Giá gốc 20tr + Phí bảo hành 1tr (5% của 20tr do BH 24 tháng) = 21.000.000 VNĐ.
            + Tủ lạnh: Giá gốc 15tr + Phí vận chuyển 500k (50kg * 10k) = 15.500.000 VNĐ.
            + Tổng hóa đơn 1: 36.500.000 VNĐ.
        - Tạo Hóa đơn 2 cho Khách B (VIP). Khách B mua 2 Tivi Sony và 1 Tủ lạnh LG.
        -> Mức giá kỳ vọng:
            + Tivi (x2): 20tr (Bảo hành 12 tháng nên không có phụ phí).
            + Tủ lạnh (x1): 15tr + Phí vận chuyển 500k = 15.500.000 VNĐ.
            + Tiền hàng (Giá gốc): 20tr + 15tr = 35.000.000 VNĐ.
            + Giảm giá VIP (10% tiền hàng): Trừ đi 3.500.000 VNĐ.
            + Tiền phụ phí tổng cộng: 500.000 VNĐ.
            + Tổng hóa đơn 2: (35.000.000 - 3.500.000) + 500.000 = 32.000.000 VNĐ.

        Bước 4: Kiểm tra trạng thái hệ thống
        - In ra màn hình Tồn kho hiện tại của Cửa hàng. (Laptop Dell phải còn 9, Tivi Sony còn 3, Tủ lạnh LG còn 6).
        - Thử tạo một hóa đơn mua 10 chiếc Tủ lạnh LG -> Hệ thống phải báo lỗi không đủ hàng.

        Danh sách hóa đơn từ cao tới thấp theo giá trị
        in ra màn hình người mua hàng nhiều tiền nhất
        */

        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        int choice;
        int choice4;
        Product ED1 = new ElectronicDevices("ED1","Laptop Dell", 20000000, 10, 24);
        store.addProduct(ED1);
        Product ED2 = new ElectronicDevices("ED2","Iphone 17", 30000000, 10, 12);
        store.addProduct(ED2);
        Product EA1 = new ElectricalAppliances("EA1", "Tủ lạnh LG", 5000000, 10, 15);
        store.addProduct(EA1);
        Product EA2 = new ElectricalAppliances("EA2", "Tivi Soni", 10000000, 10, 10);
        store.addProduct(EA2);
        do {
            System.out.println("-----   THẾ GIỚI DI ĐỘNG   -----");
            System.out.println("1. Tạo khách hàng | 2. Thêm sản phẩm vào giỏ hàng | 3. Tính tiền | 4. Kho hàng | 5. Danh sách hóa đơn | 6. Hóa đơn khách hàng mua nhiều sản phẩm nhất");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tên khách hàng: ");
                    String customerName = sc.next();
                    System.out.println("Số điện thoại: ");
                    int customerPhoneNumber = sc.nextInt();
                    System.out.println("1. Khách hàng cơ bản | 2. Khách hàng VIP");
                    int choice1 = sc.nextInt();
                    if (choice1 == 1) {
                        store.addCustomer(new StandardCustomer("SC", customerName, customerPhoneNumber));
                    }
                    else if (choice1 == 2) {
                        store.addCustomer(new VIPCustomer("VC", customerName, customerPhoneNumber));
                    }
                    break;
                case 2:
                    ArrayList<Order> cart = new ArrayList<>();
                    store.displayCustomer();
                    System.out.println("Nhập tên khách hàng: ");
                    String customerNameInput = sc.next();
                    Customer customer = store.getCustomerList().get(customerNameInput);
                    if (store.getCustomerList().containsKey(customerNameInput)) {
                        do {
                            System.out.println("1. Thiết bị điện tử | 2. Hàng điện gia dụng");
                            int choice2 = sc.nextInt();
                            if (choice2 == 1) {
                                System.out.println("1. Laptop Dell - 20.000.000 VNĐ - BH 24 tháng | 2. Iphone 17 - 30.000.000 VNĐ - BH 12 tháng");
                                int choice3 = sc.nextInt();
                                if (choice3 == 1) {
                                    System.out.println("Nhập số lượng sản phẩm: ");
                                    int quantity = sc.nextInt();
                                    if (store.checkWarehouse(ED1, quantity)) {
                                        Order order = new Order(ED1, quantity);
                                        cart.add(order);
                                        customer.setCart(cart);
                                    }
                                }
                                else if (choice2 == 2) {
                                    System.out.println("Nhập số lượng sản phẩm: ");
                                    int quantity = sc.nextInt();
                                    if (store.checkWarehouse(ED2, quantity)) {
                                        Order order = new Order(ED2, quantity);
                                        cart.add(order);
                                        customer.setCart(cart);
                                    }
                                }
                            } else if (choice2 == 2) {
                                System.out.println("1. Tủ lạnh LG - 5.000.000 VNĐ - 15kg | 2. Tivi Soni - 10.000.000 - 10kg");
                                int choice3 = sc.nextInt();
                                if (choice3 == 1) {
                                    System.out.println("Nhập số lượng sản phẩm: ");
                                    int quantity = sc.nextInt();
                                    if (store.checkWarehouse(EA1, quantity)) {
                                        Order order = new Order(EA1, quantity);
                                        cart.add(order);
                                        customer.setCart(cart);
                                    }
                                } else if (choice2 == 2) {
                                    System.out.println("Nhập số lượng sản phẩm: ");
                                    int quantity = sc.nextInt();
                                    if (store.checkWarehouse(EA2, quantity)) {
                                        Order order = new Order(EA2, quantity);
                                        cart.add(order);
                                        customer.setCart(cart);
                                    }
                                }
                            }
                            System.out.println("1.Thêm tiếp | 2. Thoát");
                            choice4 = sc.nextInt();
                        }while (choice4 != 2);
                    }
                    break;
                case 3:
                    store.displayCustomer();
                    System.out.println("Nhập tên khách hàng: ");
                    String customerNameInput1 = sc.next();
                    Customer customer1 = store.getCustomerList().get(customerNameInput1);
                    if (store.getCustomerList().containsKey(customerNameInput1)) {
                        customer1.displayProduct();
                        System.out.println("Hóa đơn của khách hàng " + customerNameInput1 + " là: " + customer1.finalTotal() + " VNĐ.");
                    }
                    break;
                case 4:
                    store.displayProduct();
                    break;
                case 5:

            }
        }while (choice != 7);
    }
}
