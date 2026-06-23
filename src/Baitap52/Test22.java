package Baitap52;

import java.util.Arrays;

public class Test22 {

    public static void binarySearch(int[] arr, int target) {
        int[] temp = new int[2];
        int i = 0;
        int firstIndex = 0;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                firstIndex = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        if (firstIndex == 0) {
            temp[i] = -1;
        }else
            temp[i] = firstIndex;
        i++;
        int lastIndex = 0;
        int right1 = arr.length - 1;
        while (firstIndex <= right1) {
            int mid = (firstIndex + right1) / 2;
            if (arr[mid] == target) {
                lastIndex = mid;
                firstIndex = mid + 1;
            } else if (arr[mid] > target) {
                right1 = mid - 1;
            } else if (arr[mid] < target) {
                firstIndex = mid + 1;
            }
        }
        if (lastIndex == 0) {
            temp[i] = -1;
        }else
            temp[i] = lastIndex;
        System.out.println(Arrays.toString(temp));
    }


    public static void main(String[] args) {
        /*Cho một mảng số nguyên arr đã được sắp xếp tăng dần và một số target.
        Hãy tìm vị trí (index) đầu tiên và cuối cùng của target trong mảng.
        Trả về kết quả dưới dạng một mảng gồm 2 phần tử [vị_trí_đầu, vị_trí_cuối].
        Nếu target không tồn tại trong mảng, trả về [-1, -1].
        Ví dụ 1:
        Input: arr = [5, 7, 7, 8, 8, 8, 10], target = 8
        Output: [3, 5]
        Giải thích: Số 8 xuất hiện lần đầu ở index 3 và lần cuối ở index 5.
        Ví dụ 2:
        Input: arr = [5, 7, 7, 8, 8, 10], target = 6
        Output: [-1, -1]*/

        int[] arr1 = {5, 7, 7, 8, 8, 8, 10}; int target1 = 8;
        System.out.println("Ví dụ 1: ");
        System.out.print(Arrays.toString(arr1));
        System.out.println("  Target: " + target1);
        System.out.println("Output: ");
        binarySearch(arr1, target1);
        System.out.println();
        int[] arr2 = {5, 7, 7, 8, 8, 10}; int target2 = 6;
        System.out.println("Ví dụ 2: ");
        System.out.print(Arrays.toString(arr2));
        System.out.println("  Target: " + target2);
        System.out.println("Output: ");
        binarySearch(arr2, target2);
    }
}
