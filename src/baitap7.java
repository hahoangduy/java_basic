import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        /*1. Cho số nguyên dương n
         nếu từ 1 -> n có số nguyên tố thì tính giai thừa của số đó và cộng vào tổng
          Trả kết quả tổng giai thừa của các số nguyên tố từ 1 -> n.

        2. Cho số nguyên dương n
        đếm có bao nhiêu số từ 1 -> n
        nếu trong số đó có số chia hết cho 3 thì trừ đi 1 đơn vị
        ví dụ: n = 10, thì kết qủa là 4, vì 3,6,9 chia hết cho 3 nên 7 - 3 = 4, kết qủa cuối cùng là 4.*/


        // Bai 1
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen duong n: ");
        int n = sc.nextInt();
        int x = 1;
        int tong = 0;
        while (x <= n) {
            int giaiThua = 1;
            int y = 0;
            for (int q = 1; q <= x; q++) {
                if (x % q == 0)
                    y++;
            }
            if (y == 2) {
                for (int z = 1; z <= x; z++) {
                    giaiThua *= z;
                }
                tong += giaiThua;
            }
            x++;
        }
        System.out.println(tong);*/




        // Bai 2
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong n: ");
        int n = sc1.nextInt();
        int demSo = 0;
        for (int i = 1; i <= n; i++){
            if (i % 3 != 0)
                demSo += 1;
            else
                demSo -= 1;
        }
        System.out.println(demSo);
    }
}
