package PoUchebniku;

public class ArrayIns {
    private long[] a;
    private int nElems;

    public ArrayIns(int max) {
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

    public void insertionSort() {
        int in;
        int out;
        for (out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while (in > 0 && a[in - 1] >= temp) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }

    public double median() {
        insertionSort();
        if (nElems % 2 == 0) {
            return (double) nElems / 2;
        } else {
            return ((double) ((nElems - 1) / 2)
                    + (double) (nElems / 2)) / 2;
        }
    }

//    public long[] noDups() {
//        insertionSort();
//        TreeSet<Long> treeSet = new TreeSet<>();
//        for (int i = 0; i < nElems; i++) {
//            treeSet.add(a[i]);
//        }
//
//    }
}
