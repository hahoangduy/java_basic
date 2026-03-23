public class bai7 {
    public static void main(String[] args) {
        int a = 11;
        int b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // phep cong
        System.out.println("a + b = " + (a+b) );

        //gan bien
        int cong = a + b;
        System.out.println("a + b = " + cong);

        // phep tru
        System.out.println("a - b = "+ (a-b) );
        int tru = a - b;
        System.out.println("a - b = " + tru);

        // phep nhan
        System.out.println("a * b = "+ (a*b) );
        int nhan = a * b;
        System.out.println("a * b = " + nhan);

        // phep chia
        System.out.println("a / b = "+ ((double)a/b) );

        // phep chia lay du
        System.out.println("a % b = "+ (a%b) );
        int du = a % b;
        System.out.println("a % b = " + du);



        // Bai tap
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        double d1 = 2.0;
        double d2 = 5.0;
        double d3 = -0.5;

        System.out.println("(a) = " + (i1 + (i2 * i3)));
        System.out.println("(b) = " + (i1 * (i2 + i3)));
        System.out.println("(c) = " + (i1 / (i2 + i3)));
        double kq = (double) i1 / i2 ;
        System.out.println("(d) = " + (kq + i3));
        System.out.println("(e) = " + (3+4+5/3));
        System.out.println("(f) = "+ ((3+4+5)/3));
        System.out.println("(g) = "+ (d1 + (d2 * d3)));
        System.out.println("(h) = " + (d1 + d2 * d3));
        System.out.println("(i) = " + (d1 / d2 - d3));
        System.out.println("(k) = " + (d1 / (d2 - d3)));
        System.out.println("(l) = " + (d1 + d2 + d3 / 3));
        System.out.println("(p) = "+ ((d1 + d2 + d3) / 3));
        System.out.println("(q) = " + (d1 + d2 + (d3 / 3)));
        System.out.println("(r) = " + (3 * (d1 + d2) * (d1 - d3)));
        System.out.println("(t) = " + (i1 * d3 /i2));
    }
}
