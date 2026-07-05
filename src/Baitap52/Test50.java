package Baitap52;

import java.util.Arrays;
import java.util.HashMap;

public class Test50 {

    public static int countExactlyK(int[] arr, int k) {
        return subArrayEqualK(arr, k) - subArrayEqualK(arr, k - 1);
    }
    public static int subArrayEqualK(int[] arr, int k) {
        if (k < 0 || k > arr.length) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int result = 0;
        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            result += (right - left + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr và một số nguyên k. Hãy đếm số lượng mảng con liên tiếp có chứa đúng k số nguyên khác nhau.
        Ví dụ 1:
        Input: arr = [1, 2, 1, 2, 3], k = 2
        Output: 7
        Giải thích: Các mảng con có đúng 2 số khác nhau là:
        [1, 2], [2, 1], [1, 2], [2, 3], [1, 2, 1], [2, 1, 2], [1, 2, 1, 2].
        Ví dụ 2:
        Input: arr = [1, 2, 1, 3, 4], k = 3
        Output: 3
        Giải thích: Các mảng con hợp lệ: [1, 2, 1, 3], [2, 1, 3], [1, 3, 4].*/

        int[] arr1 = {1, 2, 1, 2, 3}; int k1 = 2;
        System.out.println("Ví dụ 1: " + Arrays.toString(arr1) + " |K: " + k1);
        System.out.println("Output: " + countExactlyK(arr1, k1));
        System.out.println();
        int[] arr2 = {1, 2, 1, 3, 4}; int k2 = 3;
        System.out.println("Ví dụ 1: " + Arrays.toString(arr2) + " |K: " + k2);
        System.out.println("Output: " + countExactlyK(arr2, k2));
    }
}
