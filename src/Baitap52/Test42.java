package Baitap52;

import java.util.Arrays;

public class Test42 {

    public static int highestSum(int[] arr, int k) {
        int l = 0;
        int sum = 0;
        int maxSum = 0;
        for (int r = 0; r < arr.length; r++) {
            sum += arr[r];
            while ((r-l)+1 == k) {
                maxSum = Math.max(sum, maxSum);
                sum -= arr[l];
                l++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr và một số nguyên dương k.
        Hãy tìm một mảng con liên tiếp có độ dài đúng bằng k sao cho tổng các phần tử trong mảng con đó là lớn nhất có thể.
        Bạn chỉ cần trả về giá trị tổng lớn nhất đó.
        Ví dụ 1:
        Input: arr = [2, 1, 5, 1, 3, 2], k = 3
        Output: 9
        Giải thích: Các mảng con có kích thước 3 là:
        [2, 1, 5] có tổng = 8
        [1, 5, 1] có tổng = 7
        [5, 1, 3] có tổng = 9 (Đây là tổng lớn nhất)
        [1, 3, 2] có tổng = 6
        Ví dụ 2:
        Input: arr = [2, 3, 4, 1, 5], k = 2
        Output: 7
        Giải thích: Mảng con [3, 4] có tổng là 7.*/

        int[] arr1 = {2, 1, 5, 1, 3, 2}; int k1 = 3;
        System.out.println("Ví dụ 1: " + Arrays.toString(arr1) + " |K: " + k1);
        System.out.println("Output: " + highestSum(arr1, k1));
        System.out.println();
        int[] arr2 = {2, 3, 4, 1, 5}; int k2 = 2;
        System.out.println("Ví dụ 2: " + Arrays.toString(arr2) + " |K: " + k2);
        System.out.println("Output: " + highestSum(arr2, k2));
    }
}
