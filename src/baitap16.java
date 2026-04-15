import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baitap16 {
    public static void main(String[] args) {
        /*Khai báo một Array chứa n điểm số (số thực) do người dùng nhập vào từ bàn phím.
    Chuyển toàn bộ các phần tử từ Array này vào một ArrayList.
    Thêm 2 điểm số mới vào cuối ArrayList.
    Tính điểm trung bình của tất cả các con số trong ArrayList.
    In ra màn hình: Điểm cao nhất, điểm thấp nhất và điểm trung bình.
    VD:
    Nhập 5 điểm vào mảng (Array):
    Điểm 1: 8.5
    Điểm 2: 7.0
    Điểm 3: 9.0
    Điểm 4: 6.5
    Điểm 5: 8.0
    Thêm 2 điểm mới: 10.0 và 5.5.
    Kết quả cuối cùng:
    Danh sách điểm: [8.5, 7.0, 9.0, 6.5, 8.0, 10.0, 5.5]
    Điểm cao nhất: 10.0
    Điểm thấp nhất: 5.5
    Điểm trung bình: 7.78
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap so luong diem: ");
        int n = sc.nextInt();
        double[] diem = new double[n];
        ArrayList<Double> diemList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            System.out.println("Moi nhap diem so thu " + (i+1) + " vao mang: ");
            double x = sc.nextDouble();
            diem[i] = x;
            diemList.add(diem[i]);
        }
        System.out.println("Danh sach diem la: ");
        System.out.println(diemList);
        Collections.sort(diemList);
        double diemTB = 0;
        for (int i = 0; i < diemList.size(); i++){
            if (i == 0)
                System.out.println("Diem thap nhat la: " + diemList.get(0));
            if (i == diemList.size()-1)
                System.out.println("Diem cao nhat la: " + diemList.get(i));
            diemTB +=diemList.get(i);
        }
        diemTB = diemTB/n;
        System.out.println("Diem trung binh: " + diemTB);
    }
}
