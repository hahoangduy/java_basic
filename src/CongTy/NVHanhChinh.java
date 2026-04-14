package CongTy;

public class NVHanhChinh extends NhanVien{
    public NVHanhChinh(String ten, String que, int cccd) {
        super(ten, que, cccd); // super dung de goi constructor tu class cha
    }

    @Override // tai dinh nghia/ghi de
    public double tinhLuong() {
        return luongcoban;
    }
}
