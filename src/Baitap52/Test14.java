package Baitap52;

import java.util.Arrays;

public class Test14 {

    public static void bubbleSort(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                int sumArray1 = sumOfArray(arr[j], arr);
                int sumArray2 = sumOfArray(arr[j+1], arr);
                int countArray1 = countOfLength(arr[j], arr);
                int countArray2 = countOfLength(arr[j+1], arr);
                if (sumArray1 < sumArray2) {
                    int[] tam = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tam;
                }
                if (sumArray1 == sumArray2) {
                    if (countArray1 >  countArray2) {
                        int[] tam1 = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tam1;
                    }
                }
            }
        }
        printArray(arr);
    }

    public static int sumOfArray(int[] a, int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum += a[j];
            }
            return sum;
        }
        return sum;
    }

    public static int countOfLength(int[] a, int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < a.length; j++) {
                count++;
            }
            return count;
        }
        return count;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]) + ", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        /*Cho một mảng hai chiều arr (có thể hiểu là một danh sách chứa các danh sách con nhỏ hơn).
        Hãy sắp xếp các danh sách con này theo thứ tự giảm dần của tổng các phần tử trong danh sách đó.
        Nếu hai danh sách con có tổng bằng nhau, danh sách nào có ít phần tử hơn (độ dài ngắn hơn) sẽ được xếp trước.
        Ví dụ 1:
        Input: arr = [[1, 2, 3], [10], [4, 5], [2, 2, 2, 4]]
        Output: [[10], [2, 2, 2, 4], [4, 5], [1, 2, 3]]
        Giải thích:
        Mảng [1, 2, 3] có tổng = 6, độ dài = 3.
        Mảng [10] có tổng = 10, độ dài = 1.
        Mảng [4, 5] có tổng = 9, độ dài = 2.
        Mảng [2, 2, 2, 4] có tổng = 10, độ dài = 4.
        Nhóm có tổng lớn nhất là 10 (gồm [10] và [2, 2, 2, 4]). Vì [10] có độ dài ngắn hơn nên xếp trước.
        Tiếp theo là tổng 9 ([4, 5]) và cuối cùng là tổng 6 ([1, 2, 3]).
        Ví dụ 2:
        Input: arr = [[1, 1], [2], [0, 2]]
        Output: [[2], [1, 1], [0, 2]]*/

        int[][] arr = new int[][] {
                {1, 2, 3},
                {10},
                {4, 5},
                {2, 2, 2, 4}
        };
        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]) + ", ");
        }
        System.out.println();
        System.out.println("Output: ");
        bubbleSort(arr);

        int[][] arr1 = new int[][] {
                {1, 1},
                {2},
                {0, 2}
        };

        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(Arrays.toString(arr1[i]) + ", ");
        }
        System.out.println();
        System.out.println("Output: ");
        bubbleSort(arr1);
    }
}
