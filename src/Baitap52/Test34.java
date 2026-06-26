package Baitap52;

import java.util.Arrays;

public class Test34 {

    public static int binarySearch(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for (int w : weights) {
            if (w > left) {
                left = w;
            }
            right += w;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            int daysNeeded = 1;
            int currentLoad = 0;
            for (int w : weights) {
                if (currentLoad + w > mid) {
                    daysNeeded++;
                    currentLoad = w;
                } else {
                    currentLoad += w;
                }
            }
            if (daysNeeded <= days) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        /*Một băng chuyền chứa các gói hàng có khối lượng được cho trong mảng weights.
        Các gói hàng này phải được vận chuyển lên một con tàu trong vòng days ngày theo đúng thứ tự của mảng.
        Mỗi ngày, tàu sẽ chở hàng với tổng khối lượng không vượt quá công suất tối đa của nó.
        Hãy tìm công suất tối ưu của con tàu để nó có thể chở hết toàn bộ gói hàng trong vòng days ngày.
        Ví dụ:
        Ví dụ 1:
        Input: weights = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], days = 5
        Output: 15
        Giải thích: Công suất 15 là tối ưu để chia làm 5 ngày:
        Ngày 1: 1, 2, 3, 4, 5 (Tổng = 15)
        Ngày 2: 6, 7 (Tổng = 13)
        Ngày 3: 8 (Tổng = 8)
        Ngày 4: 9 (Tổng = 9)
        Ngày 5: 10 (Tổng = 10)
        Ví dụ 2:
        Input: weights = [3, 2, 2, 4, 1, 4], days = 3
        Output: 6
        day 1: 5
        day 2: 6
        day 3: 5
        */

        int[] weights1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; int days1 = 5;
        System.out.println("Ví dụ 1: ");
        System.out.println(Arrays.toString(weights1) + " |Days: " + days1);
        System.out.print("Output: ");
        int result1 = binarySearch(weights1, days1);
        System.out.println(result1);
        System.out.println();
        int[] weights2 = {3, 2, 2, 4, 1, 4}; int days2 = 3;
        System.out.println("Ví dụ 2: ");
        System.out.println(Arrays.toString(weights2) + " |Days: " + days2);
        System.out.print("Output: ");
        int result2 = binarySearch(weights2, days2);
        System.out.println(result2);
    }
}
