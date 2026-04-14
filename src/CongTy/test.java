package CongTy;

public class test {
    public static void main(String[] args) {
        /*NhanVien nv1 = new NhanVien("Nhan vien 1", "Dak Nong", 12345577);
        double luongnv1 = nv1.tinhLuong();
        System.out.println("luong cua nv1: " + luongnv1);*/

        //tao doi tuong la NV hanh chinh
        NVHanhChinh nvhc = new NVHanhChinh("HC 1", "Dak Lak", 1234712);
        double luongnvhc = nvhc.tinhLuong();
        System.out.println("luong cua nv hc la: " + luongnvhc);

        // tao doi tuong la nv di ca
        NVDiCa ca1 = new NVDiCa("DC", "Phu Yen", 192307841);
        double luongdc = ca1.tinhLuong();
        System.out.println( "luong cua di ca: " + luongdc);
        NVDiCa ca2 = new NVDiCa("DC", "Phu Yen", 192307841, 12);
        double luongdc2 = ca2.tinhLuong();
        System.out.println( "luong cua di ca: " + luongdc2);
        ca1.hienthiTT();
    }
}
