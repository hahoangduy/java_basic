package Baitap52;

import java.util.ArrayList;
import java.util.Arrays;

public class Test12 {
    public static class Student {
        private String name;
        private int score;
        private int age;

        public Student(String name, int score, int age) {
            this.name = name;
            this.score = score;
            this.age = age;
        }
    }

    public static void bubbleSort(ArrayList<Student> st) {
        int n = st.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (st.get(j).score < st.get(j+1).score) {
                    Student tam = st.get(j);
                    st.set(j, st.get(j+1));
                    st.set(j+1, tam);
                }
                if (st.get(j).score == st.get(j+1).score) {
                    if (st.get(j).age > st.get(j+1).age) {
                        Student tam1 = st.get(j);
                        st.set(j, st.get(j+1));
                        st.set(j+1, tam1);
                    }
                }
            }
        }
        printArray(st);
    }

    public static void printArray(ArrayList<Student> st) {
        for (int i = 0; i < st.size(); i++) {
            System.out.println("Name: " + st.get(i).name + " |Score: " + st.get(i).score + " |Age: " + st.get(i).age);
        }
    }

    public static void main(String[] args) {
        /*Cho một mảng students chứa thông tin sinh viên. Mỗi đối tượng sinh viên có các thuộc tính: name (tên), score (điểm số), và age (tuổi).
        Bạn hãy sắp xếp danh sách này theo các quy tắc ưu tiên sau:
        Sắp xếp điểm số (score) theo thứ tự giảm dần (ai điểm cao xếp trước).
        Nếu điểm số bằng nhau, tiếp tục sắp xếp theo tuổi (age) theo thứ tự tăng dần (ai trẻ tuổi hơn xếp trước).
        Ví dụ 1:
        Input:
        [
          {"name": "Alice", "score": 85, "age": 20},
          {"name": "Bob", "score": 90, "age": 22},
          {"name": "Charlie", "score": 85, "age": 19}
        ]
        Output:
        [
          {"name": "Bob", "score": 90, "age": 22},
          {"name": "Charlie", "score": 85, "age": 19},
          {"name": "Alice", "score": 85, "age": 20}
        ]
        Giải thích: * "Bob" có điểm cao nhất (90) nên đứng đầu.
        "Charlie" và "Alice" cùng điểm (85), nhưng "Charlie" (19 tuổi) trẻ hơn "Alice" (20 tuổi) nên "Charlie" đứng trước "Alice".*/
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85, 20));
        students.add(new Student("Bob", 90, 22));
        students.add(new Student("Charlie", 85, 19));

        Student[] st1 = new Student[]{};
        for (Student st : students) {
            System.out.println("Name: " + st.name + " |Score: " + st.score + " |Age: " + st.age);
        }
        System.out.println();
        System.out.println("Output: ");
        bubbleSort(students);
    }
}
