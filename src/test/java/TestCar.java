import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import parking.Car;
import parking.Parking;

/**
 * Created BY Armine Movsisyan on 12 February,2020
 */
public class TestCar {
    Parking parking;

    @BeforeMethod
    public void parking() {
        parking = new Parking();
    }


    @Test
    public void testA() {

        parking.addCar(new Car());
        System.out.println("A");
        Assert.assertTrue(parking.getCarCount() == 1);
    }

    @Test
    public void testB() {
        Parking parking = new Parking();
        parking.addCar(new Car());
        System.out.println("A");
        Assert.assertFalse(parking.getCarCount() == 0);
        System.out.println("B");
    }

    @AfterMethod
    public void afterMethod() {

    }

}
