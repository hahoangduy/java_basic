package Baitap52;

import java.util.Arrays;

public class Test23 {

    public static boolean binarySearch(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] > target) {
                    right = mid - 1;
                } else if (matrix[i][mid] < target) {
                    left = mid + 1;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        /*Cho một ma trận 2 chiều (mảng của các mảng) kích thước m x n. Ma trận này có hai tính chất đặc biệt:
        Các số trong mỗi hàng đều được sắp xếp từ trái sang phải.
        Số đầu tiên của mỗi hàng luôn lớn hơn số cuối cùng của hàng ngay trước nó.
        Viết thuật toán tìm kiếm xem một số target có tồn tại trong ma trận hay không (trả về true hoặc false).
        Ví dụ 1:
        Input:
        matrix = [
          [1, 3, 5, 7],
          [10, 11, 16, 20],
          [23, 30, 34, 60]
        ]
        target = 3
        Output: true
        Ví dụ 2:
        Input: Dùng ma trận trên, target = 13
        Output: false
        */

        int[][] matrix= new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target1 = 3;
        int target2 = 13;
        int target3 = 34;
        System.out.println("Ví dụ: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println("Target 1: " + target1);
        boolean isEqual1 = binarySearch(matrix, target1);
        System.out.print("Output: ");
        System.out.println(Boolean.toString(isEqual1));
        System.out.println();
        System.out.println("Target 2: " + target2);
        boolean isEqual2 = binarySearch(matrix, target2);
        System.out.print("Output: ");
        System.out.println(Boolean.toString(isEqual2));
        System.out.println();
        System.out.println("Target 3: " + target3);
        boolean isEqual3 = binarySearch(matrix, target3);
        System.out.print("Output: ");
        System.out.println(Boolean.toString(isEqual3));
    }
}
