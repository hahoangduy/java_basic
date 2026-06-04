package Baitap46;

public class Economy extends Ticket{
    public Economy(Passenger passenger, int basePrice, int luggageWeight) {
        super(passenger, basePrice, luggageWeight);
    }

    @Override
    public String getTicketType() { return "Economy"; }

    @Override
    public int calculateTicketPrice() {
        return getBasePrice();
    }

    @Override
    public int calculateLuggageFee() {
        if (getLuggageWeight() <= 20)
            return 0;
        else
            return (getLuggageWeight() - 20) * 50000;
    }

    @Override
    public int calculateCancellationFee() {
        int total = (int) (calculateTicketPrice() * 0.3);
        return total;
    }

    @Override
    public int calculateRefundAmount() {
        int total = (int) (calculateTicketPrice() * 0.7);
        return total;
    }

    @Override
    public boolean canBeCancelled() {
        return true;
    }

    @Override
    public void display() {
        System.out.println("Type: " + getTicketType() + " |Base price: " + getBasePrice());
    }
}
