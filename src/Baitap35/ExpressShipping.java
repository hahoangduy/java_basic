package Baitap35;

public class ExpressShipping extends ShippingOrder{
    private int isFragile;

    public ExpressShipping(String orderId, String senderName, double distance, double weight, double baseRate, int isFragile) {
        super(orderId, senderName, distance, weight, baseRate);
        this.isFragile = isFragile;
    }

    @Override
    public double calculateShippingFee() {
        double total = 0;
        total = (getDistance() * getBaseRate() * 1.5) + (getWeight() * 5000);
        if (isFragile == 1) {
            total += 50000;
        }
        return total;
    }

    @Override
    public int calculateEstimatedDays() {
        if (getDistance() > 300) {
            return 2;
        }
        return 1;
    }

    @Override
    public void detail() {
        double total = 0;
        System.out.println("OrderId: " + getOrderId() + " |Name: " + getSenderName() + " |Distance: " + getDistance() + " |Weight: " + getWeight() + " |BaseRate: " + getBaseRate());
        total = (getDistance() * getBaseRate() * 1.5) + (getWeight() * 5000);
        System.out.println("Phí: " + "(" +getDistance() + "*" + getBaseRate() + " * 1.5) + (" + getWeight() + " * 5.000) = " + total + "VNĐ");
        if (isFragile == 1) {
            total += 50000;
            System.out.println("Vì bạn có hàng dễ vỡ nên tổng chi phí tăng thêm 50.000VNĐ =" + total + "VNĐ");
            System.out.println("Thời gian giao hàng: " + calculateEstimatedDays() + " ngày.");
        }
    }

    @Override
    public void display() {
        System.out.println("Mã ĐH: " + getOrderId() + " |Người gửi: " + getSenderName() + " |Khoảng cách: " + getDistance() + " |Cân nặng: " + getWeight());
    }
}
