import java.util.Arrays;
import java.util.Scanner;

public class baitap11 {
    public static void main(String[] args) {
        /*Cho một mảng các số nguyên n phần tử arr được nhập từ bàn phím.
         Bạn hãy viết chương trình hiển thị ra phần tử lớn nhất trong mảng.
          Ví dụ nếu bạn nhập n = 5, arr = [2, 7, 6, 8, 9] thì sẽ trả kết quả ra là 9.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Moi ban nhap phan tu thu " + (i+1) + ":");
            int pt = sc.nextInt();
            mang[i] = pt;
        }
        System.out.println("Mang cua ban la: ");
        System.out.println(Arrays.toString(mang));
        Arrays.sort(mang);
        for (int i = 0; i < n; i++){
            if (i == (mang.length-1)) {
                System.out.println("So lon nhat trong mang cua ban la: " + mang[i]);
            }
        }
    }
}
