package Lessons;

import java.io.IOException;

public class Ssss {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        System.out.println("Hello world");
//        System.out.println("Программировать - это легко!");
//        System.out.println("Программировать - это легко!");
//        System.out.println("Программировать - это легко!");
//        String a = " ";
//        System.out.print("Программировать - это легко!"+a+"Программировать - это легко!"+a+"Программировать - это легко!"
//        +a+"Программировать - это легко!"+a+"Программировать - это легко!");
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        System.out.println(a+" "+"+"+" "+b+" "+"+"+" "+c+" "+"="+" "+(a+b+c));
//        System.out.println(a+" "+"*"+" "+b+" "+"*"+" "+c+" "+"="+" "+(a*b*c));
//        System.out.println("("+a+" "+"+"+" "+b+") "+"*"+" "+c+" "+"="+" "+((a+b)*c));
//        Scanner in = new Scanner(System.in);
//        int c1 = System.in.read();
//        System.out.print(System.in.read() + System.in.read() + System.in.read() - ' ');
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println((a/b));
////        System.out.println((a%b));
//        int c1 = System.in.read();
//        System.out.println(c1);
//        int c1 = System.in.read();
//        int c2 = System.in.read();
//        int c3 = System.in.read();
//        System.out.println((c1+c3));
//        Scanner fl = new Scanner(System.in);
//        float f1 = fl.nextFloat();
//        float f2 = fl.nextFloat();
//        System.out.printf("%.2f",(f1/f2));
//        Scanner jeq = new Scanner(System.in);
//        long jeq1 = jeq.nextLong();
//        long jeq2 = jeq.nextLong();
//        long del = jeq1%jeq2;
//        System.out.println(del);

//        if(a>b){
//            System.out.println("A");
//        }
//        else {
//            System.out.println("B");
//        }
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int max = Math.max(Math.max(a,b),c);
//        System.out.println(max);
//        max = a > b ? a : b;
//        max = a > c ? a : c;
//        System.out.println(max);
//        Scanner in = new Scanner(System.in);
//        int c = 0;
//        while (c < 1000) {
//            System.out.print(5);
//            c++;
//            if (c % 80 == 0) {
//                System.out.println();
//            }
//        }
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int summ = 0;
//        while (a > 0) {
//            summ = summ + (a % 10);
//            a /= 10;
//        }
//        System.out.println(summ);
//        Scanner in = new Scanner(System.in);
//        int a, summ = 0;
//        while (in.hasNext()) {
//            a = in.nextInt();
//            summ += a;
//            System.out.println(summ);
//        }
//        Scanner in = new Scanner(System.in);
//        int a = 9;
//        int max = (int) -1e9;
//        while (a != 0) {
//            a = in.nextInt();
//            if (a > max && a != 0){
//                max = a;
//            }
//        }
//        System.out.println(max);
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int j = 1;
//        int pr = 0;
//        int summ = 0;
//
//        for (int i = 1; N!=0; i++) {
//            j = N % 10;
//            N = N / 10;
//            if (j % 2 == 0) {
//                if (pr == 0) {
//                    pr = (pr + 1) * j;
//                } else pr = pr * j;
//            } else summ = summ + 1;
//        }
//        System.out.print(summ+" "+pr);
//        Scanner in = new Scanner(System.in);
//        int a = (int) 1e9;
//
//        while (in.hasNext()) {
//            int b = in.nextInt();
//            if (b < a){
//                a = b;
//            }
//
//        }System.out.println(a);
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int buf;
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = in.nextInt();
//        }
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < n - 1; j++) {
////                if (a[j] > a[j + 1]) {
////                    buf = a[j + 1];
////                    a[j + 1] = a[j];
////                    a[j] = buf;
////                }
////            }
////        }
////        for (int i : a) System.out.println(i);
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        String s1 = in.nextLine();
//        System.out.println(s+"\n"+s1);
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        char[] a = s.toCharArray();
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] >= 'A' && a[i] <= 'Z') {
//                a[i] += (int) ('a' - 'A');
//            }
//        }
//        StringBuilder s1 = new StringBuilder();
//        s = Arrays.toString(a);
//        for (char i : a) {
//            s1.append(i);
//        }
//        System.out.println(s1);
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        String [] strings = s.split("-");
//        System.out.println(Arrays.toString(strings));
//        Arrays
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int k = 0;
//        if (N > 0 && N < 1000) {
//            int[] massiv = new int[N];
//            for (int i = 0; i < N; i++) {
//                massiv[i] = in.nextInt();
//                if (massiv[i] > 0 && massiv[i] % 2 == 0 && massiv[i] >= 10 && massiv[i] <= 99) {
//                    System.out.println(massiv[i] + " ");
//                    k+=1;
//                }
//            }
//            if(k == 0){
//                System.out.println(-1);
//            }
//        }
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int[] massiv2 = new int[N];
//        int schet = 0;
//        if (N > 0 && N < 1000) {
//            for (int i = 0; i < N; i++) {
//                massiv2[i] = in.nextInt();
//            }
//            for (int i = 0; i < N - 1; i++) {
//                if (massiv2[i] > massiv2[i + 1]) {
//                    schet += 1;
//                }
//
//            }
//            System.out.println(schet);
//        }
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int buf;
//        int[] m = new int[N];
//        if (N > 0 && N < 100) {
//            for (int i = 0; i < N; i++) {
//                m[i] = in.nextInt();
//            }
//                for (int i = 0; i < N; i++) {
//                    for (int j = 0; j < N - 1; j++) {
//                        if (m[j] > m[j + 1]) {
//                            buf = m[j];
//                            m[j] = m[j + 1];
//                            m[j + 1] = buf;
//                        }
//                    }
//                }
//            for (int i : m)
//                System.out.print(i+" ");
//        }
//            for (int i = 0; i < N - 1; i++) {
////                if (a[i] < a[i + 1]) {
////                    System.out.print(a[i] + " ");
////                    dlina += 1;
////                } else {
////                    if (dlina >= 1) {
////                        System.out.print(a[i]);
////                    }
////                    System.out.println();
////                    dlina = 0;
////                }
////            }
////            System.out.println("\n" + dlina);
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int dlina = 0;
//        int k = 0;
//        int[] a = new int[N];
//        if (N > 0) {
//            for (int i = 0; i < N; i++) {
//                a[i] = in.nextInt();
//            }
//            for (int i = 0; i < (N - 1); i++) {
//                if ((a[i] < a[i + 1]) && i != N - 1) {
////                    System.out.print(a[i] + " ");
//                    dlina += 1;
//                } else {
//                    if (i > 0) {
//                        if (a[i] > a[i - 1] && a[i] > a[i + 1])
//                            dlina += 1;
////                        System.out.print(a[i] + " ");
////                        System.out.println();
//                        if (k <= dlina) {
//                            k = dlina;
//                            dlina = 0;
//                        }
//                    }
//                }
//                if (a[i] < a[i + 1] && i + 2 == N) {
////                    System.out.print(a[i + 1] + " ");
//                    dlina += 1;
//                }
////                System.out.println(i + "AAAAAAAAAAAAAA");
//            }
////            System.out.println();
//            if (k > dlina) {
//                System.out.println(k);
//            } else System.out.println(dlina);
//        }
////        System.out.println(k);
//        for (int i = 0; i < (N - 1); i++) {
//            if ((a[i] < a[i + 1]) && i != N - 1) {
//                System.out.print(a[i] + " ");
//                dlina += 1;
//            } else {
//                if (i > 0) {
//                    if (a[i] > a[i - 1] && a[i] > a[i + 1])
//                        dlina += 1;
//                    System.out.print(a[i] + " ");
//                    System.out.println();
//                    if (k <= dlina) {
//                        k = dlina;
//                        dlina = 0;
//                    }
//                }
//            }
//            if (a[i] < a[i + 1] && i + 2 == N) {
//                System.out.print(a[i + 1] + " ");
//                dlina += 1;
//            }
////                System.out.println(i + "AAAAAAAAAAAAAA");
//        }
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        char a[]= s.toCharArray();
//        for (int i = 0; i < a.length; i++) {
//            if(a[i]>= 'A' && a[i]<='Z')
//                a[i]+='a'-'A';
//        }
//        System.out.print(a);
//        String str = "Последний символ в этой строке - о";
//        int last = str.length()-5;//длина строки - 1, так как отсчет начинается с 0
//        char ch = str.charAt(last);
//        System.out.println(ch);
//        Scanner in = new Scanner(System.in);
//        String str1 = in.next();
//        String str2 = in.next();
//        System.out.println(str1 + " " + str2);
//        int a = str1.compareTo(str2);
//        if (a < 0){
//            System.out.println(str1);
//        }else System.out.println(str2);
//        Scanner in = new Scanner(System.in);
//        String stroka = in.nextLine();
//        char q;
//        String[] stroka2 = stroka.split(" ");
//        for (int i = 0; i < stroka2.length; i++) {
//            q = stroka2[i].charArt(0);
//        }
//        System.out.println(Arrays.toString(stroka2));
//        char letter1;
//        Scanner in = new Scanner(System.in);
//        String s1 = in.nextLine();
//        String[] arrayWords = s1.split(" ");
//        for (int i = 0; i < arrayWords.length; i++) {
//            letter1 = arrayWords[i].charAt(0);
//            if (letter1 >= 'a' && letter1 <= 'h') {
//                System.out.println(arrayWords[i]);
//            } else if(letter1 >= 'A' && letter1 <= 'H') System.out.println(arrayWords[i]);
//        }
//        Scanner in = new Scanner(System.in);
//        String stroka = in.nextLine();
//        String nwstroka = stroka.replace(" - ", ":");
//        String nwstroka2 = nwstroka.replace(", ", "-");
//        String[] nwstroka3 = nwstroka2.split(":|-");
//        for (int i = 0; i < nwstroka3.length - 1; i++) {
//            if (i == 0){
//                System.out.println(nwstroka3[i]+":");
//            }else System.out.println("-"+nwstroka3[i]);
//        }
//        ArrayList<Integer> arrayListlist = new ArrayList<>();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            arrayListlist.add(i + 1);
//        }
//        arrayListlist.add(3, 87);
//        System.out.println(arrayListlist.contains(5));
//        arrayListlist.remove(2);
//        System.out.println(arrayListlist);
//        for (int i = 0; i < arrayListlist.size(); i++) {
//            arrayListlist.set(i, arrayListlist.get(i) * 7);
//        }
//        System.out.println(arrayListlist);
//        ArrayList<Integer> arrayListlist = new ArrayList<>();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        Random r = new Random();
//        for (int i = 0; i < 10; i++) {
//            arrayListlist.add(r.nextInt(100));
//        }
//        System.out.println(arrayListlist);
//        for (int i = 0; i < 20; i++) {
//            linkedList.add(r.nextInt(100));
//        }
//        System.out.println(linkedList);
//        arrayListlist.addAll(linkedList);
//        Collections.sort(arrayListlist);
//        System.out.println(arrayListlist);
//        ArrayList<String> s = new ArrayList<>();
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int i = 0; i < n; i++) {
//            s.add(in.next());
//        }
//        System.out.println(s);
//        Scanner in = new Scanner(System.in);
//        String str = in.next();
//        String str2 = "";
//        for (int i = str.length(); i > 0; i--) {
//            str2 = str2 + s;
//        Scanner in = new Scanner(System.in);
//        String str = in.next();
//        char[] strchar = str.toCharArray();
//        String strdlinnaya =
//        for (int i = strchar.length - 1; i >= 0; i--) {
//            System.out.print(strchar[i]);
//        Scanner in = new Scanner(System.in);
//        String str = in.next();
//        StringBuilder strb = new StringBuilder(str);
//        strb.reverse();
//        String str2 = str + strb;
//        System.out.println(str2);
//        Scanner in = new Scanner(System.in);
//        String str2 = "";
//        while (str2!="printList"){
//            final String str = in.next();
//            str2 = str;
//            System.out.println(str2);
//        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        if (in.next().equals("create")) {
//            int b = Integer.parseInt(in.next());
//            for (int i = 1; i <= b; i++) {
//                list.add(i);
//            }
//        }
//        while (!in.next().equals("printList")) {
//            String[] arr = in.next().split(" ");
//            if (arr[0].equals("add")) {
//                if(arr.length == 2){
//                    list.add(Integer.parseInt(arr[1]));
//                }else if(arr.length > 2){
//                    int b = Integer.parseInt(arr[1]);
//                    int c = Integer.parseInt(arr[2]);
//                    list.add(b,c);
//                }
//            }
//        }
//        System.out.println(list);
//        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        String str1 = in.nextLine();
//        String str2 = in.nextLine();
//        String str3 = in.nextLine();
//        String[] str1m = str1.split(" ");
//        String[] str2m = str2.split(" ");
//        String[] str3m = str3.split(" ");
//        for (int i = 0; i < str1m.length; i++) {
//            if (Integer.parseInt(str1m[i]) > 0) {
//                list.add(Integer.parseInt(str1m[i]));
//            }
//        }
//        for (int i = 0; i < str2m.length; i++) {
//            if (Integer.parseInt(str2m[i]) % 2 == 0) {
//                list.add(Integer.parseInt(str2m[i]));
//            }
//        }
//        for (int i = 0; i < str3m.length; i++) {
//            if (Integer.parseInt(str3m[i]) % 7 == 0) {
//                list.add(Integer.parseInt(str3m[i]));
//            }
//        }
//        Collections.sort(list);
//        for (int i = 0; i <list.size() ; i++) {
//            System.out.print(list.get(i) +" ");
//        }
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int i = 0; i < n; i++) {
//            list1.add(in.nextInt());
//        }
//        n = in.nextInt();
//        for (int i = 0; i < n; i++) {
//            list2.add(in.nextInt());
//        }
//        list1.addAll(list2);
//        Collections.sort(list1);
//        Collections.reverse(list1);
//        for (int i = 0; i < list1.size(); i++) {
//            System.out.print(list1.get(i) + " ");
//        }
//        Scanner in = new Scanner(System.in);
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        ArrayList<String> list3 = new ArrayList<>();
//        int lineCount = 0;
//        while (in.hasNextLine()) {
//            lineCount++;
//            String a = in.nextLine();
//            String[] command = a.split(" ");
//            switch (lineCount) {
//                case 1: {
//                    list1.addAll(Arrays.asList(command));
//                }
//                break;
//                case 2: {
//                    list2.addAll(Arrays.asList(command));
//                }
//                break;
//            }
//        }
//        for (int i = 0; i < list1.size(); i++) {
//            for (int j = 0; j < list2.size(); j++) {
//                if (list1.get(i).equals(list2.get(j))) {
//                    list3.add(list1.get(i));
//                }
//            }
//        }
//        Collections.sort(list3);
//        HashSet<String> m = new HashSet<>(list3);
//        for (String i : m) {
//            System.out.print(i+" ");
//        }
//        Scanner in = new Scanner(System.in);
//        String str = in.next();
//        char[] strm = str.toCharArray();
//        System.out.println(strm);
//        int k = strm.length;
//        for (int i = 0; i < strm.length; i++) {
//            k--;
//            for (int j = 0; j < strm.length; j++) {
//                if (i == 0 && j != strm.length - 1) {
//                    System.out.print(strm[j] + " ");
//                } else {
//                    if (j == 0 && i != strm.length - 1) {
//                        System.out.print(strm[i]);
//                    }
//                }
//                if (i != 0 && i != strm.length - 1 && j != 0 && j != strm.length - 1) {
//                    System.out.print(" 0");
//                }
//                if (i == strm.length - 1 & j == strm.length - 1) {
//                    for (int l = strm.length - 1; l > 0; l--) {
//                        System.out.print(strm[l] + " ");
//                    }
//                }
//                if (j == strm.length - 1 && i != 0 && i !=strm.length-1) {
//                    System.out.print(" " + strm[k] + " ");
//                } else if (j == strm.length - 1 && i == 0){
//                    System.out.print(strm[k]+" ");
//                }
//                if(j == strm.length - 1 && i == strm.length - 1){
//                    System.out.print(strm[k]+" ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//        Scanner in = new Scanner(System.in);
//        String str = in.next();
//        StringBuilder strb1 = new StringBuilder(str);
//        StringBuilder strb2 = new StringBuilder(str);
//        int k = strb1.length() - 1;
//        for (int i = 0; i < strb1.length() - 1; i++) {
//

//        System.out.println(strb);

    }
}


