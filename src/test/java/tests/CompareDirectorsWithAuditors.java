package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuditorsPage;
import pages.DirectorsPage;
import pages.MainPage;

import java.util.ArrayList;

/**
 * Created BY Armine Movsisyan on 12 May,2020
 */
public class CompareDirectorsWithAuditors extends BaseTest {
    @Test
    public void compareDirectorsWithAuditors() {
        MainPage page = new MainPage();
        page.selectFinancialInstitution("00017");
        page.clickOnConsultButton();
        page.clickOnDirectorsLink();
        DirectorsPage directorsPage = new DirectorsPage();
        ArrayList<String> directorsData = directorsPage.getDirectorsData(100);
        directorsPage.navigateBack();
        page.clickOnAuditorsLink();
        AuditorsPage auditorsPage = new AuditorsPage();
        ArrayList<String> auditorsData = auditorsPage.getAuditorsData(10);
        for (String auditorsDatum : auditorsData) {
            Assert.assertTrue(directorsData.contains(auditorsDatum));
        }


    }


}
