import java.sql.SQLOutput;
import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap diem: ");
        float diem = sc.nextFloat();
        *//*if (diem >= 5){
            System.out.println("Ban da do");
            System.out.println("Chuc mung ban");
        }
        // khi trong if chi co 1 cau lenh thi khong can dung "{}"
        else
            System.out.println("Ban da truot"); // else co the co hoac khong*//*

        // if else-if else khi co nhieu dieu kien
        if (diem <= 10 && diem >= 8)
            System.out.println("Ban xep loai gioi");
        else if (diem < 8 && diem >= 6.5)
            System.out.println("Ban sep loai kha");
        else if (diem < 6.5 && diem >= 4)
            System.out.println("Ban xep loai trung binh");
        else
            System.out.println("Ban xep loai yeu");*/



        // Bai tap
        // Bai 1:
        /*Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhap tong 2 so: ");
        double tong = sc1.nextDouble();
        System.out.println("Nhap hieu 2 so: ");
        double hieu = sc1.nextDouble();
        double x = (tong + hieu) /2;
        double y = tong - x;
        System.out.println("x la: " + x);
        System.out.println("y la: " + y);*/

        // Bai 2:
        /*Scanner sc2 = new Scanner(System.in);
        System.out.println("Moi nhap can nang: ");
        int nang = sc2.nextInt();
        System.out.println("Moi nhap chieu cao: ");
        double cao = sc2.nextDouble();
        double BMI = nang / Math.pow(cao,2);
        if (BMI < 15 )
            System.out.println("Than hinh qua gay");
        else if (BMI >= 15 && BMI <16) {
            System.out.println("Than hinh gay");
        }
        else if (BMI >= 16 && BMI < 18.5){
            System.out.println("Than hinh hoi gay");
        }
        else if(BMI >= 18.5 && BMI < 25){
            System.out.println("Than hinh binh thuong");
        }
        else if (BMI >= 25 && BMI < 30){
            System.out.println("Than hinh hoi beo");
        }
        else if (BMI >= 30 && BMI < 35) {
            System.out.println("Than hinh beo");
        }
        else if (BMI >= 35) {
            System.out.println("Beo phi");
        }*/


        // Bai 3
        /*Scanner sc4 = new Scanner(System.in);
        System.out.println("Moi nhap nam: ");
        int nam = sc4.nextInt();
        if (nam % 4 == 0 && nam % 100 != 0)
            System.out.println("Nam nay la nam nhuan");
        else
            System.out.println("Nam nay khong phai la nam nhuan");*/


        // Bai 4
        /*Scanner sc5 = new Scanner(System.in);
        System.out.println("Moi nhap thang: ");
        byte thang = sc5.nextByte();
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12)
        System.out.println("Thang nay co 31 ngay");
        else if (thang == 4 || thang == 6 || thang == 9 || thang == 11)
            System.out.println("Thang nay co 30 ngay");
        else if (thang == 2)
            System.out.println("Vui long nhap nam: ");
            int nam = sc5.nextInt();
        if (nam % 4 == 0 && nam % 100 != 0)
            System.out.println("Thang 2 nam " + nam + " co 29 ngay ");
        else
            System.out.println("Thang 2 nam " + nam + " co 28 ngay");*/


        // Bai 5
        /*Scanner sc6 = new Scanner(System.in);
        System.out.println("Moi nhap thang: ");
        byte thang1 = sc6.nextByte();
        if (thang1 == 1 || thang1 == 2 || thang1 == 3)
            System.out.println("Day la Quy 1");
        else if (thang1 == 4 || thang1 == 5 || thang1 == 6)
            System.out.println("Day la Quy 2");
        else if (thang1 == 7 || thang1 == 8 || thang1 == 9)
            System.out.println("Day la Quy 3");
        else if (thang1 == 10 || thang1 == 11 || thang1 == 12)
            System.out.println("Day la Quy 4");*/


        // Bai 6
        Scanner sc7 = new Scanner(System.in);
        System.out.println("Moi nhap so a: ");
        double a = sc7.nextDouble();
        System.out.println("Moi nhap so b: ");
        double b = sc7.nextDouble();
        System.out.println("Moi nhap so c: ");
        double c = sc7.nextDouble();
        // tinh delta
        double delta = Math.pow(b,2) - (4*a*c); // cong thuc tinh delta = b^2 - 4*a*c
        if (delta < 0)
            System.out.println("PT vo nghiem");
        else if (delta == 0){
            double x = -b / (2 * a);
            System.out.println("PT co nghiem kep x1 = x2 = " + x);
        }
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("PT co 2 nghiem phan biet: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

    }
}