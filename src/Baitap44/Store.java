package Baitap44;

import java.util.ArrayList;
import java.util.HashMap;

public class Store {
    private HashMap<String, Product> productList = new HashMap<>();
    private HashMap<String, Customer> customerList = new HashMap<>();

    public Store() {
    }

    public HashMap<String, Product> getProductList() {
        return productList;
    }

    public HashMap<String, Customer> getCustomerList() {
        return customerList;
    }

    public void addProduct(Product p) {
        productList.put(p.getProductName(), p);
    }
    public void addCustomer(Customer c) {
        customerList.put(c.getCustomerName(), c);
    }

    public boolean checkWarehouse(Product product, int quantity) {
        if (product.getStock() < quantity) {
            System.out.println("Hàng trong kho không đủ!");
            return false;
        }
        else {
            product.setStock(product.getStock() - quantity);
            return true;
        }
    }
    public void displayProduct() {
        for (String key : productList.keySet()) {
            Product value = productList.get(key);
            value.display();
            System.out.println("");
        }
    }
    public void displayCustomer() {
        for (String key : customerList.keySet()) {
            Customer value = customerList.get(key);
            value.display();
        }
    }

    public void calculateBill(Order order) {

    }
}
