package Baitap53.Bai14;

import java.util.ArrayList;
public class StackBai14_2 {

    private ArrayList<Integer> list;

    public StackBai14_2() {
        list = new ArrayList<>();
    }

    public void push(int index) {
        list.add(index);
    }

    public int pop() {
        if (isEmpty()) return -1;
        return list.remove(list.size() - 1);
    }

    public int peek() {
        if (isEmpty()) return -1;
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
