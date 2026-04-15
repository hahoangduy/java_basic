import java.util.*;

public class baitap14 {
    public static void main(String[] args) {
        /*Tạo một ArrayList<Integer> chứa 10 số nguyên ngẫu nhiên (có thể chứa số âm và số dương).
        Sắp xếp danh sách theo thứ tự tăng dần.
        Tìm và in ra số nguyên dương nhỏ nhất trong danh sách.
        Xóa tất cả các số âm khỏi ArrayList.
        In danh sách sau khi đã lọc để kiểm tra kết quả.
        Vd:
        1. Danh sách ngẫu nhiên: [5, -2, 12, -8, 3, 0, -1, 7, 4, -5]
        2. Sau khi sắp xếp: [-8, -5, -2, -1, 0, 3, 4, 5, 7, 12]
        3. Số nguyên dương nhỏ nhất: 3 (Lưu ý: 0 không phải số dương)
        4. Sau khi xóa các số âm:
            Danh sách còn lại: [0, 3, 4, 5, 7, 12]
        */
        ArrayList<Integer> soNguyen = new ArrayList<>(10);
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            int ngauNhien = rd.nextInt(-100, 101);
            soNguyen.add(ngauNhien);
        }
        System.out.println("1. Danh sach cua ban la: ");
        System.out.println(soNguyen);
        Collections.sort(soNguyen);
        System.out.println("2. Danh sach sau khi duoc sap xep tang dan: ");
        System.out.println(soNguyen);
        boolean check = false;
        for (int i = 0; i < soNguyen.size(); i++) {
            if (soNguyen.get(i) > 0) {
                System.out.println("3. So nguyen duong nho nhat la: " + soNguyen.get(i));
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println("Khong co so nguyen duong nao.");
        for (int i = 0; i < 10; i++){
            if (soNguyen.get(0) < 0)
                soNguyen.remove(soNguyen.get(0));
        }
        System.out.println("4. Danh sach sau khi xoa cac so am la: ");
        System.out.println(soNguyen);
        /*
        for (int i = 0, j = soNguyen.size()-1; i < j ; i++, j--){
            int luu = soNguyen.get(i);
            int tam = soNguyen.get(j);
            soNguyen.set(i, tam);
            soNguyen.set(j, luu);
        }*/
        Collections.sort(soNguyen, Collections.reverseOrder()); // sap xep tu lon den be
        System.out.println("5. Danh sach sau khi duoc sap xep giam dan: ");
        System.out.println(soNguyen);
    }
}
