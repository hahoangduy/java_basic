package Baitap50;

public abstract class Voucher {
    private String id;

    public Voucher(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract double calculateDiscount(double currentTotalPayable);
    public abstract String getVoucherType();
    public abstract void display();
}
