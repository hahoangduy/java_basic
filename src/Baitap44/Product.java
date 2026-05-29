package Baitap44;

public abstract class Product {
    private String productID;
    private String productName;
    private double price;
    private int stock;

    public Product(String productID, String productName, double price, int stock) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract double calculateSurcharge();
    public abstract void display();
}
