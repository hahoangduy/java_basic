package Baitap53.Bai2;

public class Main {

    public static int stack(String[] tokens) {
        StackString stack = new StackString(tokens.length);
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] != "+" && tokens[i] != "-" && tokens[i] != "*" && tokens[i] != "/") {
                stack.push(tokens[i]);
            }
            else {
                String value1 = stack.pop();
                String value2 = stack.pop();
                int value3 = Integer.parseInt(value1);
                int value4 = Integer.parseInt(value2);
                switch (tokens[i]) {
                    case "+":
                        result = value4 + value3;
                        break;
                    case "-":
                        result = value4 - value3;
                        break;
                    case "*":
                        result = value4 * value3;
                        break;
                    case "/":
                        result = value4 / value3;
                        break;
                }
                stack.push(String.valueOf(result));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /*Cho một mảng các chuỗi tokens đại diện cho một biểu thức toán học được viết theo Ký pháp nghịch đảo Ba Lan (RPN - Hậu tố).
        Hãy tính toán và trả về kết quả của biểu thức đó. Các toán tử hợp lệ chỉ gồm +, -, *, /.
        Mỗi toán hạng có thể là một số nguyên hoặc một biểu thức khác.
        Phép chia hai số nguyên phải được làm tròn về phía 0 (ví dụ: 13 / 5 = 2).
        Ví dụ 1:
        Input: tokens = ["2", "1", "+", "3", "*"]
        Output: 9
        Giải thích: Biểu thức tương đương là ((2 + 1) * 3) = 9.
        Ví dụ 2:
        Input: tokens = ["4", "13", "5", "/", "+"]
        Output: 6
        Giải thích: Biểu thức tương đương là (4 + (13 / 5)) = 4 + 2 = 6.*/

        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println("Output: " + stack(tokens1));
        System.out.println();
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println("Output: " + stack(tokens2));
    }
}
