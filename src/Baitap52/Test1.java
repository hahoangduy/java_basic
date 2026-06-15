package Baitap52;

public class Test1 {
    /*public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (Math.abs(arr[j]) > Math.abs(arr[j+1])) {
                    int tam = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tam;
                }
                if (Math.abs(arr[j]) == Math.abs(arr[j+1])) {
                    if (arr[j] < 0) {
                        continue;
                    }
                    else if (arr[j+1] < 0) {
                        int tam1 = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tam1;
                    }
                }
            }
        }
        printArray(arr);
    }*/
    public static void bubbleSortReversed(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (Math.abs(arr[j]) < Math.abs(arr[j+1])) {
                    int tam = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tam;
                }
                if (Math.abs(arr[j]) == Math.abs(arr[j+1])) {
                    if (arr[j+1] < 0) {
                        continue;
                    } else if (arr[j] < 0) {
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
        /*Cho một mảng các số nguyên arr (có thể bao gồm cả số âm và số dương). Hãy sắp xếp mảng theo thứ tự tăng dần của giá trị tuyệt đối của các phần tử.
        Nếu hai số có cùng giá trị tuyệt đối (ví dụ: -2 và 2), số nào nhỏ hơn (số âm) sẽ phải đứng trước.
        Bạn hãy thử giải bài này bằng Bubble Sort hoặc Insertion Sort mà không dùng hàm sort() có sẵn của ngôn ngữ lập trình nhé.
        Ví dụ 1:
        Input: arr = [2, -7, -2, -5, 0, 4]
        Output: [0, -2, 2, 4, -5, -7]
        Giải thích: * Giá trị tuyệt đối của các phần tử lần lượt là: [2, 7, 2, 5, 0, 4].
        Sắp xếp theo giá trị tuyệt đối tăng dần: 0, 2, 2, 4, 5, 7.
        Vì -2 và 2 có cùng giá trị tuyệt đối, số -2 nhỏ hơn nên được xếp trước số 2.
        Ví dụ 2:
        Input: arr = [3, -1, -3, 1]
        Output: [-1, 1, -3, 3]*/
        System.out.println("Ví dụ 1: ");
        int[] arr = { 2, -7, -2, -5, 0, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        /*System.out.println("\nOutput: ");
        bubbleSort(arr);*/
        System.out.println();
        System.out.println("Ví dụ 2: ");
        int[] arr1 = {3, -1, -3, 1};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        /*System.out.println("\nOutput: ");
        bubbleSort(arr1);*/
        System.out.println("\nOutput reversed 1: ");
        bubbleSortReversed(arr);
        System.out.println("Output reversed 2: ");
        bubbleSortReversed(arr1);
    }
}
