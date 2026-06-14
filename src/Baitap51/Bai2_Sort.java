package Baitap51;

public class Bai2_Sort {
    public static void main(String[] args) {
        /* CÁC THUẬT TOÁN SẮP XẾP
            1. Bubble Sort: sắp xếp nổi bọt
            2. Insertion Sort: sắp xếp chèn
            3. Selection Sort: sắp xếp chọn

           1. Bubble Sort: sắp xếp nổi bọt
           - Nguyên lý:
             + Chạy từ đầu đến cuối mảng.
             + Nếu phần tử đứng trước mà lớn hơn phần tử đứng sau thì đổi chỗ.
             + Sau mỗi vòng lặp thì phần tử lớn nhất sẽ trôi xuống dưới.
           - Mô phỏng:
           5, 3, 2, 7, 8, 1, 2
           Loop 1: 5 > 3 -> 3, 5, 2, 7, 8, 1, 2 (đẩy 3 lên trước 5 vì 5 > 3)
                   5 > 2 -> 3, 2, 5, 7, 8, 1, 2 (đẩy 2 lên trước 5 vì 5 > 2)
                   5 < 7 -> 3, 2, 5, 7, 8, 1, 2 (giữ nguyên vì 5 < 7)
                   7 < 8 -> 3, 2, 5, 7, 8, 1, 2 (giữ nguyên vì 7 < 8)
                   8 > 1 -> 3, 2, 5, 7, 1, 8, 2 (đẩy 1 lên trước 8 vì 1 < 8)
                   8 > 2 -> 3, 2, 5, 7, 1, 2, 8 (đẩy 2 lên trước 8 vì 2 < 8)
           => sau vòng lặp 1, phần tử lớn nhất đưa đẩy xuống cuối nên đến vòng lặp 2, không cần xét phần tử đó nữa.

           3, 2, 5, 7, 1, 2, (8)
           Loop 2: 3 > 2 -> 2, 3, 5, 7, 1, 2, (8) (đẩy 2 lên trước 3 vì 3 > 2)
                   3 < 5 -> giữ nguyên
                   5 < 7 -> giữ nguyên
                   7 > 1 -> 2, 3, 5, 1, 7, 2, (8) (đẩy 1 lên trước 7 vì 7 > 1)
                   7 > 2 -> 2, 3, 5, 1, 2, 7, (8) (đẩy 2 lên trước 7 vì 7 > 2)

           2, 3, 5, 1, 2, (7), (8)
           Loop 3: 2 < 3 -> giữ nguyên
                   3 < 5 -> giữ nguyên
                   5 > 1 -> 2, 3, 1, 5, 2, (7), (8) (đẩy 1 lên trước 5 vì 5 > 1)
                   5 > 2 -> 2, 3, 1, 2, 5, (7), (8) (đẩy 2 lên trước 5 vì 5 > 2)

           Loop 4: 2, 1, 2, 3, (5), (7), (8)
           Loop 5: 1, 2, 2, (3), (5), (7), (8)
           Loop 6: 1, 2, (2), (3), (5), (7), (8)


           2. Insertion Sort: Sắp xếp chèn
            - Nguyên lý:
                + Chạy từ đầu đến cuối mảng.
                + Tại vòng lặp i, coi như dãy từ [0,i-1] đã được sắp xếp, chèn phần tử a[i] vào vị trí thích hợp.
                + Sau vòng lặp thứ i thì dãy [0,i] đã được sắp xếp.
            - Mô phỏng:
              Cho 1 dãy số, kiểm tra a[i] phù hợp ở vị trí này trong dãy từ [1,i-1], đặt a[i] vào vị trí đó


            3. Selection Sort: Sắp xếp chọn
             - Nguyên lý:
                + Chạy từ đầu đến cuối mảng.
                + Tại vòng lặp i, tìm phần tử nhỏ nhất từ [i+1,n-1], nếu nhỏ hơn a[i] thì đổi chỗ cho a[i].
                + Sau vòng lặp thứ i, thì dãy [0,i] đã được sắp xếp.
         */


    }
}
