package Baitap52;

import java.util.HashMap;

public class Test36 {

    public static int hashMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        /*Cho một chuỗi s. Hãy tìm ký tự đầu tiên không lặp lại (chỉ xuất hiện đúng 1 lần) trong chuỗi đó và trả về vị trí (index) của nó.
        Nếu không tồn tại ký tự nào như vậy, trả về -1.
        Ví dụ 1:
        Input: s = "leetcode"
        Output: 0
        Giải thích: Chữ 'l' chỉ xuất hiện đúng 1 lần và nó ở ngay đầu chuỗi (index 0). Chữ 'e' xuất hiện 3 lần, chữ 't' xuất hiện 1 lần nhưng đứng sau 'l'.
        Ví dụ 2:
        Input: s = "loveleetcode"
        Output: 2
        Giải thích: Ký tự xuất hiện 1 lần đầu tiên là chữ 'v' ở index 2.*/

        String s1 = "leetcode";
        System.out.println("Ví dụ 1: " + s1);
        int result1 = hashMap(s1);
        System.out.print("Output: " + result1);
        System.out.println();
        String s2 = "loveleetcode";
        System.out.println("Ví dụ 2: " + s2);
        int result2 = hashMap(s2);
        System.out.print("Output: " + result2);
    }
}
