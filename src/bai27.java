import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
        //1. khai bao mang
        String[] mangStr;
        Float[] mangFl;
        Double[] mangDb;

        //2. khai bao kem theo kich thuoc
        String[] mangStr1 = new String[12]; // chua toi da duoc 12 phan tu
        int[] mangNguyen = new int[6]; // chua toi da duoc 6 phan tu

        //3. khoi tao mang kem theo gia tri ban dau
        String[] mangStr2 = new String[]{"Chi pheo","Thi no","Ong giao"};
        int[] mangNguyen1 = new int[]{1 ,2 ,3 ,4 ,5 ,6};

        //4. truy xuat phan tu cua mang qua vi tri index
        System.out.println(mangNguyen1[0]); // 1
        System.out.println(mangNguyen1[2]); // 3
        System.out.println(mangStr2[1]); // Thi no

        // test
        System.out.println(mangNguyen[0]); // null
        System.out.println(mangNguyen[1]); // null

        //5. length: tra ve so phan tu cua mang( chieu dai mang, bat dau tu 1)
        System.out.println("Chieu dai cua mangStr2 la: " + mangStr2.length);
        System.out.println("Chieu dai cua mangNguyen1 la: " + mangNguyen1.length);

        //6. duyet mang dung for
        //c1:
        int[] mangNguyen2 = new int[]{1 ,2 ,3 ,4 ,5 ,6 ,7 ,8};
        for (int pt : mangNguyen2){
            System.out.println(pt);
        }
        String[] mangStr3 = new String[]{"Duy","Hoang","Ha"};
        for (String pt1 : mangStr3){
            System.out.println(pt1);
        }

        //c2:
        for (int i = 0; i < mangNguyen2.length; i++){
            System.out.println(mangNguyen2[i]);
        }
        for (int i = 0; i <mangStr3.length; i++){
            System.out.println(mangStr3[i]);
        }

        //7. thay doi gia tri cho mang
        // thay doi theo index
        mangStr3[0] = "Toi la duy";
        System.out.println("MangStr3 sau khi thay doi la: ");
        for (int i = 0; i< mangStr3.length; i++){
            System.out.println(mangStr3[i]);
        }

        //update toan bo danh sach
        int[] mang1 = new int[]{1 ,2 ,3 ,4 ,5 ,6 ,7 ,8};
        for (int i = 0; i < mang1.length; i++){
            mang1[i] += 5;
            System.out.println(mang1[i]);
        }


        //8. vd: Viet chuong trinh tao 1 mang 1 chieu gom cac pt la so nguyen co n pt, n duoc nhap vao tu ban phim

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so pt toi da cua mang: ");
        int n = sc.nextInt();
        // tao mang co n phan tu (cap phat bo nho cho mang)
        int[] M = new int[n];
        // nhap du lieu cho tung phan tu
        for (int i = 0; i < M.length; i++){
            System.out.println("M["+i+"]= "); // M[0] = , M[1] = , ...
            M[i] = sc.nextInt();
        }
        // xuat mang
        System.out.println("Mang M duoc tao la: ");
        System.out.println(Arrays.toString(M)); // in phan tu cua mang*/

        //9. sap xep mang tang dan
        int[] mang2 = {8 , 9 ,12 , 76 , 129, 0, 21};
        Arrays.sort(mang2); // sap xep mang
        System.out.println("Mang sau duoc sap xep tang dan la: ");
        System.out.println(Arrays.toString(mang2));

        //10. dao nguoc mang
        for (int i = 0, j = mang2.length - 1; i < j; i++, j--){ // khoi tao bien neu co 2 bien tro len dung ","
            int tam = mang2[i]; // luu gia tri cua pt dau tien vao bien tam
            mang2[i] = mang2[j];
            mang2[j] = tam;
        }

        // xuat mang
        System.out.println("Mang sau khi dao duoc lai la: ");
        System.out.println(Arrays.toString(mang2));

        System.out.println("");
        System.out.println("");
        System.out.println("");
        //11. phep gan mang truy xuat cung vung nho
        int[] mang3 = {1, 4, 5, 6, 12, 2, 56};
        int[] mang4 = mang3;
        mang3[0] = 100;
        System.out.println(Arrays.toString(mang3));
        System.out.println(Arrays.toString(mang4));

        System.out.println("");
        System.out.println("");
        System.out.println("");

        //12. clone (khac vung nho)
        int[] mang5 = {1, 4, 5, 6, 12, 2, 56};
        int[] mang6 = mang5.clone();
        mang5[0] = 9;
        System.out.println(Arrays.toString(mang5));
        System.out.println(Arrays.toString(mang6));


        // bai tap:
        /* 1. Viet chuong trinh tao 1 mang 1 chieu gom cac phan tu la so nguyen, co n pt ngau nhien
        n do nguoi dung nhap vao
           2. Xuat cac gia tri trong mang
           3. Dao nguoc mang va xuat mang da dao nguoc
           4. Sap xep mang tang dan
           5. Tinh tong cac phan tu trong mang
           6. Cho nguoi dung nhap 1 so bat ki, kiem tra so do co trong mang khong
           neu co xuat ra vi tri index cua so do trong mang
            */

        //1.
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Moi nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < mang.length; i++){
            int z = rd.nextInt(101);
            mang[i] = z;
        }

        //2.
        System.out.println("Mang cua ban la: ");
        System.out.println(Arrays.toString(mang));

        //3.
        for (int i = 0, j = mang.length - 1; i < j; i++, j--){
            int luu = mang[i];
            mang[i] = mang[j];
            mang[j] = luu;
        }
        System.out.println("Mang sau khi dao nguoc la: ");
        System.out.println(Arrays.toString(mang));

        //4.
        Arrays.sort(mang);
        System.out.println("Mang sau khi sap xep tang dan la: ");
        System.out.println(Arrays.toString(mang));

        //5.
        int tong = 0;
        for (int pt : mang){
            tong += pt;
        }
        System.out.println("Tong cac phan tu trong mang la: " + tong);

        //6.
        //tu lam
        System.out.println("Moi ban nhap 1 so bat ky trong mang: ");
        int input = sc.nextInt();
        /*for (int i = 0; i < mang.length; i++) {
            if (input == mang[i]) {
                System.out.println("Index cua so ban vua nhap la: " + i);
                break;
            }
        }*/

        // loi giai
        boolean ktra = false;
        String vitri = "";
        for (int i = 0; i < mang.length; i++){
            if (mang[i] == input){
                ktra = true;
                vitri += (i + " ");
            }
        }
        if (ktra == true)
            System.out.println(input + " co ton tai trong mang voi vi tri index la: " + vitri);
        else
            System.out.println(input + " khong ton tai trong mang");
    }
}
