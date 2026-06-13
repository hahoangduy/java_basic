package Baitap50;

public class FixedDiscount extends Voucher{
    public double discountAmount = 50000;
    public FixedDiscount(String id) {
        super(id);
    }

    @Override
    public double calculateDiscount(double currentTotalPayable) {
        if (discountAmount > currentTotalPayable) {
            return currentTotalPayable;
        }
        else {
            return discountAmount;
        }
    }

    @Override
    public String getVoucherType() {
        return "Fixed discount";
    }

    @Override
    public void display() {
        System.out.println("Voucher ID: " + getId());
    }
}
