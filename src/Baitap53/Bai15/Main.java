package Baitap53.Bai15;

public class Main {

    public static String decodeString(String s) {
        StackInt stackInt = new StackInt(s.length());
        StackStringBuilder stackString = new StackStringBuilder(s.length());
        StringBuilder current = new StringBuilder();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                stackInt.push(k);
                stackString.push(current);
                current = new StringBuilder();
                k = 0;
            } else if (c == ']') {
                int count = stackInt.pop();
                StringBuilder prev = stackString.pop();
                for (int j = 0; j < count; j++) {
                    prev.append(current);
                }
                current = prev;
            } else {
                current.append(c);
            }
        }
        return current.toString();
    }

    public static void main(String[] args) {
        /*Cho một chuỗi được mã hóa theo quy tắc: k[chuỗi_con], nghĩa là chuỗi con bên trong dấu ngoặc vuông sẽ được lặp lại đúng k lần.
        Các chuỗi mã hóa có thể lồng vào nhau. Hãy giải mã và trả về chuỗi gốc.
        Ví dụ 1:
        Input: s = "3[a]2[bc]"
        Output: "aaabcbc"
        Ví dụ 2:
        Input: s = "3[a2[c]]"
        Output: "accaccacc"
        Giải thích: Giải mã từ trong ra ngoài: 2[c] thành cc. Chuỗi trở thành 3[acc]. Giải mã tiếp thành accaccacc.*/

        String s1 = "3[a]2[bc]";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + decodeString(s1));
        System.out.println();
        String s2 = "3[a2[c]]";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + decodeString(s2));
    }
}
