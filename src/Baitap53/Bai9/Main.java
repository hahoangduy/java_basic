package Baitap53.Bai9;

import Baitap53.Bai2.StackString;
import Baitap53.Bai6.StackBai6;

import java.util.Arrays;

public class Main {

    public static int moveFiles(String[] logs) {
        int count = 0;
        StackString stack = new StackString(logs.length);
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                    count--;
                }
            } else if (logs[i].equals("./")) {
                continue;
            } else {
                stack.push(logs[i]);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /*Bài này mô phỏng lại cách bạn điều hướng các thư mục trên máy tính bằng dòng lệnh.
        Mô tả bài toán: Bạn đang ở thư mục gốc (Main Folder). Bạn có mảng logs đại diện cho các lệnh:
        "../": Quay ngược lên thư mục cha (nếu ở gốc thì đứng yên).
        "./": Ở lại thư mục hiện tại.
        "x/": Chuyển vào thư mục con tên là x.
        Hãy trả về số bước tối thiểu để lùi về thư mục gốc.
        Ví dụ: logs = ["d1/", "d2/", "../", "d21/", "./"]
        Output: 2 (Đang ở d21/ là con của d1/, cần 2 bước để về gốc).*/

        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
        System.out.println("Input: " + Arrays.toString(logs));
        System.out.println("Output: " + moveFiles(logs));
    }
}
