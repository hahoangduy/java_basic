package Baitap44;

import java.util.ArrayList;

public abstract class Customer {
    private String customerID;
    private String customerName;
    private int customerPhoneNumber;
    private ArrayList<Order> cart;

    public Customer(String customerID, String customerName, int customerPhoneNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public ArrayList<Order> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Order> cart) {
        this.cart = cart;
    }

    public abstract double calculateOrder();
    public double totalBasicPurchasePrice() {
        double total = 0;
        for (Order order : cart) {
            total += order.calculateBasicPurchasePrice();
        }
        return total;
    }

    public double totalSurcharge() {
        double total = 0;
        for (Order order : cart) {
            total += order.calculateSurcharge();
        }
        return total;
    }
    public double totalDiscountVIP() {
        double total = 0;
        for (Order order : cart) {
            total += order.getProduct().getPrice() * calculateOrder();
        }
        return total;
    }

    public double finalTotal() {
        return (totalBasicPurchasePrice() - totalDiscountVIP()) + totalSurcharge();
    }

    public void displayProduct() {
        for (Order order : cart) {
            order.display();
        }
    }
    public abstract void display();
}
