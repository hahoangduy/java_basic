package CongTy;

public abstract class NhanVien {
    protected String ten;
    protected String que;
    protected int cccd;
    protected double luongcoban = 850;

    public NhanVien(String ten, String que, int cccd) {
        this.ten = ten;
        this.que = que;
        this.cccd = cccd;
    }

    public abstract double tinhLuong();
    public void hienthiTT (){
        System.out.println(ten + ", " + que + ", " + cccd);
    }
}
