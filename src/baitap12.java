import java.util.Arrays;
import java.util.Scanner;

public class baitap12 {
    public static void main(String[] args) {
        /*Viết chương trình nhập vào một mảng số nguyên có n phần tử và thực hiện các công việc sau:
          1. Xuất giá trị các phần tử của mảng.
          2. Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
          3. Đếm số phần tử là số chẵn.
          4. Sắp xếp mảng tăng dần.
         */

        //1.
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Moi nhap vao phan tu thu " + (i+1) + " cua mang:");
            int pt = sc.nextInt();
            mang[i] = pt;
        }
        System.out.println("1: Mang cua ban la: ");
        System.out.println(Arrays.toString(mang));

        //2.
        for (int i = 0; i < n; i++){
            if (i == 0)
                System.out.println("2.1: So nho nhat trong mang la: " + mang[i]);
            else if (i == (mang.length - 1))
                System.out.println("2.2: So lon nhat trong mang la: " + mang[i]);
        }

        //3.
        int dem = 0;
        for (int pt : mang){
            if (pt % 2 == 0)
                dem++;
        }
        System.out.println("3: Co " + dem + " so chan trong mang.");

        //4.
        Arrays.sort(mang);
        System.out.println("4: Mang sau khi sap xep tang dan la: ");
        System.out.println(Arrays.toString(mang));
    }
}
