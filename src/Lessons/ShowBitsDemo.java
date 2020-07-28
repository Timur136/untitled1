package Lessons;

public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBit b = new ShowBit(8);
        ShowBit i = new ShowBit(32);
        ShowBit li = new ShowBit(64);

        System.out.println("123 в двоичном представлении: ");
        b.show(123);

        System.out.println("\n87987 в двоичном представлении: ");
        b.show(87987);

        System.out.println("\n237658768 в двоичном представлении: ");
        b.show(237658768);

        System.out.println("\nМладшие 8 битов числа 87987 " +
                "в двоичном представлении");
        b.show(87987);
    }
}
