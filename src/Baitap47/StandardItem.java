package Baitap47;

public class StandardItem extends Menu{
    public StandardItem(String id, String name, double basePrice) {
        super(id, name, basePrice);
    }

    @Override
    public double calculateSellingPrice() {
        return getBasePrice();
    }

    @Override
    public void display() {

    }
}
