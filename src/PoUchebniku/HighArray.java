package PoUchebniku;

public class HighArray {
    private long[] a;
    private int nElems;
    private long max = 0;

    public HighArray(int maxSize) {
        a = new long[maxSize];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] == searchKey)
                break;
        }
        if (j == nElems)
            return false;
        else
            return true;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (value == a[j])
                break;
        }
        if (j == nElems)
            return false;
        else {
            for (int i = j; i < nElems - 1; i++) {
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

    public long getMax() {
        if (nElems == 0)
            return -1;
        for (int i = 0; i < nElems; i++) {
            if (max < a[i])
                max = a[i];
        }
        return max;
    }

    public void removeMax() {
        int index = 0;
        for (int i = 0; i < nElems; i++) {
            if (a[i] == getMax()) {
                index = i;
                break;
            }
        }
        for (int i = index; i < nElems - 1; i++) {
            a[i] = a[i + 1];
        }
        nElems--;
    }
}


