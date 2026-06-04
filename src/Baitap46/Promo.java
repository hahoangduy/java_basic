package Baitap46;

public class Promo extends Ticket{
    public Promo(Passenger passenger, int basePrice, int luggageWeight) {
        super(passenger, basePrice, luggageWeight);
    }

    @Override
    public String getTicketType() { return "Promo"; }

    @Override
    public int calculateTicketPrice() {
        int total = (int) (getBasePrice() * 0.5);
        return total;
    }

    @Override
    public int calculateLuggageFee() {
        return getLuggageWeight() * 100000;
    }

    @Override
    public int calculateCancellationFee() {
        return calculateTicketPrice();
    }
    @Override
    public int calculateRefundAmount() {
        return 0;
    }

    @Override
    public boolean canBeCancelled() {
        return false;
    }

    @Override
    public void display() {
        System.out.println("Type: " + getTicketType() + " |Base price: " + getBasePrice());
    }
}
