package Baitap52;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class Test46 {

    public static int maxFruits(int[] fruits) {
        int left = 0;
        int maxLength = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < fruits.length; right++) {
            if (!(map.containsKey(fruits[right]))) {
                count++;
            }
            while (count > 2) {
                map.remove(fruits[left]);
                left = right-1;
                count--;
            }
            map.put(fruits[right], right);
            int length = right - left + 1;
            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        /*Bạn đang ở trong một nông trại có một hàng cây ăn quả. Mảng fruits đại diện cho hàng cây đó, trong đó fruits[i] là loại trái cây sinh ra từ cây thứ i.
        Bạn có đúng 2 chiếc giỏ, mỗi chiếc giỏ chỉ có thể chứa một loại trái cây duy nhất (nhưng sức chứa của giỏ là vô hạn).
        Bạn phải thu hoạch theo các quy tắc sau:
        Bắt đầu từ bất kỳ cây nào, di chuyển sang phải và hái đúng 1 quả từ mỗi cây.
        Nếu gặp một cây có loại trái cây không thể bỏ vào 2 chiếc giỏ của bạn (tức là bạn đã gặp loại trái cây thứ 3), bạn bắt buộc phải dừng lại.
        Hãy tìm số lượng trái cây tối đa bạn có thể thu hoạch được.
        Ví dụ 1:
        Input: fruits = [1, 2, 1]
        Output: 3
        Giải thích: Bạn có thể hái tất cả 3 cây. Giỏ 1 chứa loại 1, giỏ 2 chứa loại 2.
        Ví dụ 2:
        Input: fruits = [0, 1, 2, 2]
        Output: 3
        Giải thích: Bạn có thể hái [1, 2, 2]. Nếu hái từ đầu [0, 1], đến cây loại 2 bạn sẽ phải dừng vì đã đủ 2 loại (0 và 1), chỉ hái được 2 quả.
        Ví dụ 3:
        Input: fruits = [3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4]
        Output: 5
        Giải thích: Khoảng thu hoạch tốt nhất là [1, 2, 1, 1, 2] (từ index 3 đến index 7).*/

        int[] fruits1 = {1, 2, 1};
        System.out.println("Ví dụ 1: " + Arrays.toString(fruits1));
        System.out.println("Output: " + maxFruits(fruits1));
        System.out.println();
        int[] fruits2 = {0, 1, 2, 2};
        System.out.println("Ví dụ 2: " + Arrays.toString(fruits2));
        System.out.println("Output: " + maxFruits(fruits2));
        System.out.println();
        int[] fruits3 = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println("Ví dụ 3: " + Arrays.toString(fruits3));
        System.out.println("Output: " + maxFruits(fruits3));

        for (int s : fruits3) {
            System.out.println(s);
        }

        System.out.println("======");

        Hashtable<Integer, Integer> map1 = new Hashtable<>();
        map1.put(3,0);
        map1.put(5,0);
        map1.put(2,0);
        map1.put(1,0);
        map1.put(10,0);
        map1.put(9,0);


        for (int key : map1.keySet()) {
            System.out.println(key);
        }



        // tim 5 [index, value]a;
        // for O(n)
        // a[250] => -1 O(1)



        // b.get(5) => index

        //
        /// hashtanle[key, value]
        // 5, , 10, 7. => for 5,,10,7
        // containsKey(5) O(1)
        // get(5) => value O(1)
        // for O(n)
        // h.[5]
        // func hash(input) => output hash-value . the same input => same output.
        // 5 + func hash(5) => [htgv4r5tt3dwdfrg5edsw, 86]
        // 3=> 666666
        // 5 => htgv4r5tt3dwdfrg5edsw
        // remove(5) => 5 + func hash(5) => htgv4r5tt3dwdfrg5edsw => h[]
    }
}
