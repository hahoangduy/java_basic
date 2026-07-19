package Baitap52;

public class Test60 {

    public static boolean backspaceCompare(String s, String t) {
        for (int i = 0; i < s.length(); i++) {

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

        String s1 = "ab#c"; String t1 = "ab#c";
        System.out.println("Input 1: " + s1 + " ," + t1);
        boolean result1 = backspaceCompare(s1, t1);
        System.out.println("Output: " + result1);
        System.out.println("");

        String s2 = "ab##"; String t2 = "c#d#";
        System.out.println("Input 2: " + s2 + " ," + t2);
        boolean result2 = backspaceCompare(s2, t2);
        System.out.println("Output: " + result2);
    }
}
