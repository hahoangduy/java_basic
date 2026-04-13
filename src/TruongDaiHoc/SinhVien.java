public class SinhVien {
    // thuoc tinh (giong voi bien)
    public String hoTen; // bien toan cuc
    private double diem;

    //constructor mac dinh (khong doi so)
    // khoi tao cac gia tri mac dinh ngay khi doi tuong vua duoc tao ra
    public SinhVien(){ // ten constructor giong ten class
        hoTen = "No name";
        diem = 0.0;
    }

    // constructor co doi so


    public SinhVien(String hoTen) { // bien cuc bo
        this.hoTen = hoTen; // this.hoTen de hieu dang goi bien toan cuc neu bien cuc bo va bien toan cuc ten giong nhau
    }

    public SinhVien(String hoTenx, double diemx) { // 2 doi so la ten va diem
        hoTen = hoTenx; // ten khac nhau nen khong can dung this
        diem = diemx;
    }

    // phuong thuc (cac ham)
    // phuong thuc khong co kieu tra ve
    public void hienThithongtin(){
        System.out.println(hoTen + ": " + diem );
    }
}
