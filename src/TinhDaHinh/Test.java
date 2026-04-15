package TinhDaHinh;

public class Test {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("Duy", "1231412", "hdauf");
        // xuat luong pho phong
        System.out.println("Luc ns1 dang lam pho phong");
        System.out.println(ns1.getTen() + ", " + ns1.getCccd() + ", " + ns1.getQue());
        System.out.println(ns1.tinhLuong(30));
        // thay doi chuc vu
        ns1 = new TruongPhong(ns1.getTen(), ns1.getCccd(),ns1.getQue());
        // xuat luong truong phong
        System.out.println("Sau khi ns1 lam truong phong");
        System.out.println(ns1.getTen() + ", " + ns1.getCccd() + ", " + ns1.getQue());
        System.out.println(ns1.tinhLuong(30));
    }
}
