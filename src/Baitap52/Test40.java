package Baitap52;

import java.util.Arrays;
import java.util.HashMap;

public class Test40 {
    public static int hashMap(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
           map.put(arr[i], 1);
        }
        int count = 0;
        for (int num : map.keySet()) {
            if (!(map.containsKey(num-1))) {
                int currentNum = num;
                int currentCount = 1;
                while (map.containsKey(currentNum+1)) {
                    currentCount++;
                    currentNum++;
                }
                count = Math.max(count, currentCount);
            }
        }
        return count;
    }



    public static void main(String[] args) {
        /*Cho một mảng các số nguyên chưa được sắp xếp arr. Hãy tìm độ dài của chuỗi các phần tử có giá trị liên tiếp nhau dài nhất.
        (Lưu ý: Các phần tử liên tiếp này không cần phải đứng cạnh nhau trong mảng ban đầu).
        Ví dụ 1:
        Input: arr = [100, 4, 200, 1, 3, 2]
        Output: 4
        Giải thích: Chuỗi các số liên tiếp dài nhất là [1, 2, 3, 4]. Độ dài của chuỗi này là 4. (Các số 100 và 200 đứng đơn độc).
        Ví dụ 2:
        Input: arr = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
        Output: 9*/

        int[] arr1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Ví dụ 1: " + Arrays.toString(arr1));
        System.out.println("Output: " + hashMap(arr1));
        int[] arr2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Ví dụ 2: " + Arrays.toString(arr2));
        System.out.println("Output: " + hashMap(arr2));
    }
}
