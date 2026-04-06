import java.util.Scanner;

public class bai25 {
    public static void main(String[] args) {
        /*// khai bao ( khong co gia tri)
        char ch3;
        // khoi tao ( co gia tri)
        char ch = 'a';
        // char ch1 = "a"; loi vi khong the dung ""; chi co the dung ''
        char ch2 = 66; // bang ma ASCII
        System.out.println(ch2);
        System.out.println(ch);

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 ky tu: ");
        String s = sc.nextLine();
        char ch4 = s.charAt(0);
        System.out.println("Ky tu vua nhap la : " + ch4);*/


        // so sanh 2 ky tu
        System.out.println(Character.compare('b', 'b')); // 2 ky tu giong nhau se tra kq = 0
        System.out.println(Character.compare('a', 'b')); // ky tu dung truoc nho hon ky tu dung sau trong bang ASCII se tra kq am
        System.out.println(Character.compare('c', 'b')); // ky tu dung truoc lon hon ky tu dung sau trong bang ASCII se tra kq duong


        char ch5 = '1';
        char ch6 = 's';
        char ch7 = 'S';
        char ch8 = ' ';
        System.out.println(Character.isDigit(ch5)); // kiem tra xem co phai la so hay kh
        System.out.println(Character.isLetter(ch6)); // kiem tra xem co phai la chu hay kh
        System.out.println(Character.isLowerCase(ch6)); // kiem tra xem co phai la chu thuong hay kh
        System.out.println(Character.isUpperCase(ch7)); // kiem tra xem co phai la chu viet hoa hay kh
        System.out.println(Character.isSpaceChar(ch8)); // kiem tra xem co phai la ky tu khoang cach hay kh
        // dung thi tra kq true, sai tra kq false
    }
}
