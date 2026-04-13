import java.util.HashMap;
import java.util.Scanner;

public class bai29 {
    public static void main(String[] args) {
        //1. khai bao
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Double> map1 = new HashMap<>();

        //2. Them cac phan tu vao hasmap
        map.put(234,"duy");
        map.put(123,"hoang");
        map.put(345,"ha");

        //3. Lay gia tri cua mot phan tu
        String value = map.get(234);
        String value1 = map.get(123);
        String value2 = map.get(345);
        System.out.println(value);
        System.out.println(value1);
        System.out.println(value2);

        //4. Xoa phan tu khoi hasmap
        map.remove(234);
        System.out.println(map.get(234));

        //5. kiem tra 1 phan tu co trong hasmap kh
        boolean check = map.containsKey(345);
        System.out.println(check);

        //6. kiem tra xem 1 gia tri co trong map kh
        boolean check1 = map.containsValue("hoang");
        System.out.println(check1);

        //7. kiem tra xem hasmap co rong hay kh
        boolean check2 = map.isEmpty();
        System.out.println(check2);

        //8. lay so luong phan tu
        int soLuong = map.size();
        System.out.println(soLuong);

        //9. duyet hasmap
        for (Integer key : map.keySet()){
            String vl = map.get(key);
            System.out.println(key + ":" + vl);
        }

        // bai tap:
        /*Viet chuong trinh su dung dict chua 10 user name va passwor.
         Chuong trinh yeu cau nhap vao username va pass.
         1. neu user name khong co trong dict, chuong trinh bao user name khong ton tai.
         2. neu user name dung ma password sai thi bao: PASSWORD sai.
         3. neu user, pass dung thi bao ban da login thanh cong
         */
        HashMap<String, String> dict = new HashMap<>();
        dict.put("user1", "1234");
        dict.put("user2", "1234");
        dict.put("user3", "1234");
        dict.put("user4", "1234");
        dict.put("user5", "1234");
        dict.put("user6", "1234");
        dict.put("user7", "1234");
        dict.put("user8", "1234");
        dict.put("user9", "1234");
        dict.put("user10", "1234");

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao username: ");
        String user = sc.nextLine();
        System.out.println("Moi nhap vao password: ");
        int pass = sc.nextInt();
        if (!dict.containsKey(user)){
            System.out.println("User name khong ton tai");
        }
        else if (!dict.get(user).equals(pass)) {
            System.out.println("Pass sai");
        }
        else
            System.out.println("Ban da dang nhap thanh cong");
    }
}
