package Baitap52;

public class Test25 {

    public static int binarySearch(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        /*Giả sử một mảng số nguyên arr đã được sắp xếp tăng dần, sau đó bị xoay vòng (rotated) tại một vị trí ngẫu nhiên không biết trước.
        (Ví dụ: mảng [0, 1, 2, 4, 5, 6, 7] có thể bị xoay thành [4, 5, 6, 7, 0, 1, 2]).
        Hãy tìm và trả về phần tử nhỏ nhất trong mảng này. Thuật toán của bạn bắt buộc phải có độ phức tạp thời gian là O(log n).
        Ví dụ 1:
        Input: arr = [3, 4, 5, 1, 2]
        Output: 1
        Giải thích: Mảng gốc là [1, 2, 3, 4, 5] bị xoay 3 lần. Số nhỏ nhất là 1.
        Ví dụ 2:
        Input: arr = [4, 5, 6, 7, 0, 1, 2]
        Output: 0
        Ví dụ 3:
        Input: arr = [11, 13, 15, 17]
        Output: 11
        Giải thích: Mảng nguyên vẹn, không bị xoay hoặc xoay đủ 1 vòng.*/

        int[] arr1 = {3, 4, 5, 1, 2};
        System.out.println("Output ví dụ 1: " + binarySearch(arr1));
        int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Output ví dụ 2: " + binarySearch(arr2));
        int[] arr3 = {11, 13, 15, 17};
        System.out.println("Output ví dụ 3: " + binarySearch(arr3));
    }
}
