package Baitap29;

import Baitap28.Product;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager{
    private ArrayList<Student> dsSV = new ArrayList<>();

    // Them SV
    public void themSV(Student hs) {
        dsSV.add(hs);
        System.out.println("Them thanh cong");
        System.out.println("");
    }

    // Hien thi danh sach
    public void hienThi() {
        System.out.println("");
        System.out.println("Danh sach sinh vien cua ban: ");
        for (Student pt : dsSV) {
            System.out.println("ID: " + pt.getId() + " | Ten: " + pt.getFullName() + " | GPA: " + pt.getGpa());
        }
        System.out.println("");
    }

    // Sap xep

    public void sapXep() {
        System.out.println("");
        dsSV.sort(Comparator.comparing(Student::getGpa).reversed());
        System.out.println("Danh sách sinh viên sau khi sắp xếp điểm GPA giảm dần: ");
        for (Student pt : dsSV) {
            System.out.println("ID: " + pt.getId() + " | Ten: " + pt.getFullName() + " | GPA: " + pt.getGpa());
        }
        System.out.println("");
    }


    // Hoc bong
    public void hocBong() {
        System.out.println("");
        System.out.println("Danh sách những sinh viên đậu học bổng: ");
        for (Student highGPA : dsSV) {
            if (highGPA.getGpa() >= 8.0) {
                System.out.println("ID: " + highGPA.getId() + " | Ten: " + highGPA.getFullName() + " | GPA: " + highGPA.getGpa());
            }
        }
        System.out.println("");
    }

    // Tim kiem

    public void timKiem(String tim) {
        System.out.println("");
        boolean found = false;
        for (Student p : dsSV) {
            if (p.getFullName().contains(tim)) {
                System.out.println("ID: " + p.getId() + " | Ten: " + p.getFullName() + " | GPA: " + p.getGpa());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy");
        }
        System.out.println("");
    }
}
