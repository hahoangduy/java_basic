package Baitap35;

import java.util.ArrayList;

public class ShippingManager {
    ArrayList<ShippingOrder> list = new ArrayList<>();

    public void addOrder(ShippingOrder order) {
        list.add(order);
        System.out.println("Thêm đơn hàng thành công!");
    }

    public double getTotalExpectedRevenue() {
        double sum = 0;
        for (ShippingOrder order : list) {
            sum += order.calculateShippingFee();
        }
        System.out.println("Tổng doanh thu: " + sum);
        return sum;
    }

    public void processOrder(String orderId) {
        for (ShippingOrder order : list) {
            if (order.getOrderId().equals(orderId)) {
                System.out.println("Phí vận chuyển: " + order.calculateShippingFee() + " VNĐ, thời gian dự kiến: " + order.calculateEstimatedDays() + " ngày.");
            }
        }
    }
    public void display() {
        for (ShippingOrder x : list) {
            x.display();
        }
    }

    public void detail(String orderId) {
        for (ShippingOrder order : list) {
            if (order.getOrderId().equals(orderId)) {
                order.detail();
            }
        }
    }
}
