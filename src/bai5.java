public class bai5 {
    public static void main(String[] args) {

        // khai bao bien
        int a;
        byte tuoi;
        float diemToan;

        // khai bao nhieu bien 1 luc cung kieu
        int c,d,e,f;

        //khoi tao bien ( them gia tri cho bien)
        int tuoiCon = 10;
        /*
         float & double deu la so thap phan
         float 32-bit
         double 64-bit
        * */
        float diemVan = 7.5f; // bien float phai them "f" o sau khi gan gia tri cho bien
        double diemAnh = 7.5;

        System.out.println("tuoi Con khi con nho = " + tuoiCon); // tuoiCon truoc khi thay doi gia tri
        tuoiCon = 15;
        System.out.println("tuoi Con khi qua 5 nam = " + tuoiCon); // sau khi thay doi gia tri

        System.out.println("diem Van cua Duy la " + diemVan);
        diemVan = 9;
        System.out.println("diem van cua Long la " + diemVan);

        System.out.println("diem Anh cua Duy la " + diemAnh);
        diemAnh = 10;
        System.out.println("diem Anh cua chi Yen la " + diemAnh);

        c = 9;
        System.out.println("bay gio la " + c + " gio");

        // hang so (khong the thay doi gia tri), co "final" o truoc bien, ten bien viet full hoa
        final int DOSOI = 100;
       // DOSOI = 200; // dong nay bao loi vi DOSOI la final

        System.out.println("do soi cua nuoc la " + DOSOI + " do C");
    }
}
