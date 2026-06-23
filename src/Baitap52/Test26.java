package Baitap52;

import java.util.Arrays;
public class Test26 {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] >= arr[left]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr đã được sắp xếp tăng dần nhưng bị xoay vòng tại một vị trí ngẫu nhiên (ví dụ: [0,1,2,4,5,6,7] có thể thành [4,5,6,7,0,1,2]).
         Các phần tử trong mảng là duy nhất.
        Hãy viết thuật toán tìm vị trí (index) của số target trong mảng này. Nếu không tìm thấy, trả về -1.
        Yêu cầu: Thuật toán phải có độ phức tạp thời gian là O(log n).
        Ví dụ 1:
        Input: arr = [4, 5, 6, 7, 0, 1, 2], target = 0
        Output: 4
        Ví dụ 2:
        Input: arr = [4, 5, 6, 7, 0, 1, 2], target = 3
        Output: -1*/
        int[] arr1 = {4, 5, 6, 7, 0, 1, 2}; int target1 = 0;
        System.out.println("Ví dụ 1: ");
        System.out.println(Arrays.toString(arr1) + " |Target: " + target1);
        int result1 = binarySearch(arr1, target1);
        System.out.println("Output: " + result1);
        System.out.println();
        int[] arr2 = {4, 5, 6, 7, 0, 1, 2}; int target2 = 3;
        int result2 = binarySearch(arr2, target2);
        System.out.println("Ví dụ 2: ");
        System.out.println(Arrays.toString(arr2) + " |Target: " + target2);
        System.out.println("Output: " + result2);
    }
}
