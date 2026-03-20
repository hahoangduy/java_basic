public class bai9 {
    public static void main(String[] args) {
        byte z = 5;
        // kiem tra gia tri z > 0 va z < 10 khong
        System.out.println("(a) = " + (z > 0 && z < 10)); // && -> and (toan tu va)
        // chi dung khi ca 2 dieu kien deu dung
        System.out.println("(b) = " + (z > 0 && z < 3)); // tra kq false vi 1 dieu kien sai

        // kiem tra gia tri z > 10 hoac z < -4
        System.out.println("(c) = " + (z > 3 || z < -4)); // || -> or(toan tu hoac)
        // chi can 1 dieu kien dung se tra kq dung

        // phep phu dinh
        System.out.println("(d) = " + (!(z > 3 || z < -4)));
        // vi (c) true, ma (d) phu dinh cua (c) nen (d) false


        // toan tu tien to, hau to ( phep toan don le )
        byte a = 17;
        byte b = 99;
        byte c = 65;
        byte d = 19;

        a++; // a = a + 1 -> tang a len 1 gia tri (postfix)
        ++b; // b = b + 1 -> tang b len 1 gia tri
        c--; // c = c - 1 -> giam c di 1 gia tri (prefix)
        --d; // d = d - 1 -> giam d di 1 gia tri
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // phep toan phuc tap
        int x = 1;
        int y = 2;
        int w = x++ - ++y + 1;
        System.out.println(x);
        System.out.println(y);
        System.out.println(w);

    }
}
