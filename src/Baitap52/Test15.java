package Baitap52;
import java.util.Arrays;
public class Test15 {
    public static class Player {
        String name;
        int win;
        int[] scores;
        public Player(String name, int win, int[] scores) {
            this.name = name;
            this.win = win;
            this.scores = scores;
        }

        public int getTotalScore() {
            int sum = 0;
            for (int s : scores) {
                sum += s;
            }
            return sum;
        }

        public int getMaxScore() {
            int max = scores[0];
            for (int s : scores) {
                if (s > max) {
                    max = s;
                }
            }
            return max;
        }
    }

    public static void bubbleSort(Player[] pl) {
        int n = pl.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                Player pl1 = pl[j];
                Player pl2 = pl[j + 1];
                if (pl1.win < pl2.win) {
                    Player tam = pl[j];
                    pl[j] = pl[j+1];
                    pl[j+1] = tam;
                } else if (pl1.win == pl2.win) {
                    int sumPl1 = pl1.getTotalScore();
                    int sumPl2 = pl2.getTotalScore();
                    if (sumPl1 < sumPl2) {
                        Player tam = pl[j];
                        pl[j] = pl[j+1];
                        pl[j+1] = tam;
                    } else if (sumPl1 == sumPl2) {
                        int maxPl1 = pl1.getMaxScore();
                        int maxPl2 = pl2.getMaxScore();
                        if (maxPl1 < maxPl2) {
                            Player tam = pl[j];
                            pl[j] = pl[j+1];
                            pl[j+1] = tam;
                        } else if (maxPl1 == maxPl2) {
                            if (pl1.name.compareTo(pl2.name) > 0) {
                                Player tam = pl[j];
                                pl[j] = pl[j+1];
                                pl[j+1] = tam;
                            }
                        }
                    }
                }
            }
        }
        printArray(pl);
    }

    public static void printArray(Player[] pl) {
        for (int i = 0; i < pl.length; i++) {
            System.out.println("Name: " + pl[i].name + " |Wins: " + pl[i].win + " |Score: " + Arrays.toString(pl[i].scores));
        }
    }

    public static void main(String[] args) {
        /*Cho một mảng players chứa thông tin của các tuyển thủ.
        Mỗi đối tượng tuyển thủ bao gồm: name (tên chuỗi), wins (số trận thắng), và scores (một mảng gồm đúng 3 số nguyên đại diện cho điểm của 3 vòng đấu gần nhất).
        Hãy sắp xếp danh sách này theo các quy tắc ưu tiên khắt khe sau:Số trận thắng (wins) theo thứ tự giảm dần.
        Nếu số trận thắng bằng nhau, so sánh tổng điểm của 3 vòng đấu (tổng của mảng scores) theo thứ tự giảm dần.
        Nếu tổng điểm vẫn bằng nhau, so sánh điểm số cao nhất đạt được trong 1 vòng đấu (giá trị lớn nhất trong mảng scores) theo thứ tự giảm dần.
        Nếu tất cả đều bằng nhau, sắp xếp theo tên (name) theo bảng chữ cái tăng dần (từ A đến Z).

        Ví dụ:
        Input:
        [
          {"name": "Alex", "wins": 5, "scores": [10, 15, 20]},
          {"name": "Ben", "wins": 6, "scores": [5, 5, 5]},
          {"name": "Cody", "wins": 5, "scores": [15, 15, 15]},
          {"name": "Dan", "wins": 5, "scores": [10, 10, 25]}
        ]
        Output:
        [
          {"name": "Ben", "wins": 6, "scores": [5, 5, 5]},
          {"name": "Dan", "wins": 5, "scores": [10, 10, 25]},
          {"name": "Cody", "wins": 5, "scores": [15, 15, 15]},
          {"name": "Alex", "wins": 5, "scores": [10, 15, 20]}
        ]
        Giải thích:Ben đứng nhất vì có wins cao nhất (6 trận).
        Alex, Cody, Dan đều có 5 trận thắng.
        Xét quy tắc 2 (tổng điểm):Alex tổng = 45.Cody tổng = 45.Dan tổng = 45.
        Vẫn hòa, xét quy tắc 3 (điểm cao nhất trong các vòng):Dan có điểm cao nhất là 25, Dan xếp ngay sau Ben.
        Alex có điểm cao nhất là 20.Cody có điểm cao nhất là 15.Thứ tự cuối cùng: Ben, Dan, Alex, Cody. (Trong ví dụ này chưa cần dùng đến quy tắc 4 xét tên).*/

        Player[] pl = {
                new Player("Alex", 5, new int[]{10, 15, 20}),
                new Player("Ben", 6, new int[]{5, 5, 5}),
                new Player("Cody", 5, new int[]{15, 15, 15}),
                new Player("Dan", 5, new int[]{10, 10, 25})
        };

        System.out.println("Ví dụ 1: ");
        for (int i = 0; i < pl.length; i++) {
            System.out.println("Name: " + pl[i].name + " |Wins: " + pl[i].win + " |Score: " + Arrays.toString(pl[i].scores));
        }
        System.out.println();
        System.out.println("Output: ");
        bubbleSort(pl);
    }
}
