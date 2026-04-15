package TestInterface;

public interface VDInterface {
    //  tap cac thuoc tinh (chi duoc phep la hang so)
    static final double phucap = 15;
    // cac phuong thuc (phai la truu tuong)
    public abstract void thongTin(String ten, String cccd, int namSinh);
    public abstract double tinhLuong(double luongNgay, int soNgaycong);
}
