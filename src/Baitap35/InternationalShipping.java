package Baitap35;

public class InternationalShipping extends ShippingOrder{
    private String destinationCountry;
    private double importTax;

    public InternationalShipping(String orderId, String senderName, double distance, double weight, double baseRate, String destinationCountry, double importTax) {
        super(orderId, senderName, distance, weight, baseRate);
        this.destinationCountry = destinationCountry;
        this.importTax = importTax;
    }

    @Override
    public double calculateShippingFee() {
        double total = 0;
        total = 500000 + (getWeight() * 20000);
        double a = total * importTax;
        total += a;
        return total;
    }

    @Override
    public int calculateEstimatedDays() {
        if (destinationCountry.equals("USA") || destinationCountry.equals("Europe")) {
            return 15;
        }
        return 7;
    }

    @Override
    public void display() {
        System.out.println("Mã ĐH: " + getOrderId() + " |Người gửi: " + getSenderName() + " |Cân nặng: " + getWeight() + " |Đi: " + destinationCountry);
    }

    @Override
    public void detail() {
        double total = 0;
        total = 500000 + (getWeight() * 20000);
        System.out.println("OrderId: " + getOrderId() + " |Name: " + getSenderName()+ " |Weight: " + getWeight() + " |Đi: " + destinationCountry + " |Thuế: " + importTax);
        System.out.println("Phí: 500.000 + (" + getWeight() + " * 20.000) = " + total + "VNĐ");
        double a = total * importTax;
        double newTotal = total + a;
        System.out.println("Phí bao gồm thuế: " + total + " + (" + total + " * " + a + ") = " + newTotal + "VNĐ");
        if (destinationCountry.equals("USA") || destinationCountry.equals("Europe")) {
            System.out.println("Thời gian: 15 ngày (Do quốc gia đến là USA).");
        }
        else
            System.out.println("Thời gian: 7 ngày.");
    }
}
