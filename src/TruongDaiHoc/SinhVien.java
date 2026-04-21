package TruongDaiHoc;



public class SinhVien {
    // thuoc tinh (giong voi bien)
    private String hoTen; // bien toan cuc (Instance variable)
    private double diem; // bien toan cuc (Instance variable)

    // constructor mac dinh (khong doi so)
    // khoi tao cac gia tri mac dinh ngay khi doi tuong vua duoc tao ra
    public SinhVien(){ // ten constructor giong ten class
        hoTen = "No name";
        diem = 0.0;
    }

    // constructor co doi so


    public SinhVien(String hoTen) { // bien cuc bo (Local variable)
        this.hoTen = hoTen; // this.hoTen de hieu dang goi bien toan cuc neu bien cuc bo va bien toan cuc ten giong nhau
    }

    public SinhVien(String hoTenx, double diemx) { // 2 doi so la ten va diem
        hoTen = hoTenx; // ten khac nhau nen khong can dung this
        diem = diemx;
        String s = "ahdanf"; // cung la 1 bien cuc bo
    }

    // phuong thuc (cac ham)
    // phuong thuc khong co kieu tra ve
    public void hienThithongtin(){
        System.out.println(hoTen + ": " + diem );
    }

    //phuong thuc co kieu tra ve (return)
    public double tinhDTB(double diemToan, double diemVan){ //2 doi so (Overloading Method)
        return (diemToan + diemVan)/2;
    }

    // pt 2
    public double tinhDTB(double diemToan, double diemVan, double diemAnh){ //3 doi so (Overloading Method)
        return (diemToan + diemVan + diemAnh)/3;
    }
    public double tinhDTB(double diemToan, double diemVan, String abc){
        return (diemToan + diemVan)/2;
    }public double tinhDTB(String abc, double diemToan, double diemVan){ //3 doi so nhung khac nhau ve thu tu cac doi so (Overloading Method)
        return (diemToan + diemVan)/2;
    }

    //get, set // dung de cho nhap du lieu tu ben ngoai khi bien la private

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    // toString


    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

    // Support Method va Service Method
    // Support Method chi su dung trong noi tai class -> private
    // ktra diem khi nhap ho so cho sinh vien

     private boolean checkDiem(){
        return this.diem >=24;
    }

    // Service Method co the goi tu ben ngoai -> public
    public void checkHoplediem(){
        if (checkDiem())
            System.out.println("Diem hop le, tiep tuc nhap thong tin");
        else
            System.out.println("Kiem tra lai diem dau vao cua sv");
    }

    //Parametter List
    public double tongDiem(double ... arr){ // truyen vao 1 mang
        double tong = 0.0; // local
        for (double x : arr){
            tong += x;
        }
        return tong;
    }
}


