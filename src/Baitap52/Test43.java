package Baitap52;

import java.util.HashMap;

public class Test43 {

    public static int longestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, right);
            int length = right - left + 1;
            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        /*Cho một chuỗi s. Hãy tìm độ dài của chuỗi con (substring) liên tiếp dài nhất mà trong đó không có bất kỳ ký tự nào bị xuất hiện nhiều hơn 1 lần.
        Ví dụ 1:
        Input: s = "abcabcbb"
        Output: 3
        Giải thích: Chuỗi con dài nhất không lặp lại là "abc", có độ dài 3.
        Ví dụ 2:
        Input: s = "bbbbb"
        Output: 1
        Giải thích: Chuỗi con dài nhất không lặp lại là "b", độ dài 1.
        Ví dụ 3:
        Input: s = "pwwkew"
        Output: 3
        Giải thích: Chuỗi con dài nhất là "wke", độ dài 3. Lưu ý "pwke" không hợp lệ vì nó không phải là chuỗi liên tiếp.*/
        String s1 = "abcabcbb";
        System.out.println("Ví dụ 1: " + s1);
        System.out.println("Output: " + longestSubstring(s1));
        System.out.println();
        String s2 = "bbbbb";
        System.out.println("Ví dụ 2: " + s2);
        System.out.println("Output: " + longestSubstring(s2));
        System.out.println();
        String s3 = "pwwkew";
        System.out.println("Ví dụ 3: " + s3);
        System.out.println("Output: " + longestSubstring(s3));
        String s4 = "abcabde";
        System.out.println(longestSubstring(s4));

    }
}
