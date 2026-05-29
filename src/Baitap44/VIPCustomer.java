package Baitap44;

public class VIPCustomer extends Customer{
    public VIPCustomer(String customerID, String customerName, int customerPhoneNumber) {
        super(customerID, customerName, customerPhoneNumber);
    }

    @Override
    public double calculateOrder() {
        return 0.1;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getCustomerName() + " |Type: VIP customer |Phone number: " + getCustomerPhoneNumber());
    }
}
