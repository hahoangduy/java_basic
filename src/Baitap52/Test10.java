package Baitap52;

import java.util.ArrayList;
import java.util.Arrays;

public class Test10 {
    public static void bubbleSort2D(int[][] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j][0] > a[j+1][0]) {
                    int tam = a[j][0];
                    a[j][0] = a[j+1][0];
                    a[j+1][0] = tam;
                    int tam2 = a[j][1];
                    a[j][1] = a[j+1][1];
                    a[j+1][1] = tam2;
                }
                if (a[j][0] == a[j+1][0]) {
                    if (a[j][1] < a[j+1][1]) {
                        int tam3 = a[j][0];
                        a[j][0] = a[j+1][0];
                        a[j+1][0] = tam3;
                        int tam4 = a[j][1];
                        a[j][1] = a[j+1][1];
                        a[j+1][1] = tam4;
                    }
                }
            }
        }
        printArray2D(a);
    }
    public static void bubbleSortArrayList(ArrayList<int[]> arr) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr.get(j)[0] > arr.get(j+1)[0]) {
                    int[] tam = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1, tam);
                }
                if (arr.get(j)[0] == arr.get(j+1)[0]) {
                    if (arr.get(j)[1] < arr.get(j+1)[1]) {
                        int[] tam1 = arr.get(j);
                        arr.set(j,arr.get(j+1));
                        arr.set(j+1, tam1);
                    }
                }
            }
        }
        printArray(arr);
    }

    public static void printArray2D(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(Arrays.toString(a[i]) + ", ");
        }
        System.out.println();
    }
    public static void printArray(ArrayList<int[]> arr) {
        for (int[] ints : arr) {
            System.out.print(Arrays.toString(ints) + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*Cho một mảng arr chứa các khoảng thời gian.
        Mỗi phần tử trong mảng là một mảng con gồm 2 số nguyên dương [start, end] đại diện cho thời điểm bắt đầu và kết thúc của một sự kiện (luôn đảm bảo start <= end).
        Hãy sắp xếp mảng arr theo các quy tắc sau:
        Ưu tiên sắp xếp theo thời điểm bắt đầu (start) tăng dần.
        Nếu hai sự kiện có cùng thời điểm bắt đầu, hãy sắp xếp theo thời điểm kết thúc (end) giảm dần (tức là sự kiện nào kéo dài lâu hơn sẽ đứng trước).
        Ví dụ 1:
        Input: arr = [[1, 4], [8, 10], [1, 5], [3, 6]]
        Output: [[1, 5], [1, 4], [3, 6], [8, 10]]
        Giải thích:
        Nhóm có start nhỏ nhất là 1: gồm [1, 4] và [1, 5]. Vì cùng start, ta xét end giảm dần nên [1, 5] đứng trước [1, 4].
        Sự kiện tiếp theo có start là 3: [3, 6].
        Sự kiện cuối cùng có start là 8: [8, 10].
        Ví dụ 2:
        Input: arr = [[5, 5], [2, 4], [2, 7], [1, 3]]
        Output: [[1, 3], [2, 7], [2, 4], [5, 5]]*/

        int[][] a = new int[][]{
                {1,4},
                {8,10},
                {1,5},
                {3,6}
        };
        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(Arrays.toString(a[i]) + ", ");
        }
        System.out.println();
        System.out.println("Output: ");
        bubbleSort2D(a);

        int[][] b = new int[][] {
                {5,5},
                {2,4},
                {2,7},
                {1,3}
        };

        System.out.println();
        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(Arrays.toString(b[i]) + ", ");
        }
        System.out.println();
        System.out.println("Output: ");
        bubbleSort2D(b);
        /*System.out.println("Ví dụ 1: ");
        ArrayList<int[]> arr = new ArrayList<>();
        arr.add(new int[]{1, 4});
        arr.add(new int[]{8, 10});
        arr.add(new int[]{1, 5});
        arr.add(new int[]{3, 6});
        for (int[] ints : arr) {
            System.out.print(Arrays.toString(ints) + ", ");
        }
        System.out.println();
        System.out.println("Output: ");
        bubbleSortArrayList(arr);
        System.out.println("---------");
        System.out.println("Ví dụ 2: ");
        ArrayList<int[]> arr1 = new ArrayList<>();
        arr1.add(new int[]{5, 5});
        arr1.add(new int[]{2, 4});
        arr1.add(new int[]{2, 7});
        arr1.add(new int[]{1, 3});
        for (int[] ints : arr1) {
            System.out.print(Arrays.toString(ints) + ", ");
        }
        System.out.println();
        System.out.println("Output: ");
        bubbleSortArrayList(arr1);*/
    }
}
