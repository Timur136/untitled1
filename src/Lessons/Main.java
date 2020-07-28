package Lessons;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            list1.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            list2.add(str2.charAt(i));
        }
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    list1.set(i, '0');
                    list2.set(j, '0');
                    continue;
                }
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != '0')
                list3.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) != '0')
                list3.add(list2.get(i));
        }
        for (Character i : list3) {
            System.out.print(i);
        }
    }
}
