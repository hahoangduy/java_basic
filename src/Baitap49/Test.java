package Baitap49;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*1. Bối cảnh
        Một trường Trung học Phổ thông cần xây dựng một hệ thống phần mềm để quản lý toàn diện thông tin nhân sự (Giáo viên, Học sinh),
        tổ chức lớp học và tự động hóa việc tính toán các khoản tài chính (Thu tiền học phí của học sinh và Trả lương cho giáo viên).

        2. Yêu cầu quản lý dữ liệu (Nghiệp vụ)

         Thông tin Nhân sự chung:
        Học sinh hay Giáo viên thì đều là những cá nhân sinh hoạt trong trường.
         Hệ thống cần lưu trữ các thông tin cơ bản cho mọi cá nhân bao gồm: Mã số định danh (ID), Họ và tên, và Năm sinh.

          Phân hệ Giáo viên (Tính lương):
        Mọi giáo viên đều có dữ liệu về "Số giờ giảng dạy" trong tháng. Tuy nhiên, trường có 2 nhóm giáo viên với chính sách lương khác nhau:
        - Giáo viên Cơ hữu (Biên chế): Là nhân viên chính thức của trường.
          Lương của họ = Lương cơ bản cố định (Ví dụ: 5.000.000 VNĐ) + (Số giờ giảng dạy * 100.000 VNĐ).
        - Giáo viên Thỉnh giảng (Hợp đồng): Là các chuyên gia được mời về dạy. Họ không có lương cơ bản, nhưng đơn giá giờ dạy cao hơn.
          Lương của họ = Số giờ giảng dạy * 200.000 VNĐ.

          Phân hệ Học sinh (Tính học phí và Điểm):
        Mọi học sinh đều có 3 cột điểm: Toán, Văn, Anh và cần có một chức năng tính Điểm Trung Bình (Trung bình cộng 3 môn).
          Mức học phí gốc của trường là 10.000.000 VNĐ/tháng. Trường có 2 nhóm học sinh:
        - Học sinh Đại trà: Đóng 100% mức học phí gốc.
        - Học sinh Tài năng (Được cấp học bổng): Nhóm này được hưởng chính sách khuyến học. Nếu Điểm Trung Bình của tháng >= 8.0, các em sẽ được giảm 50% học phí.
          Nếu Điểm Trung Bình < 8.0, các em vẫn phải đóng 100% học phí như học sinh đại trà.

          Phân hệ Lớp học (Quản lý tổ chức):
        Một Lớp học cần quản lý các thông tin: Mã Lớp, Tên Lớp.
        Về mặt nhân sự, mỗi Lớp học sẽ bao gồm:
        - MỘT Giáo viên chủ nhiệm. Ràng buộc nghiệp vụ: Chỉ có "Giáo viên Cơ hữu" mới được phép làm giáo viên chủ nhiệm.
          Nếu hệ thống cố tình gán "Giáo viên Thỉnh giảng" làm chủ nhiệm, phải báo lỗi hoặc từ chối thao tác.
        - MỘT Danh sách các Học sinh thuộc lớp đó. Hệ thống cần có tính năng thêm học sinh mới vào lớp.

         Phân hệ Trường học (Quản lý tổng thể):
        Trường học sẽ chứa một danh sách tất cả các Lớp học đang hoạt động và một danh sách tất cả các Giáo viên
         (bao gồm cả giáo viên chủ nhiệm lẫn giáo viên chỉ dạy môn không chủ nhiệm).

        3. Kịch bản mô phỏng (Test Cases)
        Hãy thiết kế hệ thống OOP để đáp ứng các yêu cầu trên, sau đó khởi tạo một kịch bản trong hàm main() như sau:

        Bước 1: Khởi tạo dữ liệu nhân sự.
        - Tạo Giáo viên Cơ hữu: "Thầy A" (Lương CB: 5tr, dạy 40 giờ).
        - Tạo Giáo viên Thỉnh giảng: "Cô B" (Dạy 30 giờ).
        - Tạo Học sinh : "Trò C" (Điểm: 7, 7, 7), "Trò D" (Điểm: 5, 6, 7), "Trò E" (Điểm: 9, 9, 9).

        Bước 2: Tổ chức lớp học.
        - Tạo một Lớp học mang tên "12A1".
        - Thử phân công "Cô B" (Thỉnh giảng) làm chủ nhiệm lớp 12A1 -> Hệ thống phải từ chối.
        - Phân công "Thầy A" (Cơ hữu) làm chủ nhiệm lớp 12A1 -> Thành công.
        - Thêm Trò C, Trò D, và Trò E vào lớp 12A1.

        Bước 3: Thực hiện các thống kê cấp trường (In kết quả ra màn hình).
        - Thống kê 1: Tính và in ra tổng quỹ lương trường phải trả cho TẤT CẢ giáo viên trong tháng này.
        - Thống kê 2: Duyệt vào lớp "12A1", in ra danh sách học sinh của lớp kèm theo Số tiền học phí mà mỗi em phải đóng.
          Tính tổng số tiền học phí thu được của toàn bộ lớp "12A1".
        - Thống kê 3: Tìm ra Học sinh có Điểm Trung Bình cao nhất trong lớp "12A1" và in thông tin của em đó ra màn hình.
        - Thống kê 4: Tìm ra Học sinh có Điểm Trung Bình cao nhất toan truong và in thông tin của em đó ra màn hình.*/
        Scanner sc = new Scanner(System.in);
        School school = new School();
        Student st1 = new RegularStudent("RS1", "A", 2008, 3, 5, 4);
        Student st2 = new RegularStudent("RS2", "B", 2008, 2, 6, 7);
        Student st3 = new TalentedStudent("TS1", "C", 2008, 10, 9, 9);
        Student st4 = new TalentedStudent("TS2", "D", 2008, 8, 7, 9);
        Teacher t1 = new FullTimeTeacher("FT1", "E", 1994, 10);
        Teacher t2 = new PartTimeTeacher("PT1", "F", 1995, 20);
        Class c1 = new Class("C1", "12A1");
        Class c2 = new Class("C2", "12A2");
        school.addClass(c1);
        school.addClass(c2);
        school.addTeacher(t1);
        school.addTeacher(t2);
        school.addStudent(st1);
        school.addStudent(st2);
        school.addStudent(st3);
        school.addStudent(st4);
        int choice;
        do {
            System.out.println("-----  Quản lý trường học  ------");
            System.out.println("1.Thêm giáo viên vào lớp |2. Thêm học sinh vào lớp |3. Lương giáo viên |4. ĐTB cao nhất lớp |5. ĐTB cao nhất trường |6. Tổng học phí trong lớp |7. Tổng học phí trong trường |8. Xem thành viên trong lớp |9. Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    school.displayTeacher();
                    System.out.println("Mời chọn giáo viên: ");
                    String tNameInput = sc.next();
                    Teacher t = school.getTeacherList().get(tNameInput);
                    school.displayClass();
                    System.out.println("Mời chọn lớp để thêm: ");
                    String cNameInput = sc.next();
                    Class class1 = school.getClassList().get(cNameInput);
                    class1.addTeacher(t);
                    break;
                case 2:
                    school.displayStudent();
                    System.out.println("Mời chọn học sinh: ");
                    String stNameInput = sc.next();
                    Student st = school.getStudentList().get(stNameInput);
                    school.displayClass();
                    System.out.println("Mời chọn lớp để thêm: ");
                    cNameInput = sc.next();
                    Class class2 = school.getClassList().get(cNameInput);
                    class2.addStudent(st);
                    break;
                case 3:
                    school.calculateTotalSalary();
                    break;
                case 4:
                    school.displayClass();
                    System.out.println("Mời chọn lớp để thêm: ");
                    cNameInput = sc.next();
                    Class class3 = school.getClassList().get(cNameInput);
                    class3.highestDTBClass();
                    break;
                case 5:
                    school.highestDTBSchool();
                    break;
                case 6:
                    school.displayClass();
                    System.out.println("Mời chọn lớp để thêm: ");
                    cNameInput = sc.next();
                    Class class4 = school.getClassList().get(cNameInput);
                    class4.calculateTotalTuition();
                    break;
                case 7:

                    school.calculateTotalSchoolTuition();
                    break;
                case 8:
                    school.displayClass();
                    System.out.println("Mời chọn lớp để thêm: ");
                    cNameInput = sc.next();
                    Class class5 = school.getClassList().get(cNameInput);
                    class5.displayClass();
                    break;
                case 9:
                    System.out.println("Đang thoát...");
                    break;
                default:
                    System.out.println("Không có chức năng này!");
            }
        }while (choice != 9);
    }
}
