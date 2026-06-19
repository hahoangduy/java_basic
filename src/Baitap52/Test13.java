package Baitap52;

public class Test13 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                int countNumber1 = countBit(arr[j]);
                int countNumber2 = countBit(arr[j+1]);
                if (countNumber1 > countNumber2) {
                    int tam = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tam;
                }
                if (countNumber1 == countNumber2) {
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
    public static int countBit(int number) {
        int count = 0;
        while (number > 0) {
            if (number % 2 == 1) {
                count++;
            }
            number /= 2;
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
        /*Cho một mảng arr chứa các số nguyên dương. Hãy sắp xếp mảng theo thứ tự tăng dần của số lượng bit 1 có trong biểu diễn nhị phân của mỗi số.
        Nếu hai số có cùng số lượng bit 1, số nào có giá trị nhỏ hơn sẽ đứng trước.
        Ví dụ 1:
        Input: arr = [3, 8, 5, 7]
        Output: [8, 3, 5, 7]
        Giải thích:
        8 trong hệ nhị phân là 1000 (có 1 bit 1).
        3 trong hệ nhị phân là 11 (có 2 bit 1).
        5 trong hệ nhị phân là 101 (có 2 bit 1).
        7 trong hệ nhị phân là 111 (có 3 bit 1).
        Sắp xếp theo số lượng bit 1 tăng dần: 8 đứng đầu. Nhóm có 2 bit 1 là 3 và 5 (vì 3 < 5 nên 3 xếp trước). Cuối cùng là 7.
        Ví dụ 2:
        Input: arr = [1024, 512, 256, 4, 2]
        Output: [2, 4, 256, 512, 1024]
        Giải thích: Tất cả các số này đều là lũy thừa của 2 nên biểu diễn nhị phân của chúng chỉ có đúng 1 bit 1.
        Vì số bit bằng nhau, ta chỉ cần sắp xếp theo giá trị thực tăng dần.*/

        int[] arr = {3, 8, 5, 7};
        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr);
        System.out.println();
        int[] arr1 = {1024, 512, 256, 4, 2};
        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d, ", arr1[i]);
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr1);

    }
}
