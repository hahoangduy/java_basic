package Baitap52;

import java.util.Arrays;

public class Test29 {

    /*time complexity O(n^2)*/
    public static void linearSearch(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum < target) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        int count = 0;
        while (left <= right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left);
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr (có thể chứa số âm) và một số nguyên target. Hãy đếm số lượng các cặp (i, j) thỏa mãn hai điều kiện:
        Vị trí của chúng khác nhau (0 <= i < j < arr.length).

        Tổng của hai phần tử nhỏ hơn mục tiêu: arr[i] + arr[j] < target.
        Ví dụ 1:
        Input: arr = [-1, 1, 2, 3, 1], target = 2
        Output: 3
        Giải thích: Mảng sau khi sắp xếp sẽ giúp tìm cặp dễ hơn, nhưng xét trên giá trị, các cặp hợp lệ có tổng nhỏ hơn 2 là:
        (-1, 1) có tổng = 0
        (-1, 2) có tổng = 1
        (-1, 1) có tổng = 0 (đây là số 1 thứ hai trong mảng)
        Ví dụ 2:
        Input: arr = [-6, 2, 5, -2, -7, -1, 3], target = -2
        Output: 10*/

        int[] arr1 = {-1, 1, 2, 3, 1}; int target1 = 2;
        bubbleSort(arr1);
        System.out.println("Ví dụ 1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Output: ");
        linearSearch(arr1, target1);
        binarySearch(arr1, target1);
        System.out.println();
        int[] arr2 = {-6, 2, 5, -2, -7, -1, 3}; int target2 = -2;
        bubbleSort(arr2);
        System.out.println("Ví dụ 2: ");
        System.out.println(Arrays.toString(arr2));
        System.out.print("Output: ");
        linearSearch(arr2, target2);
        binarySearch(arr2, target2);

    }
}
