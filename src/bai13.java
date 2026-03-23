import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap 1 so: ");

        // kiem tra chia het cho 2 khong
        int a = sc.nextInt();
        int so = a % 2;
        switch (so)
        {
            case 0:
                System.out.println(a + " la so chan");
                break;
            default:
                System.out.println(a + " la so le");
                break;
        }

        System.out.println("Moi nhap 1 thang: ");
        byte thang = sc.nextByte();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(thang + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(thang + " co 30 ngay");
                break;
            case 2:
                System.out.println(thang + " co 28 hoac 29 ngay");
                break;
        }*/


        // Bai tap
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Moi bam so de chon: ");
        System.out.println("1. Tim theo ten");
        System.out.println("2. Tim theo tac gia");
        System.out.println("3. Tim theo nha xuat ban");
        System.out.println("4. Tim theo tieu de");
        byte bam = sc1.nextByte();
        switch (bam){
            case 1:
                System.out.println("Tim theo ten");
                break;
            case 2:
                System.out.println("Tim theo tac gia");
                break;
            case 3:
                System.out.println("Tim theo nha xuat ban");
                break;
            case 4:
                System.out.println("Tim theo tieu de");
                break;
            default:
                System.out.println("Phim bam khong hop le");
                break;
        }
        
    }
}
