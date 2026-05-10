package Baitap39;

public class Outpatient extends BenhAn implements IBaoHiem{
    public Outpatient(String maBenhAn, String name, boolean isHasBHYT, double phiKhamBenhBanDau, double tienThuoc) {
        super(maBenhAn, name, isHasBHYT, phiKhamBenhBanDau, tienThuoc);
    }


    @Override
    public double tongVienPhi() {
        return getPhiKhamBenhBanDau() + getTienThuoc();
    }

    @Override
    public double tinhTienBaoHiemTra() {
        double discount;
        if (isHasBHYT()) {
            discount = tongVienPhi() * 0.8;
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
        System.out.println("ID: " + getMaBenhAn() + " |Name: " + getName() + " |Type: Outpatient" + " |Tổng viện phí: " + tongVienPhi() + " VNĐ"
                + " |BHYT chi trả: " + tinhTienBaoHiemTra() + " VNĐ" + " |Bệnh nhân tự chi trả: " + vienPhiTuTra() + " VNĐ");
    }
}
