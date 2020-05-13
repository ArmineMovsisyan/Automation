package pages;

import helper.DriverSetup;
import org.openqa.selenium.*;

import java.util.ArrayList;

/**
 * Created BY Armine Movsisyan on 12 May,2020
 */
public class ShareholdersPage extends BasePage {
    public ShareholdersPage() {
        super("/");
    }

    private ArrayList<String> shareHolderNames = new ArrayList<>();


    public ArrayList<String> getShareholderData(int number) {
        shareHolderNames.clear();
        for (number = 1; number < 10; number++) {

            try {
                WebElement directors = DriverSetup.getDriver().findElement(By.cssSelector(" table.table.table-BCRA.table-bordered.table-hover.table-responsive > tbody > tr:nth-child(" + number + ") > td:nth-child(1)"));
                shareHolderNames.add(directors.getText());

            } catch (ElementNotInteractableException | StaleElementReferenceException | NoSuchElementException ignored) {

            }

        }
        return shareHolderNames;

    }

    public boolean isNameRepeated(ArrayList<ArrayList<String>> names) {

        for (String firstOrganization : names.get(0)) {
            for (String secondOrganization : names.get(1)) {
                for (String thirdOrganization : names.get(2)) {
                    if (firstOrganization.contains(secondOrganization) || firstOrganization.contains(thirdOrganization) || secondOrganization.contains(thirdOrganization)) {
                        return true;
                    }
                }

            }
        }
        return false;
    }
}

