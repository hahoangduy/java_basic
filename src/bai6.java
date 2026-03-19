public class bai6 {
    public static void main(String[] args) {

        /*
        ep kieu de dua ra ket qua chinh xac nhat cua 1 phep tinh
        */


        // ep kieu rong
       int a = 5;
       int b = 32;
       double kq = (double) a/b; // int -> double
       System.out.println(kq);

       int kq1 = a/b;
       System.out.println(kq1);

       double kq2 = a/b; // neu khong co ep kieu thi may khong the dua ra kq chinh xac

       int a1 = 97;
       int b1 = 100;
       double kq3 =  a1/b1;
       System.out.println(kq3);

       double kq4 =(double) a1/b1;
       System.out.println(kq4);

       float kq5 = (float) a1/b1; // ngoai double co the dung float
       System.out.println(kq5);

//        // ep kieu hep
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
