package Baitap34;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
        Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(nam, nữ, khác), địa chỉ.

        Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
        Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
        Các nhân viên có thuộc tính riêng: công việc.
        Yêu cầu 1: Xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo.

        Yêu cầu 2: Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:

        Thêm mới cán bộ.
        Tìm kiếm theo họ tên.
        Hiện thị thông tin về danh sách các cán bộ.
        Thoát khỏi chương trình.*/

        Scanner sc = new Scanner(System.in);
        QLCB cb = new QLCB();
        int choice;
        do {
            System.out.println("Mời bạn chọn dịch vụ: ");
            System.out.println("1. Thêm mới cán bộ | 2. Tìm kiếm theo họ tên | 3. Hiện thị danh sách cán bộ | 4. Thoát chương trình");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mời nhập tên: ");
                    String name = sc.next();
                    System.out.println("Mời nhập tuổi: ");
                    int age = sc.nextInt();
                    System.out.println("Mời nhập giới tính: ");
                    String sex = sc.next();
                    System.out.println("Mời nhập địa chỉ: ");
                    String address = sc.next();
                    System.out.println("Bạn làm vị trí nào?");
                    System.out.println("1. Công nhân | 2. Kỹ sư | 3. Nhân viên");
                    int choice1 = sc.nextInt();
                    switch (choice1) {
                        case 1:
                            System.out.println("Bạn bậc thứ bao nhiêu?");
                            int level = sc.nextInt();
                            cb.addCB(new CongNhan(name, age, sex, address, level));
                            break;
                        case 2:
                            System.out.println("Bạn làm ngành gì?");
                            String nganh = sc.next();
                            cb.addCB(new KySu(name, age, sex, address, nganh));
                            break;
                        case 3:
                            System.out.println("Bạn làm công việc gì?");
                            String congViec = sc.next();
                            cb.addCB(new NhanVien(name, age, sex, address, congViec));
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Mời nhập tên để tìm: ");
                    String tim = sc.next();
                    cb.search(tim);
                    break;
                case 3:
                    cb.display();
                    break;
                case 4:
                    System.out.println("Đã thoát chương trình!");
                    break;
                default:
                    System.out.println("Không có lựa chọn này!");
                    break;
            }
        }while (choice != 4);
    }
}
