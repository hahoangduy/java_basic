package Baitap53.Bai5;

public class Main {

    public static int ping(QueueBai5 queue, int t) {
        queue.push(t);
        while (!queue.isEmpty() && queue.getValue() < t - 3000) {
            queue.pop();
        }
        return queue.size();
    }

    public static void main(String[] args) {
        /*Hãy thiết kế một class RecentCounter để đếm số lượng các cuộc gọi đến hệ thống (ping) trong vòng 3000 mili-giây (3 giây) vừa qua.
        Hệ thống chỉ có 1 hàm duy nhất:
        ping(t): Ghi nhận một cuộc gọi mới tại thời điểm t (tính bằng mili-giây). Trả về tổng số cuộc gọi đã xảy ra trong khoảng thời gian từ [t - 3000, t].
        Dữ liệu đầu vào đảm bảo mỗi lần gọi ping(t), giá trị t luôn lớn hơn t của lần gọi trước đó (thời gian luôn tiến về phía trước).
        Ví dụ:
        RecentCounter counter = new RecentCounter();
        counter.ping(1);     // Trả về 1. Khoảng thời gian: [-2999, 1]. Có 1 cuộc gọi ở t = 1.
        counter.ping(100);   // Trả về 2. Khoảng thời gian: [-2900, 100]. Cuộc gọi ở t = 1, 100.
        counter.ping(3001);  // Trả về 3. Khoảng thời gian: [1, 3001]. Cuộc gọi ở t = 1, 100, 3001.
        counter.ping(3002);  // Trả về 3. Khoảng thời gian: [2, 3002]. Cuộc gọi ở t = 100, 3001, 3002.
                             // (Cuộc gọi ở t = 1 đã "quá hạn" vì nằm ngoài khoảng 3000ms nên bị loại bỏ).*/

        QueueBai5 queue = new QueueBai5(100);

        System.out.println("Ping 1: " + ping(queue, 1));
        System.out.println("Ping 100: " + ping(queue, 100));
        System.out.println("Ping 3001: " + ping(queue, 3001));
        System.out.println("Ping 3002: " + ping(queue, 3002));
    }
}
