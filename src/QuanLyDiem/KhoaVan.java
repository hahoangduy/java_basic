package QuanLyDiem;

public class KhoaVan extends NamHoc2023{
    public KhoaVan(String ten, String cccd) {
        super(ten, cccd);
    }

    @Override
    public void tinhDTB() {
        System.out.println("Day la pt tinh dtb cua khoa Van");
    }
}
