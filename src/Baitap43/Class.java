package Baitap43;

import java.util.ArrayList;
import java.util.Comparator;
public class Class {
    private String classID;
    private String className;

    private Teacher teacher;
    private ArrayList<Student> listStudent;

    public Class(String classID, String className, Teacher teacher, ArrayList<Student> listStudent) {
        this.classID = classID;
        this.className = className;
        this.teacher = teacher;
        this.listStudent = listStudent;
    }

    public Class() {
    }

    public Class(String classID, String className) {
        this.classID = classID;
        this.className = className;
    }


    public String getClassName() {
        return className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setListStudent(ArrayList listStudent) {
        this.listStudent = listStudent;
    }
    public void displayClass() {
        this.display();
        System.out.println("TEACHER: ");
        this.getTeacher().display();
        System.out.println("STUDENT: ");
        for (Student st : listStudent) {
            st.display();
        }
    }

    public void display() {
        System.out.println("Class name: " + className);
    }

    public void calculateTotalTuition(String classNameChose) {
        double total = 0;
        if (className.equals(classNameChose)) {
            for (Student st : listStudent) {
                total += st.calculateTuition();
            }
        }
        System.out.println("Tổng học phí của lớp " + className + " là: " + total + " VNĐ.");
    }

    public void highestDTB() {
        listStudent.sort(Comparator.comparing(Student::calculateDTB).reversed());
        Student student = listStudent.get(0);
        System.out.println("Học sinh có điểm TB cao nhất lớp là: " + student.getName() + " | Average score: " + student.calculateDTB());
    }
}
