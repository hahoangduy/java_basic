package Baitap38;

public abstract class ThemePark {
    private String ticketid;
    private String name;
    private double baseRate;

    public ThemePark(String ticketid, String name, double baseRate) {
        this.ticketid = ticketid;
        this.name = name;
        this.baseRate = baseRate;
    }

    protected ThemePark() {
    }

    public String getTicketid() {
        return ticketid;
    }

    public String getName() {
        return name;
    }

    public double getBaseRate() {
        return baseRate;
    }
    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }
    public abstract double calculateBill();
    public abstract void display();
}
