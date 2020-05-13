package pages;

import helper.DriverSetup;
import org.openqa.selenium.*;

import java.util.ArrayList;

/**
 * Created BY Armine Movsisyan on 12 May,2020
 */
public class AuditorsPage extends BasePage {

    private ArrayList<String> auditorsName = new ArrayList<>();

    public AuditorsPage() {
        super("/");
    }

    public ArrayList<String> getAuditorsData(int number) {
        auditorsName.add(DriverSetup.getDriver().findElement(By.cssSelector(" table:nth-child(6) > tbody > tr:nth-child(1) > td:nth-child(2)")).getText().replaceAll(",", ""));

        for (number = 2; number < 10; number++) {

            try {
                WebElement directors = DriverSetup.getDriver().findElement(By.cssSelector(" tbody > tr:nth-child(" + number + ") > td:nth-child(2)"));
                auditorsName.add(directors.getText().replaceAll(",", " "));

            } catch (ElementNotInteractableException | StaleElementReferenceException | NoSuchElementException ignored) {


            }

        }
        return auditorsName;

    }


}
