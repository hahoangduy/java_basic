package Baitap52;

import java.util.Arrays;

public class Test55 {

    public static int[] removeDuplication(int[] arr) {
        if (arr.length == 0)
            return new int[]{0};
        int j = 1;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr đã được sắp xếp tăng dần.
        Hãy xóa các phần tử trùng lặp trực tiếp trên mảng gốc sao cho mỗi phần tử duy nhất chỉ xuất hiện đúng 1 lần.
        Thứ tự tương đối của các phần tử phải được giữ nguyên.
        Hàm của bạn cần trả về mảng mới sau đi xóa các phần tử trùng lặp.
        Các phần tử nằm sau vị trí k trong mảng gốc mang giá trị gì không quan trọng.
        Ví dụ 1:
        Input: arr = [1, 1, 2]
        Output: Trả về mảng arr biến đổi thành [1, 2, _]
        Giải thích: Có 2 phần tử duy nhất là 1 và 2.
        Ví dụ 2:
        Input: arr = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
        Output: Trả về mảng arr biến đổi thành [0, 1, 2, 3, 4, _, _, _, _, _]*/

        int[] arr1 = {1, 1, 2};
        System.out.println("Ví dụ 1: " + Arrays.toString(arr1));
        System.out.println("Output2: " + Arrays.toString(removeDuplication(arr1)));
        System.out.println();
        int[] arr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Ví dụ 2: " + Arrays.toString(arr2));
        System.out.println("Output2: " + Arrays.toString(removeDuplication(arr2)));
    }
}
