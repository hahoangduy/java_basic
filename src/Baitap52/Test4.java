package Baitap52;

public class Test4 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] % 2 != 0) {
                    int tam = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tam;
                }
            }
        }
        printArray(arr);
        for (int k = 0; k < n; k++) {
            for (int z = 0; z < n-k-1; z++) {
                if (arr[z] > arr[z+1] && arr[z] % 2 != 0 && arr[z+1] % 2 != 0) {
                    int tam1 = arr[z];
                    arr[z] = arr[z+1];
                    arr[z+1] = tam1;
                } else if (arr[z] > arr[z + 1] && arr[z] % 2 == 0 && arr[z+1] % 2 == 0) {
                    int tam2 = arr[z];
                    arr[z] = arr[z+1];
                    arr[z+1] = tam2;
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
        /*Cho một mảng arr chứa các số nguyên dương. Bạn hãy sắp xếp mảng sao cho tất cả các số chẵn đứng trước tất cả các số lẻ.
        Đồng thời:
        Các số chẵn phải được sắp xếp theo thứ tự tăng dần.
        Các số lẻ cũng phải được sắp xếp theo thứ tự tăng dần.
        Ví dụ 1:
        Input: arr = [3, 1, 2, 4, 7, 6]
        Output: [2, 4, 6, 1, 3, 7]
        Giải thích: * Nhóm số chẵn: 2, 4, 6 (đã sắp xếp tăng dần và đứng trước).
        Nhóm số lẻ: 1, 3, 7 (đã sắp xếp tăng dần và đứng sau).
        Ví dụ 2:
        Input: arr = [5, 9, 8, 10]
        Output: [8, 10, 5, 9]*/
        /*int[] arr = {3, 1, 2, 6, 7, 4};*/
        int[] arr = {7, 9, 3, 5 , 11, 7, 9, 6, 8, 2, 4, 10};
        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr);
        System.out.println();
        int[] arr1 = {5, 9, 8, 10};
        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr1);
    }
}
