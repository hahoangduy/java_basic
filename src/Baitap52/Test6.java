package Baitap52;

import java.util.Arrays;

public class Test6 {
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                int countOfWord1 = countVowels(arr[j]);
                int countOfWord2 = countVowels(arr[j+1]);
                if (countOfWord1 > countOfWord2) {
                    String tam = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tam;
                }
            }
        }
        printArray(arr);
    }

    public static int countVowels(String words) {
        int count = 0;
        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s, ", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*Cho một mảng arr chứa các từ (chuỗi ký tự viết thường). Hãy sắp xếp mảng theo thứ tự tăng dần của số lượng chữ cái nguyên âm (a, e, i, o, u) có trong mỗi từ.
        Nếu hai từ có cùng số lượng nguyên âm, hãy giữ nguyên thứ tự xuất hiện ban đầu của chúng.
        Ví dụ 1:
        Input: arr = ["algorithm", "cat", "queue", "hello"]
        Output: ["cat", "hello", "algorithm", "queue"]
        Giải thích:
        "cat" có 1 nguyên âm (a)
        "hello" có 2 nguyên âm (e, o)
        "algorithm" có 3 nguyên âm (a, o, i)
        "queue" có 4 nguyên âm (u, e, u, e)
        Sắp xếp theo số lượng nguyên âm tăng dần là 1, 2, 3, 4.
        Ví dụ 2:
        Input: arr = ["sky", "apple", "bee"]
        Output: ["sky", "apple", "bee"]
        Giải thích: * "sky" có 0 nguyên âm.
        "apple" có 2 nguyên âm.
        "bee" có 2 nguyên âm.
        Vì "apple" và "bee" đều có 2 nguyên âm, ta giữ nguyên thứ tự ban đầu của chúng.*/
        String[] arr = {"algorithm", "cat", "queue", "hello"};
        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr);
        System.out.println();
        String[] arr1 = {"sky", "apple", "bee"};
        System.out.println("Ví dụ 2: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println("\nOutput: ");
        bubbleSort(arr1);
    }
}
