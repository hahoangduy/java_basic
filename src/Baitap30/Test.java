package Baitap30;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Order sp = new Order();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Bạn muốn làm gì?");
            System.out.println("1. Mua sản phẩm | 2. Tính tiền");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("----  MENU CỬA HÀNG  ----");
                    System.out.println("Gạo - 100,000 VND");
                    System.out.println("Trứng - 150,000 VND");
                    System.out.println("Thịt - 200,000 VND");
                    System.out.println("Mời bạn chọn sản phẩm: ");
                    String SP = sc.next();
                    System.out.println("Mời bạn nhập số lượng sản phẩm: ");
                    int quantity = sc.nextInt();
                    Product p = new Product(SP, quantity);
                    if (SP.equals("Gạo")) {
                        p = new Product("Gạo", 100000);
                    }
                    if (SP.equals("Trứng")) {
                        p = new Product("Trứng", 150000);
                    }
                    if (SP.equals("Thịt")) {
                        p = new Product("Thịt", 200000);
                    }
                    sp.addItem(new OrderItem(p, quantity));
                    sp.addStrategy(new BulkDiscount());
                    sp.addStrategy(new VoucherDiscount(50000));
                    break;
                case 2:
                    System.out.println("Hoá đơn của bạn: ");
                    double total = sp.calculateTotal();
                    System.out.println("Total: " + total);
                    break;
            }
        }while (choice != 2);
    }
}
