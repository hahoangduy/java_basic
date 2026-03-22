import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        // khoi tao doi tuong scanner
        Scanner sc = new Scanner(System.in); // co dinh

        /*// cho phep nhap chuoi
        System.out.println("Moi nhap mat khau vao: ");
        String mk1 = sc.nextLine();
        System.out.println("Mat khau la: " + mk1);

        // nhap so nguyen
        System.out.println("Moi nhap vao 1 so nguyen a: ");
        int a = sc.nextInt(); // sc.nextInt/Long/Byte ( tuy vao dat bien gi )
        System.out.println("So nguyen a la: " + a);

        // nhap so thap phan
        System.out.println("Moi nhap vao 1 so thap phan b: ");
        float b = sc.nextFloat();
        System.out.println("So thap phan b la: " + b); // nhap so co dau "," chuong trinh se bao sai, phai dung "."*/

        // nhap chuoi
        /*
        new Scanner(System.in).next...() la de lap lai lenh nhap chuoi nhieu lan ma khong bi loi
        nhung lenh o dong code tren neu dat lenh nhap chuoi them 1 lan nua may se bao loi
        */

        // nhap chuoi
        System.out.println("Moi nhap ten vao: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("Ho va ten la: " + ten);

        // nhap double
        System.out.println("Moi nhap chieu cao vao: ");
        Double chieucao = new Scanner(System.in).nextDouble();
        System.out.println("Chieu cao la: " + chieucao);

        // nhap byte
        System.out.println("Moi nhap can nang vao: ");
        Byte cannang = new Scanner(System.in).nextByte();
        System.out.println("Can nang la: " + cannang);

        // nhap chuoi
        System.out.println("Moi nhap tuoi vao: ");
        Byte tuoi = new Scanner(System.in).nextByte();
        System.out.println("Tuoi la: " + tuoi);



        // tinh chu vi, dien tich
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Moi nhap vao ban kinh duong tron: ");
        double r = sc1.nextDouble();
        double cv = 2 * Math.PI * r; // tinh chu vi hinh tron (Math.PI la so pi)
        double dt = Math.PI * Math.pow(r,2); // tinh dien tich hinh tron
        System.out.println("Chu vi la: " + cv);
        System.out.println("Dien tich la: " + dt);

    }
}
