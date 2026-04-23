package Baitap25;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }
    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmount() {
        return amount;
    }
    public double getAmountAfterDiscount() {
        return amount - amount * customer.getDiscount() / 100;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
