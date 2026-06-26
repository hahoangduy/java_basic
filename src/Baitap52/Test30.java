package Baitap52;

import java.util.Arrays;

public class Test30 {

    public static void linearSearch(int[][] intervals) {
        int[] arrayTemp = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int end_i = intervals[i][1];
            int minStart = 9999999;
            int indexTemp = -1;
            for (int j = 0; j < intervals.length; j++) {
                if (intervals[j][0] >= end_i) {
                    if (intervals[j][0] < minStart) {
                        minStart = intervals[j][0];
                        indexTemp = j;
                    }
                }
            }
           arrayTemp[i] = indexTemp;
        }
        System.out.println(Arrays.toString(arrayTemp));
    }

    public static int[] bubbleSort(int[][] intervals) {
        int n = intervals.length;
        int[] arrTemp = new int[intervals.length];
        for (int i = 0; i < n; i++) {
            arrTemp[i] = intervals[i][0];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arrTemp[j] > arrTemp[j+1]) {
                    int temp = arrTemp[j];
                    arrTemp[j] = arrTemp[j+1];
                    arrTemp[j+1] = temp;
                }
            }
        }
        return arrTemp;
    }

    public static void binarySearch(int[][] intervals) {
        int[] startValueArray = bubbleSort(intervals);
        int[] arrayTemp = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int indexTemp = -1;
            int left = 0;
            int right = startValueArray.length - 1;
            while(left <= right) {
                int mid =(left+right) / 2;
                if (startValueArray[mid] >= intervals[i][1]) {
                    indexTemp = mid;
                    right = mid - 1;
                } else if (startValueArray[mid] < intervals[i][1]) {
                    left = mid + 1;
                }
            }
            for (int j = 0; j < intervals.length; j++) {
                if (indexTemp != -1) {
                    if (startValueArray[indexTemp] == intervals[j][0]) {
                        arrayTemp[i] = j;
                        break;
                    }
                }
                else
                    arrayTemp[i] = indexTemp;
            }
        }
        System.out.println(Arrays.toString(arrayTemp));
    }

    public static void main(String[] args) {
        /*Cho một mảng intervals chứa các khoảng thời gian, trong đó intervals[i] = [start_i, end_i] và mỗi start_i đều là duy nhất.
        Khoảng thời gian j được gọi là "khoảng nối tiếp" (right interval) của khoảng thời gian i nếu:
        start_j >= end_i (khoảng j bắt đầu sau khi khoảng i kết thúc, hoặc vừa lúc kết thúc).
        start_j là giá trị nhỏ nhất có thể thỏa mãn điều kiện trên.
        Hãy trả về một mảng kết quả, trong đó phần tử thứ i là vị trí (index) ban đầu của khoảng nối tiếp dành cho khoảng i.
        Nếu khoảng i không có khoảng nối tiếp nào, trả về -1 tại vị trí đó.
        Ví dụ 1:
        Input: intervals = [[3, 4], [2, 3], [1, 2]]
        Output: [-1, 0, 1]
        Giải thích:
        Khoảng ở index 0 là [3, 4]. Không có khoảng nào có điểm bắt đầu >= 4. Kết quả: -1.
        Khoảng ở index 1 là [2, 3]. Khoảng có điểm bắt đầu >= 3 gần nhất là [3, 4] (index ban đầu là 0). Kết quả: 0.
        Khoảng ở index 2 là [1, 2]. Khoảng có điểm bắt đầu >= 2 gần nhất là [2, 3] (index ban đầu là 1). Kết quả: 1.
        Ví dụ 2:
        Input: intervals = [[1, 4], [2, 3], [3, 4]]
        Output: [-1, 2, -1]*/

        //  Output: 2, 0, 3, 2, 3, 4
        int[][] intervals1 = {
                new int[]{3, 4},
                new int[]{2, 3},
                new int[]{1, 2}

        };
        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < intervals1.length; i++) {
            System.out.print(Arrays.toString(intervals1[i]) + ", ");
        }
        System.out.println("\nOutput: ");
        linearSearch(intervals1);
        binarySearch(intervals1);
        System.out.println();
        int[][] intervals2 = {
                new int[]{1, 4},
                new int[]{2, 3},
                new int[]{3, 4}

        };
        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < intervals2.length; i++) {
            System.out.print(Arrays.toString(intervals2[i]) + ", ");
        }
        System.out.println("\nOutput: ");
        linearSearch(intervals2);
        binarySearch(intervals2);
    }
}
