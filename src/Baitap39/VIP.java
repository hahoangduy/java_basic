package Baitap39;

public class VIP extends Inpatient{
    private double phiDichVuGiaTang;

    public VIP(String maBenhAn, String name, boolean isHasBHYT, double phiKhamBenhBanDau, double tienThuoc, int soNgayNhapVien, String loaiPhong, double phiPhauThuat, double phiDichVuGiaTang) {
        super(maBenhAn, name, isHasBHYT, phiKhamBenhBanDau, tienThuoc, soNgayNhapVien, loaiPhong, phiPhauThuat);
        this.phiDichVuGiaTang = phiDichVuGiaTang;
    }

    @Override
    public double tongVienPhi() {
        return super.tongVienPhi() + phiDichVuGiaTang;
    }

    @Override
    public double tinhTienBaoHiemTra() {
        return super.tinhTienBaoHiemTra();
    }

    @Override
    public double vienPhiTuTra() {
        return super.vienPhiTuTra() + phiDichVuGiaTang;
    }

    @Override
    public void display() {
        System.out.println("ID: " + getMaBenhAn() + " |Name: " + getName() + " |Type: VIP" + " |Tổng viện phí: " + tongVienPhi() + " VNĐ"
                + " |BHYT chi trả: " + tinhTienBaoHiemTra() + " VNĐ" + " |Bệnh nhân tự chi trả: " + vienPhiTuTra() + " VNĐ");
    }
}
