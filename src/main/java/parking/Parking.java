package parking;

/**
 * Created BY Armine Movsisyan on 12 February,2020
 */
public class Parking {
    private int carCount = 0;
    public void  addCar(Car car){
        carCount++;
        System.out.println("add car");


    }

    public int getCarCount() {
        return carCount;
    }
}
