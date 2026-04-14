import java.util.Arrays;
import java.util.Scanner;

public class baitap13 {
    public static void main(String[] args) {
        /*Cho một mảng các số nguyên n phần tử arr được nhập từ bàn phím.
         Bạn hãy viết chương trình hiển thị ra phần tử khác biệt trong mảng đó.
         Vd: arr=[1,1,2,1,1] => hiện ra 2.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Moi ban nhap phan tu thu " + (i+1) + " cua mang: ");
            int pt = sc.nextInt();
            mang[i] = pt;
        }
        System.out.println("Mang cua ban la: ");
        System.out.println(Arrays.toString(mang));
        for (int i = 0; i < n; i++){
            if (mang[0] != mang[1]) {
                System.out.println(mang[i] + " la so khac biet");
                break;
            }
            if (mang[i] != mang[i+1]) {
                System.out.println(mang[i+1] + " la so khac biet");
                break;
            }
        }
    }
}
