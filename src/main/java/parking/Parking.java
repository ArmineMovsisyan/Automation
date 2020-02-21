package parking;

public class Parking {
    private int count;
    private int parkingLength;
    private Car[][] arr;

    public Parking(int parkingLength) {
        this.parkingLength = parkingLength;
        this.arr = new Car[parkingLength][parkingLength];
    }


    public void addCarInParking(Car car) {
        if (count == parkingLength * parkingLength) {
            System.out.println("Parking is full, please remove a car!");
        } else {
            switch (car.getType()) {
                case JEEP:
                    addCarLogic(0, car);
                    break;
                case SEDAN:
                    addCarLogic(1, car);
                    break;
                case COUPE:
                    addCarLogic(2, car);
                    break;
                default:
                    System.out.println("This type of car cannot be parked here.");
            }
        }
    }

    private void addCarLogic(int floor, Car car) {
        for (int i = 0; i < arr[floor].length - 1; i++) {
            if (arr[floor][i] != null && car.getModel().equals(arr[floor][i].getModel())) {
                System.out.println("The car is already in parking.");
                break;
            } else if (arr[floor][i] == null) {
                arr[floor][i] = car;
                count += 1;
                System.out.println("Car is added.");
                break;
            } else {
                if (i == arr[floor].length - 1) {
                    System.out.println("This floor is full, bro.");
                }

            }


        }

    }

    public void checkIndex(int index) {
        if (index < arr.length - 1) {
            System.out.println("Your index is corresponds to array index!");
        } else {
            throw new UncheckedException("Exception: ArrayIndexOutOfBounds");
        }


    }

    public void checkNumber(int number, int size) {
        if (number != size) {
            throw new UncheckedException("Exception: This car type can't enter in parking");

        } else {
            System.out.println("Your car number is Armenian");
        }
    }


    public void checkSpeed(int currentSpeed, int speed) {
        if (currentSpeed > speed) {
            throw new UncheckedException("Exception: Dx~xk!");

        } else {
            System.out.println("Your car speed less than " + speed + " km.h!");
        }
    }

    public void checkParkingPlace(int i, int j) throws CheckedException {

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == null) {
                    throw new CheckedException("Exception: In the parking doesn't  exist car with that  index!");
                }

            }


        }
    }
}


