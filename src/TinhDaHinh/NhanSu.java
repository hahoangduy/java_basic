package TinhDaHinh;

public abstract class NhanSu {
    // thuoc tinh
    private String ten;
    private String cccd;
    private String que;
    // phuong thuc tinh luong
    public abstract double tinhLuong (int ngayCong);

    public NhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }

    public String getTen() {
        return ten;
    }

    public String getCccd() {
        return cccd;
    }

    public String getQue() {
        return que;
    }
}
