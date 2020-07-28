package PoUchebniku;

public class ObjectSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInOb arr = new ArrayInOb(maxSize);
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);

        arr.display();
        arr.insertionSort();
        arr.display();
    }
}
