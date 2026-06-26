package Baitap52;

import java.util.Arrays;

public class Test33 {
    
    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    } 
    
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left+right) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[left] == arr[mid] && arr[right] == arr[mid]) {
                left++;
                right--;
                continue;
            }
            if (arr[mid] >= arr[left]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        /*Đây là bản nâng cấp của bài toán đầu tiên bạn đưa ra. Mảng arr được sắp xếp tăng dần và bị xoay vòng, nhưng lần này các phần tử có thể trùng lặp.
        Hãy viết hàm kiểm tra xem target có nằm trong mảng hay không (trả về true hoặc false).
        Ví dụ:
        Ví dụ 1:
        Input: arr = [2, 5, 6, 0, 0, 1, 2], target = 0
        Output: true
        Ví dụ 2:
        Input: arr = [2, 5, 6, 0, 0, 1, 2], target = 3
        Output: false*/
        int[] arr1 = {2, 5, 6, 0, 0, 1, 2}; int target1 = 0;
        System.out.println("Ví dụ 1: ");
        System.out.println(Arrays.toString(arr1) + " |Target: " + target1);
        boolean isHasTarget1 = linearSearch(arr1, target1);
        boolean isHasTarget1_1 = binarySearch(arr1, target1);
        System.out.print("Output: ");
        System.out.println(Boolean.toString(isHasTarget1));
        System.out.println(Boolean.toString(isHasTarget1_1));
        int target2 = 3;
        System.out.println("Ví dụ 2: ");
        System.out.println(Arrays.toString(arr1) + " |Target: " + target2);
        boolean isHasTarget2 = linearSearch(arr1, target2);
        boolean isHasTarget2_1 = binarySearch(arr1, target2);
        System.out.print("Output: ");
        System.out.println(Boolean.toString(isHasTarget2));
        System.out.println(Boolean.toString(isHasTarget2_1));
        int[] arr2 = {1,0,1,1,1}; int target3 = 0;
        boolean i = binarySearch(arr2, target3);
        System.out.println(Boolean.toString(i));
    }
}
