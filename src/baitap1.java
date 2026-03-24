import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        /*
        Nhap so ngay va thang
        Kiem tra co hop le hay khong
        neu hop le -> hop le
        neu khong hop le -> khong hop le
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ngay: ");
        int ngay = sc.nextInt();
        System.out.println("Moi nhap thang: ");
        byte thang = sc.nextByte();
        /*
        if((ngay < 1 || ngay > 31) && (thang < 1 || thang > 12))
            System.out.println("Khong hop le");
        else if(ngay > 30 && ( thang == 4 || thang == 6 || thang == 9 || thang == 11))
            System.out.println("Khong hop le");
        else if(thang == 2 && ngay > 29)
            System.out.println("Khong hop le");
        else if ((ngay >= 1 && ngay <= 31) && (thang >= 1 && thang <= 12))
            System.out.println("Hop le");
        else
            System.out.println("Khong hop le");*/


        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (ngay >= 1 && ngay <= 31)
                    System.out.println("Hop le");
                else
                System.out.println("Khong hop le");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (ngay >= 1 && ngay <= 30)
                    System.out.println("Hop le");
                else
                    System.out.println("Khong hop le");
                break;
            case 2:
                if (ngay >= 1 && ngay <= 29)
                    System.out.println("Hop le");
                else
                    System.out.println("Khong hop le");
                break;
        }
    }
}