package Algoritmi;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];
        int s = 0;
        if (N > 2) {
            a[0] = 1;
            a[1] = 1;
            a[2] = 2;
            for (int i = 2; i < N; i++) {
                a[i] = (a[i - 1] % 10 + a[i - 2] % 10);
                s = a[i];
            }
            if (s % 10 > 0) {
                System.out.println(s % 10);
            } else System.out.println(s);
        } else System.out.println(1);

        // put your code here
    }
}