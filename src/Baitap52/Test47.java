package Baitap52;

import java.util.HashMap;

public class Test47 {

    public static int longestSubstring(String s, int k) {
        int left = 0;
        int countSwap = 0;
        int maxLength= 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            countSwap = Math.max(countSwap, map.get(rightChar));
            if ((right - left + 1) - countSwap > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            int length = right - left + 1;
            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        /*Cho một chuỗi s chỉ chứa các chữ cái tiếng Anh in hoa và một số nguyên k.
        Bạn được phép thay đổi bất kỳ ký tự nào trong chuỗi thành bất kỳ chữ cái in hoa nào khác, nhưng tối đa chỉ được đổi k lần.
        Hãy tìm chiều dài của chuỗi con dài nhất chứa cùng một chữ cái duy nhất có thể tạo ra sau khi thực hiện các phép thay thế.
        Ví dụ 1:
        Input: s = "ABAB", k = 2
        Output: 4
        Giải thích: Bạn có thể thay 2 chữ 'B' thành 'A' để được "AAAA", hoặc thay 2 chữ 'A' thành 'B' để được "BBBB". Cả hai cách đều tạo ra chuỗi dài 4.
        Ví dụ 2:
        Input: s = "AABABBA", k = 1
        Output: 4
        Giải thích: * Thay chữ 'A' ở giữa thành 'B' để tạo thành "AABBBBA". Chuỗi con "BBBB" có độ dài 4.*/

        String s1 = "ABAB"; int k1 = 0;
        System.out.println("Ví dụ 1: " + s1 + " |K: " + k1);
        System.out.println("Output: " + longestSubstring(s1, k1));
        System.out.println();
        String s2 = "AABABBA"; int k2 = 1;
        System.out.println("Ví dụ 2: " + s2 + " |K: " + k2);
        System.out.println("Output: " + longestSubstring(s2, k2));
        String s3 = "AABABBABABBBBB"; int k3 = 1;
        System.out.println(longestSubstring(s3, k3));
        String s4 = "ABAA"; int k4 = 0;
        System.out.println(longestSubstring(s4, k4));
    }
}
