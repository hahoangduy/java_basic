package Baitap52;

import java.util.Arrays;

public class Test32 {

    public static void linearSearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println(i);
                break;
            }if (arr[0] > target) {
                System.out.println(0);
                break;
            }if (i+1 == arr.length) {
                System.out.println(i+1);
                break;
            }
            if (arr[i] < target && arr[i+1] > target) {
                System.out.println(i+1);
                break;
            }
        }
    }

    public static void binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        if (arr.length == 0) {
            return;
        }
        else {
            while (left <= right) {
                int mid = (left+right) / 2;
                if (arr[mid] == target) {
                    System.out.println(mid);
                    break;
                } else if (arr[mid] > target) {
                    right = mid - 1;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } if (arr[0] > target) {
                    System.out.println(0);
                } else if (mid+1 == arr.length) {
                    System.out.println(mid+1);
                    break;
                } else if (arr[mid] < target && arr[mid+1] > target) {
                    System.out.println(mid+1);
                    break;
                }
            }
        }
    }

    public static int searchInsert(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // Tránh overflow

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Khi loop kết thúc, left chính là vị trí nên chèn
        return left;
    }

    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr đã được sắp xếp tăng dần và một số nguyên target.
        Hãy tìm và trả về vị trí (index) của target trong mảng nếu nó tồn tại.
        Nếu target không có trong mảng, hãy trả về vị trí mà nó nên được chèn vào để mảng vẫn giữ nguyên tính chất sắp xếp tăng dần.
        Ví dụ:
        Ví dụ 1:
        Input: arr = [1, 3, 5, 6], target = 5
        Output: 2
        Ví dụ 2:
        Input: arr = [1, 3, 5, 6], target = 2
        Output: 1 (Vì số 2 sẽ được chèn vào giữa 1 và 3)
        Ví dụ 3:
        Input: arr = [1, 3, 5, 6], target = 7
        Output: 4 (Chèn vào cuối mảng)*/

        int[] arr1 = {1, 3, 5, 6}; int target1 = 5;
        System.out.println("Ví dụ 1: ");
        System.out.println(Arrays.toString(arr1) + " |Target: " + target1);
        System.out.print("Output: ");
        linearSearch(arr1,target1);
        binarySearch(arr1, target1);
        searchInsert(arr1, target1);
        System.out.println();
        int target2 = 2;
        System.out.println("Ví dụ 2: ");
        System.out.println(Arrays.toString(arr1) + " |Target: " + target2);
        System.out.print("Output: ");
        linearSearch(arr1,target2);
        binarySearch(arr1, target2);
        searchInsert(arr1,target2);
        System.out.println();
        int target3 = 7;
        System.out.println("Ví dụ 3: ");
        System.out.println(Arrays.toString(arr1) + " |Target: " + target3);
        System.out.print("Output: ");
        linearSearch(arr1, target3);
        binarySearch(arr1, target3);
        int[] arr4 = {};
        int target4 = 0;
        binarySearch(arr4, target4);
        linearSearch(arr4, target4);
    }
}
