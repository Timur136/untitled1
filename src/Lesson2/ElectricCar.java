package Lesson2;

public class ElectricCar extends Auto {

    private int batteryValue;
    private int passengersNumber;

    public ElectricCar(String producer, String model, int batteryValue, int passengersNumber) {
        super(producer, model, EngineType.ELECTRIC);
        this.batteryValue = batteryValue;
        this.passengersNumber = passengersNumber;
    }

    public void charge(){
        System.out.println("Battery is ready");
    }

    public int getBatteryValue() {
        return batteryValue;
    }

    public void setBatteryValue(int batteryValue) {
        this.batteryValue = batteryValue;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }
}
