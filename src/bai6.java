public class bai6 {
    public static void main(String[] args) {

        // ep kieu rong
        int a = 5;
        int b = 10;
        double kq = (double) a/b; // int -> double
        System.out.println(kq);

        // ep kieu hep
        int c = 128;
        byte d = (byte) c; // byte tu -128 -> 127 => ep tu int c = 128 -> byte d => tra kq sai
        System.out.println(c);
        System.out.println(d);

        int e = 15;
        byte f = (byte) e; // ep kieu tu int -> byte ( vi 15 nam trong du lieu cua byte nen phep tinh dung )
        System.out.println(e);
        System.out.println(f);
    }
}
