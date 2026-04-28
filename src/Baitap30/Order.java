package Baitap30;

import java.util.ArrayList;
    public class Order {

            ArrayList<OrderItem> items = new ArrayList<>();
            ArrayList<IDiscountStrategy> strategies = new ArrayList<>();

            public void addItem(OrderItem item) {
                items.add(item);
            }
            public void addStrategy(IDiscountStrategy strategy) {
                strategies.add(strategy);
            }
            public double calculateTotal() {
                double total = 0;
                for (OrderItem item : items) {
                    total += item.getTotalPrice();
                }

                for (IDiscountStrategy strategy : strategies) {
                    total = strategy.apply(items, total);
                }

                total *= 1.1;

                return total;
            }
    }
