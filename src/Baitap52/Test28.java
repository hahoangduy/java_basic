package Baitap52;

import java.util.Arrays;

public class Test28 {

    public static void linearSearch(int[] spells, int[] potions, int success) {
        int[] temp = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int count = 0;
            for (int j = 0; j < potions.length; j++) {
                int combine = spells[i] * potions[j];
                if (combine >= success) {
                    count++;
                }
            }
            temp[i] = count;
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void binarySearch(int[] spells, int[] potions, int success) {
        int[] arrayTemp = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int resultTemp = 0;
            int left = 0;
            int right = potions.length - 1;
            int count = 0;
            double target = (double) success / (double) spells[i];
            while (left <= right) {
                int mid = (left + right) / 2;
                if ((double)(potions[mid]) < target) {
                    left = mid + 1;
                }else if ((double)(potions[mid]) >= target) {
                    right = mid - 1;
                    resultTemp = mid;
                }
            }
            if (resultTemp != 0) {
                count = potions.length - resultTemp;
            }
            arrayTemp[i] = count;
        }
        System.out.println(Arrays.toString(arrayTemp));
    }

    public static void main(String[] args) {
        /*Bạn được cung cấp hai mảng số nguyên dương: spells (sức mạnh của các câu thần chú) và potions (độ đậm đặc của các bình thuốc).
        Bạn cũng có một số nguyên success (ngưỡng thành công).
        Một câu thần chú và một bình thuốc khi kết hợp lại sẽ tạo ra năng lượng bằng tích của chúng: spell * potion.
        Cặp ghép này được coi là "thành công" nếu năng lượng tạo ra lớn hơn hoặc bằng success.
        Với mỗi câu thần chú trong mảng spells, hãy đếm xem có bao nhiêu bình thuốc trong mảng potions có thể kết hợp với nó để tạo thành một cặp thành công.
        Trả về một mảng chứa kết quả tương ứng.
        Ví dụ 1:
        Input: spells = [5, 1, 3], potions = [1, 2, 3, 4, 5], success = 7
        Output: [4, 0, 3]
        Giải thích:Với thần chú 5: Cần bình thuốc có sức mạnh $\ge 7/5 = 1.4$.
        Các bình thuốc thỏa mãn là [2, 3, 4, 5] (có 4 bình).
        Với thần chú 1: Cần bình thuốc có sức mạnh $\ge 7/1 = 7$.
        Không có bình thuốc nào thỏa mãn (0 bình).
        Với thần chú 3: Cần bình thuốc có sức mạnh $\ge 7/3 = 2.33$.
        Các bình thuốc thỏa mãn là [3, 4, 5] (có 3 bình).
         Do đó kết quả trả về là [4, 0, 3].
         Ví dụ 2:
         Input: spells = [3, 1, 2], potions = [8, 5, 8], success = 16
         Output: [2, 0, 2]*/

        int[] spells1 = {5, 1, 3}; int[] potions1 = {1, 2, 3, 4, 5}; int success1 = 7;
        bubbleSort(potions1);
        System.out.println("Ví dụ 1: ");
        System.out.println("Spells: " + Arrays.toString(spells1) + " |Potions: " + Arrays.toString(potions1) + " |Success: " + success1);
        System.out.print("Output: ");
        linearSearch(spells1, potions1, success1);
        binarySearch(spells1, potions1, success1);
        System.out.println();
        int[] spells2 = {3, 1, 2}; int[] potions2 = {8, 5, 8}; int success2 = 16;
        bubbleSort(potions2);
        System.out.println("Ví dụ 2: ");
        System.out.println("Spells: " + Arrays.toString(spells2) + " |Potions: " + Arrays.toString(potions2) + " |Success: " + success2);
        System.out.print("Output: ");
        linearSearch(spells2, potions2, success2);
        binarySearch(spells2, potions2, success2);
    }
}
