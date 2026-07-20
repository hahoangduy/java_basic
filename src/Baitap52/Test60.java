package Baitap52;

import java.util.ArrayList;

public class Test60 {

    public static boolean backspaceCompare(String s, String t) {
        StringBuilder resultS = new StringBuilder();
        StringBuilder resultT = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                resultS.append(s.charAt(i));
            }
            else {
                if (resultS.length() > 0) {
                    resultS.deleteCharAt(resultS.length()-1);
                }
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                resultT.append(t.charAt(i));
            }
            else {
                if (resultT.length() > 0) {
                    resultT.deleteCharAt(resultT.length()-1);
                }
            }
        }
        String resultS1 = resultS.toString();
        String resultT1 = resultT.toString();
        if (resultS1.equals(resultT1)) {
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        /*Cho hai chuỗi s và t đại diện cho các thao tác gõ phím, trong đó ký tự '#' đóng vai trò là phím Backspace (xóa ký tự ngay trước nó).
        Hãy kiểm tra xem sau khi gõ xong, hai chuỗi có giống hệt nhau không.
        Lưu ý: Nếu bạn ấn Backspace khi chuỗi đang rỗng, chuỗi vẫn tiếp tục rỗng.
        Ví dụ 1:
        Input: s = "ab#c", t = "ad#c"
        Output: true
        Giải thích: Cả hai chuỗi sau khi xử lý phím xóa đều trở thành "ac".
        Ví dụ 2:
        Input: s = "ab##", t = "c#d#"
        Output: true
        Giải thích: Cả hai chuỗi đều trở thành chuỗi rỗng "".*/

        String s1 = "ab#c"; String t1 = "ad#c";
        System.out.println("Input 1: s = " + s1 + " ,t = " + t1);
        boolean result1 = backspaceCompare(s1, t1);
        System.out.println("Output: " + result1);
        System.out.println("");

        String s2 = "ab##"; String t2 = "c#d#";
        System.out.println("Input 2: s = " + s2 + " ,t = " + t2);
        boolean result2 = backspaceCompare(s2, t2);
        System.out.println("Output: " + result2);
    }
}
