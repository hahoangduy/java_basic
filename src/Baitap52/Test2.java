package Baitap52;

public class Test2 {

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].length() > arr[j+1].length()) {
                    String tam = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tam;
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
        /*Cho một mảng arr chứa các chuỗi (string). Bạn hãy sắp xếp mảng này theo thứ tự độ dài của chuỗi tăng dần.
        Nếu hai chuỗi có độ dài bằng nhau, bạn có thể giữ nguyên thứ tự xuất hiện ban đầu của chúng.
        Ví dụ 1:
        Input: arr = ["apple", "pie", "banana", "kiwi"]
        Output: ["pie", "kiwi", "apple", "banana"]
        Giải thích: Độ dài tương ứng của các chuỗi là: 5, 3, 6, 4.
        Sắp xếp theo độ dài tăng dần ta có thứ tự độ dài là 3, 4, 5, 6, tương ứng với các chuỗi pie, kiwi, apple, banana.
        Ví dụ 2:
        Input: arr = ["cat", "dog", "elephant", "ant"]
        Output: ["cat", "dog", "ant", "elephant"] (Vì "cat", "dog", "ant" đều có độ dài là 3 nên giữ nguyên thứ tự, "elephant" dài nhất bị đẩy về cuối).*/

        String[] arr = {"apple", "pie", "banana", "kiwi"};
        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr);
        String[] arr1 = {"cat", "dog", "elephant", "ant"};
        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr1);
    }

}
