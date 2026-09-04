package Baitap53.Bai13;

import Baitap53.Bai11.StackBai11;

public class Main {

    // s = "a)b(c)d" peek, pop ,  "a(v(a"
    public static String removeBracket(String s) {
        StackBai11 stack = new StackBai11(s.length());
        boolean[] remove = new boolean[s.length()]; //
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(')
                stack.push(i);
            else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                else {
                    remove[i] = true;
                }
            }
        }
        while (!stack.isEmpty()) {
            remove[stack.pop()] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!remove[i]) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        /*Cho một chuỗi s chứa chữ cái in thường và các dấu ngoặc ( , ). Hãy xóa số lượng dấu ngoặc ít nhất (bất kỳ vị trí nào) để chuỗi trở thành hợp lệ.
        Ví dụ: s = "a)b(c)d"
        Output: "ab(c)d" (Dấu ) đầu tiên bị thừa nên xóa đi).
        Ví dụ 2: s = "))(("
        Output: "" (Xóa hết vì không có cặp nào hợp lệ).*/

        String s1 = "a)b(c)d";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + removeBracket(s1));
        System.out.println();
        String s2 = "))((";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + removeBracket(s2));
    }
}
