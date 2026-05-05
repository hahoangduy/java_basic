package Baitap35;

public abstract class ShippingOrder {
    private String orderId;
    private String senderName;
    private double distance;
    private double weight;
    private double baseRate;

    public ShippingOrder(String orderId, String senderName, double distance, double weight, double baseRate) {
        this.orderId = orderId;
        this.senderName = senderName;
        this.distance = distance;
        this.weight = weight;
        this.baseRate = baseRate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public double getDistance() {
        return distance;
    }

    public double getWeight() {
        return weight;
    }

    public double getBaseRate() {
        return baseRate;
    }
    public abstract double calculateShippingFee();
    public abstract int calculateEstimatedDays();
    public abstract void display();
    public abstract void detail();
}
