package Baitap53.Bai14;

import Baitap53.Bai11.StackBai11;

import java.util.Arrays;

public class Main {

    public static int[] numberOfDays(int[] temperatures) {
        StackBai14 stack = new StackBai14();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peekTemp()) {
                int prevIndex = stack.peekIndex();
                result[prevIndex] = i - prevIndex;
                stack.pop();
            }
            stack.push(i, temperatures[i]);
            }
        return result;
    }

    public static int[] numberOfDays2(int[] temperatures) {
        StackBai14_2 stack = new StackBai14_2();
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        /*Cho một mảng số nguyên temperatures biểu diễn nhiệt độ hàng ngày,
        hãy trả về một mảng answer sao cho answer[i] là số ngày bạn phải chờ sau ngày thứ i để có nhiệt độ ấm hơn.
        Nếu không có ngày nào trong tương lai thỏa mãn điều kiện này, thì giữ answer[i] == 0.
        Ví dụ 1:
        textInput: temperatures = [73,74,75,71,69,72,76,73]
        Output: [1,1,4,2,1,1,0,0]
        Ví dụ 2:
        textInput: temperatures = [30,40,50,60]
        Output: [1,1,1,0]
        Ví dụ 3:
        textInput: temperatures = [30,60,90]
        Output: [1,1,0]*/

        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println("Input: " + Arrays.toString(temperatures1));
        System.out.println("Output: " + Arrays.toString(numberOfDays(temperatures1)));
        System.out.println("Output2: " + Arrays.toString(numberOfDays2(temperatures1)));
        System.out.println();
        int[] temperatures2 = {30, 40, 50, 60};
        System.out.println("Input: " + Arrays.toString(temperatures2));
        System.out.println("Output: " + Arrays.toString(numberOfDays(temperatures2)));
        System.out.println("Output2: " + Arrays.toString(numberOfDays2(temperatures2)));
        System.out.println();
        int[] temperatures3 = {30, 60, 90};
        System.out.println("Input: " + Arrays.toString(temperatures3));
        System.out.println("Output: " + Arrays.toString(numberOfDays(temperatures3)));
        System.out.println("Output2: " + Arrays.toString(numberOfDays2(temperatures3)));
    }
}
