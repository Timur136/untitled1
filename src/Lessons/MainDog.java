package Lessons;

public class MainDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.setSize(Size.AVERAGE);
        System.out.println(dog1.getSize());
        dog1.bark();


        Size s = Size.SMALL;
        System.out.println(s);
        Size s1 = Size.valueOf("BIG");
//        System.out.println(s1);

        Size[] values = Size.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
