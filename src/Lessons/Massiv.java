package Lessons;

import java.util.Arrays;
import java.util.Scanner;

public class Massiv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int buf;
//        for (int i : a){
//            System.out.println(i);
//        }
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - 1; j++) {
//                if (a[j] > a[j + 1]) {
//                    buf = a[j + 1];
//                    a[j + 1] = a[j];
//                    a[j] = buf;
//                }
//            }
////            a[i] = in.nextInt();
//        }
//        for (int i : a) System.out.println(i);
////        for (int i : a) System.out.println(i);
    }
}
