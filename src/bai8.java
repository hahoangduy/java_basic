public class bai8 {
    public static void main(String[] args) {
        // gan cong
        int x = 8;
        x += 5; // x = x + 5 -> 8 + 5 = 13
        System.out.println("x = " + x);

        // gan tru
        int x1 = 3;
        x1 -= 1; // x1 = x1 - 1 -> 3 - 1 = 2
        System.out.println("x1 = " + x1);

        // gan nhan
        int x2 = 7;
        x2 *= 4; // x2 = x2 * 4 -> 7 * 4 =28
        System.out.println("x2 = " + x2);

        // gan chia
        int x3 = 15;
        x3 /= 3; // x3 = x3 / 3 -> 15 / 3 = 5
        System.out.println("x3 = " + x3);


        // so sanh
        int y1 = 6;
        int y2 = 10;
        System.out.println(y1 == y2); // so sanh bang nhau hay khong
        System.out.println(y1 != y2); // so sanh khac nhau hay khong
        System.out.println(y1 > y2); // so sanh co lon hon hay khong
        System.out.println(y1 < y2); // so sanh co nho hon hay khong
        System.out.println(y1 >= y2); // so sanh co lon hon hoac bang hay khong
        System.out.println(y1 <= y2); // so sanh co nho hon hoac bang hay khong

    }
}
