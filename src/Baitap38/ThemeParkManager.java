package Baitap38;

import Baitap37.Viettel;

import java.util.ArrayList;

public class ThemeParkManager {
    ArrayList<ThemePark> list = new ArrayList<>();
    public boolean addTicket(ThemePark guessTicket) {
        for (ThemePark x : list) {
            if (x.getTicketid().equals(guessTicket.getTicketid())) {
                System.out.println("Đã tồn tại vé.");
                return false;
            }
        }
        list.add(guessTicket);
        System.out.println("Thêm vé thành công!");
        return true;
    }

    public ArrayList<ThemePark> getList() {
        return this.list;
    }

    public void display() {
        for (ThemePark x : list) {
            x.display();
        }
    }

    public void totalRevenue() {
        double total = 0;
        for (ThemePark x : list) {
            total += x.getBaseRate();
        }
        System.out.println("Tổng doanh thu: " + total);
    }
}
