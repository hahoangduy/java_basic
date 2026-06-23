package Baitap52;

import java.util.Arrays;

public class Test27 {

    public static void linearSearch(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    if (Math.abs(arr[i] - arr[j]) == k) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr chứa các số không trùng lặp và một số nguyên dương k.
        Hãy đếm xem có bao nhiêu cặp số (a, b) trong mảng thỏa mãn điều kiện giá trị tuyệt đối của hiệu hai số bằng k (Tức là |a - b| = k).
        Ví dụ 1:
        Input: arr = [1, 5, 3, 4, 2], k = 2
        Output: 3
        Giải thích: Có 3 cặp số thỏa mãn khoảng cách bằng 2 là: (1, 3), (3, 5), và (2, 4).
        Ví dụ 2:
        Input: arr = [8, 12, 16, 4, 0, 20], k = 4
        Output: 5
         */
        int[] arr1 = {1, 5, 3, 4, 2}; int k1 = 2;
        System.out.println("Ví dụ 1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Output: ");
        linearSearch(arr1, k1);
        System.out.println();
        int[] arr2 = {8, 12, 16, 4, 0, 20}; int k2 = 4;
        System.out.println("Ví dụ 2: ");
        System.out.println(Arrays.toString(arr2));
        System.out.print("Output: ");
        linearSearch(arr2, k2);
    }
}
