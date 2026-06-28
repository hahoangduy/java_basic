package Baitap52;

import java.util.HashMap;

public class Test39 {

    public static boolean hashMap(String s, String t) {
        HashMap<Character, Character> mapS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) {
                    return false;
                }
            } else {
                mapS.put(charS, charT);
            }
        }
        return true;
    }


    public static void main(String[] args) {
        /*Cho hai chuỗi s và t có cùng độ dài. Hãy kiểm tra xem chúng có phải là hai chuỗi đồng cấu hay không.
        Hai chuỗi được gọi là đồng cấu nếu các ký tự trong s có thể được thay thế hoàn toàn bằng các ký tự khác để tạo thành t, với điều kiện:
        Mỗi ký tự trong s chỉ được ánh xạ (map) tới đúng một ký tự trong t.
        Không có hai ký tự khác nhau nào trong s cùng ánh xạ tới một ký tự trong t.
        Một ký tự có thể tự ánh xạ vào chính nó.
        Ví dụ 1:
        Input: s = "egg", t = "add"
        Output: true
        Giải thích: 'e' được map thành 'a', 'g' được map thành 'd'. Quy tắc này áp dụng đúng cho toàn bộ chuỗi.
        Ví dụ 2:
        Input: s = "foo", t = "bar"
        Output: false
        Giải thích: 'f' map thành 'b'. 'o' đầu tiên map thành 'a'.
        Nhưng 'o' thứ hai lại phải map thành 'r' (vi phạm quy tắc 1 vì 'o' đã được quy định map thành 'a' trước đó).*/


        String s1 = "egg"; String t1 = "add";
        System.out.println("Ví dụ 1: s = " + s1 + " |t = " + t1);
        System.out.println("Output: " + hashMap(s1, t1));
        System.out.println();
        String s2 = "foo"; String t2 = "bar";
        System.out.println("Ví dụ 2: s = " + s2 + " |t = " + t2);
        System.out.println("Output: " + hashMap(s2, t2));
    }
}
