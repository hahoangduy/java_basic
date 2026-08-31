package Baitap53.Bai6;

import Baitap53.Bai1.StackChar;

public class Main {

    public static String removeDuplicates(String s) {
        StackBai6 stack = new StackBai6(s.length());
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!stack.isEmpty() && stack.getChar() == currentChar) {
                stack.pop();
            } else {
                stack.push(currentChar);
            }
        }
        return stack.print();
    }

    public static void main(String[] args) {
        /*Cho một chuỗi s bao gồm các chữ cái in thường. Bạn được phép thực hiện thao tác xóa hai ký tự giống hệt nhau và đứng cạnh nhau.
        Thao tác này có thể lặp đi lặp lại cho đến khi không còn ký tự trùng lặp kề nhau nào nữa.
        Hãy trả về chuỗi kết quả cuối cùng.
        Ví dụ 1:
        Input: s = "abbaca"
        Output: "ca"
        Giải thích:
        Ban đầu có "abbaca". Cặp "bb" đứng cạnh nhau nên bị xóa. Chuỗi biến thành "aaca".
        Lúc này, cặp "aa" lại đứng cạnh nhau nên tiếp tục bị xóa. Chuỗi biến thành "ca". Không còn gì để xóa.
        Ví dụ 2:
        Input: s = "azxxzy"
        Output: "ay"
        Giải thích: "azxxzy" triệt tiêu "xx" thành "azzy". Sau đó triệt tiêu tiếp "zz" thành "ay".*/
        String s1 = "abbaca";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + removeDuplicates(s1));
        System.out.println();
        String s2 = "azxxzy";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + removeDuplicates(s2));
    }
}
