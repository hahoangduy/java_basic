package Baitap52;

public class Test7 {

    public static void bubbleSort(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (Math.abs(arr[j] - k) > Math.abs(arr[j+1] - k)) {
                    int tam = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tam;
                } else if (Math.abs(arr[j] - k) == Math.abs(arr[j+1] - k)) {
                    if (arr[j] > arr[j+1]) {
                        int tam1 = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tam1;
                    }
                }
            }
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /*Cho một mảng các số nguyên arr và một số nguyên k (target).
        Hãy sắp xếp mảng dựa trên khoảng cách từ mỗi phần tử đến k theo thứ tự tăng dần (số nào gần k nhất sẽ đứng đầu mảng).
        Khoảng cách giữa hai số a và b được tính bằng giá trị tuyệt đối của hiệu hai số: |a - b|.
        Nếu có hai số có cùng khoảng cách đến k, số nào nhỏ hơn sẽ đứng trước.
        Ví dụ 1:
        Input: arr = [10, 5, 8, 3, 6], k = 7
        Output: [6, 8, 5, 10, 3]
        Giải thích: * Tính khoảng cách từ các phần tử đến 7:
        * |10 - 7| = 3
        * |5 - 7| = 2
        * |8 - 7| = 1
        * |3 - 7| = 4
        * |6 - 7| = 1
        Các số có khoảng cách nhỏ nhất là 8 và 6 (đều cách 7 là 1 đơn vị). Vì 6 < 8 nên 6 xếp trước 8.
        Thứ tự hoàn chỉnh: 6 (cách 1), 8 (cách 1), 5 (cách 2), 10 (cách 3), 3 (cách 4).
        Ví dụ 2:
        Input: arr = [1, 2, 3, 4, 5], k = 3
        Output: [3, 2, 4, 1, 5]*/

        int[] arr = {10, 5, 8, 3, 6};
        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr, 7);
        System.out.println();
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr1, 3);
    }
}
