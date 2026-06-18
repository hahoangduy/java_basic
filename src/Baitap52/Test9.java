package Baitap52;

public class Test9 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                int countOfNumber1 = countOccurrence(arr[j], arr);
                int countOfNumber2 = countOccurrence(arr[j+1], arr);
                if (countOfNumber1 < countOfNumber2) {
                    int tam = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tam;
                }
                if (countOfNumber1 == countOfNumber2) {
                    if (arr[j] < arr[j+1]) {
                        int tam1 = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tam1;
                    }
                }
            }
        }
        printArray(arr);
    }

    public static int countOccurrence(int number, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                count++;
            }
        }
        return count;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        /*Cho một mảng arr chứa các số nguyên. Hãy sắp xếp mảng sao cho các phần tử xuất hiện nhiều lần nhất đứng trước (tần suất giảm dần).
        Nếu có nhiều phần tử có cùng số lần xuất hiện, phần tử nào có giá trị lớn hơn sẽ được xếp trước.
        Ví dụ 1:
        Input: arr = [2, 3, 2, 4, 3, 3]
        Output: [3, 3, 3, 2, 2, 4]
        Giải thích: * Số 3 xuất hiện 3 lần.
        Số 2 xuất hiện 2 lần.
        Số 4 xuất hiện 1 lần.
        Sắp xếp theo tần suất giảm dần ta được các nhóm số 3, rồi đến nhóm số 2, cuối cùng là số 4.
        Ví dụ 2:
        Input: arr = [4, 4, 1, 1, 2]
        Output: [4, 4, 1, 1, 2]
        Giải thích:
        Số 4 và số 1 đều xuất hiện 2 lần.
        Vì 4 lớn hơn 1, nên nhóm số 4 đứng trước nhóm số 1. Số 2 xuất hiện 1 lần nên đứng cuối.*/

        int[] arr = {2, 3, 2, 4, 3, 3};
        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr);
        System.out.println();


        int[] arr1 = {4, 4, 1, 1, 2};
        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr1);
        System.out.println();


        int[] arr2 = {3, 4, 3, 4, 5, 6, 2, 4, 5, 3, 1, 2};
        System.out.println("Ví dụ 3: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr2);
    }
}
