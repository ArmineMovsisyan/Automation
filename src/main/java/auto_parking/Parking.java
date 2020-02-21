package auto_parking;

/**
 * Created BY Armine Movsisyan on 04 February,2020
 */
public class Parking {

    public static Car[][] sortCars(Car[] carsToSort) {
        Car[][] array = new Car[3][3];

        for (int i = 0; i < carsToSort.length; i++) {
            try {

                if (carsToSort[i].getType().equals(CarType.COUPE)) {
                    array[0][i] = carsToSort[i];

                } else if (carsToSort[i].getType().equals(CarType.JEEP)) {
                    array[1][i] = carsToSort[i];
                } else {
                    array[2][i] = carsToSort[i];
                }

            } catch (ArrayIndexOutOfBoundsException e) {

                e.getStackTrace();

                System.out.println("Exception");
            }


        }
        return array;
    }
}
