package Baitap52;

public class Test8 {

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                String[] tach = arr[j].split("\\.");
                String[] tach2 = arr[j+1].split("\\.");
                int maxLength = Math.max(tach.length, tach2.length);
                int so = 0;
                int so2 = 0;
                for (int k = 0; k < maxLength; k++) {
                    if (k >= tach.length) {
                        so = 0;
                    }
                    else {
                        so = Integer.parseInt(tach[k]);
                    }
                    if (k >= tach2.length) {
                        so2 = 0;
                    }
                    else {
                        so2 = Integer.parseInt(tach2[k]);
                    }
                    if (so < so2) {
                        break;
                    }
                    if (so > so2){
                        String tam = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tam;
                        break;
                    }
                }
            }
        }
        printArray(arr);
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s, ", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*Cho một mảng arr chứa các chuỗi đại diện cho các phiên bản phần mềm (ví dụ: "1.2.0", "1.15", "2.0"). Hãy sắp xếp mảng theo thứ tự tăng dần của phiên bản.
        Lưu ý quan trọng: Chuỗi "1.15" được xem là lớn hơn chuỗi "1.2" vì khi tách ra, số 15 lớn hơn số 2.
        Nếu một phiên bản bị thiếu phần đuôi, phần đó được xem là 0 (ví dụ: "1.0" tương đương "1.0.0").
        Ví dụ 1:
        Input: arr = ["1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"]
        Output: ["1.0", "1.0.2", "1.0.12", "1.1.2", "1.3.3"]
        Giải thích:
        "1.0" là nhỏ nhất (tương đương 1.0.0).
        Tiếp theo là "1.0.2".
        Tiếp theo là "1.0.12" (vì 12 > 2).
        Các phiên bản "1.1.2" và "1.3.3" lớn hơn nên nằm ở cuối.
        Ví dụ 2:
        Input: arr = ["2.10.1", "2.1", "2.2.5", "2.10"]
        Output: ["2.1", "2.2.5", "2.10", "2.10.1"]*/


        String[] arr = {"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"};
        String[] arr2 = {"1.1.2", "1.1.2.0.2", "1.3.3", "1.0.12", "1.0.2"};
        String[] arr3 = {"1.1.2", "1.1.1.1.1", "1.3.3", "1.0.12", "1.0.2"};
        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nOutput: ");
        //bubbleSort(arr);
        bubbleSort(arr3);
        System.out.println();
        String[] arr1 = {"2.10.1", "2.1", "2.2.5", "2.10"};
        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr1);
    }
}
