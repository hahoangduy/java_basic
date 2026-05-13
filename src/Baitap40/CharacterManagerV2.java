package Baitap40;

import java.util.HashMap;

public class CharacterManagerV2 {
    HashMap<String, Character> list = new HashMap<>();

    public void addC(Character c) {
        list.put(c.getCharacterName(), c);
    }

    public void display() {
        for (String key : list.keySet()) {
            Character value = list.get(key);
            value.display();
        }
    }

    public HashMap<String, Character> getList() {
        return list;
    }

    public double fight(String name) {
        boolean check = list.containsKey(name);
        if (check) {
            Character vl = list.get(name);
            return vl.fight();
        }
        System.out.println(name + " không tồn tại!");
        return 0;
    }

    public double recovery(String name) {
        boolean check = list.containsKey(name);
        if (check) {
            Character vl = list.get(name);
            return vl.recovery();
        }
        System.out.println(name + " không tồn tại!");
        return 0;
    }

    public double attacked(String name, double dame) {
        boolean check = list.containsKey(name);
        if (check) {
            Character vl = list.get(name);
            return vl.attacked(dame);
        }
        System.out.println(name + " không tồn tại!");
        return 0;
    }

    public boolean status(String name) {
        boolean check = list.containsKey(name);
        if (check) {
            Character vl = list.get(name);
            if (vl.status().equals("Đã chết")) {
                return true;
            }
        }
        return false;
    }
}
