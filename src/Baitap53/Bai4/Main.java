package Baitap53.Bai4;

public class Main {

    public static int timeToBuyTickets(int[] tickets, int k) {
        QueueBai4 queue = new QueueBai4(10000);
        int time = 0;
        for (int i = 0; i < tickets.length; i++) {
            queue.push(i);
        }
        while (!queue.isEmpty()) {
            int current = queue.pop();
            tickets[current]--;
            time++;
            if (current == k && tickets[current] == 0) {
                return time;
            }
            if (tickets[current] > 0) {
                queue.push(current);
            }
        }
        return time;
    }

    public static void main(String[] args) {
        /*Có n người đang xếp hàng để mua vé máy bay, người thứ 0 đứng đầu hàng và người thứ n-1 đứng cuối hàng.
        Bạn được cấp một mảng tickets, trong đó tickets[i] là số lượng vé mà người thứ i muốn mua.
        Mất đúng 1 giây để một người mua được 1 vé. Quy trình mua như sau:
        Người đứng đầu hàng mua 1 vé.
        Nếu họ đã mua đủ số vé mong muốn, họ sẽ rời khỏi hàng.
        Nếu họ vẫn cần mua thêm, họ phải đi xuống cuối hàng để xếp hàng lại.
        Hãy tính xem mất tổng cộng bao nhiêu giây để người ở vị trí k (index k ban đầu) mua đủ số vé của mình.
        Ví dụ 1:
        Input: tickets = [2, 3, 2], k = 2
        Output: 6
        Giải thích:
        Giây 1: Người 0 mua 1 vé, mảng thành [1, 3, 2], người 0 xuống cuối hàng.
        Giây 2: Người 1 mua 1 vé, mảng thành [1, 2, 2], người 1 xuống cuối hàng.
        Giây 3: Người 2 (mục tiêu) mua 1 vé, mảng thành [1, 2, 1], người 2 xuống cuối hàng.
        Giây 4: Người 0 mua 1 vé, mảng thành [0, 2, 1], người 0 rời hàng.
        Giây 5: Người 1 mua 1 vé, mảng thành [0, 1, 1].
        Giây 6: Người 2 mua nốt 1 vé cuối, mảng thành [0, 1, 0]. Người 2 mua xong! Trả về 6.*/
        int[] tickets = {2, 3, 2};
        int k = 2;

        System.out.println("Output: " + timeToBuyTickets(tickets, k));
    }
}
