package Baitap52;

import java.util.Arrays;

public class Test53 {

    public static int[] twoPoint(int[] arr) {
        if (arr.length == 0) {
            return new int[]{};
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr. Hãy di chuyển tất cả các số 0 xuống cuối mảng, đồng thời giữ nguyên thứ tự tương đối của các số khác 0.
        Bạn bắt buộc phải thao tác trực tiếp trên mảng gốc, không được tạo mảng mới.
        Ví dụ 1:
        Input: arr = [0, 1, 0, 3, 12]
        Output: [1, 3, 12, 0, 0]
        Ví dụ 2:
        Input: arr = [0]
        Output: [0]*/

        int[] arr1 = {0, 1, 0, 3, 12};
        System.out.println("Ví dụ 1: " + Arrays.toString(arr1));
        System.out.println("Output: " + Arrays.toString(twoPoint(arr1)));
        System.out.println();
        int[] arr2 = {0};
        System.out.println("Ví dụ 2: " + Arrays.toString(arr2));
        System.out.println("Output: " + Arrays.toString(twoPoint(arr2)));

        int[] arr3 = {0, 4, 3, 0, 0, 1};
        System.out.println("Output: " + Arrays.toString(twoPoint(arr3)));
        // expectation output [4, 3, 1, 0, 0, 0]

    }
}
