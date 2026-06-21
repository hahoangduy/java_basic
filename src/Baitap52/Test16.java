package Baitap52;

public class Test16 {
    public static int calculateTotal(int number) {
        while (number >= 10) {
            int digitSum = 0;
            while (number > 0) {
                digitSum += number % 10;
                number /= 10;
            }
            number = digitSum;
        }
        return number;
    }

    public static void main(String[] args) {
        /*Cho một số nguyên không âm num. Hãy cộng dồn tất cả các chữ số của nó lại với nhau.
        Nếu kết quả thu được vẫn lớn hơn hoặc bằng 10 (có từ 2 chữ số trở lên), tiếp tục cộng dồn các chữ số của kết quả đó.
        Lặp lại quá trình này cho đến khi kết quả chỉ còn đúng 1 chữ số. Hãy trả về chữ số cuối cùng đó.
        Ví dụ 1:
        Input: num = 38
        Output: 2
        Giải thích: Quá trình cộng dồn:
        3 + 8 = 11 (Vẫn còn 2 chữ số, tiếp tục)
        1 + 1 = 2 (Đã về 1 chữ số, dừng lại và trả về 2).
        Ví dụ 2:
        Input: num = 0
        Output: 0*/
        int num1 = 38;
        System.out.println("Ví dụ 1: " + num1);
        System.out.println("Output 1: " + calculateTotal(num1));
        int num2 = 0;
        System.out.println("Ví dụ 2: " + num2);
        System.out.println("Output 2: " + calculateTotal(num2));
        int num3 = 180;
        System.out.println("Ví dụ 3: " + num3);
        System.out.println("Output 3: " + calculateTotal(num3));
        int num4 = 50;
        System.out.println("Ví dụ 4: " + num4);
        System.out.println("Output 4: " + calculateTotal(num4));

    }
}
