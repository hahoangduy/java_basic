package Baitap50;

import java.util.ArrayList;
import java.util.Comparator;

public class ShopManager {
    public ArrayList<Cart> cartList;
    public double shippingFee = 30000;
    public ShopManager() {
        this.cartList = new ArrayList<>();
    }
    public void addCart(Cart c) {
        cartList.add(c);
    }

    public void calculateBill(Cart c) {
        double totalProductPrice = 0;
        for (Product p : c.getProductList()) {
            totalProductPrice += p.calculateOrder();
        }
        double remainingPrice = totalProductPrice;
        double totalVoucherDiscount = 0;
        for (Voucher v : c.getVoucherList()) {
            double discount = v.calculateDiscount(remainingPrice);
            totalVoucherDiscount += discount;
            remainingPrice -= discount;
        }
        double finalPrice = remainingPrice + shippingFee;
        c.setFinalPayment(finalPrice);
        System.out.println("Chi tiết giỏ hàng:");
        System.out.println("Danh sách mặt hàng đã chọn:");
        for (Product p : c.getProductList()) {
            System.out.println("Name: " + p.getName() + " |Base price: " + p.getBasePrice() + " |Actual price: " + p.calculateOrder());
        }
        System.out.println("Tổng tiền hàng thực tế: " + totalProductPrice);
        System.out.println("Voucher áp dụng: ");
        for (Voucher v : c.getVoucherList()) {
            System.out.println("Type voucher: " + v.getVoucherType());
        }
        System.out.println("Số tiền Voucher hỗ trợ: " + totalVoucherDiscount + " VNĐ.");
        System.out.println("Phí vận chuyển: " + shippingFee + " VNĐ.");
        System.out.println("Tổng số tiền phải trả: " + finalPrice + " VNĐ.");
    }

    public void saleReport() {
        double totalRevenue = 0;
        for (Cart cart : cartList) {
            totalRevenue += cart.getFinalPayment();
        }
        System.out.println("Tổng doanh thu: " + totalRevenue + " VNĐ.");
    }

    public void arrange() {
        cartList.sort(Comparator.comparing(Cart::getFinalPayment).reversed());
        System.out.println("Danh sách khách hàng từ cao đến thấp theo giá trị của đơn hàng: ");
        for (Cart c : cartList) {
            System.out.println("Customer name: " + c.getCustomerName() + " |Total bill: " + c.getFinalPayment());
        }
    }
}
