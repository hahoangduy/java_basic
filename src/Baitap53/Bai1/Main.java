package Baitap53.Bai1;

public class Main {

    public static boolean symmetryCheck(String a) {
        StackChar stack = new StackChar(a.length());
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        /*Kiểm tra chuỗi đối xứng
         * VD1: a = {[]()} => ok
         * VD2: a = ()[]{} => ok
         * VD3: a = []({}) => ok
         * VD4: a = (([])) => ok
         * VD5: a = (] => k ok
         * VD6: a = {{() => k ok
         */
        String[] a = {"[](){}", "()[]{}", "[]({})", "(([]))", "(]", "{{()"};

        for (String s : a) {
            if (symmetryCheck(s)) {
                System.out.println(s + " => true");
            } else {
                System.out.println(s + " => false");
            }
        }
    }
}
