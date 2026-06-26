package Baitap52;

import java.util.Arrays;

public class Test31 {

    public static void binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int[] arrTemp = new int[2];
        int firstIndex = - 1;
        while (left <= right) {
            int mid = (left+right) / 2;
            if (arr[mid] == target) {
                firstIndex = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
         }
        arrTemp[0] = firstIndex;
        int lastIndex = -1;
        int right1 = arr.length - 1;
        while(firstIndex <= right1) {
            if (firstIndex != -1) {
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
            else
                break;
        }
        arrTemp[1] = lastIndex;
        System.out.println(Arrays.toString(arrTemp));
    }

    public static void main(String[] args) {
     /*Cho một mảng số nguyên arr đã được sắp xếp theo thứ tự không giảm (tăng dần hoặc bằng nhau).
        Hãy viết thuật toán tìm vị trí (index) đầu tiên và vị trí cuối cùng của một số target cho trước trong mảng.
        Nếu target không tồn tại trong mảng, trả về [-1, -1].
        Yêu cầu: Thuật toán bắt buộc phải có độ phức tạp thời gian là O(log n).
        Ví dụ 1:
        Input: arr = [5, 7, 7, 8, 8, 10], target = 8
        Output: [3, 4]
        Giải thích: Số 8 xuất hiện lần đầu ở vị trí index 3 và lần cuối ở vị trí index 4.
        Ví dụ 2:
        Input: arr = [5, 7, 7, 8, 8, 10], target = 6
        Output: [-1, -1]
        Giải thích: Số 6 không có trong mảng.
        Ví dụ 3:
        Input: arr = [], target = 0
        Output: [-1, -1]*/

        int[] arr1 = {5, 7, 7, 8, 10}; int target1 = 8;
        System.out.println("Ví dụ 1: ");
        System.out.print(Arrays.toString(arr1));
        System.out.println("  Target: " + target1);
        System.out.print("Output: ");
        binarySearch(arr1, target1);
        System.out.println();
        int[] arr2 = {5, 7, 7, 8, 8, 10}; int target2 = 6;
        System.out.println("Ví dụ 2: ");
        System.out.print(Arrays.toString(arr2));
        System.out.println("  Target: " + target2);
        System.out.print("Output: ");
        binarySearch(arr2, target2);
        System.out.println();
        int[] arr3 = {}; int target3 = 0;
        System.out.println("Ví dụ 3: ");
        System.out.print(Arrays.toString(arr3));
        System.out.println("  Target: " + target3);
        System.out.print("Output: ");
        binarySearch(arr3, target3);
    }
}
