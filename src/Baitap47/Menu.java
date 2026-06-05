package Baitap47;

public abstract class Menu {
    private String id;
    private String name;
    private double basePrice;

    public Menu(String id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getBasePrice() {
        return basePrice;
    }

    public abstract double calculateSellingPrice();
    public abstract void display();
}
