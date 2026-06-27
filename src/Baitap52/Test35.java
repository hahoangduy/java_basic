package Baitap52;

import java.util.Arrays;
import java.util.HashMap;

public class Test35 {

    public static int[] hashTable(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int numberNeed = target - arr[i];
            if (map.containsKey(numberNeed)) {
                result = new int[]{map.get(numberNeed), i};
                return result;
            }
            map.put(arr[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr và một số nguyên target. Hãy tìm vị trí (index) của hai số trong mảng sao cho tổng của chúng bằng đúng target.
        Bạn có thể giả định rằng mỗi đầu vào sẽ có đúng một đáp án duy nhất và bạn không được sử dụng cùng một phần tử hai lần. Kết quả trả về là một mảng gồm 2 index.
        Ví dụ 1:
        Input: arr = [2, 7, 11, 15], target = 9
        Output: [0, 1]
        Giải thích: Vì arr[0] + arr[1] = 2 + 7 = 9, nên ta trả về [0, 1].
        Ví dụ 2:
        Input: arr = [3, 2, 4], target = 6
        Output: [1, 2]*/
        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = hashTable(arr1, target1);
        System.out.print("Ví dụ 1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Output: ");
        System.out.println(Arrays.toString(result1));
        System.out.println();
        int[] arr2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = hashTable(arr2, target2);
        System.out.print("Ví dụ 2: ");
        System.out.println(Arrays.toString(arr2));
        System.out.print("Output: ");
        System.out.println(Arrays.toString(result2));
    }
}
