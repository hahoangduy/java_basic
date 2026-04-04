import java.util.Scanner;

public class baitap10 {
    /*public static void main(String[] args) {
        *//*Nhap so n nguyen duong
          Cho tu 1-n tim xem so do la so hoan hao hay la so nguyen to va in ra mh
          vd: n=6
          1 kh la so nt va kh la so hoan hao
          2 la so nt va kh la so hoan hao
          3 la so nt va kh la so hoan hao
          4 kh la so nt va kh la so hoan hao
          5 la so nt va kh la so hoan hao
          6 kh la so nt va la so hoan hao*//*
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 so nguyen duong n: ");
        int n = sc.nextInt();
        // tim so nguyen to
        int z = 6;
        while (z <= n) {
            int y = 0;
            *//*for (int i = 1; i <= z; i++) {
                if (z % i == 0)
                    y++;
                if (y == 2 && z < n) {
                    System.out.println(z + " khong la so nguyen to");
                    break;
                }
                if (y == 2) {
                    System.out.println(z + " la so nguyen to");
                    break;
                }
            }*//*
                // tim so hoan hao
                int tong = 0;
                for (int x = 1; x < z; x++) {
                    if (z % x == 0) {
                        tong += x;
                    }
                    if (tong == z) {
                        System.out.println(z + " la so hoan hao");
                        break;
                    }
                }
            z++;
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap 1 so n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            soNT(i);
            soHH(i);
        }
    }
    public static void soNT(int n) {
        int y = 0;
        for (int x = 1; x <= n; x++)
            if (n % x == 0)
                y++;

        if (y == 2)
            System.out.println(n + " la so nguyen to");
    }

    // số hoàn hảo
    public static void soHH(int n) {
        int s = 0;
        for (int z = 1; z < n; z++)
            if (n % z == 0)
                s += z;

        if (s == n)
            System.out.println(n + " la so hoan hao");
    }
}