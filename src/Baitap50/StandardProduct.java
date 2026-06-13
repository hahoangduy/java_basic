package Baitap50;

public class StandardProduct extends Product{
    public StandardProduct(String id, String name, double basePrice) {
        super(id, name, basePrice);
    }

    @Override
    public double calculateOrder() {
        return getBasePrice();
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName() + " |Price: " + getBasePrice());
    }
}
