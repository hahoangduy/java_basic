package Baitap52;

import java.util.HashMap;

public class Test49 {

    public static String minSubstring(String s, String t) {
        return "";
    }

    public static void main(String[] args) {
        /*Cho hai chuỗi s và t. Hãy tìm chuỗi con (substring) ngắn nhất trong s sao cho nó chứa tất cả các ký tự của t (bao gồm cả các ký tự lặp lại).
        Nếu không tồn tại chuỗi con nào như vậy, trả về chuỗi rỗng "".
        Ví dụ 1:
        Input: s = "ADOBECODEBANC", t = "ABC"
        Output: "BANC"
        Giải thích: Chuỗi con "BANC" chứa đủ 3 ký tự 'A', 'B', 'C' và có chiều dài ngắn nhất (4). (Chuỗi "ADOBEC" cũng chứa đủ nhưng dài tới 6).
        Ví dụ 2:
        Input: s = "a", t = "a"
        Output: "a"
        Ví dụ 3:
        Input: s = "a", t = "aa"
        Output: ""
        Giải thích: t yêu cầu tới 2 chữ 'a', nhưng s chỉ có 1.*/
        String s1 = "ADOBECODEBANC"; String t1 = "ABC";
        System.out.println("Ví dụ 1: s: " + s1 + " |T: " + t1);
        System.out.println("Output: " + minSubstring(s1, t1));
        System.out.println();
        String s2 = "a"; String t2 = "a";
        System.out.println("Ví dụ 2: s: " + s2 + " |T: " + t2);
        System.out.println("Output: " + minSubstring(s2, t2));
        System.out.println();
        String s3 = "a"; String t3 = "aa";
        System.out.println("Ví dụ 3: s: " + s3 + " |T: " + t3);
        System.out.println("Output: " + minSubstring(s3, t3));
    }
}
