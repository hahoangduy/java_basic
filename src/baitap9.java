import java.util.Scanner;

public class baitap9 {
    public static void main(String[] args) {
        /*
         Nhap so n nguyen duong
         tinh tong, neu tu 1-n co so chan thi tinh giai thua cua so do
         neu la so le thi tim giai thua va cong voi chinh no
         vd: n = 4
         1 la le -> giai thua cua 1 = 1, + 1 = 2
         2 la chan -> giai thua cua 2 = 2*1 = 2
         3 la le -> giai thua cua 3 = 3 * 2 * 1 = 6, +3 = 9
         4 la chan -> giai thua cua 4 = 4 * 3 * 2 * 1 = 24
         => tong = 2 + 2 + 9 + 24 = 37*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so nguyen duong n: ");
        int n = sc.nextInt();
        int tong = 0;
        /*for (int i = 1; i <= n; i++){
            int giaiThua = 1;
            for (int z = 1; z <= i; z++) {
                giaiThua *= z;
            }
                if (i % 2 == 0) {
                    tong += giaiThua;
                } else {
                    giaiThua += i;
                    tong += giaiThua;
                }
        }
        System.out.println(tong);*/
    }

}
