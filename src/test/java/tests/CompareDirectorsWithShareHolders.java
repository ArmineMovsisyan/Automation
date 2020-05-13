package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DirectorsPage;
import pages.MainPage;
import pages.ShareholdersPage;

import java.util.ArrayList;

/**
 * Created BY Armine Movsisyan on 12 May,2020
 */
public class CompareDirectorsWithShareHolders extends BaseTest {
    @Test
    public void compareDirectorsWithShareHolders() {
        MainPage page = new MainPage();
        page.selectFinancialInstitution("00426");
        page.clickOnConsultButton();
        page.clickOnDirectorsLink();
        DirectorsPage directorsPage = new DirectorsPage();
        ArrayList<String> directorsData = directorsPage.getDirectorsData(100);
        directorsPage.navigateBack();
        page.clickOnShareholdersLink();
        ShareholdersPage shareholdersPage = new ShareholdersPage();
        ArrayList<String> shareholdersData = shareholdersPage.getShareholderData(10);
        for (int i = 0; i < 1; i++) {
            Assert.assertTrue(directorsData.contains(shareholdersData.get(i)));
        }

    }
}
