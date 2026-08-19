package Baitap53.Bai1;

public class StackChar {

    private Character[] array;
    private int SIZE;
    private int topIndex;
    public StackChar(int size){
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

    public boolean isFull() {
        return topIndex == SIZE - 1;
    }
    public boolean isEmpty() {
        return topIndex < 0;
    }
}
