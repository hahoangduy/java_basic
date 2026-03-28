import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        /*// tinh tong tu 1 -> 5 nhung bo qua so 3 (continue)
        int tong = 0;
        for (int x = 0; x <= 5; x++){
            if (x == 3)
                continue; // dung de bo qua 1 hoac nhieu gia tri
            tong += x;
        }
        System.out.println("tong = " + tong);

        // break
        int i = 0;
        while (i < 100){
            System.out.println("i = " + i);
            if (i == 20)
                break;
            i++;*/



        // bai 1

        // for
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen n: ");
        int n = sc.nextInt();
        int giaiThua = 1;
        *//*for (int x = 1; x <= n; x++){
            giaiThua *= x;
        }
        System.out.println(n + "! = " + giaiThua);*//*

        //while

        int i = 1;
        while (i <= n){
            giaiThua *= i;
            i++;
        }
        System.out.println(n + "! = " + giaiThua);*/


        // Bai 2
        /*Scanner sc1 = new Scanner(System.in);
        System.out.println("Moi nhap so chan a: ");
        int a = sc1.nextInt();
        int tong = 0;
        if (a % 2 == 0){
            for (int i = 0; i <= a; i++){
                if (i % 2 == 0)
                    tong += i;
                else
                    continue;
            }
            System.out.println("Tong = " + tong);
        }else
            System.out.println("Toi khong tinh so le");*/



        // Bai 3
        /*Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhap 1 so le: ");
        int n = 0;
        n = sc2.nextInt();
        int tong = 0;
        if (n % 2 != 0){
            for (int i = 0; i <= n; i++){
                if (i == 3)
                    continue;
                if (i % 2 != 0)
                    tong += i;
            }
            System.out.println("Tong = " + tong);
        }*/
/*
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhap 1 so le: ");
        int n = sc2.nextInt();
        int tong = 0;
        if (n % 2 != 0){
            for (int i = 0; i <= n; i++){
                if (i % 2 != 0){
                    tong += i;
                }
            }
            System.out.println("Tong cac so le tu 0 - " + n + " la: " + tong);
        }
        else
            System.out.println("Khong tinh so chan");*/

        // Bai 4
        /*Scanner sc3 = new Scanner(System.in);
        System.out.println("Nhap 1 so a tu 10-50: ");
        int x = sc3.nextInt();
        if (x >= 10 && x <= 50) {
            for (int z = 10; z <= x; z++) {
                if (z % 3 == 0) {
                    System.out.println(z + " co the chia het cho 3");
                } else
                    continue;
            }
        }
        else
            System.out.println("Nhap sai");*/


        // Bai 5
       /* int s = 1;
        int tong = 0;
        int giaiThua1 = 1;
        while (s <= 4){
            giaiThua1 *= s;
            tong += giaiThua1;
            s++;
        }
        System.out.println("Tong = " + tong);*/

        /*int i = 1;
        int tong = 0;
        while (i <= 4){
            int giaiThua1 = 1;
            for (int z = 1; z <= i; z++){
                giaiThua1 *= z;
            }
            tong += giaiThua1;
            i++;
        }
        System.out.println("Tong = " + tong);*/


        // Bai 6
        System.out.println("các số hoàn hảo từ 1- 1000 là: ");
        for(int i=1;i<=1000;i++) {
            int tong=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0) {
                    tong+=j;
                }
            }
            if(tong==i) {
            System.out.println(i);
            }
        }
    }
}
