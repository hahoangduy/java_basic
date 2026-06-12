package Baitap49;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.HashMap;

public class School {
    private HashMap<String, Class> classList = new HashMap<>();
    private HashMap<String, Teacher> teacherList = new HashMap<>();
    private HashMap<String, Student> studentList = new HashMap<>();

    public HashMap<String, Class> getClassList() {
        return classList;
    }

    public HashMap<String, Teacher> getTeacherList() {
        return teacherList;
    }
    public HashMap<String, Student> getStudentList() {
        return studentList;
    }

    public void addClass(Class c) {
        classList.put(c.getClassName(), c);
    }
    public void addTeacher(Teacher t) {
        teacherList.put(t.getFullName(), t);
    }
    public void addStudent(Student st) {
        studentList.put(st.getFullName(), st);
    }

    public void calculateTotalSalary() {
        double totalSalary = 0;
        for (Teacher teacher : teacherList.values()) {
            totalSalary += teacher.calculateSalary();
            System.out.println("Name: " + teacher.getFullName() + " |Teaching hours: " + teacher.getTeachingHours());
        }
        System.out.println("Tổng lương giáo viên trong trường: " + totalSalary + " VNĐ.");
    }

    public double calculateTotalSchoolTuition() {
        double totalSchoolTuition = 0;
        for (Class c : classList.values()) {
            totalSchoolTuition += c.calculateTotalTuition();
        }
        System.out.println("Tổng học phí của học sinh trong trường: " + totalSchoolTuition + " VNĐ.");
        return totalSchoolTuition;
    }

    public void highestDTBSchool() {
        Student studentNo1 = null;
        for (Class c : classList.values()) {
            for (Student st : c.getStudentList()) {
                if (studentNo1 == null || st.calculateAverageScore() > studentNo1.calculateAverageScore()) {
                    studentNo1 = st;
                }
            }
        }
        if (studentNo1 != null) {
            System.out.println("Thủ khoa toàn trường: " + studentNo1.getFullName() + " |DTB: " + studentNo1.calculateAverageScore());
        }
    }

    public void displayTeacher() {
        for (Teacher t : teacherList.values()) {
            t.display();
        }
    }

    public void displayClass() {
        for (Class c : classList.values()) {
            c.display();
        }
    }

    public void displayStudent() {
        for (Student st : studentList.values()) {
            st.display();
        }
    }
}
