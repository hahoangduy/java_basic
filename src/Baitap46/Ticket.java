package Baitap46;

public abstract class Ticket {
    private Passenger passenger;
    private int basePrice;
    private int luggageWeight;
    private boolean isCancelled;

    public Ticket(Passenger passenger, int basePrice, int luggageWeight) {
        this.passenger = passenger;
        this.basePrice = basePrice;
        this.luggageWeight = luggageWeight;
        this.isCancelled = false;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public int getLuggageWeight() {
        return luggageWeight;
    }

    public boolean isCancelled() {
        return isCancelled;
    }
    public void cancel() {
        isCancelled = true;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public abstract String getTicketType();
    public abstract int calculateTicketPrice();
    public abstract int calculateLuggageFee();
    public abstract int calculateCancellationFee();
    public abstract int calculateRefundAmount();
    public abstract boolean canBeCancelled();

    public int getTotalPaid() {
        return calculateTicketPrice() + calculateLuggageFee();
    }

    public int getRevenue() {
        if (isCancelled) {
            return getTotalPaid() - calculateRefundAmount();
        }
        return getTotalPaid();
    }

    public abstract void display();
}
