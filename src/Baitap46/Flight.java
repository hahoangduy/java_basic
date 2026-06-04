package Baitap46;

import java.util.HashMap;

public class Flight {
    private String flightCode;
    private int basePrice;
    private int maxCapacity;
    private HashMap<String, Ticket> tickets;

    public Flight(String flightCode, int basePrice, int maxCapacity) {
        this.flightCode = flightCode;
        this.basePrice = basePrice;
        this.maxCapacity = maxCapacity;
        this.tickets = new HashMap<>();
    }

    public String getFlightCode() {
        return flightCode;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public int getActivePassenger() {
        int count = 0;
        for (Ticket t : tickets.values()) {
            if (!(t.isCancelled())) {
                count++;
            }
        }
        return count;
    }

    public boolean bookTicket(Ticket ticket) {
        if (getActivePassenger() >= maxCapacity) {
            System.out.println("Thất bại: Chuyến bay " + flightCode + " đã hết chỗ!");
            return false;
        }
        String passengerId = ticket.getPassenger().getId();
        if (tickets.containsKey(passengerId) && !tickets.get(passengerId).isCancelled()) {
            System.out.println("Thất bại: Hành khách có CCCD " + passengerId + " đã đặt vé trên chuyến bay này!");
            return false;
        }
        tickets.put(passengerId, ticket);
        System.out.println("Thành công! Hóa đơn : " + ticket.getTotalPaid() + " VNĐ (Vé: " + ticket.calculateTicketPrice() + ", hành lí: " + ticket.calculateLuggageFee() + ")");
        return true;
    }

    public Ticket findActiveTicket(String passengerId) {
        if (tickets.containsKey(passengerId)) {
            Ticket t = tickets.get(passengerId);
            if (!t.isCancelled()) {
                return t;
            }
        }
        return null;
    }
    public double getFlightRevenue() {
        double total = 0;
        for (Ticket t : tickets.values()) {
            total += t.getRevenue();
        }
        return total;
    }

    public void displayFlight() {
        System.out.println("Id: " + getFlightCode() + " |Số khách hiện tại: " + getActivePassenger() + " |Doanh thu chuyến bay: " + getFlightRevenue());
    }
}
