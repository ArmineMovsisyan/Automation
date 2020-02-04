package auto_parking;

/**
 * Created BY Armine Movsisyan on 04 February,2020
 */
public class Car {
    private int speed;
    private String model;
    private boolean stateEngine;
    private int maxSpeed;
    private CarType type;

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public boolean getStateEngine() {
        return stateEngine;
    }

    int addSpeed(int speed, int speedToAdd) {


        return speed + speedToAdd;
    }

    void reduceSpeed(int speed, int speedToReduce) {
        speed -= speedToReduce;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public CarType getType() {
        return type;
    }

    public Car(int speed, String model, boolean stateEngine, int maxSpeed, CarType type) {
        this.speed = speed;
        this.model = model;
        this.stateEngine = stateEngine;
        this.maxSpeed = maxSpeed;
        this.type = type;

    }

    @Override
    public String toString() {
        return String.format("%s,%s",model,type);
    }
}
