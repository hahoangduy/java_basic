package Baitap38;

public class IndividualTicket extends ThemePark{
    private int age;
    public IndividualTicket(String ticketid, String name, double baseRate, int age) {
        super(ticketid, name, baseRate);
        this.age = age;
    }
    public IndividualTicket() {

    }

    @Override
    public double calculateBill() {
        double discount;
        if (age <= 12) {
            discount = getBaseRate() * 0.5;
            setBaseRate(getBaseRate() - discount);
            System.out.println("Vì khách hàng dưới 12 tuổi nên tổng hóa đơn sẽ được giảm 50%.");
            System.out.println("Hoá đơn của khách hàng: " + getBaseRate() + " VNĐ");
        }
        else if (age >= 60) {
            discount = getBaseRate() * 0.7;
            setBaseRate(getBaseRate() - discount);
            System.out.println("Vì khách hàng trên 60 tuổi nên tổng hóa đơn sẽ được giảm 70%.");
            System.out.println("Hoá đơn của khách hàng: " + getBaseRate() + " VNĐ");
        }
        else {
            setBaseRate(getBaseRate());
            System.out.println("Hoá đơn của khách hàng: " + getBaseRate() + " VNĐ");
        }
        return getBaseRate();
    }

    @Override
    public void display() {
        System.out.println("Ticket Id: " + getTicketid() + " |Name: " + getName() + " |Ticket Type: Individual Ticket" + " |Bill: " + getBaseRate());
    }
}
