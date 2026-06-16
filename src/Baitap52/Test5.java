package Baitap52;

public class Test5 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                int tam = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tam;
            }
        }
        printArray(arr);
    }
    public static void reversed(int chuoiSo) {
        int reversed = 0;
        while (chuoiSo != 0) {
            int digit = chuoiSo % 10;
            reversed = reversed * 10 + digit;
            chuoiSo /= 10;
        }
        System.out.println(reversed);
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        /*bài 2:
        cho 1 chuỗi số ngẫu nhiên, đảo ngược lại chữ số ngẫu nhiên này, ví dụ:
        86325 -> 53268
        75119 -> 91157*/

        /*int[] arr = {8, 6, 3, 2, 5};
        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr);
        System.out.println();
        int[] arr1 = {7, 5, 1, 1, 9};
        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr1);*/

        int chuoiSo = 86325;
        System.out.println("Ví dụ 1: ");
        System.out.println(chuoiSo);
        System.out.println("Output: ");
        reversed(chuoiSo);
        System.out.println();
        int chuoiSo2 = 75119;
        System.out.println("Ví dụ 2: ");
        System.out.println(chuoiSo2);
        System.out.println("Output: ");
        reversed(chuoiSo2);
    }
}
