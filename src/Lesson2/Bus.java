package Lesson2;

public class Bus extends FutelAuto {

    private int passengerNumber;

    public Bus(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
    }

    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(int petroValue) {
        int volume = getAvailablePetrol() + petroValue;
        if (volume > getTankVolume()) {
            setAvailablePetrol(getTankVolume());
        }

    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassangers(int passengerNum) {
        this.passengerNumber += passengerNum;
        System.out.println("Загрузка пасажиров " + passengerNumber);
    }

    public void releasePassangers() {
        if (isRunning) {
            stop();
        }
        this.passengerNumber = 0;
        System.out.println("Пасажиров нет");
    }


}
