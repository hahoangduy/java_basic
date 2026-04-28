package Baitap30;

import java.util.ArrayList;

public interface IDiscountStrategy {
    public abstract double apply(ArrayList<OrderItem> items, double currentTotal);

}
