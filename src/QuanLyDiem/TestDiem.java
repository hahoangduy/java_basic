package QuanLyDiem;

public class TestDiem {
    public static void main(String[] args) {
        // khoi tao doi tuong khoa toan
        KhoaToan toan1 = new KhoaToan("Duy", "1651651257");
        toan1.tinhDTB();

        KhoaAnh anh1 = new KhoaAnh("Hoang", "11571518");
        anh1.tinhDTB();

        KhoaVan van1 = new KhoaVan("Ha", "12738124");
        van1.tinhDTB();
    }
}
