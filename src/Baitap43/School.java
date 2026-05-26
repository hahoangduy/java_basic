package Baitap43;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class School {
    HashMap<String, Class> listClass = new HashMap<>();
    HashMap<String, Teacher> listTeacher = new HashMap<>();

    ArrayList<Student> listStudent = new ArrayList<>();

    public void addTeacher(Teacher t) {
        listTeacher.put(t.getName(), t);
        System.out.println("Bạn tạo giáo viên thành công!");
    }

    public void addClass(Class c) {
        listClass.put(c.getClassName(), c);
        System.out.println("Bạn tạo lớp thành công!");
    }

    public void addStudent(Student s) {
        listStudent.add(s);
        System.out.println("Bạn tạo học sinh thành công!");
    }

    public void displayTeacher() {
        for (String key : listTeacher.keySet()) {
            Teacher value = listTeacher.get(key);
            value.display();
        }
    }

    public void displayStudent() {
        for (Student student : listStudent) {
            student.display();
        }
    }

    public void displayClass(String className) {
        for (Class c : listClass.values()) {
            if (c.getClassName().equals(className)) {
                c.displayClass();
            }
        }
    }

    public void totalSalary() {
        double total = 0;
        for (Teacher teacher : listTeacher.values()) {
            total += teacher.calculateSalary();
        }
        System.out.println("Tổng lương của giáo viên trong trường: " + total + " VNĐ.");
    }

    public void highestDTB() {
        listStudent.sort(Comparator.comparing(Student::calculateDTB).reversed());
        Student student = listStudent.get(0);
        System.out.println("Học sinh có điểm TB cao nhất trường là: " + student.getName() + " | Average score: " + student.calculateDTB());
    }

}
