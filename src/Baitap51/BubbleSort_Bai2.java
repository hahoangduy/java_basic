package Baitap51;

public class BubbleSort_Bai2 {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
            printArray(i, a);
            if (isSorted) { // khi không đổi chỗ -> dãy đã được sắp xếp, dừng việc sắp xếp
                break;
            }
        }
    }
    public static void printArray(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2};
        int[] b = {1,2,3,4,5,7,6};
        bubbleSort(a);
    }
}
