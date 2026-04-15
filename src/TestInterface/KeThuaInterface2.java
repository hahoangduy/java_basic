package TestInterface;

public class KeThuaInterface2 implements VDInterface, ViDuInterface2{ // 1 class co the dan xuat tu nhieu interface
    @Override
    public void xetThuong(int cccd, double doanhThu) { // dan xuat tu interface phai override

    }

    @Override
    public void thongTin(String ten, String cccd, int namSinh) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNgaycong) {
        return luongNgay*soNgaycong;
    }
}
