package Lessons;

import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {
        Array1<Integer> aI = new Array1<>();
        Array1<String> aS = new Array1<>();
        aI.add(1);
        aI.add(1);
        aI.add(1);
        aI.add(1);
        aS.add("world");
        aS.add("world");
        aS.add("world");
        aS.add("world");
        System.out.println(aI);
        System.out.println(aS);
        ArrayList<Integer> as = new ArrayList<>();
    }
}
