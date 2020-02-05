package auto_parking;

/**
 * Created BY Armine Movsisyan on 04 February,2020
 */
class Parking {

    static Car[][] sortCars(Car[] carsToSort) {
        Car[][] array = new Car[6][6];

        for (int i = 0; i < carsToSort.length; i++) {

            if (carsToSort[i].getType().equals(CarType.COUPE)) {
                array[0][i] = carsToSort[i];

            } else if (carsToSort[i].getType().equals(CarType.JEEP)) {
                array[1][i] = carsToSort[i];
            } else {
                array[2][i] = carsToSort[i];
            }

        }
        return array;

    }
}
