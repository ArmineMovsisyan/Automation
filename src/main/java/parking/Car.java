package parking;

public abstract class Car {
    private int currentSpeed;
    private boolean engineState;
    private CarType type;
    private String model;
    private String carNumber;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getCarNumber() {
        return carNumber;
    }

    enum CarType {
        SEDAN,
        JEEP,
        COUPE
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public boolean isEngineState() {
        return engineState;
    }

    public void setEngineState(boolean engineState) {
        this.engineState = engineState;
    }

    void changeSpeed(int speed) {
        if (speed > 0) {
            System.out.println("Your speed will be added by " + speed);
        } else {
            System.out.println("Your speed will decrease by " + speed);
        }
        currentSpeed += speed;
        System.out.println("Current speed is " + currentSpeed);
    }

    abstract void startEngine();

    abstract void stopEngine();


    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

}
