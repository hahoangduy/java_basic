import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        int x = 0;
        while (x <= 10){
            System.out.println("x = " + x);
            x++;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 so tu 1-99: ");
        int n = sc.nextInt();
        while (n < 1 || n > 99){
            System.out.println("Ban nhap sai, vui long nhap theo yeu cau");
            n = sc.nextInt();
        }
        System.out.println("So cua ban la: " + n);
    }
}
