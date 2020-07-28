package PoUchebniku;

public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] > value)
                break;
        }
        for (int i = nElems; i > j; i--) {
            a[i] = a[i - 1];
        }
        a[j] = value;
        nElems++;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems)
            return false;
        else {
            for (int i = j; i < nElems; i++) {
                a[i] = a[i + 1];
            }
            nElems--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public long[] merge(long[] a1, long[] a2) {
        long[] a3 = new long[a1.length + a2.length];
        int x = 0;
        int y = 0;
        for (int i = 0; i < a1.length + a2.length; i++) {
            if (y == a2.length || x < a1.length
                    && a1[x] <= a2[y])
                a3[i] = a1[x++];
            else
                a3[i] = a2[y++];
        }
        return a3;
    }

    public void noDups() {
        for (int i = 0; i < nElems; i++) {
            for (int j = 0; j < nElems - 1; j++) {
                if (a[j] == a[j + 1]) {
                    for (int k = j; k < nElems - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    nElems--;
                }
            }
        }
    }
}
