package OOP;

import java.util.ArrayList;
import java.util.Collections;

public class Stack {
    private ArrayList<Integer> list = new ArrayList<>();

    public void push(int value) {
        list.add(0, value);
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public int pop() {
        int buf = list.get(0);
        list.remove(0);
        return buf;
    }

    public int size() {
        return list.size();
    }

    public int getMin() {
        int min = 0;
        if (list.size() > 0) min = Collections.min(list);
        return min;
    }

    public int getMax() {
        int max = 0;
        if (list.size() > 0) max = Collections.max(list);
        return max;
    }

    public boolean isEmpty() {
        boolean proverka = true;
        if (list.size() != 0)
            proverka = false;
        return proverka;
    }

}
