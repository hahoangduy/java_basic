package Baitap53.Bai11;

import java.util.Arrays;

public class StackBai11 {
    private int[] array;
    private int SIZE;
    private int topIndex;

    public StackBai11(int size){
        SIZE = size;
        array = new int[SIZE];
        topIndex = -1;
    }

    public boolean push(int value) {
        if (!isFull()) {
            topIndex++;
            array[topIndex] = value;
            return true;
        }
        return false;
    }

    public int pop() {
        if (!isEmpty()) {
            int value = array[topIndex];
            topIndex--;
            return value;
        }
        return -1;
    }

    public int getValue() {
        return array[topIndex];
    }

    public boolean isFull() {
        return topIndex == SIZE - 1;
    }

    public boolean isEmpty() {
        return topIndex < 0;
    }

    public String print() {
        return Arrays.toString(array);
    }
}
