package Lesson2;

public class MainAuto {
    public static void main(String[] args) {

        Truck truck = new Truck("Volvo", "VHL 300", EngineType.PETROL, 300, 500, 1000);
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(50);
        truck.load();
        truck.unload();

        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 4, 100500);
        electricCar.start();
        electricCar.stop();
        electricCar.charge();
    }
}
