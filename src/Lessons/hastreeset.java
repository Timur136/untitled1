package Lessons;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class hastreeset {
    public static void main(String[] args) {
//        HashSet<Integer> hashSet = new HashSet<>();
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        Random r = new Random();
//        for (int i = 0; i < 12; i++) {
//            treeSet.add(r.nextInt(100));
//            hashSet.add(r.nextInt(100));
//        }
//        System.out.println(treeSet);
//        System.out.println(hashSet);
//        Scanner in = new Scanner(System.in);
//        TreeSet<Character> treeSet = new TreeSet<>();
//        String s = in.nextLine();
//        s = s.toLowerCase();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
//                treeSet.add(s.charAt(i));
//            }
//        }
//        System.out.println(treeSet);
//        for (Character i : treeSet) {
//            System.out.print(i);
//        }
//        Scanner in = new Scanner(System.in);
//        TreeMap<Character, Integer> treeMap = new TreeMap<>();
//        String s = in.nextLine();
//        s = s.toLowerCase();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
//                if (treeMap.containsKey(s.charAt(i))) {
//                    treeMap.put(s.charAt(i), treeMap.get(s.charAt(i)) + 1);
//                }else {
//                    treeMap.put(s.charAt(i), 1);
//                }
//            }
//        }
//        for (Character ch : treeMap.keySet()) {
//            System.out.println(ch + ":" + treeMap.get(ch));
//        }
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        String[] s2 = s.split(" ");
//        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(s2));
//        System.out.println(treeSet);
//        System.out.println(treeSet.first());
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        while (in.hasNext()) {
            list1.add(in.nextInt());
        }
        if (list1.size() == n1) {
            for (int i = 0; i < n1; i++) {
                treeSet.add(list1.get(i));
            }
            if (treeSet.size() >= n2) {
                list2.addAll(treeSet);
                for (int i = 0; i < n2; i++) {
                    System.out.print(list2.get(i) + " ");
                }
            } else System.out.println("-1");
        } else System.out.println("-1");
    }
}
