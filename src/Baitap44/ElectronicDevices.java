package Baitap44;

public class ElectronicDevices extends Product{
    private int warrantyPeriod;

    public ElectronicDevices(String productID, String productName, double price, int stock, int warrantyPeriod) {
        super(productID, productName, price, stock);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double calculateSurcharge() {
        double surcharge = 0;
        if (warrantyPeriod > 12) {
            surcharge = getPrice() * 0.05;
            return surcharge;
        }
        return 0;
    }

    @Override
    public void display() {
        System.out.print("Name: " + getProductName() + " |Type: Electronic devices |Price: " + getPrice() + " |Stock: " + getStock());
    }
}
