package Baitap39;

import Baitap38.ThemePark;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLyBenhVien {
    ArrayList<BenhAn> list = new ArrayList<>();

    public void addBenhAn(BenhAn ba) {
        list.add(ba);
        System.out.println("Thêm bệnh án thành công!");
    }

    public ArrayList<BenhAn> getList(){
        return this.list;
    }

    public void display() {
        for (BenhAn x : list) {
            x.display();
        }
    }

    public void hoaDonBHYT() {
        double total = 0;
        for (BenhAn x : list) {
            if (x instanceof IBaoHiem) { // kiểm tra xem đối tượng x này có implement IBaoHiem không
                IBaoHiem totalBH = (IBaoHiem) x; // ép kiểu từ BenhAn qua IBaoHiem
                total += totalBH.tinhTienBaoHiemTra();
            }
        }
        System.out.println("Tổng số tiền BHYT phải thanh toán: " + total);
    }

    public void danhSachTuTra() {
        list.sort(Comparator.comparing(BenhAn::vienPhiTuTra).reversed());
        System.out.println("Danh sách bệnh án giảm dần theo số tiền bệnh nhân tự thanh toán: ");
        for (BenhAn x : list) {
            System.out.println("ID: " + x.getMaBenhAn() + " |Name: " + x.getName() + " |Bệnh nhân tự chi trả: " + x.vienPhiTuTra());
        }
    }
}
