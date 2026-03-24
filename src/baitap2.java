import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        /*
        cho nhap 1 so n nguyen duong
        - tinh tong tu 1 -> n
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap 1 so n nguyen duong: ");
        int n = sc.nextInt();
        int x = 0;
        int tong = 0;
        while (x < n) {
            x++;
            tong += x;
            }
        System.out.println(tong);
    }
}
