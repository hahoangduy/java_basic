package Baitap40;

import java.util.ArrayList;

public class CharacterManager {
    ArrayList<Character> list = new ArrayList<>();

    public void addC(Character c) {
        list.add(c);
    }
    public void display() {
        for (Character x : list) {
            x.display();
        }
    }

    public ArrayList<Character> getList() {
        return this.list;
    }

    public double fight(String name) {
        for (Character x : list) {
            if (name.equals(x.getCharacterName())) {
                return x.fight();
            }
        }
        return 0;
    }

    public double recovery(String name) {
        for (Character x : list) {
            if (name.equals(x.getCharacterName())) {
                x.recovery();
            }
        }
        return 0;
    }

    public double biTanCong(String name, double dame) {
        for (Character x : list) {
            if (name.equals(x.getCharacterName())) {
                return x.biTancong(dame);
            }
        }
        return 0;
    }

    public boolean status(String name) {
        for (Character x : list) {
            if (name.equals(x.getCharacterName())) {
                if (x.status().equals("Đã chết")){
                    return true;
                }
            }
        }
        return false;
    }
}
