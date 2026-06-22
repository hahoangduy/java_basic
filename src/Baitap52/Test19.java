package Baitap52;

public class Test19 {

    public static void findBall(int n, int start, int k) {
        int a = 1 + ((start - 1 + k) % n);
        System.out.println(a);
    }

    public static void main(String[] args) {
        /*Có n người bạn đang ngồi thành một vòng tròn, được đánh số thứ tự từ 1 đến n theo chiều kim đồng hồ.
        Quả bóng đang nằm ở người có số thứ tự start (từ 1 đến n). Người này chuyền bóng đi k bước theo chiều kim đồng hồ.
        Hỏi quả bóng sẽ dừng lại ở người số mấy?
        Ví dụ 1:
        Input: n = 5, start = 2, k = 8
        Output: 5
        Giải thích: * Vòng tròn có 5 người: [1, 2, 3, 4, 5].
        Bắt đầu ở vị trí số 2.
        Chuyền 8 bước: 2 -> 3 -> 4 -> 5 -> 1 -> 2 -> 3 -> 4 -> 5.

        Bóng dừng ở người số 5.
        Ví dụ 2:
        Input: n = 4, start = 4, k = 1
        Output: 1
        Giải thích: Bắt đầu ở số 4, chuyền 1 bước sẽ quay vòng lại người số 1.*/
        int n1 = 5; int start1 = 2; int k1 = 8;
        System.out.println("Ví dụ 1: ");
        System.out.println("N: " + n1 + " |Start: " + start1 + " |K: " + k1);
        System.out.println("Output: ");
        findBall(n1, start1, k1);
        int n2 = 4; int start2 = 4; int k2 = 1;
        System.out.println("Ví dụ 2: ");
        System.out.println("N: " + n2 + " |Start: " + start2 + " |K: " + k2);
        System.out.println("Output: ");
        findBall(n2, start2, k2);
    }
}
