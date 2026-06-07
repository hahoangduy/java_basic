package Baitap47;

import java.util.ArrayList;
import java.util.HashMap;

public class RestaurantManager {
    private ArrayList<Table> tables = new ArrayList<>();
    private ArrayList<Menu> menu = new ArrayList<>();
    private HashMap<String, Order> orders = new HashMap<>();
    private ArrayList<Order> revenueHistory = new ArrayList<>();

    public void addTable(Table table) { tables.add(table); }
    public void addMenuItem(Menu item) { menu.add(item); }
    public ArrayList<Table> getTables() { return tables; }
    public ArrayList<Menu> getMenu() { return menu; }
    public Order getActiveOrderOfTable(String tableId) { return orders.get(tableId); }

    public Table findTable(String tableId) {
        for (Table t : tables) { if (t.getTableId().equalsIgnoreCase(tableId)) return t; }
        return null;
    }
    public Menu findMenuItem(String itemId) {
        for (Menu item : menu) { if (item.getId().equalsIgnoreCase(itemId)) return item; }
        return null;
    }

    public void checkInTable(String tableId, int guestCount, String orderId) {
        Table table = findTable(tableId);
        if (table == null) {
            System.out.println("Không tồn tại bàn " + tableId);
            return;
        }
        if (table.checkIn(guestCount)) {
            Order newOrder = new Order(orderId, table);
            orders.put(tableId.toUpperCase(), newOrder);
            System.out.println("Đã mở bàn " + tableId + " cho " + guestCount + " khách.");
        } else {
            System.out.println("Bàn đang bận hoặc số khách vượt quá sức chứa (" + table.getMaxCapacity() + " chỗ).");
        }
    }

    public void processCheckout(String tableId) {
        Order order = orders.get(tableId);
        if (order == null) {
            System.out.println("Bàn " + tableId + " hiện đang trống, không có hóa đơn để tính tiền!");
            return;
        }
        double subtotal = order.calculateSubtotal();
        double finalAmount = order.calculateFinalTotal();
        order.setPaid(true);
        order.getTable().checkOut();
        revenueHistory.add(order);
        orders.remove(tableId);
        System.out.println("------ HÓA ĐƠN THANH TOÁN ------");
        System.out.println("Mã hóa đơn: " + order.getOrderId() + " | Bàn: " + tableId.toUpperCase());
        System.out.println("");
        for (Menu item : order.getItemQuantities().keySet()) {
            int quantity = order.getItemQuantities().get(item);
            System.out.println("Name: "+  item.getName() + " |Quantity: " + quantity);
        }
        System.out.println("Tạm tính(Subtotal): " + subtotal);
        if (subtotal > 2000000) {
            System.out.println("Khuyến mãi áp dụng(10%): " + subtotal * 0.1);
        }
        System.out.println("Tổng thanh toán(+8% VAT): " + finalAmount);
    }

    public void calculateTotalRevenue() {
        double total = 0;
        for (Order o : revenueHistory) {
            total += o.calculateFinalTotal();
        }
        System.out.println("Tổng doanh thu: " + total);
    }
}
