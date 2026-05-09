package Baitap38;

public class GroupTicket extends ThemePark{
    private int totalGuess;

    public GroupTicket(String ticketid, String name, double baseRate, int totalGuess) {
        super(ticketid, name, baseRate);
        this.totalGuess = totalGuess;
    }

    public GroupTicket() {
    }

    @Override
    public double calculateBill() {
        double discount;
        setBaseRate(getBaseRate() * totalGuess);
        if (totalGuess >= 5 && totalGuess < 15) {
            discount = getBaseRate() * 0.1;
            setBaseRate(getBaseRate() - discount);
            System.out.println("Vì nhóm của khách hàng có số lượng thành viên thuộc loại 1 (5 - 15 người) nên tổng hóa đơn sẽ được giảm 10%.");
            System.out.println("Hóa đơn của khách hàng: " + getBaseRate());
        }
        else if (totalGuess >= 15) {
            discount = getBaseRate() * 0.2;
            setBaseRate(getBaseRate() - discount);
            System.out.println("Vì nhóm của khách hàng có số lượng thành viên thuộc loại 2 (>15 người) nên tổng hóa đơn sẽ được giảm 20%.");
            System.out.println("Hóa đơn của khách hàng: " + getBaseRate());
        }
        else {
            System.out.println("Hóa đơn của khách hàng: " + getBaseRate());
        }
        return getBaseRate();
    }

    @Override
    public void display() {
        System.out.println("Ticket Id: " + getTicketid() + " |Name: " + getName() + " |Ticket Type: Group Ticket" + " |Bill: " + getBaseRate());
    }
}
