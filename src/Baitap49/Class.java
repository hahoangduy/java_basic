package Baitap49;

import java.util.ArrayList;
import java.util.Comparator;

public class Class {
    private String classId;
    private String className;
    private Teacher teacher;
    private ArrayList<Student> studentList;

    public Class(String classId, String className) {
        this.classId = classId;
        this.className = className;
        this.studentList = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public void addTeacher(Teacher t) {
        if (t.getTeacherType().equals("Full time")) {
            teacher = t;
            System.out.println("Đã phân công giáo viên " + t.getFullName() + " làm GVCN cho lớp " + className);
        }
        else if (t.getTeacherType().equals("Part time")){
            System.out.println("Giáo viên thỉnh giảng không thể phân công làm GVCN");
        }
    }

    public void addStudent(Student st) {
        studentList.add(st);
        System.out.println("Đã thêm học sinh " + st.getFullName() + " vào lớp " + className);
    }

    public void highestDTBClass() {
        studentList.sort(Comparator.comparing(Student::calculateAverageScore).reversed());
        Student student = studentList.get(0);
        System.out.println("Học sinh có điểm TB cao nhất lớp là: " + student.getFullName() + " | Average score: " + student.calculateAverageScore());
    }

    public double calculateTotalTuition() {
        double totalClassTuition = 0;
        for (Student student : studentList) {
            totalClassTuition += student.calculateTuition();
        }
        System.out.println("Tổng học phí của học sinh trong lớp: " + className + " là: " + totalClassTuition + " VNĐ.");
        return totalClassTuition;
    }

   public void display() {
       System.out.println("Name: " + getClassName());
   }

   public void displayClass() {
        this.display();
        System.out.println("Teacher: ");
        teacher.display();
        System.out.println("Student: ");
        for (Student st : getStudentList()) {
            st.display();
        }
   }
}
