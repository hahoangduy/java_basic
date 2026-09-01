package Baitap53.Bai8;

import Baitap53.Bai6.StackBai6;

public class Main {

    public static String removeDuplicatesUpperAndLower(String s) {
        StackBai6 stack = new StackBai6(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
            }
            else {
                if (Character.toLowerCase(c) == Character.toLowerCase(stack.getChar()) && c != stack.getChar()) {
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
        }
        return stack.print();
    }

    public static void main(String[] args) {
        /*Một chuỗi được gọi là "tuyệt vời" nếu không có hai ký tự liền kề nào là cùng một chữ cái nhưng một cái in hoa, một cái in thường
        (ví dụ: 'a' và 'A', hoặc 'B' và 'b').
        Hãy loại bỏ các cặp vi phạm này để chuỗi trở nên "tuyệt vời".
        Ví dụ 1:
        Input: s = "leEeetcode"
        Output: "leetcode"
        Giải thích: Cặp 'e' và 'E' đứng cạnh nhau nên bị triệt tiêu.
        Ví dụ 2:
        Input: s = "abBAcC"
        Output: ""Giải thích: 'b' và 'B' triệt tiêu -> "aaCc".
        Sau đó 'a' và 'A' (vừa được kéo lại gần nhau) triệt tiêu -> "cC".
        Cuối cùng 'c' và 'C' triệt tiêu.
        Chuỗi rỗng.*/
        String s1 = "leEeetcode";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + removeDuplicatesUpperAndLower(s1));
        System.out.println();
        String s2 = "abBAcC";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + removeDuplicatesUpperAndLower(s2));
    }
}
