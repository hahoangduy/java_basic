import java.util.Scanner;

public class bai21 {
    /*public static void main(String[] args) {
        int kq = Cong(1, 2 ,3);
        int kq1 = Cong(4, 5 ,6);
        System.out.println("Tong cac so la: " + kq);
        System.out.println("Tong cac so la: " + kq1);
        XinChao("Female");
        XinChao("Male");
        XinChao("fajfa");
    }
    public static int Cong(int x, int y, int z){ // ham tra ve ket qua phai co return
        return x + y + z;
    }

    // ham thu tuc
    public static void XinChao(String gioitinh){
        if (gioitinh.equals("Female"))
            System.out.println("Xin chao, toi la nhan vien nu");
        else if (gioitinh.equals("Male"))
            System.out.println("Xin chao, toi la nhan vien nam");
        else
            System.out.println("Khong hop le");
    }*/
/*    public static void main(String[] args) {
        *//*String kq = GiaiPTB2(1, 2, 3);
        String kq1 = GiaiPTB2(1, 2, 1);
        String kq2 = GiaiPTB2(1, 2, -3);
        System.out.println(kq);
        System.out.println(kq1);
        System.out.println(kq2);*//*

        // Cho nhap a, b, c
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so a");
        double a = sc.nextDouble();
        System.out.println("Moi nhap vao so b");
        double b = sc.nextDouble();
        System.out.println("Moi nhap vao so c");
        double c = sc.nextDouble();
        String kq3 = GiaiPTB2(a, b, c);
        System.out.println(kq3);
    }
    public static String GiaiPTB2(double a, double b, double c){
        // neu a = 0 thi pt tro thanh ptbn (bx+c=0)
        if (a == 0){
            if (b == 0 && c == 0)
                return "PT bac nhat vo so nghiem";
            else if (b == 0 && c != 0)
                return "PT bac nhat vo nghiem";
            else
                return "PT bac nhat co nghiem: " + (-c/b);
        }
        else {
            // giai PTB2
            double delta =(b*b) - (4*a*c);
            if (delta < 0)
                return "PT bac 2 vo nghiem";
            else if (delta == 0) {
                double x= -b / (2*a);
                return "PT bac 2 co nghiem kep x = " + x;
            }
            else {
                double x1 = (-b+Math.sqrt(delta)) / (2 * a);
                double x2 = (-b-Math.sqrt(delta)) / (2 * a);
                return "PT bac 2 co 2 nghiem phan biet x1 = " + x1 + "; x2 = " + x2;
            }
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so a: ");
        double a = sc.nextDouble();
        System.out.println("Moi nhap vao so b: ");
        double b = sc.nextDouble();
        System.out.println("Moi nhap vao phep tinh: ");
        Scanner scString = new Scanner(System.in);
        // Khai bao lai doi tuong Scanner vi khong the dung chung de gan gia tri so va String chung duoc
        String c = scString.nextLine();
        switch (c) {
            case "+":
                cong(a, b);
                break;
            case "-":
                tru(a, b);
                break;
            case "*":
                nhan(a, b);
                break;
            case "/":
                chia(a, b);
                break;
            default:
                System.out.println("Khong the thuc hien phep tinh");
        }
    }

    public static void cong(double a, double b){
        double kq = a + b;
        System.out.println("kq = " + kq);
    }
    public static void tru(double a, double b){
        double kq = a - b;
        System.out.println("kq = " + kq);
    }
    public static void nhan(double a, double b){
        double kq = a * b;
        System.out.println("kq = " + kq);
    }
    public static void chia(double a, double b){
        if (b == 0)
            System.out.println("Khong the thuc hien phep tinh");
        else {
            double kq = a / b;
            System.out.println("kq = " + kq);
        }
    }
}
