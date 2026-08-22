package Baitap53.Bai5;

public class QueueBai5 {
    private int[] data;
    private int capacity;
    private int headIndex;
    private int tailIndex;

    public QueueBai5(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        headIndex = tailIndex = -1;
    }

    public boolean push(int value) {
        if (!isFull()) {
            if (isEmpty()) {
                headIndex++;
            }
            tailIndex++;
            data[tailIndex] = value;
            return true;
        }
        return false;
    }

    public int getValue() {
        if (!isEmpty()) {
            return data[headIndex];
        }
        return -1;
    }

    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = data[headIndex];
            headIndex++;
            if (headIndex > tailIndex) {
                headIndex = tailIndex = -1;
            }
        }
        return value;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return tailIndex - headIndex + 1;
    }
    public boolean isFull() {
        return tailIndex == capacity - 1;
    }
    public boolean isEmpty() {
        return (headIndex == -1) && (tailIndex == -1);
    }

}
