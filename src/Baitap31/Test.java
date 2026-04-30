package Baitap31;

import Baitap28.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
         Xây dựng hệ thống cho thuê xe gồm 3 loại: Car (Xe con), Truck (Xe tải), và Motorbike (Xe máy).

        Thuộc tính chung: id, brand, basePrice (giá thuê cơ bản theo ngày).

        Logic tính giá thuê (calculateRent(int days)):

        Car: Nếu thuê > 7 ngày, giảm 10% tổng tiền. Nếu là xe hạng sang, cộng thêm 500k/ngày phí bảo hiểm.

        Truck: Giá = basePrice * days + (Tải trọng * 100k). Nếu thuê > 15 ngày, giảm 20% tổng tiền.

        Motorbike: Giá cố định theo ngày, nhưng nếu phân khối > 175cc, phí thuê tăng 50%

        Viết hàm generateInvoice(String id, int days): Tìm xe theo ID, tính giá và in ra hóa đơn chi tiết (bao gồm cả các khoản phụ phí và giảm giá).
        Viết hàm display(): Hiển thị danh sách tất cả xe có trong hệ thống với thông tin chi tiết (id, brand,...).

        Bạn có một chiếc Truck (ID: T01), giá gốc 1 triệu/ngày, tải trọng 5 tấn.
        Khách thuê 20 ngày.Tiền gốc: 1.000.000 * 20 = 20.000.000.
        Phí tải trọng: 5 * 100.000 = 500.000. (Phí này cộng vào mỗi ngày hay tổng? Đề bài quy định cộng vào tổng).
        Tổng trước giảm giá: 20.500.000.
        Giảm giá 20% (vì > 15 ngày): 20.500.000 * 0.2 = 4.100.000.
        Thành tiền: 16.400.000.*/


        Scanner sc = new Scanner(System.in);
        ArrayList<Rent> DSC = new ArrayList<>();
        DSC.add(new Truck("T01", "Chenglong", 1000000, 5));
        DSC.add(new Truck("T02", "JAC", 700000, 4));
        DSC.add(new Truck("T03", "CAMC", 500000, 3));
        DSC.add(new Car("C01", "Mazda", 300000, "Mazda"));
        DSC.add(new Car("C02", "Mercedes", 1000000, "Mercedes"));
        DSC.add(new Car("C03", "BMW", 2000000, "BMW"));
        DSC.add(new Motorbike("CM01", "Sirius 110cc", 100000, "110cc"));
        DSC.add(new Motorbike("CM02", "Exciter 185cc", 2500000, "185cc"));
        DSC.add(new Motorbike("CM03", "SHi 350cc", 500000, "350cc"));

        System.out.println("----- DỊCH VỤ THUÊ XE -----");
        for (Rent x : DSC) {
            System.out.println(x.getId() + " | " + x.getBrand() + " | " + x.getBasePrice() + "/day");
        }
        System.out.println("Mời bạn chọn loại xe muốn thuê, vui lòng nhập ID của xe: ");
        String choice = sc.nextLine();
        System.out.println("Bạn muốn thuê bao nhiêu ngày? ");
        int days = sc.nextInt();

        for (Rent x : DSC) {
            if (x.getId().equals(choice)) {
                System.out.println("===== HÓA ĐƠN =====");
                x.display(days);
                return;
            }
        }

        System.out.println("Không tìm thấy xe bạn muốn thuê!");
    }
}
