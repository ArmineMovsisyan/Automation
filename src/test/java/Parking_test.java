
import auto_parking.Car;
import auto_parking.CarType;
import auto_parking.Main;
import auto_parking.Parking;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created BY Armine Movsisyan on 14 February,2020
 */
public class Parking_test {
    private Car[][] parkedCars;

    @BeforeClass

    public void addObject() {
        parkedCars = Parking.sortCars(Main.addObject());
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void checkMethod() {
        System.out.println("Exception");

    }


    @Test
    public void checkParkingFirstFloor() {
        for (int i = 0; i < parkedCars.length; i++) {
            if (parkedCars[0][i] != null) {
                Assert.assertEquals(parkedCars[0][i].getType(), CarType.COUPE);
            }


        }

    }

    //
    @Test
    public void checkParkingSecondFloor() {
        for (int i = 0; i < parkedCars.length; i++) {
            if (parkedCars[1][i] != null) {
                Assert.assertEquals(parkedCars[1][i].getType(), CarType.JEEP);
            }


        }
    }

    @Test
    public void checkParkingThirdFloor() {
        for (int i = 0; i < parkedCars.length; i++) {
            if (parkedCars[2][i] != null) {
                Assert.assertEquals(parkedCars[2][i].getType(), CarType.SEDAN);
            }
        }

    }
}
