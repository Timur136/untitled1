package Interfaces;

import Lessons.Size;

public class Pizza implements Deliverable, Orderable {
    private String name;
    private int quantity;
    private int price;
    private Size size;

    public Pizza(String name, int quantity, int price, Size size) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public int calcDeliveryPrice() {
        if (size == Size.VERY_BIG || quantity > 1)
            return 0;
        else {
            return 7;
        }

    }

    @Override
    public int calcOrderPrice() {
        return quantity * price;
    }
}
