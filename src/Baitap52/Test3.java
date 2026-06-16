package Baitap52;

public class Test3 {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] % 10 > arr[j+1] % 10) {
                    int tam = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tam;
                }
                else if (arr[j] % 10 == arr[j+1] % 10) {
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
        /*Cho một mảng arr gồm các số nguyên dương. Hãy sắp xếp mảng theo thứ tự tăng dần dựa trên chữ số cuối cùng (hàng đơn vị) của các số đó.
        Nếu hai số có chữ số cuối cùng giống nhau, số nào có giá trị thực nhỏ hơn sẽ đứng trước.
        Ví dụ 1:
        Input: arr = [15, 22, 10, 8, 34]
        Output: [10, 22, 34, 15, 8]
        Giải thích: Chữ số cuối của các số lần lượt là: 5, 2, 0, 8, 4.
        Sắp xếp theo chữ số cuối tăng dần: 0 (của 10), 2 (của 22), 4 (của 34), 5 (của 15), 8 (của 8).
        Ví dụ 2:
        Input: arr = [42, 12, 5, 105, 33]
        Output: [12, 42, 33, 5, 105]
        Giải thích: 42 và 12 đều tận cùng bằng 2, nhưng 12 < 42 nên 12 đứng trước.
        5 và 105 đều tận cùng bằng 5, nhưng 5 < 105 nên 5 đứng trước.*/
        int[] arr = {15, 22, 10, 8, 34};System.out.println("Ví dụ 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr);

        int[] arr1 = {42, 12, 5, 105, 33};
        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr1);
    }
}
