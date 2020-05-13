package helper;

/**
 * Created BY Armine Movsisyan on 12 May,2020
 */
public interface ComponentHelper {
    default void navigateBack() {
        DriverSetup.getDriver().navigate().back();
    }
}
