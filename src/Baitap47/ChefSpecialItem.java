package Baitap47;

public class ChefSpecialItem extends Menu{
    public ChefSpecialItem(String id, String name, double basePrice) {
        super(id, name, basePrice);
    }

    @Override
    public double calculateSellingPrice() {
        double fee = getBasePrice() * 0.15;
        return getBasePrice() + fee;
    }

    @Override
    public void display() {

    }
}
