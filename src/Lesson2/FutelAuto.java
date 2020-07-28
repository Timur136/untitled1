package Lesson2;

public class FutelAuto extends Auto {

    private int availablePetrol;
    private int tankVolume;

    public void fuelUp(int petroValue) {
        availablePetrol += petroValue;
        System.out.println("Заправка");
    }

    public FutelAuto(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume) {
        super(producer, model, engineType);
        this.availablePetrol = availablePetrol;
        this.tankVolume = tankVolume;
    }

    public int getAvailablePetrol() {
        return availablePetrol;
    }

    public void setAvailablePetrol(int availablePetrol) {
        this.availablePetrol = availablePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}
