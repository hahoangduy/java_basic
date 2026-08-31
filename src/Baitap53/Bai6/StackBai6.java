package Baitap53.Bai6;

public class StackBai6 {
    private Character[] array;
    private int SIZE;
    private int topIndex;
    public StackBai6(int size){
        SIZE = size;
        array = new Character[SIZE];
        topIndex = -1;
    }

    public boolean push(Character c) {
        if (!isFull()) {
            topIndex++;
            array[topIndex] = c;
            return true;
        }
        return false;
    }

    public char pop() {
        if (!isEmpty()) {
            Character c = array[topIndex];
            topIndex--;
            return c;
        }
        return ' ';
    }

    public char getChar() {
        return array[topIndex];
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= topIndex; i++) {
            sb.append(array[i]);
        }
        return sb.toString();
    }

    public boolean isFull() {
        return topIndex == SIZE - 1;
    }
    public boolean isEmpty() {
        return topIndex < 0;
    }
}
