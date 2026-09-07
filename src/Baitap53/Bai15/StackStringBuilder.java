package Baitap53.Bai15;

public class StackStringBuilder {
    private StringBuilder[] array;
    private int SIZE;
    private int topIndex;
    public StackStringBuilder(int size){
        SIZE = size;
        array = new StringBuilder[SIZE];
        topIndex = -1;
    }

    public boolean push(StringBuilder sb) {
        if (!isFull()) {
            topIndex++;
            array[topIndex] = sb;
            return true;
        }
        return false;
    }

    public StringBuilder pop() {
        if (!isEmpty()) {
            StringBuilder sb = array[topIndex];
            topIndex--;
            return sb;
        }
        return null;
    }
    public StringBuilder peek() {
        return array[topIndex];
    }
    public boolean isFull() {
        return topIndex == SIZE - 1;
    }
    public boolean isEmpty() {
        return topIndex < 0;
    }
}
