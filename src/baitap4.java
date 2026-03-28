import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        /*Nhap 1 so bat ki
          tinh tong tu 1 -> n
            nhung neu co so le thi tinh tong + giai thua cua so do
             n = 3 thi tong = 1! + 2 + 3! = 9*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so bat ki: ");
        int n = sc.nextInt();
        int tong = 0;
        int i = 1;
        while (i <= n){
            int giaiThua = 1;
            if (i % 2 == 0){
                tong += i;
            }
            else {
                for (int z = 1; z <= i; z++) {
                    giaiThua *= z;
                }
                tong += giaiThua;
            }
            i++;
        }
        System.out.println("Tong tu 1-" +n + " la: " + tong);



        /*while (i <= n){
            for (int t = 1; t <= n; t++){
                giaiThua *= i;
                while (t % 2 != 0) {
                    tong += giaiThua;
                    break;
                }
                while (t % 2 == 0){
                    tong += t;
                    break;
                }
                    i++;
            }
        }*/

    }
}
