package Baitap31;

public class Motorbike extends Rent{
    private String cm3;

    public Motorbike(String id, String brand, double basePrice, String cm3) {
        super(id, brand, basePrice);
        this.cm3 = cm3;
    }
    @Override
    public double calculateRent(int days) {
        double total = getBasePrice() * days;

        if (cm3.equals("185cc") || cm3.equals("350cc")) {
            total *= 1.5;
        }
        return total;
    }
    @Override
    public void display(int days) {
        double totalPrice = getBasePrice() * days;
        System.out.println("Xe: " + getBrand());
        System.out.println("Số ngày thuê: " + days);
        System.out.println("Tiền gốc: " + totalPrice);
        if (this.cm3.equals("185cc") || this.cm3.equals("350cc")) {
            System.out.println("Vì xe bạn thuê > 175cc nên tăng 50% tổng sô tiền");
            totalPrice *= 1.5;
        }
        System.out.println("Tổng tiền bạn phải trả là: " + totalPrice);
    }
}
