public class bai23 {
    public static void main(String[] args) {
        System.out.println("PI = " + Math.PI); // tra ve gia tri cua PI
        // tri tuyet doi
        int a = -8;
        System.out.println(Math.abs(a)); // gia tri tuyet doi cua a

        //max, min
        System.out.println(Math.max(4,7));
        System.out.println(Math.min(4,7));

        // can bac 2
        System.out.println(Math.sqrt(4)); // can bac 2 cua 4

        //luy thua
        System.out.println(Math.pow(2,3));

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
