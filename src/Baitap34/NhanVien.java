package Baitap34;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String name, int age, String sex, String address, String congViec) {
        super(name, age, sex, address);
        this.congViec = congViec;
    }
}
