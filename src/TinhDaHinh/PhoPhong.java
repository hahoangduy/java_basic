package TinhDaHinh;

public class PhoPhong extends NhanSu{
    public PhoPhong(String ten, String cccd, String que) {
        super(ten, cccd, que);
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return 40 * ngayCong;
    }
}
