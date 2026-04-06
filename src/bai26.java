public class bai26 {
    public static void main(String[] args) {
        String s = "abcdef" +
                "\n123456";
        System.out.println(s);
        // khai bao doi tuong chuoi
        StringBuilder sd = new StringBuilder();
        // cac phuong thuc thuong dung
        // 1. append: Them vao cuoi chuoi
        sd.append("Xin chao, ");
        sd.append("minh moi hoc lap trinh ");
        System.out.println(sd);

        // 2. insert ( vi tri index, chuoi can chen) -> chen chuoi vao sau vi tri index mong muon
        sd.insert(10, "Hello");
        System.out.println(sd);

        // 3. delete( start, end) -> xoa tat ca cac ky tu tu vi tri start den vi tri end-1
        sd.delete(2, 7); // xoa tu 2 -> 6
        System.out.println(sd);

        // 4. length: tra ve do dai cua chuoi tinh ca space
        System.out.println(sd.length());
    }
}
