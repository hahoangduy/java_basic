public class bai20 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try { /* dung khi nghi ngo code co the phat sinh loi
                neu khong co loi thi chay code nhu binh thuong */
            int c = a / b;
            System.out.println("c = " + c);
        }
        catch (ArithmeticException ex){ // bat loi toan hoc khi co phat sinh loi
            System.out.println("Co loi toan hoc roi");
            ex.printStackTrace(); // in loi ra
        }
        catch (Exception ex){ // bat loi khi co phat sinh loi
            System.out.println("Co loi roi");
            ex.printStackTrace(); // in loi ra
        }
        finally {
            System.out.println("Co loi hay khong co loi van phai thuc hien doan code nay");
        }
        System.out.println("Doan code phia sau");
    }
}
