import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class bai26 {
    public static void main(String[] args) {
String s = "abcdef" +
                "\n123456";
        System.out.println(s);
        // khai bao doi tuong chuoi
        StringBuilder sd = new StringBuilder();
        // cac phuong thuc thuong dung
        // 1. append: Them vao cuoi chuoi
        sd.append("Xin chao, ");
        sd.append("minh moi hoc lap trinh ");
        System.out.println(sd);

        // 2. insert ( vi tri index, chuoi can chen) -> chen chuoi vao sau vi tri index mong muon
        sd.insert(10, "Hello");
        System.out.println(sd);

        // 3. delete( start, end) -> xoa tat ca cac ky tu tu vi tri start den vi tri end-1
        sd.delete(1, 8); // xoa tu 2 -> 7
        System.out.println(sd);

        // 4. length: tra ve do dai cua chuoi tinh ca space
        System.out.println(sd.length());

        // 5. IndexOf: Kiem tra vi tri xuat hien dau tien cua ky tu hoac chuoi
        // tra ve -1 neu khong tim thay
        String s1 = "Toi di tim toi";
        System.out.println(s1.indexOf("toi"));

        // 6. lastIndexOf: tra ve vi tri index xuat hien cuoi cung cua ky tu hoac chuoi
        // tra ve -1 neu khong tim thay
        System.out.println(s1.lastIndexOf("di"));

        // 7. contains: kiem tra chuoi con
        String s3 = ".mp3";
        String s4 = "tuhoc.mp3";
        boolean check = s4.contains(s3);
        if (check)
            System.out.println("Co .mp3 trong chuoi");
        else
            System.out.println("Khong tim thay .mp3 trong chuoi");

        // 8. Substring : trich loc chuoi con tu chuoi ban dau
        // substring(int beginIndex)
        // substring(int beginIndex, int endIndex)
        String s5 = "abcdefgh";
        String s6 = s5.substring(3); // lay tu index t3 den het
        String s7 = s5.substring(3, 6); // lay tu index t3 den index t5
        System.out.println(s6);
        System.out.println(s7);

        // 9. replace ("str old", "str new") thay the toan bo chuoi old bang chuoi new
        String s8 = "hoc, hoc nua, hoc mai";
        String s9 = s8.replace("hoc", "ngu");
        System.out.println(s8);
        System.out.println(s9);

        // 10. replaceFirst ("str old", "str new") thay the chuoi old dau tien duoc tim thay bang chuoi new
        String s11 = s8.replaceFirst("hoc", "ngu");
        System.out.println(s11);

        // 11. strim(): xoa toan bo khoang trang o dau va cuoi
        String s12 = "          Ha Hoang Duy             ";
        String s13 = s12.trim();
        System.out.println(s12);
        System.out.println(s13);

        //12. Xoa toan bo khoang trang o cuoi
        // cach 1: bieu thuc chinh quy (regular expression)
        // dung /s+$ de xoa tat ca khoang trang o cuoi chuoi
        String s14 = s12.replaceAll("\\s+$", ""); // dau "/" la ky tu dac biet nen phai dung "//"
        // \s: 1 ky tu khoang trang
        // \s+: nhieu ky tu khoang trang
        // $: dai dien cho truoc khi key thuc chuoi
        System.out.println(s14);

        // cach 2: xoa khoang trang o cuoi chuoi bang vong lap
        while (s12.endsWith(" ")){
            s12 = s12.substring(0, s12.length()-1);
        }
        System.out.println(s12);

        // 13.  Xoa toan bo khoang trang o dau
        // cach 1: bieu thuc chinh quy (regular expression)
        String s15 = "          Toi la Duy       ";
        String s16 = s15.replaceFirst("^\\s+", "");
        // ^: dai dien cho dau chuoi
        System.out.println(s15);
        System.out.println(s16);

        // cach 2: xoa khoang trang o dau chuoi bang vong lap
        String s17 = "          Toi la Duy       ";
        while (s17.startsWith(" ")){
            s17 = s17.substring(1);
        }
        System.out.println(s17);

        // 14. compareTo, compareToIgnoreCase: so sanh 2 chuoi
        // = nhau -> 0
        // lon hon -> > 0
        // nho hon -> < 0
        // compareToIgnoreCase: Bo qua phan biet hoa, thuong
        String s18 = "abc123456";
        String s19 = "abc123456";
        int x = s18.compareTo(s19);
        System.out.println("x = " + x);

        String s20 = "Abc123456";
        String s21 = "abc123456";
        int x1 = s20.compareTo(s21); // vi "A" nho hon "a" nen s21 - s20 = 65 - 97 = -32 (bang ma ASCII)
        System.out.println("x1 = " + x1);

        String s22 = "abc123456";
        String s23 = "Abc123456";
        int x2 = s22.compareTo(s23); // vi "a" lon hon "A" nen s21 - s20 = 97 - 65 = 32 (bang ma ASCII)
        System.out.println("x2 = " + x2);

        String s24 = "Abc123456";
        String s25 = "abc123456";
        int x3 = s24.compareToIgnoreCase(s25); // khong phan biet viet hoa hay viet thuong nen 2 chuoi bang nhau -> 0
        System.out.println("x3 = " + x3);

        // 15. Noi chuoi(cong chuoi)
        // cach 1: cong kieu don gian
        String s26 = "Hom nay";
        String s27 = s26 + " troi mua";
        System.out.println(s27);

        // cach 2: Noi chuoi su dung StringBuilder
        //khoi tao
        StringBuilder s28 = new StringBuilder();

        // insert chen vao chuoi
        StringBuilder s29 = new StringBuilder("12345678");
        s29 = s29.insert(2, "Duy");
        System.out.println(s29);

        // append: them vao cuoi cung
        StringBuilder s30 = new StringBuilder("1234");
        s30 = s30.append("Duy ne");
        System.out.println(s30);

        // xoa tu start den end-1
        StringBuilder s31 = new StringBuilder("12391247");
        s31.delete(0, 3); // xoa tu index 0 -> index 2
        System.out.println(s31);

        // dao nguoc chuoi
        StringBuilder s32 = new StringBuilder("123456789");
        s32 = s32.reverse();
        System.out.println(s32);

        // 17. split: tach chuoi
        String s33 = "Hello, world";
        String[] mang = s33.split(", ");
        // duyet mang
        for (int z = 0; z < mang.length; z++){
            System.out.println(mang[z]);
        }

        // 18. toLowerCase() & toUpperCase()
        String s34 = "Toi Hoc lAp trInh treN maNg";
        String s35 = s34.toLowerCase(); // chuyen tat ca cac ky tu qua chu thuong
        System.out.println(s35);

        String s36 = s34.toUpperCase(); // chuyen tat ca cac ky tu qua chu hoa
        System.out.println(s36);

        // 19. toCharArray(): tach chuoi thanh tung ky tu, cho vao mang
        String s37 = "Hello, World";
        char[] mang1 = s37.toCharArray();
        for (int i = 0; i < mang1.length; i++){
            System.out.println(mang1[i]);
        }




        // vi du van dung

            /*nhap 1 chuoi ky tu
           dem xem co bao nhieu ky tu in hoa
           co bao nhieu ky tu thuong
           co bao nhieu ky tu so
           co bao nhieu ky khoang trang*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 chuoi ky tu: ");
        String n = sc.nextLine();
        int demInthuong = 0;// bien dem
        int demInhoa = 0;// bien dem
        int demSo = 0;// bien dem
        int demKhoangtrang = 0;// bien dem
        for (int i = 0; i < n.length(); i++){
            char c = n.charAt(i);
            if (Character.isLowerCase(c))
                demInthuong++;
            else if (Character.isUpperCase(c))
                demInhoa++;
            else if (Character.isDigit(c))
                demSo++;
            else if (Character.isWhitespace(c))
                demKhoangtrang++;
        }
        System.out.println("So luong ky tu thuong la: " + demInthuong);
        System.out.println("So luong ky tu in hoa la: " + demInhoa);
        System.out.println("So luong ky tu so la: " + demSo);
        System.out.println("So luong ky tu khoang trang la: " + demKhoangtrang);
    }

}
