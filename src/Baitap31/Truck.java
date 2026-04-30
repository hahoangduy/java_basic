package Baitap31;

public class Truck extends Rent {
    private int load;

    public Truck(String id, String brand, double basePrice, int load) {
        super(id, brand, basePrice);
        this.load = load;
    }

    @Override
    public double calculateRent(int days) {
        double newPrice = getBasePrice() * days;
        double taiTrong = load * 100000;
        newPrice += taiTrong;
        if (days > 15) {
            newPrice *= 0.8;
        }
        return newPrice;
    }

    @Override
    public void display(int days) {
        double tienGoc = getBasePrice() * days;
        double phiTaiTrong = load * 100000;
        double totalPrice = tienGoc + phiTaiTrong;

        System.out.println("Xe: " + getBrand());
        System.out.println("Số ngày thuê: " + days);
        System.out.println("Tiền gốc: " + tienGoc);
        System.out.println("Phí tải trọng: " + phiTaiTrong);

        if (days > 15) {
            double discount = totalPrice * 0.2;
            totalPrice -= discount;
            System.out.println("Số tiền được giảm: " + discount);
        }
        System.out.println("Tổng tiền bạn phải trả là: " + totalPrice);
    }
}
