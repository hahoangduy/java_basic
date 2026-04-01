public class bai23 {
    public static void main(String[] args) {
        System.out.println("PI = " + Math.PI); // tra ve gia tri cua PI
        // tri tuyet doi
        int a = -8;
        System.out.println("Gia tri tuyet doi cua " + a + " la: " + Math.abs(a)); // gia tri tuyet doi cua a

        //max, min
        System.out.println("Max la: " +Math.max(4,7));
        System.out.println("Min la: " +Math.min(4,7));

        // can bac 2
        int b = 4;
        System.out.println("Can bac 2 cua " + b + " la: " +Math.sqrt(b)); // can bac 2 cua 4

        //luy thua
        int c = 2;
        int d = 3;
        System.out.println(c +  " mu " + d + " la: " + Math.pow(c,d));

        // sin, cos, tan
        int goc = 90;
        double sin = Math.sin(Math.PI*goc/180);
        double cos = Math.cos(Math.PI*goc/180);
        double tan = Math.tan(Math.PI*goc/180);
        System.out.println("Sin 90 do = " + sin);
        System.out.println("Cos 90 do = " + cos);
        System.out.println("Tan 90 do = " + tan);
    }
}
