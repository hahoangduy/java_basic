package Baitap32;

public abstract class ShippingOrder {
    private int id;
    private int weight;
    private int distance;

    public ShippingOrder(int id, int weight, int distance) {
        this.id = id;
        this.weight = weight;
        this.distance = distance;
    }
    public ShippingOrder(int id, int distance) {
        this.id = id;
        this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public int getDistance() {
        return distance;
    }

    public abstract int calculateFreight(int price);
    public abstract void printInvoice();
}
