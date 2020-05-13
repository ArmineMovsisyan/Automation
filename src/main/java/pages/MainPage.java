package pages;

import helper.DriverSetup;
import helper.WaitHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

/**
 * Created BY Armine Movsisyan on 12 May,2020
 */
public class MainPage extends BasePage {
    @FindBy(how = How.CSS, using = ".form-control")
    private WebElement selectInstitution;

    @FindBy(how = How.CSS, using = "button[class='btn btn-primary btn-sm']")
    private WebElement consultButton;

    @FindBy(how = How.CSS, using = "a[href*='directivos.asp']")
    private WebElement directorsLink;

    @FindBy(how = How.CSS, using = "a[href*='accionistas.asp']")
    private WebElement shareholdersLink;

    @FindBy(how = How.CSS, using = "a[href*='auditores.asp']")
    private WebElement auditorsLink;


    public MainPage() {
        super("/");
    }


    public void selectFinancialInstitution(String code) {
        Select financialInstitution = new Select(selectInstitution);
        financialInstitution.selectByValue(code);

    }

    public void clickOnConsultButton() {
        WaitHelper.waitForElementToBeClickable(DriverSetup.getDriver(), consultButton);
        consultButton.click();
    }


    public void clickOnDirectorsLink() {
        directorsLink.click();
    }

    public void clickOnShareholdersLink() {
        shareholdersLink.click();
    }

    public void clickOnAuditorsLink() {
        auditorsLink.click();
    }


    public ArrayList<String> setInstitutionValue() {
        ArrayList<String> value = new ArrayList<>();
        value.add("00340");
        value.add("00017");
        value.add("00426");


        return value;
    }


}
