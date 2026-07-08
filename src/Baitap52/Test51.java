package Baitap52;

import java.util.Arrays;
import java.util.HashMap;

public class Test51 {

    public static int[] maxValueInWindow(int[] arr, int k) {
        if (arr.length == 0) {
            return new int[]{};
        }
        else if (arr.length == 1) {
            return new int[]{arr[0]};
        }
        int[] result = new int[arr.length-k+1];
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            int maxValue = 0;
            int leftClone = left;
            if ((right-left) + 1 == k) {
                while (leftClone < right) {
                    if (arr[leftClone] > arr[right]) {
                        maxValue = Math.max(maxValue, arr[leftClone]);
                    }
                    else
                        maxValue = Math.max(maxValue, arr[right]);
                    leftClone++;
                }
                result[left] = maxValue;
                left++;
            }
        }
        return result;
    }
    private static int findMax(HashMap<Integer, Integer> map) {
        int max = Integer.MIN_VALUE;
        for (int key : map.keySet()) {
            if (key > max) {
                max = key;
            }
        }
        return max;
    }

    public static int[] maxValueInWindow2(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k == 0) {
            return new int[0];
        }
        int n = arr.length;
        int[] result = new int[n - k + 1];
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < k; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        result[0] = findMax(freqMap);
        for (int i = k; i < n; i++) {
            int out = arr[i - k];
            freqMap.put(out, freqMap.get(out) - 1);
            if (freqMap.get(out) == 0) {
                freqMap.remove(out);
            }
            int in = arr[i];
            freqMap.put(in, freqMap.getOrDefault(in, 0) + 1);
            result[i - k + 1] = findMax(freqMap);
        }
        return result;
    }

    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr và một số nguyên k đại diện cho kích thước của một cửa sổ.
        Cửa sổ này trượt từ ngoài cùng bên trái của mảng sang ngoài cùng bên phải, mỗi lần trượt đi 1 ô.
        Tại bất kỳ thời điểm nào, bạn chỉ có thể nhìn thấy k con số bên trong cửa sổ.
        Hãy trả về một mảng chứa giá trị lớn nhất của từng cửa sổ tại mỗi bước trượt.
        Ví dụ 1:
        Input: arr = [1, 3, -1, -3, 5, 3, 6, 7], k = 3
        Output: [3, 3, 5, 5, 6, 7]
        Giải thích:
        Cửa sổ [1, 3, -1] -> Max là 3
        Cửa sổ [3, -1, -3] -> Max là 3
        Cửa sổ [-1, -3, 5] -> Max là 5
        Cửa sổ [-3, 5, 3] -> Max là 5
        Cửa sổ [5, 3, 6] -> Max là 6
        Cửa sổ [3, 6, 7] -> Max là 7
        Ví dụ 2:
        Input: arr = [1], k = 1
        Output: [1]*/

        int[] arr1 = {1, 3, -1, -3, 5, 3, 6, 7}; int k1 = 3;
        System.out.println("Ví dụ 1: " + Arrays.toString(arr1) + " |K: " + k1);
        System.out.println("Output: " + Arrays.toString(maxValueInWindow(arr1, k1)));
        System.out.println("Output2: " + Arrays.toString(maxValueInWindow2(arr1, k1)));
        System.out.println();
        int[] arr2 = {1}; int k2 = 1;
        System.out.println("Ví dụ 2: " + Arrays.toString(arr2) + " |K: " + k2);
        System.out.println("Output: " + Arrays.toString(maxValueInWindow(arr2, k2)));
        System.out.println("Output2: " + Arrays.toString(maxValueInWindow2(arr2, k2)));

        int[] arr3 = {10,9,8,7}; int k3 = 3;
        System.out.println(Arrays.toString(maxValueInWindow(arr3, k3)));
        System.out.println(Arrays.toString(maxValueInWindow2(arr3, k3)));
    }
}
