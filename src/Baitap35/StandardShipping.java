package Baitap35;

public class StandardShipping extends ShippingOrder{
    public StandardShipping(String orderId, String senderName, double distance, double weight, double baseRate) {
        super(orderId, senderName, distance, weight, baseRate);
    }

    @Override
    public double calculateShippingFee() {
        double total = 0;
        total = (getDistance() * getBaseRate()) + (getWeight() * 2000);
        if (getDistance() > 100) {
            double a = total * 0.2;
            total += a;
        }
        return total;
    }

    @Override
    public int calculateEstimatedDays() {
        if (getDistance() > 100) {
            return 5;
        }
        return 3;
    }
    @Override
    public void detail() {
        double total = 0;
        System.out.println("OrderId: " + getOrderId() + " |Name: " + getSenderName() + " |Distance: " + getDistance() + " |Weight: " + getWeight() + " |BaseRate: " + getBaseRate());
        total = (getDistance() * getBaseRate()) + (getWeight() * 2000);
        System.out.println("Phí: " + "(" +getDistance() + "*" + getBaseRate() + ") + (" + getWeight() + " * 2.000) = " + total + "VNĐ");
        if (getDistance() > 100) {
            double a = total * 0.2;
            total += a;
            System.out.println("Vì > 100km, cộng thêm 20%: " + total + "VNĐ");
        }
        System.out.println("Thời gian giao hàng: " + calculateEstimatedDays() + " ngày.");
    }

    @Override
    public void display() {
        System.out.println("Mã ĐH: " + getOrderId() + " |Người gửi: " + getSenderName() + " |Khoảng cách: " + getDistance() + " |Cân nặng: " + getWeight());
    }
}
