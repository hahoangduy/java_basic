import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        /* Cho so n nguyen duong
         tinh tong cac so nguyen to tu 1-n
         vd: n = 6 -> tong = 2 + 3 + 5 = 10*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so n nguyen duong: ");
        int n = sc.nextInt();
        int tong = 0;
        int x = 1;
        if (n <= 0)
            System.out.println("Nhap sai");
        while (x <= n){
            int y = 0;
            for (int z = 1; z <= x ; z++){
                if (x % z == 0)
                    y++;
            }
            if (y == 2)
                tong += x;
            x++;
        }
        System.out.println(tong);
    }
}
