import java.util.*;

public class bai28_1 {
    public static void main(String[] args) {
        /* Bai 1:
           Viet chuong trinh tao ra 1 list co n phan tu, n nhap tu ban phim
           cac phan tu ngau nhien tu 1 - 100*/
        /*Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Moi nhap so pt: ");
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            int ngauNhien = rd.nextInt(1, 101);
            lst.add(ngauNhien);
        }
        System.out.println("List cua ban la: " + lst);*/

        /* Bai 2:
           Viet chuong trinh nhap vao 1 danh sach list co n pt
           n do nguoi dung nhap, sau do:
           1. Tao ra 1 list moi binh phuong cac phan tu
           2. Xac dinh bao nhieu phan tu lon hon 50
            */

        //1.
        /*Scanner sc1 = new Scanner(System.in);
        System.out.println("Moi nhap vao so luong phan tu: ");
        int n1 = sc1.nextInt();
        ArrayList<Integer> lst1 = new ArrayList<>(n1);
        for (int i = 0; i < n1; i++ ){
            System.out.println("Moi nhap vao gia tri cua index" + (i+1) + ":");
            int soNhap = sc1.nextInt();
            lst1.add(soNhap);
        }
        System.out.println("List cua ban la: " + lst1);
        ArrayList<Integer> bp = new ArrayList<>();
        for (int pt : lst1){
            bp.add(pt * pt);
        }
        System.out.println("List binh phuong cua list ban nhap la: " + bp);

        //2.
        int tong = 0;
        for (int so : lst1){
            if (so > 50)
                tong++;
        }
        System.out.println("So phan tu lon hon 50 la: " + tong);*/

        /* Bai 3:
           Viet chuong trinh tra loi ket qua cac phep tinh
           quest = {"2 + 5 +  7 = ", "5 * 10 = ", "sqrt(16) = ", "12 % 2 = "}
            */
        /*Scanner sc2 = new Scanner(System.in);
        ArrayList<String> cauHoi = new ArrayList<>(List.of("2 + 5 + 7 = ", "5 * 10 = ", "sqrt(16) = ", "12 % 2 = "));
        ArrayList<Integer> dapAn = new ArrayList<>(List.of(14, 50, 4, 6));
        for (int i = 0; i < cauHoi.size(); i++){
            System.out.println("Dap an cua " + cauHoi.get(i));
            int tloi = sc2.nextInt();
            if (tloi == dapAn.get(i)){
                System.out.println("Ban da tra loi dung");
            }
            else
                System.out.println("Ban da tra loi sai, dap an la " + dapAn.get(i));
        }*/

        /* Bai 4:
           Viet chuong trinh nhap vao 1 list co n phan tu ngau nhien,
           cac phan tu la so nguyen, n nhap tu ban phim
           1. in ra co bao nhieu so nho hon 80
           2. in ra vi tri index cua cac so do
            */
        /*Scanner sc3 = new Scanner(System.in);
        System.out.println("Moi nhap so phan tu: ");
        int n = sc3.nextInt();
        ArrayList<Integer> lst3 = new ArrayList<>(n);
        Random rd1 = new Random();
        int dem = 0;
        String viTri = " ";
        for (int i = 0; i < n; i++){
            int giu = rd1.nextInt(101);
            lst3.add(giu);
            if (lst3.get(i) < 80){
                dem++;
                viTri += i + " ";
            }
        }
        System.out.println("List cua ban la: " + lst3);
        if (dem == 0)
            System.out.println("Khong co so nao nho hon 80 het");
        else {
            System.out.println("So luong cac so nho hon 80 la: " + dem);
            System.out.println("Index cua cac so nho hon 80 la " + viTri);
        }*/

        /* Bai 5:
           Cho list lst = {1, 9, 3, 14, 5, 27, 8}
           1. Viet chuong trinh in so lon thu 2 va so nho thu 2 trong list
           2. In ra vi tri index cua so do
            */

        ArrayList<Integer> lst4 = new ArrayList<>(List.of(1, 9, 3, 14, 5, 27, 8));
        System.out.println(lst4);
        ArrayList<Integer> lst5 = new ArrayList<>(lst4); // tao 1 list moi nhung gia tri giong list cu
        Collections.sort(lst5); // sap xep
        int solonthu2 = lst5.get(lst5.size()-2);
        int sonhothu2 = lst5.get(1);
        System.out.println("So lon thu 2 trong list la: " + solonthu2);
        System.out.println("So nho thu 2 trong list la: " + sonhothu2);
        System.out.println("Vi tri index cua so nho thu 2 trong list la: " + lst4.indexOf(solonthu2));
        System.out.println("Vi tri index cua so nho thu 2 trong list la: " + lst4.indexOf(sonhothu2));
    }
}
