public class bai18 {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 7; i++){
            for (int j = 1 ; j <= 7; j++){
                System.out.print(i+""+j+"\t"); // in ra kq khong xuong dong nhung giua 2 don vi cach ra 1 khoang
            }
            System.out.println(""); // in kq xuong dong
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
        // in chu N
        for (int i = 1; i <= 7; i++){
            for (int j = 1 ; j <= 7; j++){
                if (j == 1 || j == 7 || i == j)
                    System.out.print(i+""+j+"\t");
                else
                    System.out.print(""+"\t"); // in ra khoang trong
            }
            System.out.println("");
        }


        System.out.println("");
        System.out.println("");
        System.out.println("");
        // in hinh vuong
        for (int i = 1; i <= 7; i++){
            for (int j = 1 ; j <= 7; j++){
                if (j == 1 || j == 7 || i == 1 || i == 7)
                    System.out.print(i+""+j+"\t");
                else
                    System.out.print(""+"\t"); // in ra khoang trong
            }
            System.out.println("");
        }



        System.out.println("");
        System.out.println("");
        System.out.println("");
        // in hinh tam giac
        for (int i = 1; i <= 7; i++){
            for (int j = 1 ; j <= i; j++){
                System.out.print(i+""+j+"\t");
            }
            System.out.println("");
        }*/





        // (a)
        System.out.println("(a)");
        for (int a = 1; a <= 4; a++){
            for (int b = 1; b <= 4; b++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }



        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (b)
        System.out.println("(b)");
        for (int a = 1; a <= 4; a++){
            for (int b = 1; b <= 4; b++){
                if (a == 1 || a == 4 || b == 1 || b == 4)
                    System.out.print("*"+"\t");
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }



        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (c)
        System.out.println("(c)");
        for (int a = 1; a <= 4; a++){
            for (int b = 1; b <= a; b++){
                System.out.print("*"+"\t");
            }
            System.out.println("");
        }



        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (d)
        System.out.println("(d)");
        for (int a = 1; a <= 4; a++){
            for (int b = 1; b <= a; b++){
                if (a == 3 && b == 2)
                    System.out.print(""+"\t");
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }



        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (e)
        System.out.println("(e)");
        for (int a = 1; a <= 4; a++){
            for (int b = 1; b <= 4; b++){
                if ((a == 2 && b == 4) || (a == 3 && (b == 3 || b == 4)) || (a == 4 && (b == 2 || b == 3 || b == 4)))
                    System.out.print(""+"\t");
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }



        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (f)
        System.out.println("(f)");
        for (int a = 1; a <= 4; a++){
            for (int b = 1; b <= 4; b++){
                if (a == 2 && b == 2) {
                    System.out.print("" + "\t");
                    continue;
                }
                if ((a == 2 && b == 4) || (a == 3 && (b == 3 || b == 4)) || (a == 4 && (b == 2 || b == 3 || b == 4)))
                    System.out.print(""+"\t");
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }



        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (g)
        System.out.println("(g)");
        for (int a = 1; a <= 4; a++){
            for (int b = 1; b <= 4; b++){
                if ((a == 1 && (b == 1 || b == 2 || b == 3)) || (a == 2 && (b == 1 || b == 2)) || (a == 3 && b == 1))
                    System.out.print(""+"\t");
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }



        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (h)
        System.out.println("(h)");
        for (int a = 1; a <= 4; a++){
            for (int b = 1; b <= 4; b++){
                if (a == 3 && b == 3){
                    System.out.print(""+"\t");
                    continue;
                }
                if ((a == 1 && (b == 1 || b == 2 || b == 3)) || (a == 2 && (b == 1 || b == 2)) || (a == 3 && b == 1))
                    System.out.print(""+"\t");
                else
                    System.out.print("*"+"\t");
            }
            System.out.println("");
        }




        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (i)
        System.out.println("(i)");
        for (int a = 1; a <= 4; a++){
            for (int b = 1; b <= 7; b++){
                if (a == 1 && b == 4) {
                    System.out.print("*" + "\t");
                    continue;
                }
                if (a == 2 && (b == 3 || b == 4 || b == 5)) {
                    System.out.print("*" + "\t");
                    continue;
                }
                if (a == 3 && (b == 2 || b == 3|| b == 4 || b == 5 || b == 6)) {
                    System.out.print("*" + "\t");
                    continue;
                }
                else if (a == 4) {
                    System.out.print("*"+"\t");
                }
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }




        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (j)
        System.out.println("(j)");
        for (int a = 1; a <= 4; a++){
            for (int b = 1; b <= 7; b++){
                if (a == 2 && b == 4){
                    System.out.print(""+"\t");
                    continue;
                }
                if (a == 3 && (b == 3 || b == 4 || b == 5)){
                    System.out.print(""+"\t");
                    continue;
                }
                if (a == 1 && b == 4) {
                    System.out.print("*" + "\t");
                    continue;
                }
                if (a == 2 && (b == 3 || b == 4 || b == 5)) {
                    System.out.print("*" + "\t");
                    continue;
                }
                if (a == 3 && (b == 2 || b == 3|| b == 4 || b == 5 || b == 6)) {
                    System.out.print("*" + "\t");
                    continue;
                }
                else if (a == 4) {
                    System.out.print("*"+"\t");
                }
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }





        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (k)
        System.out.println("(k)");
        for (int a = 1; a <= 7; a++){
            for (int b = 1; b <= 4; b++){
                if (a == 1 && b == 1){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 2 && (b == 1 || b == 2)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 3 && (b == 1 || b == 2 || b == 3)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 4 && (b == 1 || b == 2 || b == 3 || b == 4)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 5 && (b == 2 || b == 3 || b == 4)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 6 && (b == 3 || b == 4)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 7 && b == 4){
                    System.out.print("*"+"\t");
                    continue;
                }
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }




        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (l)
        System.out.println("(l)");
        for (int a = 1; a <= 7; a++){
            for (int b = 1; b <= 4; b++){
                if (a == 3 && b == 2){
                    System.out.print(""+"\t");
                    continue;
                }
                if (a == 4 && (b == 2 || b == 3)){
                    System.out.print(""+"\t");
                    continue;
                }
                if (a == 5 && b == 3){
                    System.out.print(""+"\t");
                    continue;
                }
                if (a == 1 && b == 1){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 2 && (b == 1 || b == 2)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 3 && (b == 1 || b == 2 || b == 3)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 4 && (b == 1 || b == 2 || b == 3 || b == 4)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 5 && (b == 2 || b == 3 || b == 4)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 6 && (b == 3 || b == 4)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 7 && b == 4){
                    System.out.print("*"+"\t");
                    continue;
                }
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }




        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (m)
        System.out.println("(m)");
        for (int a = 1; a <= 7; a++){
            for (int b = 1; b <= 7; b++){
                if (a == 1 && b == 1){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 2 && (b == 1 || b == 2)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 3 && (b == 1 || b == 2 || b == 3)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 5 && (b == 5 || b == 6 || b == 7)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 6 && (b == 6 || b == 7)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 7 && b == 7){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 4){
                    System.out.print("*"+"\t");
                    continue;
                }
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }



        System.out.println("");
        System.out.println("");
        System.out.println("");
        // (n)
        System.out.println("(n)");
        for (int a = 1; a <= 7; a++){
            for (int b = 1; b <= 7; b++){
                if (a == 3 && b == 2){
                    System.out.print(""+"\t");
                    continue;
                }
                if (a == 5 && b == 6){
                    System.out.print(""+"\t");
                    continue;
                }
                if (a == 1 && b == 1){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 2 && (b == 1 || b == 2)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 3 && (b == 1 || b == 2 || b == 3)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 5 && (b == 5 || b == 6 || b == 7)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 6 && (b == 6 || b == 7)){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 7 && b == 7){
                    System.out.print("*"+"\t");
                    continue;
                }
                if (a == 4){
                    System.out.print("*"+"\t");
                    continue;
                }
                else
                    System.out.print(""+"\t");
            }
            System.out.println("");
        }
    }
}
