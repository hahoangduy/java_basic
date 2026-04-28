package Baitap30;

import java.util.ArrayList;

public class VoucherDiscount implements IDiscountStrategy{
    private double discountAmount;

    public VoucherDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
    @Override
    public double apply(ArrayList<OrderItem> items, double currentTotal) {
        return currentTotal - discountAmount;
    }
}
