package Baitap50;

public class ElectronicsProduct extends Product{
    public ElectronicsProduct(String id, String name, double basePrice) {
        super(id, name, basePrice);
    }

    @Override
    public double calculateOrder() {
        return getBasePrice() * 1.1;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName() + " |Price: " + getBasePrice());
    }
}
