package Baitap52;

import java.util.Arrays;

public class Test45 {

    public static int longestSubarray(int[] arr, int k) {
        int left = 0;
        int maxLength = 0;
        int count = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                count++;
            }
            while (count > k) {
                if (arr[left] == 0) {
                    count--;
                }
                left++;
            }
            int length = right - left + 1;
            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        /*Cho một mảng nhị phân arr (chỉ chứa 0 và 1) và một số nguyên k. Bạn được phép lật ngược (đổi 0 thành 1) tối đa k lần.
        Hãy tìm độ dài của chuỗi các số 1 liên tiếp dài nhất có thể tạo ra sau khi lật.
        Ví dụ 1:
        Input: arr = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0], k = 2
        Output: 6
        Giải thích: Chúng ta lật 2 số 0 ở index 5 và index 10 (hoặc index 4 và 5).
        Mảng sẽ thành [1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1]. Chuỗi số 1 liên tiếp dài nhất có độ dài 6.
        Ví dụ 2:
        Input: arr = [0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1], k = 3
        Output: 10*/

        int[] arr1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}; int k1 = 2;
        System.out.println("Ví dụ 1: " + Arrays.toString(arr1) + " |K: " + k1);
        System.out.println("Output: " + longestSubarray(arr1, k1));
        System.out.println();
        int[] arr2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}; int k2 = 3;
        System.out.println("Ví dụ 2: " + Arrays.toString(arr2) + " |K: " + k2);
        System.out.println("Output: " + longestSubarray(arr2, k2));
    }
}
