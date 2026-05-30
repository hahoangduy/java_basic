package Baitap44;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Store {
    private ArrayList<Product> productList = new ArrayList<>();
    private ArrayList<Customer> customerList = new ArrayList<>();

    public Store() {
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void addProduct(Product p) {
        productList.add(p);
    }
    public void addCustomer(Customer c) {
        customerList.add(c);
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
        for (Product product : productList) {
            product.display();
            System.out.println("");
        }
    }
    public void displayCustomer() {
        for (Customer customer : customerList) {
            customer.display();
        }
    }
    public void listBill() {
        customerList.sort(Comparator.comparing(Customer::finalTotal).reversed());
        for (Customer customer : customerList) {
            System.out.print("Khách hàng: ");
            customer.display();
            System.out.println("Hóa đơn: " + customer.finalTotal());
        }
    }

    public void highestBill() {
        customerList.sort(Comparator.comparing(Customer::finalTotal).reversed());
        Customer customer = customerList.get(0);
        System.out.println("Khách hàng có hóa đơn cao nhất: " + customer.getCustomerName() + " | Hóa đơn: " + customer.finalTotal());
    }
}
