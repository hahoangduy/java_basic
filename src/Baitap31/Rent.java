package Baitap31;

public abstract class Rent {
    private String id;
    private String brand;
    private double basePrice;

    public Rent(String id, String brand, double basePrice) {
        this.id = id;
        this.brand = brand;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getBrand() {
        return brand;
    }

    public abstract double calculateRent(int days);
    public abstract void display(int days);
}
