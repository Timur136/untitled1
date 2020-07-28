package Lesson2;

public class Truck extends FutelAuto {

    private int caroWeight;

    public Truck(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int caroWeight) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.caroWeight = caroWeight;
    }

    public int getCaroWeight() {
        return caroWeight;
    }

    public void setCaroWeight(int caroWeight) {
        this.caroWeight = caroWeight;
    }

    public void load(){
        System.out.println("Загрузка");
    }

    public void unload(){
        System.out.println("Разгрузка");
    }
}
