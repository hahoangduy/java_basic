package Baitap44;

public class StandardCustomer extends Customer{
    public StandardCustomer(String customerID, String customerName, int customerPhoneNumber) {
        super(customerID, customerName, customerPhoneNumber);
    }

    @Override
    public double calculateOrder() {
        return 0;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getCustomerName() + " |Type: Standard customer |Phone number: " + getCustomerPhoneNumber());
    }
}
