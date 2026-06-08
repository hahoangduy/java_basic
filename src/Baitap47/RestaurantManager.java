package Baitap47;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class RestaurantManager {
    private ArrayList<Table> tables = new ArrayList<>();
    private ArrayList<Menu> menu = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Order> revenueHistory = new ArrayList<>();

    public void addTable(Table table) { tables.add(table); }
    public void addMenuItem(Menu item) { menu.add(item); }
    public ArrayList<Table> getTables() { return tables; }
    public ArrayList<Menu> getMenu() { return menu; }

    public Table findTable(String tableId) {
        for (Table t : tables) { if (t.getTableId().equals(tableId)) return t; }
        return null;
    }
    public Menu findMenuItem(String itemId) {
        for (Menu item : menu) { if (item.getId().equals(itemId)) return item; }
        return null;
    }
    public Order getActiveOrderOfTable(String tableId) {
        for (Order order : orders) {
            if (order.getTable().getTableId().equals(tableId)) {
                return order;
            }
        }
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
            orders.add(newOrder);
            System.out.println("Đã mở bàn " + tableId + " cho " + guestCount + " khách.");
        } else {
            System.out.println("Bàn đang bận hoặc số khách vượt quá sức chứa (" + table.getMaxCapacity() + " chỗ).");
        }
    }

    public void processCheckout(String tableId) {
        Order order = getActiveOrderOfTable(tableId);
        double subtotal = order.calculateSubtotal();
        double finalAmount = order.calculateFinalTotal();
        order.setPaid(true);
        order.getTable().checkOut();
        revenueHistory.add(order);
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

    public void mostOrderItem() {
        Menu mostOrderItem = null;
        int maxQuantity = 0;
        for (Menu item : menu) {
            int totalQuantity = 0;
            for (Order order : orders) {
                if (order.getItemQuantities().containsKey(item)) {
                    totalQuantity += order.getItemQuantities().get(item);
                }
            }
            if (totalQuantity > maxQuantity) {
                maxQuantity = totalQuantity;
                mostOrderItem = item;
            }
        }
        System.out.println("Món ăn được order nhiều nhất là: " +  mostOrderItem.getName() + " |Số lượng: " + maxQuantity);
    }
}
