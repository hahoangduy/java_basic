package Baitap53.Bai2;

public class StackString {
    private String[] array;
    private int SIZE;
    private int topIndex;
    public StackString(int size){
        SIZE = size;
        array = new String[SIZE];
        topIndex = -1;
    }

    public boolean push(String s) {
        if (!isFull()) {
            topIndex++;
            array[topIndex] = s;
            return true;
        }
        return false;
    }

    public String pop() {
        if (!isEmpty()) {
            String s = array[topIndex];
            topIndex--;
            return s;
        }
        return "";
    }

    public boolean isFull() {
        return topIndex == SIZE - 1;
    }
    public boolean isEmpty() {
        return topIndex < 0;
    }
}
