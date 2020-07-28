package StructuriDannihBazoviyCourse;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 1;
        for (int i = 0; i < N; i++) {
            arrayList1.add(in.nextInt());
        }
        int size = N;
        for (int i = 0; i < arrayList1.size() - 1; i++) {
            if (!arrayList1.get(i).equals(arrayList1.get(i + 1)))
                arrayList1.add(i+1,99);
        }

    }
}

