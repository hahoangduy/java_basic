package Baitap50;

public class FreshFoodProduct extends Product{
    private int expiryDay;

    public FreshFoodProduct(String id, String name, double basePrice, int expiryDay) {
        super(id, name, basePrice);
        this.expiryDay = expiryDay;
    }

    @Override
    public double calculateOrder() {
        if (expiryDay <= 2) {
            return getBasePrice() * 0.8;
        }
        else
            return getBasePrice();
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName() + " |Price: " + getBasePrice());
    }
}
