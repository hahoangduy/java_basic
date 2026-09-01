package Baitap53.Bai10;

public class QueueBai10 {
    private int[] data;
    private int capacity;
    private int headIndex;
    private int tailIndex;
    private int size;

    public QueueBai10(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        headIndex = tailIndex = size = 0;
    }

    public boolean push(int value) {
        if (isFull())
            return false;
        data[tailIndex] = value;
        tailIndex = (tailIndex + 1) % capacity;
        size++;
        return true;
    }

    public int getValue() {
        if (isEmpty())
            return -1;
        return data[headIndex];
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int value = data[headIndex];
        headIndex = (headIndex + 1) % capacity;
        size--;
        return value;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return size;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public boolean isEmpty() {
        return size == 0;
    }

}
