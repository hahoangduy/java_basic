package Baitap38;

public class VIPTicket extends ThemePark{
    private String lunchBuffet;

    public VIPTicket(String ticketid, String name, double baseRate, String lunchBuffet) {
        super(ticketid, name, baseRate);
        this.lunchBuffet = lunchBuffet;
    }

    public VIPTicket() {
    }

    @Override
    public double calculateBill() {
        setBaseRate(getBaseRate() + 200000);
        if (lunchBuffet.equals("YES")) {
            setBaseRate(getBaseRate() + 150000);
            System.out.println("Đăng ký dịch vụ thành công!");
        }
        System.out.println("Hóa đơn của khách hàng: " + getBaseRate());
        return getBaseRate();
    }

    @Override
    public void display() {
        System.out.println("Ticket Id: " + getTicketid() + " |Name: " + getName() + " |Ticket Type: VIP Ticket" +" |Lunch Buffet: " + lunchBuffet + " |Bill: " + getBaseRate());
    }
}
