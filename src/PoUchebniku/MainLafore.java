package PoUchebniku;

import java.util.Random;

public class MainLafore {
    public static void main(String[] args) {
        int maxSize = 100_000;
        Random random = new Random();
        ArrayBub arrayBub = new ArrayBub(maxSize);
        for (int i = 0; i < maxSize; i++) {
            arrayBub.insert(random.nextLong());
        }
        arrayBub.display();
        arrayBub.bubbleSort();
        System.out.println();
        arrayBub.display();
    }
}

class LowArray {
    private long[] a;
    private int size;

    public LowArray(int size) {
        a = new long[size];
    }

    public void setElement(int index, long value) {
        a[index] = value;
    }

    public long getElement(int index) {
        return a[index];
    }
}