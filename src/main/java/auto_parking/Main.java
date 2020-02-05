package auto_parking;

/**
 * Created BY Armine Movsisyan on 04 February,2020
 */

public class Main {
    public static void main(String[] args) {
        Car[] initCars = {
                new BMW(0, "BMW X6", true, 220, CarType.JEEP),
                new BMW(0, "BMW 760", true, 320, CarType.SEDAN),
                new BMW(0, "BMW M3", true, 320, CarType.COUPE),

                new Mercedes(50, "Mercedes AMG S63", true, 220, CarType.COUPE),
                new Mercedes(60, "Mercedes G500", false, 300, CarType.JEEP),
                new Mercedes(75, "Mercedes E320", true, 320, CarType.SEDAN)

        };
        trafficCar(initCars[0], 50);
        trafficCar(initCars[1], 40);
        trafficCar(initCars[2], 30);
        trafficCar(initCars[3], 60);
        trafficCar(initCars[4], 65);
        trafficCar(initCars[5], 20);
        printCars(Parking.sortCars(initCars));

    }

    private static void trafficCar(Car car, int speedToAdd) {
        int speed = car.getSpeed();
        if (car.getStateEngine()) {
            if (car.getSpeed() != 0 || car.getSpeed() < car.getMaxSpeed()) {
                speed = car.addSpeed(car.getSpeed(), speedToAdd);
                if (speed > car.getMaxSpeed()) {
                    System.out.println("Warning!Your speed is greater than the maximum speed! Car can crash ");
                } else {
                    System.out.println(car.getModel() + ":speed " + speed);
                }
            } else {
                System.out.println("Your car " + car.getModel() + " doesn't move");
            }
        }
    }

    private static void printCars(Car[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != null) {
                    System.out.print(array[i][j] + "  ");
                }
            }
            System.out.println();
        }

    }
}

