package Baitap46;

import java.util.HashMap;

public class Flight {
    private String flightCode;
    private double basePrice;
    private int maxCapacity;
    private HashMap<String, Ticket> tickets;

    public Flight(String flightCode, double basePrice, int maxCapacity) {
        this.flightCode = flightCode;
        this.basePrice = basePrice;
        this.maxCapacity = maxCapacity;
        this.tickets = new HashMap<>();
    }

    public String getFlightCode() { return flightCode; }
    public double getBasePrice() { return basePrice; }
}
