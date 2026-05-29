package Baitap44;

public class ElectricalAppliances extends Product{
    private int weight;

    public ElectricalAppliances(String productID, String productName, double price, int stock, int weight) {
        super(productID, productName, price, stock);
        this.weight = weight;
    }

    @Override
    public double calculateSurcharge() {
        return weight * 10000;
    }

    @Override
    public void display() {
        System.out.print("Name: " + getProductName() + " |Type: Electronic devices |Price: " + getPrice() + " |Stock: " + getStock());
    }
}
