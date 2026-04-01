import java.util.Calendar;
import java.util.Scanner;

public class bai22 {
    public static void main(String[] args) {/*
        Calendar cal = Calendar.getInstance();
        *//*System.out.println(cal);
        // lay ngay, thang, nam
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang + 1); // thang chay tu 0-11, nen muon thuc te thi thang + 1
        System.out.println(ngay);*//*

        //set ngay, thang, nam theo y muon
        cal.set(Calendar.YEAR, 2007);
        cal.set(Calendar.MONTH, 7);
        cal.set(Calendar.DAY_OF_MONTH, 26);
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngay, thang, nam sinh: "
                +ngaySinh+ "/"
                +thangSinh+1+ "/"
                +namSinh);


        // Xuat theo dinh dang
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh/mm/ss a");
        // tao 1 doi tuong date de get time trong doi tuong cal
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);*/




        // Bai tap vi du
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao ngay: ");
        int day = sc.nextInt();
        System.out.println("Moi nhap vao thang: ");
        int month = sc.nextInt();
        System.out.println("Moi nhap vao nam: ");
        int year = sc.nextInt();
        Calendar sn = Calendar.getInstance(); // goi bien Calendar
        sn.set(year, month - 1, day); // gan gia tri do nguoi dung nhap cho year, month, day
        int namSinh = sn.get(Calendar.YEAR); // lay du lieu nam tu may tinh
        int thangSinh = sn.get(Calendar.MONTH); // lay du lieu thang tu may tinh
        int ngaySinh = sn.get(Calendar.DAY_OF_MONTH); // lay du lieu ngay tu may tinh
        System.out.println("Ngay, thang, nam sinh la: "
               +ngaySinh + "/"
               +(thangSinh+1) + "/"
               +namSinh);
        Calendar now = Calendar.getInstance(); // nam hien tai
        int namHientai = now.get(Calendar.YEAR);
        int tuoi = namHientai - namSinh;
        System.out.println("Tuoi cua ban la: " + tuoi);
    }
}
