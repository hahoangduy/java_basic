package Baitap52;

import java.util.Arrays;
import java.util.HashMap;

public class Test54 {

    public static int twoPoint(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int i = 0;
        int j = arr.length-1;
        int countSwap = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (i <= j) {
            if (map.containsKey(arr[i])) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                countSwap++;
            }
            else {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                i++;
            }
        }

        for (int k = 0; k < arr.length - (countSwap + 1); k++) {
            for (int l = 0; l < arr.length - k - (countSwap + 1); l++) {
                if (arr[l] > arr[l+1]) {
                    int temp = arr[l];
                    arr[l] = arr[l+1];
                    arr[l+1] = temp;
                }
            }
        }
        return i;
    }

    public static int removeDuplication(int[] arr) {
        if (arr.length == 0)
            return 0;
        int currentNumber = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != currentNumber) {
                currentNumber = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr đã được sắp xếp tăng dần.
        Hãy xóa các phần tử trùng lặp trực tiếp trên mảng gốc sao cho mỗi phần tử duy nhất chỉ xuất hiện đúng 1 lần.
        Thứ tự tương đối của các phần tử phải được giữ nguyên.
        Hàm của bạn cần trả về chiều dài mới k của mảng (tức là số lượng các phần tử duy nhất).
        Các phần tử nằm sau vị trí k trong mảng gốc mang giá trị gì không quan trọng.
        Ví dụ 1:
        Input: arr = [1, 1, 2]
        Output: Trả về 2, mảng arr bị biến đổi thành [1, 2, _]
        Giải thích: Có 2 phần tử duy nhất là 1 và 2.
        Ví dụ 2:
        Input: arr = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
        Output: Trả về 5, mảng arr bị biến đổi thành [0, 1, 2, 3, 4, _, _, _, _, _]*/

        int[] arr1 = {1, 1, 2};
        System.out.println("Ví dụ 1: " + Arrays.toString(arr1));
        /*System.out.println("Output: " + twoPoint(arr1));*/
        System.out.println("Output2: " + removeDuplication(arr1));
        System.out.println();
        int[] arr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Ví dụ 2: " + Arrays.toString(arr2));
/*        System.out.println("Output: " + twoPoint(arr2));*/
        System.out.println("Output2: " + removeDuplication(arr2));
    }
}
