public class bai16 {
    public static void main(String[] args) {
        for (int i = 0; i <= 12; i += 2){
            System.out.println("i = " + i);
        }

        // tinh tong so chan tu 1 -> 10
        int tong = 0;
        for (int x = 0; x <= 10; x += 2){
            tong += x;
        }
        System.out.println("tong = " + tong);
    }
}
