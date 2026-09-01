package Baitap53.Bai10;

import Baitap53.Bai5.QueueBai5;

import java.util.Arrays;

public class Main {

    public static int eatBread(int[] students, int[] sandwiches) {
        QueueBai10 queue = new QueueBai10(students.length);
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            queue.push(students[i]);
        }
        while (!queue.isEmpty() && j < sandwiches.length) {
            if (queue.getValue() == sandwiches[j]) {
                queue.pop();
                j++;
            }
            else {
                int student = queue.pop();
                queue.push(student);
            }
        }
        return queue.size();
    }

    public static void main(String[] args) {
        /*Mô tả bài toán: Có một hàng sinh viên và một chồng bánh mì kẹp.
        Bánh mì có 2 loại: hình tròn (0) và hình vuông (1).
        Nếu sinh viên đứng đầu hàng thích loại bánh mì đang nằm trên cùng của chồng, họ sẽ lấy nó và rời đi.
        Nếu không thích, họ sẽ bỏ qua cái bánh mì đó và đi xuống xếp lại ở cuối hàng.
        Quá trình tiếp tục cho đến khi không còn ai trong hàng muốn ăn chiếc bánh mì trên cùng nữa.
        Hãy trả về số lượng sinh viên không thể ăn trưa.
        Ví dụ: students = [1, 1, 0, 0], sandwiches = [0, 1, 0, 1]
        Output: 0 (Tất cả đều ăn được).
        Giải thích:
        Sinh viên 1 không thích bánh 0 -> xuống cuối hàng [1, 0, 0, 1].
        Sinh viên 1 tiếp theo cũng không thích -> xuống cuối [0, 0, 1, 1].
        Sinh viên 0 thích bánh 0 -> lấy bánh.
        Hàng còn [0, 1, 1], bánh còn [1, 0, 1]... Cứ thế đến hết.*/

        int[] students = {1, 1, 0, 0}; int[] sandwiches = {0, 1, 0 ,1};
        System.out.println("Input: " + Arrays.toString(students) + " | " + Arrays.toString(sandwiches));
        System.out.println("Output: " + eatBread(students, sandwiches));
    }
}
