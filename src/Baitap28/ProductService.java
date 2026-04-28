package Baitap28;

import java.util.ArrayList;

public class ProductService {
    private ArrayList<Product> khoHang = new ArrayList<>();


    // Them
    public void add(Product SP) {
        khoHang.add(SP);
        System.out.println("Them thanh cong!");
    }

    // Tim
    public void search(String search) {
        boolean found = false;

        for (Product p : khoHang) {
            if (p.getName().contains(search)) {
                System.out.println(p.getId() + " | " + p.getName() + " | " + p.getPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay!");
        }
    }

    // cap nhat gia
    public void updatePrice(int id, double newPrice) {
        for (Product p : khoHang) {
            if (p.getId() == id) {
                p.setPrice(newPrice);
                System.out.println("Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay san pham!");
    }

    // xoa
    public void delete(int id) {
        for (Product SP : khoHang) {
            if (SP.getId() == id) {
                khoHang.remove(SP);
                System.out.println("Xoa thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay!");
    }

    // hien thi
    public void display() {
        System.out.println("ID    | Ten san pham    | Gia ban");

        for (Product p : khoHang) {
            System.out.printf("%-5d | %-15s | %,.0f\n",
                    p.getId(),
                    p.getName(),
                    p.getPrice());
        }
    }


}
