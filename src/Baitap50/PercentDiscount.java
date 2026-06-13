package Baitap50;

public class PercentDiscount extends Voucher{
    public double percent = 0.2;
    public double maxDiscount = 200000;
    public PercentDiscount(String id) {
        super(id);
    }

    @Override
    public double calculateDiscount(double currentTotalPayable) {
        double discountAmount = currentTotalPayable * percent;
        if (discountAmount > maxDiscount)
        {
            return maxDiscount;
        }
        else
        {
            return discountAmount;
        }
    }

    @Override
    public String getVoucherType() {
        return "Percent discount";
    }

    @Override
    public void display() {
        System.out.println("Voucher ID: " + getId());
    }
}
