package Baitap34;

import java.util.ArrayList;

public class QLCB {
    ArrayList<CanBo> list = new ArrayList<>();

    public void addCB(CanBo cb) {
        list.add(cb);
        System.out.println("Thêm thành công!");
    }

    public void search(String search) {
        for (CanBo x : list) {
            if (x.getName().contains(search)) {
                System.out.println("Name: " + x.getName() + " | Age: " + x.getAge() + " | Sex: " + x.getSex()+ " | Address: " + x.getAddress());
            }
            else
                System.out.println("Không tìm thấy cán bộ!");
        }
    }

    public void display() {
        for (CanBo x : list) {
            System.out.println("Name: " + x.getName() + " | Age: " + x.getAge() + " | Sex: " + x.getSex() + " | Address: " + x.getAddress());

        }
    }
}
