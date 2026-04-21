import TruongDaiHoc.SinhVien;
public class bai30 {
    public static void main(String[] args) {
        // khoi tao doi tuong thuoc class sinh vien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThithongtin();
        sv2.hienThithongtin();
        SinhVien sv3 = new SinhVien("Duy");
        sv3.hienThithongtin();
        SinhVien sv4 = new SinhVien("Duy", 9.5);
        sv4.hienThithongtin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());



        //thay doi ten cua sv4
        sv4.setHoTen("Hoang");
        sv4.setDiem(25);
        sv4.hienThithongtin();

        // test phuong thuc co kieu tra ve
        double diemTBsv4 = sv4.tinhDTB(8.4, 6.9);
        System.out.println(diemTBsv4);

        // test phuong thuc toString
        System.out.println(sv4);

        // Support Method va Service Method
        // sv4.checkDiem(); // loi -> private
        sv4.checkHoplediem();

        //Overloading
        double testD = sv4.tinhDTB(5, 6, 7); // pt 2
        System.out.println(testD);
        double testD2 = sv4.tinhDTB(6, 7); // pt 1
        System.out.println(testD2);

        // Parametter List
        double kq = sv4.tongDiem(1, 2, 3, 4, 5, 6, 7, 8.9, 7.4, 9.2);
        double kq1= sv4.tongDiem(1, 2, 3, 4, 5, 6, 7, 8.9, 7.4, 9.2,5,2,1,4,5,2,4,3);
        System.out.println(kq);
        System.out.println(kq1);
    }
}
