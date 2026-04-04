import com.sun.source.tree.TryTree;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class baitap8 {
    public static void main(String[] args) {
        /* Cho nhap 2 phep toan tu va nhap 2 so a va b
        kq cua toan tu 1 se ket hop toan tu 2 voi a
        vd: 2 toan tu: - & *
            a = 15, b = 3
            c = a- b = 15 - 3 = 12
            d = c * a = 12 * 15 = 180
            tra kq c va d
            */
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so a: ");
        double a = sc.nextDouble();
        System.out.println("Moi nhap so b: ");
        double b = sc.nextDouble();
        System.out.println("Moi nhap toan tu 1: ");
        String tt1 = new Scanner(System.in).nextLine();
        System.out.println("Moi nhap toan tu 2: ");
        String tt2 = new Scanner(System.in).nextLine();
        double c = 0;
        double d = 0;
        switch (tt1){
            case "+":
                c = Cong(a, b);
                break;
            case "-":
                c = Tru(a, b);
                break;
            case "*":
                c = Nhan(a, b);
                break;
            case "/":
                c = Chia(a, b);
                break;
        }
        switch (tt2){
            case "+":
                d = Cong(c, a);
                break;
            case "-":
                d = Tru(c, a);
                break;
            case "*":
                d = Nhan(c, a);
                break;
            case "/":
                d = Chia(c, a);
                break;
        }
        System.out.println(c);
        System.out.println(d);
    }

    public static double Cong(double a, double b){
        return a + b;
    }public static double Tru(double a, double b){
        return a - b;
    }public static double Nhan(double a, double b){
        return a * b;
    }public static double Chia(double a, double b){
        return a / b;
    }

}
