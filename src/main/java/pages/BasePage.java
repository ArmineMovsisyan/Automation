package pages;

import helper.ComponentHelper;
import helper.Config;
import helper.DriverSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import static org.yaml.snakeyaml.tokens.Token.ID.Error;

/**
 * Created BY Armine Movsisyan on 11 May,2020
 */
public class BasePage extends LoadableComponent implements ComponentHelper {
    private String serverUrl;
    private WebDriver driver;
    private String pagePath;


    protected Logger log = LoggerFactory.getLogger(BasePage.class);

     BasePage(String pagePath) {
        this.serverUrl = Config.getConfig("serverUrl");
        this.driver = DriverSetup.getDriver();
        this.pagePath = pagePath;
        PageFactory.initElements(driver, this);
    }

    @Override
    protected void load() {
        driver.get(serverUrl + pagePath);

    }

    @Override
    protected void isLoaded() throws Error {
        Assert.assertTrue(isOnPage());

    }

    private boolean isOnPage() {
        return driver.getCurrentUrl().equals(serverUrl + pagePath);
    }


    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}


