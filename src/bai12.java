import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);

        // kiem tra chan le
        System.out.println("Moi ban nhap so: ");
        int n = sc.nextInt();
        String traloi = (n % 2 == 0) ? "chan" : "le";
        System.out.println("So vua nhap la so " + traloi);


        System.out.println("Moi ban nhap tuoi: ");
        int tuoi = sc.nextInt();
        String traloi1 = (tuoi >= 18) ? "da du tuoi" : "chua du tuoi";
        System.out.println("Ban " + traloi1);
        */

        // Bai tap
        /*Scanner sc1 = new Scanner(System.in);
        System.out.println("Moi ban nhap diem: ");
        float diem = sc1.nextFloat();
        String traloi2 = (diem >= 8) ? "Ban xep loai gioi" :
                ((diem < 8 && diem >= 6.5) ? "Ban xep loai kha" : ((diem < 6.5 && diem > 5) ? "Ban xep loai trung binh" : "Ban xep loai yeu"));
        System.out.println(traloi2);*/


        // Bai 2
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Moi nhap can nang: ");
        int kg = sc2.nextInt();
        String nang = (kg <= 30) ? "Ban qua gay" :
                ((kg < 50 && kg >= 31) ? "Ban gay ":(kg < 70 && kg >= 50) ? "Ban can doi" : " Ban thua can");
        System.out.println(nang);
    }
}
