package parking;

public class Main {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(" AMG S63", Car.CarType.COUPE, "33 QA 333", 50);
        BMW bmw = new BMW("X6", Car.CarType.JEEP, "5555", 40);

        Parking park = new Parking(3);

        park.addCarInParking(mercedes);
        park.addCarInParking(bmw);
        park.checkIndex(5);
        park.checkNumber(bmw.getCarNumber().length(), 9);

        park.checkSpeed(mercedes.getCurrentSpeed(), 40);
        try {
            park.checkParkingPlace(1, 2);
        } catch (CheckedException e) {
            e.printStackTrace();
        }
    }

}
