package CongTy;

public class NVDiCa extends NhanVien{// khai bao ke thua
    protected int ca;
    public NVDiCa(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }
    public NVDiCa(String ten, String que, int cccd, int ca) {
        super(ten, que, cccd);
        this.ca = ca;
    }

    @Override
    public double tinhLuong() {
        return luongcoban*1.05; // cao hon 5% so voi NV hanh chinh
    }

}
