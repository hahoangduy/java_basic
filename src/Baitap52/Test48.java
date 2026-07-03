package Baitap52;

import java.util.Arrays;

public class Test48 {

    public static int maxSubarray(int[] arr, int k) {
        int left = 0;
        int count = 0;
        int multiplication = 1;
        for (int right = 0; right < arr.length; right++) {
            multiplication *= arr[right];
            while (multiplication >= k && left <= right) {
                multiplication /= arr[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        /*Cho một mảng các số nguyên dương arr và một số nguyên k.
        Hãy đếm xem có tổng cộng bao nhiêu mảng con liên tiếp (subarray) mà tích của tất cả các phần tử trong mảng con đó nhỏ hơn (nghiêm ngặt) k.
        Ví dụ 1:
        Input: arr = [10, 5, 2, 6], k = 100
        Output: 8
        Giải thích: Các mảng con có tích < 100 là:
        [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6].
        (Lưu ý mảng [10, 5, 2] có tích là 100, không nhỏ hơn 100 nên không tính).
        Ví dụ 2:
        Input: arr = [1, 2, 3], k = 0
        Output: 0*/

        int[] arr1 = {10, 5, 2, 6}; int k1 = 100;
        System.out.println("Ví dụ 1: "  + Arrays.toString(arr1) + " |K: " + k1);
        System.out.println("Output: " + maxSubarray(arr1, k1));
        System.out.println();
        int[] arr2 = {1, 2, 3}; int k2 = 0;
        System.out.println("Ví dụ 2: "  + Arrays.toString(arr2) + " |K: " + k2);
        System.out.println("Output: " + maxSubarray(arr2, k2));
    }
}
