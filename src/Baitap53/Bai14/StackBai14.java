package Baitap53.Bai14;

import java.util.ArrayList;
import java.util.HashMap;

public class StackBai14 {
    private ArrayList<HashMap<Integer, Integer>> arrayList;

    public StackBai14(){
        arrayList = new ArrayList<>();
    }

    public void push(int index, int value) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(index, value);
        arrayList.add(map);
    }

    public HashMap<Integer, Integer> pop() {
        if (isEmpty()) {
            return null;
        }
        return arrayList.remove(arrayList.size() - 1);
    }

    public int peekTemp() {
        if (isEmpty()) return -1;
        int index = peekIndex();
        return arrayList.get(arrayList.size() - 1).get(index);
    }

    public int peekIndex() {
        if (isEmpty()) {
            return -1;
        }
        return arrayList.get(arrayList.size() - 1).keySet().iterator().next();
    }

    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

}
