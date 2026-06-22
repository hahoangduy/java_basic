package Baitap52;

import java.util.Arrays;

public class Test17 {
    public static class Movies {
        private String title;
        private double rating;
        private int[] revenues;

        public Movies(String title, double rating, int[] revenues) {
            this.title = title;
            this.rating = rating;
            this.revenues = revenues;
        }

        public int totalRevenues() {
            int total = 0;
            for (int r : revenues) {
                total += r;
            }
            return total;
        }

        public int maxRevenue() {
            int max = revenues[0];
            for (int r : revenues) {
                if (r > max) {
                    max = r;
                }
            }
            return max;
        }
    }

    public static void bubbleSort(Movies[] movies) {
        int n = movies.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                Movies m1 = movies[j];
                Movies m2 = movies[j+1];
                boolean swap = false;
                if (m1.rating < m2.rating) {
                    swap = true;
                } else if (m1.rating == m2.rating) {
                    int totalM1 = m1.totalRevenues();
                    int totalM2 = m2.totalRevenues();
                    if (totalM1 < totalM2) {
                        swap = true;
                    } else if (m1.totalRevenues() == m2.totalRevenues()) {
                        int maxM1 = m1.maxRevenue();
                        int maxM2 = m2.maxRevenue();
                        if (maxM1 < maxM2) {
                            swap = true;
                        }
                        else if (m1.maxRevenue() == m2.maxRevenue()) {
                            if (m1.title.compareTo(m2.title) > 0) {
                                swap = true;
                            }
                        }
                    }
                }
                if (swap) {
                    Movies movieTemp = movies[j];
                    movies[j] = movies[j+1];
                    movies[j+1] = movieTemp;
                }
            }
        }
        printArray(movies);
    }

    public static void printArray(Movies[] movies) {
        for (Movies m : movies) {
            System.out.println("Title: " + m.title + " |Rating: " + m.rating + " |Revenues: " + Arrays.toString(m.revenues));
        }
    }

    public static void main(String[] args) {
        /*Cho một mảng movies chứa thông tin của các bộ phim.
        Mỗi đối tượng phim bao gồm:
        title (tên phim - chuỗi)
        rating (điểm đánh giá trung bình - số thực)
        revenues (một mảng gồm đúng 3 số nguyên, đại diện doanh thu của 3 tuần đầu công chiếu)
        Hãy sắp xếp danh sách các bộ phim theo các quy tắc ưu tiên sau:
        Điểm đánh giá (rating) theo thứ tự giảm dần.
        Nếu điểm đánh giá bằng nhau, so sánh tổng doanh thu của 3 tuần (revenues) theo thứ tự giảm dần.
        Nếu tổng doanh thu vẫn bằng nhau, so sánh doanh thu cao nhất trong một tuần (giá trị lớn nhất của mảng revenues) theo thứ tự giảm dần.
        Nếu tất cả đều bằng nhau, sắp xếp theo tên phim (title) theo thứ tự bảng chữ cái tăng dần (A → Z).
        Ví dụ
        Input
        [
          {"title": "Avenger", "rating": 9.0, "revenues": [150, 150, 150]},
          {"title": "Batman", "rating": 9.5, "revenues": [100, 100, 100]},
          {"title": "Captain", "rating": 9.0, "revenues": [150, 150, 150]},
          {"title": "Dragon", "rating": 9.0, "revenues": [190, 120, 150]}
        ]
        Output
        [
          {"title": "Batman", "rating": 9.5, "revenues": [100, 100, 100]},
          {"title": "Dragon", "rating": 9.0, "revenues": [190, 110, 150]},
          {"title": "Avenger", "rating": 9.0, "revenues": [150, 150, 150]},
          {"title": "Captain", "rating": 9.0, "revenues": [150, 150, 150]}
        ]
        Giải thích
        Batman đứng đầu vì có rating = 9.5, cao nhất.
        Ba phim còn lại đều có rating = 9.0.
        Xét quy tắc 2 (tổng doanh thu):
        Avenger: 450
        Captain: 450
        Dragon: 450
        Tổng doanh thu bằng nhau nên xét quy tắc 3:
        Dragon: doanh thu tuần cao nhất = 190
        Captain: doanh thu tuần cao nhất = 150
        Avenger: doanh thu tuần cao nhất = 150
        Dragon đứng thứ 2 vì có doanh thu tuần cao nhất.
        Captain và Avenger tiếp tục hòa ở quy tắc 3, nên xét quy tắc 4:
        Avenger đứng trước Captain theo bảng chữ cái.*/

        Movies[] m = {
                new Movies("Avenger", 9.0, new int[]{150, 150, 150}),
                new Movies("Batman", 9.5, new int[]{100, 100, 100}),
                new Movies("Captain", 9.0, new int[]{150, 150, 150}),
                new Movies("Dragon", 9.0, new int[]{190, 110, 150})
        };
        System.out.println("Ví dụ 1: ");
        for (Movies movies : m) {
            System.out.println("Title: " + movies.title + " |Rating: " + movies.rating + " |Revenues: " + Arrays.toString(movies.revenues));
        }
        System.out.println();
        System.out.println("Output: ");
        bubbleSort(m);
    }
}
