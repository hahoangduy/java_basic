import java.util.Random;

public class bai24 {
    public static void main(String[] args) {
        // khoi tao 1 doi tuong ngau nhien
        Random rd = new Random();

        // 1.Lay ngau nhien 1 so nguyen
        int soNguyen = rd.nextInt(-50, 51); // chay tu -50 - 50
        int soNguyen1 = rd.nextInt( 51); // chay tu 0 - 50
        System.out.println(soNguyen);
        System.out.println(soNguyen1);

        // 2.Lay ngau nhien 1 so thuc
        double soThuc = rd.nextDouble(-100, 100); // chay tu -100 - 99
        double soThuc1 = rd.nextDouble( 100); // chay tu 0 - 99
        System.out.println(soThuc);
        System.out.println(soThuc1);
    }
}
