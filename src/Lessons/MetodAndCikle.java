package Lessons;

import java.util.Scanner;

public class MetodAndCikle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long summ = 0;

        for (long i = 1; i <= n; i++) {
            summ +=i;


        }System.out.println(summ);
//            System.out.println(Integer.toBinaryString(n));



//        int b =(int) 1e9;
//        while (in.hasNext()) {
//            int a = in.nextInt();
//            if (b > a) b = a;
//        }
//        System.out.println(b);
//            n = in.nextInt();
//            System.out.println(n);
//        int N = in.nextInt();
//        int proizv = 1;
//        int K = 0;
//        for (int i = 1; N >= 1; i++) {
//            int c = N % 10;
//            if (c % 2 == 0) {
//                proizv = proizv * c;
//
//            } else {
//                K++;
//            }
//            N = N / 10;
//
//        }if(proizv == 1) proizv = 0;
//        System.out.println(K+" "+proizv);
    }
}

//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = a > b ? a : b;
//        System.out.println(c);
//        int c = 0;
//        while (c < 1000) {
//            System.out.println(c);
//            c++;
//            if (c % 80 == 0)
//                System.out.println();
//        int c = in.nextInt();
//        int summ = 0;
//        while (c > 0) {
//            summ += c % 10;
//            System.out.println(summ);
//            c /= 10;
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        if ((a > b) && (a > c)) {
//            System.out.println(a);
//        } else if ((b > c) && (b > a)){
//            System.out.println(b);
//        }else System.out.println(c);
//        int n = 0;
//        int summ;
//        while(in.hasNext()){
//            n = in.nextInt();
//            System.out.println(n);
//            for (int i = 0; i < ; i++) {
//        int N = in.nextInt();
//        int K = N;
//        while (N > 0 && N < 10000) {
//            System.out.print("[");
//            N--;
//        }
//        while (K > 0) {
//            System.out.print("]");
//            K--;
//        }



