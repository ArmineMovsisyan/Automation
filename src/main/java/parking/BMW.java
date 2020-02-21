package parking;

public class BMW extends Car {
    BMW(String model, CarType type,String carNumber,int currentSpeed){
        setModel(model);
        setType(type);
        setCarNumber(carNumber);
        setCurrentSpeed(currentSpeed);
    }

    @Override
    void startEngine() {
        if(isEngineState()){
            System.out.println("Engine is already started.");
        } else {
            setEngineState(true);
            System.out.println("Engine started");
        }
    }

    @Override
    void stopEngine() {
        if(isEngineState()){
            setEngineState(false);
            System.out.println("Engine is turned off.");
        } else{
            System.out.println("Engine is already turned off.");
        }

    }

}
