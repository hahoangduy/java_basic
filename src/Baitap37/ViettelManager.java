package Baitap37;

import java.util.ArrayList;
import java.util.Comparator;

public class ViettelManager {
    ArrayList<Viettel> list = new ArrayList<>();
    public boolean addPack(Viettel viettelGuess) {
        ///
        for (Viettel x : list) {
            if (x.getContractNumber().equals(viettelGuess.getContractNumber())) {
                System.out.println("Đã tồn tại mã hợp đồng.");
                 return false;
            }
        }
        list.add(viettelGuess);
        System.out.println("Thêm gói cước thành công!");
        return true;
    }

    public ArrayList<Viettel> getList() {
        return this.list;
    }

    public void display() {
        for (Viettel x : list) {
            x.display();
        }
    }
    public void totalBill() {
        list.sort(Comparator.comparing(Viettel::getTotalBill).reversed());
            for (Viettel x : list) {
                System.out.println("Name: " + x.getName() + " |Address: " + x.getAddress() + " |Bill: " + x.getTotalBill());
            }
    }
    public void hasSafeWeb() {
        for (Viettel x : list) {
            x.hasSafeWeb();
        }
    }
}
