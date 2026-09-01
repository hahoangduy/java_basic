package Baitap53.Bai7;

import Baitap53.Bai6.StackBai6;

public class Main {

    public static String logicProcessing (String str) {
        StackBai6 stack = new StackBai6(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != '#') {
                stack.push(c);
            }
            else if (!stack.isEmpty()){
                stack.pop();
            }
        }
        return stack.print();
    }

    public static boolean backspaceCompare (String s, String t) {
        return logicProcessing(s).equals(logicProcessing(t));
    }

    public static void main(String[] args) {
        /*Cho hai chuỗi s và t đại diện cho thứ tự các phím được gõ vào màn hình.
        Dấu # đại diện cho việc bấm phím Backspace (xóa đi ký tự vừa gõ ngay trước đó).
        Hãy kiểm tra xem sau khi gõ xong, nội dung hiển thị trên màn hình của hai chuỗi có giống hệt nhau hay không.
        Ví dụ 1:
        Input: s = "ab#c", t = "ad#c"
        Output: true
        Giải thích:
        Chuỗi s: Gõ 'a', gõ 'b', xóa 'b', gõ 'c' -> Màn hình hiện "ac".
        Chuỗi t: Gõ 'a', gõ 'd', xóa 'd', gõ 'c' -> Màn hình hiện "ac".
        Hai chuỗi bằng nhau.
        Ví dụ 2:
        Input: s = "a##c", t = "#a#c"
        Output: true
        Giải thích: Cả hai đều cho ra kết quả "c".
        Lưu ý: Nếu màn hình đang trống mà bạn bấm phím xóa, thì không có gì xảy ra cả.*/

        String s1 = "ab#c"; String t1 = "ad#c";
        System.out.println("Input: " + s1 + " | " + t1);
        System.out.println("Output: " + backspaceCompare(s1, t1));
        System.out.println();
        String s2 = " a##c"; String t2 = "#a#c";
        System.out.println("Input: " + s2 + " | " + t2);
        System.out.println("Output: " + backspaceCompare(s2, t2));
    }
}
