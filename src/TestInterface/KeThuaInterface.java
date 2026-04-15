package TestInterface;

public class KeThuaInterface implements VDInterface{

    @Override
    public void thongTin(String ten, String cccd, int namSinh) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNgaycong) {
        return luongNgay*soNgaycong;
    }
}
