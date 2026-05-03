package Baitap32;

public class SeaOrder extends ShippingOrder{
    private int containerType;
    public SeaOrder(int id, int weight, int distance, int containerType) {
        super(id, weight, distance);
        this.containerType = containerType;
    }
    public SeaOrder(int id, int distance, int containerType) {
        super(id, distance);
        this.containerType = containerType;
    }

    int newPrice = 0;
    @Override
    public int calculateFreight(int price) {
        if (containerType == 1) {
            newPrice += 5000000;
        }
        if (containerType == 2) {
            newPrice += 10000000;
        }
        if (getDistance() > 1000) {
            newPrice *= 0.9;
        }
        newPrice *= 0.02;
        return newPrice;
    }

    @Override
    public void printInvoice() {
        int totalPrice = 0;
        if (containerType == 1) {
            System.out.println("Tiền thuê của bạn là 5.000.000đ");
            totalPrice += 5000000;
        }
        if (containerType == 2) {
            System.out.println("Tiền thuê của bạn là 10.000.000đ");
            totalPrice += 10000000;
        }
        if (getDistance() > 1000) {
            System.out.println("Vì khoảng cách vận chuyển > 1000km nên bạn được giảm 10% tiền thuê container");
            double tienthue10 = totalPrice * 0.1;
            totalPrice -= tienthue10;
        }
        System.out.println("Thuế cập cảng của bạn là 2%.");
        double thue = totalPrice * 0.02;
        totalPrice += thue;
        System.out.println("Thành tiền: " + totalPrice);
    }
}
