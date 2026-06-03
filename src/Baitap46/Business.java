package Baitap46;

public class Business extends Ticket{
    public Business(Passenger passenger, int basePrice, int luggageWeight) {
        super(passenger, basePrice, luggageWeight);
    }
    @Override
    public String getTicketType() { return "Business"; }

    @Override
    public int calculateTicketPrice() {
        int total = (int) (getBasePrice() * 2.5);
        return total;
    }

    @Override
    public int calculateLuggageFee() {
        if (getLuggageWeight() <= 40) return 0;
        return (getLuggageWeight() - 40) * 50000;
    }

    @Override
    public int calculateCancellationFee() { return 20000; }

    @Override
    public int calculateRefundAmount() { return calculateTicketPrice() - 20000; }

    @Override
    public boolean canBeCancelled() { return true; }

    @Override
    public void display() {

    }
}
