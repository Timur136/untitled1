package Interfaces;

import Lessons.Size;

public class InterfaceRunner {
    public static void main(String[] args) {
        Deliverable pizza = new Pizza("Neapolitano", 1, 20, Size.BIG);
        Deliverable callPhone = new CallPhone("Motorolla", "XT1575", 1, 250);
        Deliverable fridge = new Fridge("LG", "E9090", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(callPhone);
        printDeliveryPrice(fridge);
    }


    private static void printDeliveryPrice(Deliverable del) {
        System.out.println("Deliveryble " + del.calcDeliveryPrice());
    }
}
