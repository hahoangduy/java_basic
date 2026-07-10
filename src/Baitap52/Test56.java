package Baitap52;

public class Test56 {

    public static boolean palindromeString(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return checkPalindromeString(s, left + 1, right) || checkPalindromeString(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    private static boolean checkPalindromeString(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        /*Cho một chuỗi s. Hãy kiểm tra xem chuỗi này có thể trở thành chuỗi đối xứng hay không nếu bạn được quyền xóa nhiều nhất một ký tự.
        Ví dụ 1:
        Input: s = "aba"
        Output: true
        Giải thích: Chuỗi vốn đã là chuỗi đối xứng, không cần xóa ký tự nào.
        Ví dụ 2:
        Input: s = "abca"
        Output: true
        Giải thích: Bạn có thể xóa ký tự 'c' (hoặc 'b') để được chuỗi "aba" (hoặc "aca") là một chuỗi đối xứng.
        Ví dụ 3:
        Input: s = "abc"
        Output: false
        Giải thích: Xóa bất kỳ ký tự nào cũng không thể tạo thành chuỗi đối xứng.*/

        String s1 = "aba";
        System.out.println("Input 1: " + s1);
        System.out.println("Output: " + palindromeString(s1));
        System.out.println();
        String s2 = "abca";
        System.out.println("Input 2: " + s2);
        System.out.println("Output: " + palindromeString(s2));
        System.out.println();
        String s3 = "abc";
        System.out.println("Input 3: " + s3);
        System.out.println("Output: " + palindromeString(s3));
    }
}
