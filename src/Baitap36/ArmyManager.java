package Baitap36;

import java.util.ArrayList;

public class ArmyManager {
    ArrayList<Army> list = new ArrayList<>();
    public void addArmy(Army army) {
        list.add(army);
        System.out.println("Thêm thành công!");
    }
    public ArrayList<Army> getList() {
        return this.list;
    }

    public void display() {
        for (Army x : list) {
            x.display();
        }
    }

    public void setExperience(double m_Experience) {
        double buff = 0;
        for (Army x : list) {
            if (m_Experience == 0) {
                buff = (x.getM_Attack() * 0.5) + (x.getM_Defend() * 0.5);
            }
            if (m_Experience > 0 && m_Experience <= 2) {
                buff = (x.getM_Attack() * 1.2) + (x.getM_Defend() * 1.2);
            }
            if (m_Experience > 2 && m_Experience <= 5) {
                buff = (x.getM_Attack() * 1.5) + (x.getM_Defend() * 1.5);
            }
            if (m_Experience > 5) {
                buff = (x.getM_Attack() * 2) + (x.getM_Defend() * 2);
            }
        }
    }
}
