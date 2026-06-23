package Baitap52;

public class Test24 {

    public static int binarySearch(int x) {
        int left = 2;
        int right = x / 2;
        int result = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((mid*mid) == x) {
                return mid;
            } else if ((mid*mid) > x) {
                right = mid - 1;
            }else if ((mid*mid) < x) {
                result = mid;
                left = mid + 1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        /*Cho một số nguyên không âm x. Hãy tính và trả về căn bậc hai của x dưới dạng số nguyên.
        Vì kết quả trả về phải là số nguyên, nên nếu căn bậc hai là số thập phân (ví dụ 2.828...), bạn chỉ lấy phần nguyên (tức là 2).
        Bạn không được sử dụng các hàm toán học có sẵn như Math.sqrt() hay x  0.5.
        Ví dụ 1:
        Input: x = 4
        Output: 2
        Ví dụ 2:
        Input: x = 8
        Output: 2
        Giải thích: Căn bậc hai của 8 là khoảng 2.82842... Phần nguyên là 2.*/

        int x1 = 4;
        System.out.println("Ví dụ 1: " + x1);
        int result1 = binarySearch(x1);
        System.out.println("Output: " + result1);
        System.out.println();
        int x2 = 8;
        System.out.println("Ví dụ 2: " + x2);
        int result2 = binarySearch(x2);
        System.out.println("Output: " + result2);
        System.out.println();
        int x3 = 38;
        System.out.println("Ví dụ 3: " + x3);
        int result3 = binarySearch(x3);
        System.out.println("Output: " + result3);
    }
}
