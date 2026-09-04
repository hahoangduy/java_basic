package Baitap53.Bai11;

import java.util.Arrays;

public class Main {

    // 8, 4, 6, 2, 3

    //
    public static String discount(int[] prices) {
        StackBai11 stack = new StackBai11(prices.length);
        for (int i = 0; i < prices.length; i++) {
            if (stack.isEmpty()) {
                stack.push(prices[i]);
            }
            else {
                int j = i;
                while (!stack.isEmpty() && j < prices.length) {
                    if (!(prices[j] <= stack.getValue())) {
                        j++;
                    }
                    else {
                        int value = stack.pop() - prices[j];
                        stack.push(value);
                        stack.push(prices[i]);
                        break;
                    }
                }
            }
            if (i == prices.length - 1) {
                stack.push(prices[i]);
            }
        }
        return stack.print();
    }

    public static void main(String[] args) {
        /*Bạn có một mảng prices là giá của các mặt hàng trong cửa hàng.
        Cửa hàng có một luật giảm giá đặc biệt:
        Nếu bạn mua mặt hàng thứ i, bạn sẽ được giảm một lượng tiền bằng đúng giá của mặt hàng đầu tiên nằm bên phải nó có giá thấp hơn hoặc bằng prices[i].
        Nếu không có mặt hàng nào như vậy, bạn không được giảm giá. Hãy trả về mảng giá cuối cùng bạn phải trả cho từng mặt hàng.
        Ví dụ 1:
        Input: prices = [8, 4, 6, 2, 3]
        Output: [4, 2, 4, 2, 3]
        Giải thích:
        Giá 8: Mặt hàng bên phải rẻ hơn/bằng đầu tiên là 4. Giá cuối = 8 - 4 = 4.
        Giá 4: Mặt hàng bên phải rẻ hơn/bằng đầu tiên là 2. Giá cuối = 4 - 2 = 2.
        Giá 6: Mặt hàng bên phải rẻ hơn/bằng là 2. Giá cuối = 6 - 2 = 4.
        Giá 2 và 3: Không có ai bên phải rẻ hơn. Giữ nguyên 2 và 3.*/

        int[] prices1 = {8, 4, 6, 2, 3};
        System.out.println("Input: " + Arrays.toString(prices1));
        System.out.println("Output: " + discount(prices1));
        System.out.println();
        int[] prices2 = {5, 5, 6, 8, 2, 6, 3, 4, 2};
        System.out.println("Input: " + Arrays.toString(prices2));
        System.out.println("Output: " + discount(prices2));

    }
}
