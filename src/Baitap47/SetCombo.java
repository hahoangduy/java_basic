package Baitap47;

import java.util.HashMap;

public class SetCombo extends Menu{
    private HashMap<String, StandardItem> setComboList;
    public SetCombo(String id, String name) {
        super(id, name, 0);
        this.setComboList = new HashMap<>();
    }

    public void addComponent(StandardItem item) {
        this.setComboList.put(item.getName(), item);
    }

    @Override
    public double calculateSellingPrice() {
        double totalComponentPrice = 0;
        for (StandardItem item : setComboList.values()) {
            totalComponentPrice += item.calculateSellingPrice();
        }
        return totalComponentPrice * 0.9;
    }

    @Override
    public void display() {
        System.out.println("ID: " + getId() + " Name: " + getName() + " |Price: " + getBasePrice());
    }
}
