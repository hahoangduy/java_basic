package Baitap52;

import java.util.Arrays;

public class Test21 {

    public static void linearSearch(int[] arr, int target) {
        boolean isEqual = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                isEqual = true;
            }
        }
        if (!isEqual) {
            System.out.println("-1");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr đã được sắp xếp theo thứ tự tăng dần và một số nguyên target.
        Hãy viết thuật toán tìm kiếm để tìm vị trí (index) của target trong mảng. Nếu target không tồn tại, trả về -1.
        Ví dụ 1:
        Input: arr = [-1, 0, 3, 5, 9, 12], target = 9
        Output: 4
        Giải thích: Số 9 nằm ở vị trí index thứ 4 trong mảng.
        Ví dụ 2:
        Input: arr = [-1, 0, 3, 5, 9, 12], target = 2
        Output: -1*/

        int[] arr1 = {-1, 0, 3, 5, 9, 12};
        System.out.println("Ví dụ 1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Vị trí index của số bằng target trong mảng là: ");
        linearSearch(arr1, 9);
        int result1 = binarySearch(arr1, 9);
        System.out.println("Vị trí index của số bằng target trong mảng là: " + result1);
        int[] arr2 = {-1, 0, 3, 5, 9, 12, 23, 45, 53, 59, 79, 89};
        System.out.println("Ví dụ 2: ");
        System.out.println(Arrays.toString(arr2));
        System.out.print("Vị trí index của số bằng target trong mảng là: ");
        linearSearch(arr2, 2);
        int result2 = binarySearch(arr2, 2);
        System.out.println("Vị trí index của số bằng target trong mảng là: " + result2);

        // 12 - 89
        //
    }
}
