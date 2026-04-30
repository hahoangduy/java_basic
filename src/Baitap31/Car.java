package Baitap31;

public class Car extends Rent {
    private String luxuryCar;

    public Car(String id, String brand, double basePrice, String luxuryCar) {
        super(id, brand, basePrice);
        this.luxuryCar = luxuryCar;
    }

    @Override
    public double calculateRent(int days) {
        double newPrice = getBasePrice() * days;
        if (this.luxuryCar.equals("Mercedes") || this.luxuryCar.equals("BMW")) {
            newPrice += 500000 * days;
            if (days > 7) {
                newPrice *= 0.9;
            }
        }
        return newPrice;
    }

    @Override
    public void display(int days) {
        double totalPrice = getBasePrice() * days;
        System.out.println("Xe: " + getBrand());
        System.out.println("Số ngày thuê: " + days);
        System.out.println("Tiền gốc: " + totalPrice);

        if (this.luxuryCar.equals("Mescedes") || this.luxuryCar.equals("BMW")) {
            double baoHiem = 500000 * days;
            totalPrice += baoHiem;
            System.out.println("Xe hạng sang -> Phí bảo hiểm là: 500.000/day.");
            System.out.println("Phí bảo hiểm của bạn là: " + baoHiem);
        }
        if (days > 7) {
            double discount = totalPrice * 0.1;
            totalPrice -= discount;
            System.out.println("Vì bạn thuê xe trên 7 ngày nên được giảm 10%.");
            System.out.println("Số tiền được giảm: " + discount);
        }
        System.out.println("Tổng tiền bạn phải trả là: " + totalPrice);
    }
}
