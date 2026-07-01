package Baitap52;

import java.util.Arrays;

public class Test44 {

    public static int shortestSubarray(int[] arr, int target) {
        int left = 0;
        int sum = 0;
        int minimumLength = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= target) {
                minimumLength = right - left + 1;
                sum -= arr[left];
                left++;
            }
        }
        return minimumLength;
    }

    public static int shortestSubarray2(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int left = 0;
        int sum = 0;
        int minimumLength = 1;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= target) {
                int length = right - left + 1;
                minimumLength = Math.min(length, minimumLength);
                sum -= arr[left];
                left++;
            }
        }
        return minimumLength;
    }

    public static void main(String[] args) {
        /*Cho một mảng các số nguyên dương arr và một số nguyên dương target.
        Hãy tìm độ dài nhỏ nhất của một mảng con liên tiếp mà tổng các phần tử trong đó lớn hơn hoặc bằng target. Nếu không có mảng con nào thỏa mãn, trả về 0.
        Ví dụ 1:
        Input: arr = [2, 3, 1, 2, 4, 3], target = 7
        Output: 2
        Giải thích: Mảng con [4, 3] có tổng bằng 7 và độ dài là 2. Đây là mảng con ngắn nhất thỏa mãn.
        Ví dụ 2:
        Input: arr = [1, 4, 4], target = 4
        Output: 1
        Giải thích: Mảng con [4] có tổng bằng 4 và độ dài 1.*/

        int[] arr1 = {2, 3, 1, 2, 4, 3}; int target1 = 7;
        System.out.println("Ví dụ 1: " + Arrays.toString(arr1) + " |Target: " + target1);
        System.out.println("Output: " + shortestSubarray(arr1, target1));
        System.out.println();
        int[] arr2 = {1, 4, 4}; int target2 = 4;
        System.out.println("Ví dụ 2: " + Arrays.toString(arr2) + " |Target: " + target2);
        System.out.println("Output: " + shortestSubarray(arr2, target2));
        int[] arr3 = {7, 2, 3, 1, 2, 4, 3}; int target3 = 7;
        int[] arr4 = {}; int target4 = 7;
        System.out.println(shortestSubarray2(arr4,target4));
        System.out.println(shortestSubarray2(arr3, target3));
        System.out.println(shortestSubarray(arr3, target3));

    }
}
