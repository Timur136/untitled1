package Lesson2;

public class Auto {

    private String producer;
    private String model;
    private EngineType engineType;
    private int currentSpeed;
    protected boolean isRunning;

    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Start");
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Stop");
    }

    public void accelerate(int kmPerHour) {
        currentSpeed += kmPerHour;
        System.out.println("currentSpeed is " + currentSpeed);
    }

    public Auto(String producer, String model, EngineType engineType) {
        this.producer = producer;
        this.model = model;
        this.engineType = engineType;
        System.out.println("Auto was initialised");
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                ", currentSpeed=" + currentSpeed +
                ", isRunning=" + isRunning +
                '}';
    }
}
