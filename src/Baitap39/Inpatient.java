package Baitap39;

public class Inpatient extends BenhAn implements IBaoHiem{
    private int soNgayNhapVien;
    private String loaiPhong;
    private double phiPhauThuat;

    public Inpatient(String maBenhAn, String name, boolean isHasBHYT, double phiKhamBenhBanDau, double tienThuoc, int soNgayNhapVien, String loaiPhong, double phiPhauThuat) {
        super(maBenhAn, name, isHasBHYT, phiKhamBenhBanDau, tienThuoc);
        this.soNgayNhapVien = soNgayNhapVien;
        this.loaiPhong = loaiPhong;
        this.phiPhauThuat = phiPhauThuat;
    }

    @Override
    public double tongVienPhi() {
        double total = 0;
        if (loaiPhong.equals("A")) {
            total = getPhiKhamBenhBanDau() + getTienThuoc() + (soNgayNhapVien * 1000000) + phiPhauThuat;
        }
        if (loaiPhong.equals("B")) {
            total = getPhiKhamBenhBanDau() + getTienThuoc() + (soNgayNhapVien * 500000) + phiPhauThuat;
        }
        if (loaiPhong.equals("C")) {
            total = getPhiKhamBenhBanDau() + getTienThuoc() + (soNgayNhapVien * 200000) + phiPhauThuat;
        }
        return total;
    }


    @Override
    public double tinhTienBaoHiemTra() {
        double discount;
        if (isHasBHYT()) {
            discount = getPhiKhamBenhBanDau() + getTienThuoc()+ (phiPhauThuat * 0.7);
            return discount;
        }
        return 0;
    }

    @Override
    public double vienPhiTuTra() {
        return tongVienPhi() - tinhTienBaoHiemTra();
    }


    @Override
    public void display() {
        System.out.println("ID: " + getMaBenhAn() + " |Name: " + getName() + " |Type: Inpatient" + " |Tổng viện phí: " + tongVienPhi() + " VNĐ"
                + " |BHYT chi trả: " + tinhTienBaoHiemTra() + " VNĐ" + " |Bệnh nhân tự chi trả: " + vienPhiTuTra() + " VNĐ");
    }


}
