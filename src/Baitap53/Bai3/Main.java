package Baitap53.Bai3;

public class Main {

    public static void stack(int[] asteroids) {
        StackBai3 stack = new StackBai3(asteroids.length);
        for (int i = 0; i < asteroids.length; i++) {
            boolean destroyed = false;
            while (!stack.isEmpty() && stack.getValue() > 0 && asteroids[i] < 0) {
                if (Math.abs(stack.getValue()) < Math.abs(asteroids[i])) {
                    stack.pop();
                }else if (Math.abs(stack.getValue()) > Math.abs(asteroids[i])) {
                    destroyed = true;
                    break;
                }else {
                    stack.pop();
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                stack.push(asteroids[i]);
            }
        }
        stack.print();
    }

    public static void main(String[] args) {
        /*Cho một mảng các số nguyên asteroids đại diện cho các thiên thạch nằm trên cùng một hàng.
        Đối với mỗi thiên thạch, giá trị tuyệt đối thể hiện kích thước của nó, và dấu thể hiện hướng di chuyển
        (dương nghĩa là di chuyển sang phải, âm nghĩa là di chuyển sang trái). Mỗi thiên thạch di chuyển cùng một tốc độ.
        Hãy tìm trạng thái của các thiên thạch sau khi tất cả các vụ va chạm đã xảy ra.
        Luật va chạm:
        Nếu hai thiên thạch gặp nhau, thiên thạch nhỏ hơn sẽ phát nổ (biến mất).
        Nếu kích thước bằng nhau, cả hai cùng nổ.
        Hai thiên thạch di chuyển cùng chiều sẽ không bao giờ va chạm.
        Ví dụ 1:
        Input: asteroids = [5, 10, -5]
        Output: [5, 10]
        Giải thích: Thiên thạch 10 và -5 va chạm. 10 lớn hơn nên -5 nổ. Còn lại 5 và 10 di chuyển cùng chiều sang phải.
        Ví dụ 2:
        Input: asteroids = [8, -8]
        Output: []
        Giải thích: Cả hai bằng nhau và va chạm, cùng nổ.
        Ví dụ 3:
        Input: asteroids = [10, 2, -5]
        Output: [10]
        Giải thích: 2 (phải) và -5 (trái) va chạm -> -5 thắng. Sau đó 10 (phải) và -5 (trái) tiếp tục va chạm -> 10 thắng.*/

        int[] asteroids1 = {5, 10, -5};
        System.out.print("Output: [");
        stack(asteroids1);
        System.out.print("]");
        System.out.println();
        int[] asteroids2 = {8, -8};
        System.out.print("Output: [");
        stack(asteroids2);
        System.out.print("]");
        System.out.println();
        int[] asteroids3 = {10, 2, -5};
        System.out.print("Output: [");
        stack(asteroids3);
        System.out.print("]");
    }
}

