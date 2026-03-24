import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        /* Nhap so n nguyen duong
           xac dinh n la co phai la so nguyen to hay khong
           neu co -> co
           neu khong -> khong
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so n nguyen duong: ");
        int n = sc.nextInt();
        int x = 1;
        int y = 0;
        while (x <= n) {
            if (n % x == 0)
                y++;
            x++;
        }
        if (y == 2)
            System.out.println("La so nguyen to");
        else
            System.out.println("Khong phai la so nguyen to");
    }
}
