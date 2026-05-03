package Baitap32;

public class RoadOrder extends ShippingOrder{
    private int isExpress;

    public RoadOrder(int id, int weight, int distance, int isExpress) {
        super(id, weight, distance);
        this.isExpress = isExpress;
    }

    int newPrice = 0;

    @Override
    public int calculateFreight(int price) {
        int count = 0;
        price = 15000;


        newPrice = price * getDistance();


        if (getWeight() > 100) {
            for (int i = 100; i <= getWeight(); i++) {
                count++;
            }
            newPrice = count * 2000 * getDistance();
        }
        if (isExpress == 1) {
            newPrice *= 0.2;
        }
        newPrice += 500000;
        return newPrice;
    }

    @Override
    public void printInvoice() {
        int newPrice = 0;
        int totalPrice = 0;
        newPrice += 15000 * getDistance();
        System.out.println("Giá cơ bản: " + newPrice);
        if (getWeight() > 100) {
            int count = getWeight() - 100;
            int outOfWeight = count * 2000 * getDistance();
            newPrice += outOfWeight;
            System.out.println("Phí quá tải: " + outOfWeight);
        }
        totalPrice += newPrice;
        System.out.println("tong truoc phi nhanh " + totalPrice);
        double ex = 0;
        if (isExpress == 1) {
            ex = totalPrice * 0.2;
            System.out.println("Phi truoc giao nhanh: " + ex);
        }
        System.out.println("Cộng phí cầu đường: 500.000đ");
        int a = 500000;
        totalPrice += a + ex;
        System.out.println("Thành tiền: " + totalPrice);
    }
}
