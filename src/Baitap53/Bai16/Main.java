package Baitap53.Bai16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static ArrayList<String> substringADN(String s) {
        ArrayList<String> result = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        if (s == null || s.length() < 10) {
            return result;
        }
        for (int i = 0; i <= s.length() - 10; i++) {
            String sub = s.substring(i, i + 10);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                result.add(entry.getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        /*Chuỗi ADN được biểu diễn bằng một chuỗi chỉ chứa các ký tự 'A', 'C', 'G', và 'T'.
        Khi nghiên cứu ADN, việc xác định các chuỗi con lặp lại là rất hữu ích.
        Cho một chuỗi s đại diện cho một phân tử ADN,
        hãy tìm TẤT CẢ các chuỗi con (substring) có chiều dài đúng bằng 10 xuất hiện nhiều hơn 1 lần trong phân tử ADN đó.
        Trả về dưới dạng mảng (thứ tự bất kỳ).
        Ví dụ 1:
        Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
        Output: ["AAAAACCCCC", "CCCCCAAAAA"]
        Giải thích: Cả hai chuỗi con 10 ký tự này đều xuất hiện ít nhất 2 lần trong chuỗi s.
        Ví dụ 2:
        Input: s = "AAAAAAAAAAAAA"
        Output: ["AAAAAAAAAA"]*/

        String s1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + substringADN(s1));
        System.out.println();
        String s2 = "AAAAAAAAAAAAA";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + substringADN(s2));
    }
}
