package Baitap39;

public abstract class BenhAn {
    private String maBenhAn;
    private String name;
    private boolean isHasBHYT;
    private double phiKhamBenhBanDau;
    private double tienThuoc;

    public BenhAn(String maBenhAn, String name, boolean isHasBHYT, double phiKhamBenhBanDau, double tienThuoc) {
        this.maBenhAn = maBenhAn;
        this.name = name;
        this.isHasBHYT = isHasBHYT;
        this.phiKhamBenhBanDau = phiKhamBenhBanDau;
        this.tienThuoc = tienThuoc;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public String getName() {
        return name;
    }

    public boolean isHasBHYT() {
        return isHasBHYT;
    }

    public double getPhiKhamBenhBanDau() {
        return phiKhamBenhBanDau;
    }

    public double getTienThuoc() {
        return tienThuoc;
    }

    public abstract double tongVienPhi();

    public abstract double vienPhiTuTra();

    public abstract void display();
}
