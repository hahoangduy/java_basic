package Baitap28;

import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        /* Mini project:

        Tạo một lớp (class) Product với các thuộc tính: id (int), name (String), price (double).

        Tạo một ArrayList<Product> để làm "Kho hàng".

        Viết chương trình có menu cho phép người dùng chọn:

        Thêm sản phẩm: Nhập thông tin và lưu vào danh sách.

        Tìm kiếm: Nhập tên sản phẩm và hiển thị thông tin nếu có.

        Cập nhật giá: Nhập id, nếu tìm thấy thì cho phép sửa lại giá tiền.

        Xóa: Nhập id để xóa sản phẩm khỏi kho.

        Hiển thị: In danh sách sản phẩm theo dạng bảng.


        ví dụ:

        ----- QUẢN LÝ KHO HÀNG -----
        1. Thêm sản phẩm
        2. Tìm kiếm sản phẩm
        3. Cập nhật giá
        4. Hiển thị danh sách
        5. Thoát
        Lựa chọn của bạn: 1

        Nhập ID: 101
        Nhập tên: iPhone 15
        Nhập giá: 20000000
        Thêm thành công!

        Lựa chọn của bạn: 4
        ID    | Tên sản phẩm    | Giá bán
        101   | iPhone 15       | 20,000,000

        Lựa chọn của bạn: 3
        Nhập ID cần sửa giá: 101
        Tìm thấy iPhone 15. Nhập giá mới: 19500000
        Cập nhật thành công!
            */
        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductService();

        int choice;

        do {
            System.out.println("----- QUAN LY KHO HANG -----");
            System.out.println("1. Them san pham");
            System.out.println("2. Tim kiem san pham");
            System.out.println("3. Cap nhat gia");
            System.out.println("4. Hien thi danh sach");
            System.out.println("5. Xoa");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhap ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhap ten: ");
                    String name = sc.nextLine();

                    System.out.print("Nhap gia: ");
                    double price = sc.nextDouble();

                    service.add(new Product(id, name, price));
                    break;

                case 2:
                    System.out.print("Nhap ten can tim: ");
                    String keyword = sc.nextLine();
                    service.search(keyword);
                    break;

                case 3:
                    System.out.print("Nhap ID: ");
                    int idUpdate = sc.nextInt();

                    System.out.print("Nhap gia moi: ");
                    double newPrice = sc.nextDouble();

                    service.updatePrice(idUpdate, newPrice);
                    break;

                case 4:
                    service.display();
                    break;

                case 5:
                    System.out.print("Nhap ID can xoa: ");
                    int idDelete = sc.nextInt();
                    service.delete(idDelete);
                    break;

                case 6:
                    System.out.println("Thoat!");
                    break;

                default:
                    System.out.println("Sai lua chon!");
            }

        } while (choice != 6);
    }
}
