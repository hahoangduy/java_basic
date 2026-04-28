package Baitap30;
import java.util.ArrayList;

public class BulkDiscount implements IDiscountStrategy{


    @Override
    public double apply(ArrayList<OrderItem> items, double currentTotal) {
        double newTotal = 0;
        for (OrderItem item : items) {
            double price = item.product.getPrice();
            if (item.quantity >= 10) {
                price *= 0.9;
            }
            newTotal += price * item.quantity;
        }
        return newTotal;
    }
}
