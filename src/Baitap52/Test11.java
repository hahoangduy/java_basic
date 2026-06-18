package Baitap52;

public class Test11 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                int countNumber1 = countDivisor(arr[j]);
                int countNumber2 = countDivisor(arr[j+1]);
                if (countNumber1 > countNumber2) {
                    int tam = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tam;
                }
                if (countNumber1 == countNumber2) {
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

    public static int countDivisor(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s, ", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*Cho một mảng arr chứa các số nguyên dương. Hãy sắp xếp mảng theo thứ tự tăng dần của số lượng ước số (factors/divisors) của mỗi số.
        Nếu hai số có cùng số lượng ước số, số nào có giá trị lớn hơn sẽ được xếp trước (lưu ý: ở đây là ưu tiên số lớn hơn).
        Ví dụ 1:
        Input: arr = [2, 4, 7, 8, 9]
        Output: [7, 2, 9, 4, 8]
        Giải thích:
        2 có 2 ước số (1, 2).
        4 có 3 ước số (1, 2, 4).
        7 có 2 ước số (1, 7).
        8 có 4 ước số (1, 2, 4, 8).
        9 có 3 ước số (1, 3, 9).
        Nhóm 2 ước: 2 và 7. Sắp xếp giảm dần theo giá trị -> 7, 2.
        Nhóm 3 ước: 4 và 9. Sắp xếp giảm dần theo giá trị -> 9, 4.
        Nhóm 4 ước: 8.*/

        int[] arr = {2, 4, 7, 8, 9};
        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr);
        System.out.println();

        int[] arr1 = {6, 10, 22, 4, 5};
        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr1);
    }
}
