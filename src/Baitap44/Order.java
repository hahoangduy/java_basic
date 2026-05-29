package Baitap44;

public class Order {
    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calculateBasicPurchasePrice() {
        return product.getPrice() * quantity;
    }

    public double calculateSurcharge() {
        return product.calculateSurcharge() * quantity;
    }

    public void display() {
        product.display();
        System.out.println(" |Số lượng: " + quantity);
    }
}
