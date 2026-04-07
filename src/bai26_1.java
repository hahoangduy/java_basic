import java.util.Locale;
import java.util.Scanner;

public class bai26_1 {
    /*public static void main(String[] args) {

        // Bai 1
        *//* Cho String str1 = "English = 78 Science = 83 Math = 68 History = 65"
        1. tinh tong cac so trong chuoi tren
        2. tinh trung binh cong
         *//*

     *//*String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int tong = 0;
        int dem = 0;
        String[] mang = str1.split(" "); // tach chuoi thanh tung phan bang cach su dung split() cua lop String
        for (String pt : mang) { // duyet qua tung phan va chuyen no sang kieu so neu co the
            try {
                // chuyen chuoi sang so nguyen bang phuong thuc parseInt() cua lop Integer
                int so = Integer.parseInt(pt);
                tong += so;
                dem++;
            } catch (NumberFormatException ex) {
                // khong lam gi ca
            }
        }
        double tbc = (double) tong / dem;
        System.out.println("tong cua cac so trong chuoi la: " + tong);
        System.out.println("trung binh cong la: " + tbc);*//*

    //Bai 2
        *//*Viet chuong trinh kiem tra tinh hop le cua mat khau:aaaaaAAAAAA1
        * mat khau hop le khi co it nhat 6 ky tu
        * chua it nhat 1 chu cai( hoa hoac thuong deu duoc)
        * chua it nhat 1 so
         2. Cho nguoi dung nhap vao mk de login/ so sanh, neu dung mo, sai qua 5 lan, khoa tk, thoat chuong trinh*//*

    //1. moi thiet lap mk va kiem tra tinh hop le
    Scanner sc = new Scanner(System.in);
    String pw = "";
        while (true){
        System.out.println("Moi thiet lap mat khau");
        System.out.println("Mat khau co it nhat 6 ky tu, 1 chu cai, 1 so: ");
        String nPw = sc.nextLine();
        if (checkMK(nPw)){
            pw = nPw;
            System.out.println("Mau khau da duoc thiet lap.");
            break;
        }
        else
            System.out.println("Mat khau khong hop le, xin moi nhap lai: ");
    }

    //2. cho nguoi dung nhap mk de login
    int dem = 0;
    String login = "";
        while (true){
        System.out.println("Moi nhap mk: ");
        login = sc.nextLine();
        if (login.equals(pw)) {
            System.out.println("Ban da nhap dung mat khau.");
            break;
        }
        if (dem == 4){
            System.out.println("Ban da nhap sai 5 lan, tai khoan da bi khoa.");
            break;
        }
        else {
            System.out.println("Ban da nhap sai, xin moi nhap lai, ban con " + (4-dem) + " lan thu");
            dem++;
        }
        }
    }*/
    /*public static boolean checkMK(String pass){
        // kiem tra do dai
        if (pass.length() < 6)
            return false;
        // kiem tra xem co chu cai chua
        boolean chu = false;
        for (char c : pass.toCharArray()){
            if (Character.isLetter(c)){
                chu = true;
                break;
            }
        }
        if (chu == false)
            return false;
        //kiem tra xem co so chua
        boolean so = false;
        for (char s : pass.toCharArray()){
            if (Character.isDigit(s)){
                so = true;
                break;
            }
        }
        if (so == false)
            return false;
        // neu du do dai, co chu cai, co so
        return true;
    }*/

    public static void main(String[] args) {
        /*// Bai 3
        // Viet chuong trinh chuyen tin nhan sang mat ma theo bang:
        // #a= "abcdefghijklmnopqrstuvwxyz"
        // #b= "zxcvbnmasdfghjklqwertyuiop"
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 chuoi chu cai: ");
        String nhap = sc.nextLine();
        String luu = "";
        for (int i = 0; i < nhap.length(); i++){
            char c = nhap.charAt(i); // lay tung ky tu cua nguoi dung nhap tu ban phim
            int index = a.indexOf(c); // Tim vi tri cua ky tu trong bien a
            if (index == -1) {
                luu += c;
            }
            else {
                luu += b.charAt(index);
            }
        }
        System.out.println("Tin nhan da ma hoa la: " + luu);*/


        // Bai 4
        // String a = "toi cham hoc toi chiu kho toi dep zai";
        // dem tu toi trong string a tren
        /*String a = "toi cham hoc toi chiu kho toi dep zai";
        System.out.println(a);
        int dem = 0;
        String[] tach = a.split(" ");
        for (String pt : tach){
            if (pt.equals("toi"))
                dem++;
        }
        System.out.println("co " + dem + " tu toi trong string tren");*/


        //Bai 5
        /* Viet chuong trinh tach so va chu tu chuoi nhap vao thanh 2 chuoi
        vd nhap vao: abc123 se tach va in ra thanh 2 chuoi abc va 123
        */
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap 1 chuoi ky tu: ");
        String nhap = sc.nextLine();
        String luuChu = "";
        String luuSo = "";
        for (char c : nhap.toCharArray()){
            if (Character.isLetter(c))
                luuChu += c;
            if (Character.isDigit(c))
                luuSo +=c;
        }
        System.out.println("Chuoi chu cai la: " + luuChu);
        System.out.println("Chuoi so la: " + luuSo);*/


        // Bai 6
        /* Viet chuong trinh trich loc string tu duong dan D:/galailaptrinh/music/remix.mp3
        1. tach ten tep bao gom ca duoi: remix.mp3
        2. tach ten file remix
          */

        /*
        Cach 1:
        String duongDan = "D:/galailaptrinh/music/remix.mp3";
        String luu1 = "remix.mp3";
        String luu2 = "remix";
        boolean check = duongDan.contains(luu1);
        if (check)
            System.out.println("remix.mp3");
        boolean check1 = duongDan.contains(luu2);
        if (check1)
            System.out.println("remix");


        Cach 2:
        String duongDan = "D:/galailaptrinh/music/remix.mp3";
        int dauCuoicung = duongDan.lastIndexOf('/');
        String tenFile = duongDan.substring(dauCuoicung + 1)
        System.out.println(tenFile);

        //
        int dauChamcuoi = tenFile.lastIndexOf('.')
        String ten = tenFile.substring(0, dauChamcuoi);
        System.out.println(ten);
            */

        // Bai 7
        /* Viet chuong trinh kiem tra 1 chuoi nhap tu ban phim co phai Panlyndrome (la chuoi co the dao nguoc cung bang chinh no
        vd: madam, radar ...)
        *//*
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap 1 chuoi ky tu: ");
        String a = sc.nextLine();
        String sd = new StringBuilder(a).reverse().toString();
        if (sd.equals(a))
            System.out.println("Chuoi cua ban la chuoi Panlyndrome.");
        else
            System.out.println("Khong phai la chuoi Panlyndrome");*/


        // Bai 8
        /* Nhap vao 1 chuoi -> toi uu hoa chuoi theo quy tac
        1. khong co khoang trang du thua
        2. cac tu cach nhau boi 1 khoang trang
        3. ky tu dau tien cua moi tu phai duoc viet hoa, chu cai phia sau viet thuong
        vd: input: "   Ga laI LAp    TRinH   "
            output: "Ga Lai Lap Trinh"
            */

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 chuoi: ");
        String input = sc.nextLine();
        String o = chuan(input);
        System.out.println(o);
    }

    /*public static String chuanHoa(String a){
        String luu = "";
        String[] tach = a.split(" ");
        for (int i = 0; i < tach.length; i++){
            String k = tach[i];
            if (k.equals(""))
                continue;
            int indexk = 0;
            for (char k1 : k.toCharArray()){
                String t = "";
                t += k1;
                if (indexk == 0){
                   String t1 = t.toUpperCase();
                    indexk++;
                    luu += t1;
                }
                else {
                   String t2 = t.toLowerCase();
                    luu += t2;
                }
            }
            luu += " ";
        }
        return luu;
    }*/

    public static String chuan(String input){
        input = input.trim();
        String[] words = input.split("\\s+");
        for (int i = 0; i < words.length; i++){
            words[i] = words[i].toLowerCase();
            String firstChar = words[i].substring(0,1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        return String.join(" ", words); // noi tat ca cac phan tu lai
    }
}

