package Baitap52;

import java.util.Arrays;
import java.util.HashMap;

public class Test38 {

    public static boolean hashMap(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int firstIndex = map.get(arr[i]);
                if (i - firstIndex <= k) {
                    return true;
                }
            }
            map.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr và một số nguyên k.
        Hãy kiểm tra xem có tồn tại hai vị trí i và j khác nhau trong mảng sao cho arr[i] == arr[j]
        và khoảng cách tuyệt đối giữa chúng nhỏ hơn hoặc bằng k (tức là |i - j| <= k). Trả về true nếu có, ngược lại trả về false.
        Ví dụ 1:
        Input: arr = [1, 2, 3, 1], k = 3
        Output: true
        Giải thích: Số 1 xuất hiện ở index 0 và index 3. Khoảng cách là |0 - 3| = 3, thỏa mãn điều kiện <= 3.
        Ví dụ 2:
        Input: arr = [1, 2, 3, 1, 2, 3], k = 2
        Output: false
        Giải thích: Số 1 xuất hiện ở index 0 và 3 (cách nhau 3 > 2).
        Số 2 ở index 1 và 4 (cách nhau 3 > 2). Số 3 ở index 2 và 5 (cách nhau 3 > 2). Không có cặp nào thỏa mãn.*/

        int[] arr1 = {1, 2, 3, 1}; int k1 = 3;
        System.out.println("Ví dụ 1: ");
        System.out.println(Arrays.toString(arr1) + " |K: " + k1);
        System.out.println("Output: " + hashMap(arr1, k1));
        System.out.println();
        int[] arr2 = {1, 2, 3, 1, 2, 3}; int k2 = 2;
        System.out.println("Ví dụ 2: ");
        System.out.println(Arrays.toString(arr2) + " |K: " + k2);
        System.out.println("Output: " + hashMap(arr2, k2));
    }
}
