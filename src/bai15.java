import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {

        // do while

        int a = 1;
        int tong = 0;
        do {
            tong += a;
            a++;
        }while (a <= 5);
        System.out.println("Tong = " + tong);

        // while true
        int x = 0;
        while (true) {
            x++;
            System.out.println("x = " + x);
            if (x == 10)
                break;
        }


    }
}
