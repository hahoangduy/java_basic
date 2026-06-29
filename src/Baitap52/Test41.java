package Baitap52;

import java.util.Arrays;
import java.util.HashMap;

public class Test41 {

    public static int hashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int currentSum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentSum += 1;
            }
            else
                currentSum -= 1;
            if (map.containsKey(currentSum)) {
                int prevIndex = map.get(currentSum);
                int length = i - prevIndex;
                maxLength = Math.max(maxLength, length);
            }
            else
                map.put(currentSum, i);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        /*Cho một mảng nhị phân arr (chỉ chứa các số 0 và 1). Hãy tìm độ dài lớn nhất của một mảng con liên tiếp có chứa số lượng số 0 và số 1 bằng nhau.
        Ví dụ 1:
        Input: arr = [0, 1]
        Output: 2
        Giải thích: Mảng con [0, 1] có độ dài 2, chứa một số 0 và một số 1.
        Ví dụ 2:
        Input: arr = [0, 1, 0]
        Output: 2
        Giải thích: Có hai mảng con hợp lệ là [0, 1] (từ index 0 đến 1) hoặc [1, 0] (từ index 1 đến 2). Độ dài lớn nhất là 2.
        Ví dụ 3:
        Input: arr = [0, 0, 1, 0, 0, 0, 1, 1]
        Output: 6
        Giải thích: Mảng con từ index 2 đến index 7 là [1, 0, 0, 0, 1, 1], có đúng ba số 0 và ba số 1. Độ dài là 6.*/

        int[] arr1 = {0, 1};
        System.out.println("Ví dụ 1: " + Arrays.toString(arr1));
        System.out.println("Output: " + hashMap(arr1));
        System.out.println();
        int[] arr2 = {0, 1, 0};
        System.out.println("Ví dụ 2: " + Arrays.toString(arr2));
        System.out.println("Output: " + hashMap(arr2));
        System.out.println();
        int[] arr3 = {0, 0, 1, 0, 0, 0, 1, 1};
        System.out.println("Ví dụ 3: " + Arrays.toString(arr3));
        System.out.println("Output: " + hashMap(arr3));
    }
}

