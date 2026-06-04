package Baitap46;

import java.util.HashMap;

public class VietSkyManager {
    private HashMap<String, Flight> flightList = new HashMap<>();
    private HashMap<String, Passenger> passengerList = new HashMap<>();


    public HashMap<String, Flight> getFlightList() {
        return flightList;
    }

    public HashMap<String, Passenger> getPassengerList() {
        return passengerList;
    }

    public boolean addFlight(String code, int basePrice, int capacity) {
        if (flightList.containsKey(code))
            return false;
        flightList.put(code, new Flight(code,  basePrice, capacity));
        return true;
    }
    public boolean addPassenger(String CCCD, Passenger passenger) {
        if (passengerList.containsKey(CCCD))
            return false;
        passengerList.put(CCCD, passenger);
        return true;
    }

    public boolean hasFlight(String flightCode) {
        return flightList.containsKey(flightCode);
    }
    public Ticket processBooking(String flightCode, Passenger passenger, int luggageWeight, int ticketType) {
        Flight flight = flightList.get(flightCode);
        Ticket ticket = null;
        if (ticketType == 1) {
            ticket = new Economy(passenger, (int) flight.getBasePrice(), luggageWeight);
        } else if (ticketType == 2) {
            ticket = new Business(passenger, (int) flight.getBasePrice(), luggageWeight);
        } else if (ticketType == 3) {
            ticket = new Promo(passenger, (int) flight.getBasePrice(), luggageWeight);
        }else {
            return null;
        }
        boolean isSuccess = flight.bookTicket(ticket);
        if (isSuccess) {
            return ticket;
        }
        else {
            return null;
        }
    }

    public Ticket processCancellation(String flightCode, String passengerId) {
        Flight flight = flightList.get(flightCode);
        Ticket ticket = flight.findActiveTicket(passengerId);
        if (ticket != null && ticket.canBeCancelled()) {
            ticket.cancel();
        }
        return ticket;
    }

    public double calculateTotalRevenue() {
        double total = 0;
        for (Flight f : flightList.values()) {
            total += f.getFlightRevenue();
        }
        return total;
    }

    public void displayFlight() {
        for (String key : flightList.keySet()) {
            Flight value = flightList.get(key);
            value.displayFlight();
        }
    }

    public void displayPassenger() {
        for (String key : passengerList.keySet()) {
            Passenger value = passengerList.get(key);
            value.display();
        }
    }
}
