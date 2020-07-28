package Lessons;

public class ParametrList<E> {
    private Object[] data;
    private int size;

    public ParametrList() {
        size = 0;
        data = new Object[100];
    }

    public int size() {
        return size;
    }

    public void add(E value) {
        data[size] = value;
        size++;
    }

    public Object get(int index) {
        if (index <= size)
            return data[index];
        else return -1;
    }

    public void set(int index, E object) {
        data[index] = object;
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }
}
