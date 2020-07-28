package PoUchebniku;

public class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void bubbleSort() {
        int out;
        int in;
        for (out = 0; out < nElems; out++) {
            for (in = 0; in < nElems - 1; in++) {
                if (a[in] > a[in + 1])
                    swap(in, in + 1);
            }
        }
    }

}
