package StructuriDannihBazoviyCourse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a1 = new int[2];
        int[] a2 = new int[3];
        int[] a3 = new int[a1.length + a2.length];
        int countA1 = 0;
        int countA2 = 0;
        int maxLength = Math.max(a1.length, a2.length);
        for (int i = 0; i < a1.length; i++) {
            a1[i] = in.nextInt();
        }
        for (int i = 0; i < a2.length; i++) {
            a2[i] = in.nextInt();
        }
        for (int i = 0; i < a3.length; i++) {
            a3[i] = Math.min(a1[countA1], a2[countA2]);
            if (a1[countA1] <= a2[countA2]) {
                countA1++;
                if (countA1 == a1.length) {
                    while (countA2 != a2.length) {
                        i++;
                        a3[i] = a2[countA2];
                        countA2++;
                    }
                    break;
                }
            } else if (a1[countA1] >= a2[countA2]) {
                countA2++;
                if (countA2 == a2.length) {
                    while (countA1 != a1.length) {
                        i++;
                        a3[i] = a1[countA1];
                        countA1++;
                    }
                    break;
                }
            }
        }


        for (int i : a1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : a2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : a3) {
            System.out.print(i + " ");
        }
    }
}

class StaticMassiv {
    public void ls1() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int summ = 0;
        for (int i = 0; i < N; i++) {
            int buf = in.nextInt();
            if (buf % 2 == 0 && buf > 0)
                summ += buf;
        }
        System.out.println(summ);
    }

    public void ls2() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int summ1 = 0;
        for (int i = 1; i <= N; i++) {
            int buf = in.nextInt();
            if (buf % 2 == 0 && buf > 0 && i % 2 == 0)
                summ1 += buf;
        }
        System.out.println(summ1);
    }

    public void ls3() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int summ = 0;
        int count = 0;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            int buf = in.nextInt();
            array[i] = buf;
            summ += buf;
        }
        int srarif = summ / N;
        for (int i = 0; i < N; i++) {
            if (array[i] < srarif)
                count++;
        }
        System.out.println(count);
    }

    public void ls5() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] m1 = new int[N];
        int summ = 0;
        for (int i = 0; i < N; i++) {
            m1[i] = Math.abs(in.nextInt());
            while (m1[i] != 0) {
                summ += m1[i] % 10;
                m1[i] /= 10;
            }
        }
        System.out.println(summ);
    }

    public int ls6max(int[] array) {
        int max = -101;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    public int ls6min(int[] array) {
        int min = 101;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public void ls7() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;
        int buf = 0;
        int[] massiv = new int[N];
        for (int i = 0; i < N; i++) {
            massiv[i] = in.nextInt();
            if (massiv[i] == 1)
                count = 1;
        }
        for (int i = 1; i < N; i++) {
            if (massiv[i] == 1 && massiv[i - 1] == 1) {
                count++;
            } else {
                if (buf < count) {
                    buf = count;
                    count = 1;
                }
            }
        }
        System.out.println(Math.max(count, buf));
    }

    public void ls9() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] m = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            if (a != 0) {
                m[count] = a;
                count++;
            }
        }
        for (int i : m) {
            System.out.print(i + " ");
        }
    }

    public int ls10(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }


}