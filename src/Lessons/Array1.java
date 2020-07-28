package Lessons;

public class Array1<E> {
    private Object[] data;
    private int length;

    public Array1() {
        length = 0;
        data = new Object[100];
    }

    public void add(E element) {
        data[length] = element;
        length++;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++)
            s.append(data[i]).append(" ");
        return s.toString();
    }
}
