package Baitap50;

import java.util.ArrayList;

public class Cart {
    private String customerName;
    private ArrayList<Product> productList;
    private ArrayList<Voucher> voucherList;
    private double finalPayment;

    public Cart(String customerName) {
        this.customerName = customerName;
        this.productList = new ArrayList<>();
        this.voucherList = new ArrayList<>();
        this.finalPayment = 0;
    }

    public double getFinalPayment() { return this.finalPayment; }

    public String getCustomerName() {
        return customerName;
    }

    public void setFinalPayment(double finalPayment) { this.finalPayment = finalPayment; }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public ArrayList<Voucher> getVoucherList() {
        return voucherList;
    }

    public void addProduct(Product p) {
        productList.add(p);
        System.out.println("Bạn thêm sản phẩn " + p.getName() + " vào giỏ hàng thành công!");
    }

    public void addVoucher(Voucher v) {
        voucherList.add(v);
        System.out.println("Bạn áp dụng voucher " + v.getVoucherType() + " thành công!");
    }

    public void displayCart() {
        for (Product p : productList) {
            p.display();
        }
    }

    public void displayVoucher() {
        for (Voucher v : voucherList) {
            v.display();
        }
    }
}
