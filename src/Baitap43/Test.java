package Baitap43;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
         1. Bối cảnh
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
        - Thống kê 4: Tìm ra Học sinh có Điểm Trung Bình cao nhất toan truong và in thông tin của em đó ra màn hình.
        */


        Scanner sc = new Scanner(System.in);
        School school = new School();
        int choice;
        int choice2;
        int i = 0;
        Class classa = new Class();
        String nameClass = "";
        do {
            System.out.println("---- HỆ THỐNG QUẢN LÝ TRƯỜNG HỌC ----");
            System.out.println("1. Tạo giáo viên | 2. Tạo học sinh | 3. Tạo lớp | 4. Thêm giáo viên vào lớp | 5. Thêm học sinh vào lớp | 6. Tìm lớp | 7. Lương giáo viên | 8. ĐTB cao nhất | 9. Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Tên giáo viên: ");
                    String nameTeacher = sc.next();
                    System.out.println("Năm sinh: ");
                    String yobTeacher = sc.next();
                    System.out.println("Giờ giảng dạy: ");
                    int teachingHours = sc.nextInt();
                    System.out.println("Loại giáo viên?");
                    System.out.println("1. Giáo viên cơ hữu | 2. Giáo viên thỉnh giảng");
                    int typeTeacherChoose = sc.nextInt();
                    if (typeTeacherChoose == 1) {
                        System.out.println("Lương cơ bản: ");
                        double basicSalary = sc.nextDouble();
                        school.addTeacher(new FullTimeTeachers("GVCH", nameTeacher, yobTeacher, teachingHours, basicSalary));
                    }
                    if (typeTeacherChoose == 2) {
                        school.addTeacher(new PartTimeTeachers("GVTG", nameTeacher, yobTeacher, teachingHours));
                    }
                    break;
                case 2:
                    System.out.println("Tên học sinh: ");
                    String nameStudent = sc.next();
                    System.out.println("Năm sinh: ");
                    String yobStudent = sc.next();
                    System.out.println("Điểm toán: ");
                    double mathScore = sc.nextDouble();
                    System.out.println("Điểm anh: ");
                    double englishScore = sc.nextDouble();
                    System.out.println("Điểm văn: ");
                    double literatureScore = sc.nextDouble();
                    System.out.println("Học phí: ");
                    double tuition = sc.nextDouble();
                    System.out.println("Loại học sinh?");
                    System.out.println("1. Học sinh đại trà | 2. Học sinh tài năng");
                    int typeStudentChoose = sc.nextInt();
                    if (typeStudentChoose == 1) {
                        school.addStudent(new GeneralStudents("HSDT", nameStudent, yobStudent, mathScore, englishScore, literatureScore, tuition));
                    }
                    if (typeStudentChoose == 2) {
                        school.addStudent(new TalentedStudents("HSTN", nameStudent, yobStudent, mathScore, englishScore, literatureScore, tuition));
                    }
                    break;
                case 3:
                    System.out.println("Tên lớp: ");
                    nameClass = sc.next();
                    classa = new Class("Class", nameClass);
                    school.addClass(classa);
                    break;
                case 4:
                    for (Class c : school.listClass.values()) {
                        c.display();
                    }
                    System.out.println("Nhập tên lớp: ");
                    String classNameInput = sc.next();
                    Class aClass = school.listClass.get(classNameInput);
                    do {
                        if (school.listClass.containsKey(classNameInput)) {
                            school.displayTeacher();
                            System.out.println("Bạn muốn thêm giáo viên nào làm GVCN cho lớp " + nameClass);
                            String teacherNameChoose = sc.next();
                            Teacher teacher = school.listTeacher.get(teacherNameChoose);
                            if (teacher.getId().equals("GVTG")) {
                                System.out.println("Bạn không thể thêm GVTG làm GVCN cho lớp!");
                                break;
                            }
                            else {
                                aClass.setTeacher(teacher);
                                System.out.println("Bạn thêm giáo viên vào lớp thành công!");
                            }
                        }
                        System.out.println("Bạn muốn tiếp tục thêm hay thoát?");
                        System.out.println("1. Tiếp tục | 2. Thoát");
                        choice2 = sc.nextInt();
                    }while (choice2 != 2);
                    break;
                case 5:
                    ArrayList<Student> students = new ArrayList<>();
                    for (Class c : school.listClass.values()) {
                        c.display();
                    }
                    System.out.println("Nhập tên lớp: ");
                    String classNameInput1 = sc.next();
                    Class bClass = school.listClass.get(classNameInput1);
                    do {
                        if (school.listClass.containsKey(classNameInput1)) {
                            school.displayStudent();
                            System.out.println("Bạn muốn thêm học sinh nào vào lớp " + nameClass);
                            String studentNameChoose = sc.next();
                            Student student = null;
                            for (Student s : school.listStudent) {
                                if (s.getName().equals(studentNameChoose)) {
                                    student = s;
                                    break;
                                }
                            }
                            if (student != null) {
                                students.add(student);
                                bClass.setListStudent(students);
                                System.out.println("Bạn thêm học sinh vào lớp thành công!");
                            }
                        }
                        System.out.println("Bạn muốn tiếp tục thêm hay thoát?");
                        System.out.println("1. Tiếp tục | 2. Thoát");
                        choice2 = sc.nextInt();
                    }while (choice2 != 2);
                    break;
                case 6:
                    for (Class c : school.listClass.values()) {
                        c.display();
                    }
                    System.out.println("Nhập tên lớp: ");
                    String classNameInput2 = sc.next();
                    Class cClass = school.listClass.get(classNameInput2);
                    if (school.listClass.containsKey(classNameInput2)) {
                        System.out.println("1. Học phí | 2. ĐTB cao nhất | 3. Danh sách các thành viên trong lớp");
                        int choice3 = sc.nextInt();
                        if (choice3 == 1) {
                            cClass.calculateTotalTuition(classNameInput2);
                        } else if (choice3 == 2) {
                            cClass.highestDTB();
                        } else if (choice3 == 3) {
                            school.displayClass(classNameInput2);
                        }
                    }
                    break;
                case 7:
                    school.totalSalary();
                    break;
                case 8:
                    school.highestDTB();
                    break;
                case 9:
                    System.out.println("Đang thoát...");
                    break;
                default:
                    System.out.println("Không có chức năng này!");
                    break;
            }
        }while (choice != 9);
    }
}
