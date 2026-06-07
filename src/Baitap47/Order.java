package Baitap47;

import java.util.HashMap;

public class Order {
    private String orderId;
    private Table table;
    private HashMap<Menu, Integer> itemsOrdered;
    private boolean isPaid;

    public Order(String orderId, Table table) {
        this.orderId = orderId;
        this.table = table;
        this.itemsOrdered = new HashMap<>();
        this.isPaid = false;
    }

    public String getOrderId() {
        return orderId;
    }
    public Table getTable() {
        return table;
    }
    public HashMap<Menu, Integer> getItemQuantities() {
        return itemsOrdered;
    }
    public boolean isPaid() {
        return isPaid;
    }
    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void addMenuItem(Menu menu, int quantity) {
        if (itemsOrdered.containsKey(menu.getName())) {
            // Nếu món đã có, lấy số lượng cũ ra và cộng thêm số lượng mới
            int oldQuantity = itemsOrdered.get(menu.getName());
            itemsOrdered.put(menu, oldQuantity + quantity);
        } else {
            // Nếu món chưa có, thêm mới vào map
            itemsOrdered.put(menu, quantity);
        }
    }

    public double calculateSubtotal() {
        double subtotal = 0;
        for (Menu item : itemsOrdered.keySet()) {
            subtotal += item.calculateSellingPrice() * itemsOrdered.get(item);
        }
        return subtotal;
    }

    public double calculateFinalTotal() {
        double subtotal = calculateSubtotal();
        double discount = (subtotal > 2000000) ? (subtotal * 0.10) : 0;
        double totalAfterDiscount = subtotal - discount;
        return totalAfterDiscount + (totalAfterDiscount * 0.08);
    }
}
