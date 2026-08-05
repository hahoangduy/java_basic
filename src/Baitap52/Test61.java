package Baitap52;

public class Test61 {

    public static String palindromicSubstring(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int length1 = calculateLength(s, i, i);
            int length2 = calculateLength(s, i, i + 1);
            int length = Math.max(length1, length2);
            if (length > end - start) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int calculateLength(String s, int left, int right) {
        int length = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        length = right - left - 1;
        return length;
    }

    public static void main(String[] args) {
        /*Cho một chuỗi s, hãy tìm chuỗi con đối xứng (palindromic substring) dài nhất trong s.
        Ví dụ 1:
        Input: s = "babad"
        Output: "bab" (hoặc "aba")
        Giải thích: "aba" là chuỗi đối xứng có độ dài 3.
        Ví dụ 2:
        Input: s = "cbbd"
        Output: "bb"*/

        String s1 = "babad";
        System.out.println("Input 1: " + s1);
        System.out.println("Output: " + palindromicSubstring(s1));
        System.out.println("");
        String s2 = "cbbd";
        System.out.println("Input 2: " + s2);
        System.out.println("Output: " + palindromicSubstring(s2));
    }
}
