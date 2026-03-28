import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        /* Nhap so n
        tim cac so hoan hao
        tra ra cac so hoan hao */

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap 1 so n: ");
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= n/2; i++){
            if (n % i == 0)
                tong += i;
        }
        if (tong == n)
            System.out.println(n + " la so hoan hao");
        else
            System.out.println(n + " khong phai la so hoan hao");*/


        Scanner sc1 = new Scanner(System.in);
        System.out.println("Moi nhap 1 so n: ");
        int n = sc1.nextInt();
        for (int z = 1; z < n; z++){

            int tong = 0;
            for (int i = 1; i < z; i++){
                if (z % i == 0) {
                    tong += i;
                }
            }
            if (tong == z) {
                System.out.println(z);
            }
        }
    }
}
