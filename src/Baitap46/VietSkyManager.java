package Baitap46;

import java.util.HashMap;

public class VietSkyManager {
    private HashMap<String, Flight> flightList = new HashMap<>();

    public boolean addFlight(String code ,String route, int basePrice, int capacity) {
        if (flightList.containsKey(code)) return false;
        flightList.put(code, new Flight(code ,route ,  basePrice, capacity));
        return true;
    }

    public Ticket processBooking(String flightCode, Passenger passenger, int luggageWeight, String ticketType) {
        Flight flight = flightList.get(flightCode);
        Ticket ticket = null;
        if (ticketType.equals("Economy")) {
            ticket = new Economy(passenger, (int) flight.getBasePrice(), luggageWeight);
        } else if (ticketType.equals("Business")) {
            ticket = new Business(passenger, (int) flight.getBasePrice(), luggageWeight);
        } else if (ticketType.equals("Promo")) {
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
}
