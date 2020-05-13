package pages;

import helper.DriverSetup;
import org.openqa.selenium.*;

import java.util.ArrayList;

/**
 * Created BY Armine Movsisyan on 12 May,2020
 */
public class DirectorsPage extends BasePage {
   private  ArrayList<String> directoryNames = new ArrayList<>();

    public DirectorsPage() {
        super("/");
    }

    public ArrayList<String> getDirectorsData(int number) {

        for (number = 1; number < 100; number++) {

            try {
                WebElement directors = DriverSetup.getDriver().findElement(By.cssSelector("  table.table.table-BCRA.table-bordered.table-hover.table-responsive > tbody > tr:nth-child(" + number + " ) > td:nth-child(2)"));
                directoryNames.add(directors.getText());

            } catch (ElementNotInteractableException | StaleElementReferenceException | NoSuchElementException ignored) {

            }

        }
        return directoryNames;

    }

}
