package Baitap29;

import java.io.BufferedReader;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*Tạo lớp Student với các thuộc tính: id (String), fullName (String), gpa (double - Điểm trung bình).

        Tạo lớp StudentManager chứa một ArrayList<Student>.

        Viết các chức năng:

        Thêm sinh viên: Nhập từ bàn phím.

        Hiển thị danh sách: Xuất bảng danh sách sinh viên hiện có.

        Sắp xếp theo GPA: Sắp xếp danh sách sinh viên theo thứ tự điểm giảm dần.

        Lọc sinh viên học bổng: Hiển thị những sinh viên có gpa >= 8.0.

        Tìm kiếm theo tên: Nhập một phần tên và hiển thị các sinh viên khớp với tên đó.
        ----- MENU QUẢN LÝ SINH VIÊN -----
        1. Thêm SV | 2. Hiện danh sách | 3. Sắp xếp GPA | 4. SV Học bổng | 5. Thoát
        Lựa chọn: 3

        --- Danh sách sau khi sắp xếp (GPA Giảm dần) ---
        ID: SV002 | Tên: Nguyễn Văn A | GPA: 9.2
        ID: SV001 | Tên: Trần Thị B   | GPA: 7.5*/

        Scanner sc = new Scanner(System.in);
        StudentManager sv = new StudentManager();

        int luaChon;

        do {
            System.out.println("----- MENU QUAN LY SINH VIEN -----");
            System.out.println("1. Thêm SV | 2. Hiện danh sách | 3. Sắp xếp GPA | 4. SV Học bổng | 5. Tìm kiếm | 6. Thoát");
            System.out.print("Lua chon: ");
            System.out.println("");

            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.println("Moi nhap ID: ");
                    String newID = sc.nextLine();
                    System.out.println("Moi nhap ho va ten: ");
                    String newFullName = sc.nextLine();
                    System.out.println("Moi nhap diem GPA: ");
                    double newGPA = sc.nextDouble();
                    sv.themSV(new Student(newID, newFullName, newGPA));
                    break;
                case 2:
                    sv.hienThi();
                    break;
                case 3:
                    sv.sapXep();
                    break;
                case 4:
                    sv.hocBong();
                    break;
                case 5:
                    System.out.println("Nhập tên cần tìm: ");
                    String newName = sc.nextLine();
                    sv.timKiem(newName);
                    break;
                case 6:
                    System.out.println("Đã thoát!");
                    break;
                default:
                    System.out.println("Sai lựa chọn!");
            }
        } while (luaChon != 6);


    }
}
