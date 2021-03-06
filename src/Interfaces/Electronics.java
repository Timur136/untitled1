package Interfaces;

public abstract class Electronics implements Deliverable, Orderable {

    private String make;
    private String model;
    private int quantity;
    private int price;

    @Override
    public int calcOrderPrice() {
        return 0;
    }

    public Electronics(String make, String model, int quantity, int price) {
        this.make = make;
        this.model = model;
        this.quantity = quantity;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
