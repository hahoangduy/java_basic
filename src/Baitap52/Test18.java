package Baitap52;

public class Test18 {

    public static void swapChar(String s, int k) {
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = (char) ('a' + ((c1 - 'a' + k) % 26));
            System.out.print(c2);
        }
        System.out.println();
    }

    public static void swapChar2(String s, int k) {
        String swap = "";
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = (char) ('a' + ((c1 - 'a' + k) % 26));
            swap += c2;
        }
        System.out.println("\"" + swap + "\"");
    }

    public static void swapChar3(String s, int k) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String swap = "";
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            for (int j = 0; j < alphabet.length(); j++) {
                char c2 = alphabet.charAt(j);
                if (c1 == c2) {
                    int index = (j + k) % alphabet.length();
                    char c3 = alphabet.charAt(index);
                    swap += c3;
                }
            }
        }
        System.out.println("\"" + swap + "\"");
    }

    public static void main(String[] args) {
        /*Cho một chuỗi s (chỉ chứa các chữ cái tiếng Anh in thường từ 'a' đến 'z') và một số nguyên không âm k (bước nhảy).
        Bạn hãy mã hóa chuỗi s bằng cách dịch chuyển mỗi ký tự trong chuỗi sang phải k vị trí trong bảng chữ cái.Đặc biệt chú ý: Bảng chữ cái có tính chất tuần hoàn.
        Tức là nếu dịch chuyển vượt qua chữ 'z', nó phải quay vòng lại chữ 'a'.
        Ví dụ 1:
        Input: s = "abc", k = 2
        Output: "cde"
        Giải thích: 'a' dịch 2 bước thành 'c', 'b' dịch 2 bước thành 'd', 'c' thành 'e'.

        Ví dụ 2:
        Input: s = "xyz", k = 3
        Output: "abc"
        Giải thích: * 'x' dịch 3 bước: y -> z -> a, 'y' dịch 3 bước: z -> a -> b, 'z' dịch 3 bước: a -> b -> c.*/
        System.out.println("Ví dụ 1: ");
        String s1 = "abc";
        System.out.println(s1);
        System.out.println("Output: ");
        swapChar(s1, 2);
        swapChar2(s1, 2);
        swapChar3(s1, 2);
        System.out.println();
        System.out.println("Ví dụ 2: ");
        String s2 = "xyz";
        System.out.println(s2);
        System.out.println("Output: ");
        swapChar(s2, 3);
        swapChar2(s2, 3);
        swapChar3(s2, 3);
        System.out.println();
        System.out.println("Ví dụ 3: ");
        String s3 = "xxx";
        System.out.println(s3);
        System.out.println("Output: ");
        swapChar(s3, 4);
        swapChar2(s3, 4);
        swapChar3(s3, 4);
    }
}
