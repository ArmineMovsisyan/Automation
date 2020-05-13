package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ShareholdersPage;

import java.util.ArrayList;


/**
 * Created BY Armine Movsisyan on 12 May,2020
 */
public class CheckShareholders extends BaseTest {

    private ArrayList<String> shareholdersList1;
    private ArrayList<String> shareholdersList2;
    private ArrayList<String> shareholdersList3;

    @Test
    public void checkShareholders() {
        MainPage mainPage = new MainPage();
        ShareholdersPage shareholdersPage = new ShareholdersPage();
        ArrayList<ArrayList<String>> shareholdersList = new ArrayList<>();
        for (int i = 0; i < mainPage.setInstitutionValue().size(); ++i) {
            mainPage.selectFinancialInstitution(mainPage.setInstitutionValue().get(i));
            mainPage.clickOnConsultButton();
            mainPage.clickOnShareholdersLink();
            switch (i) {
                case 0:
                    shareholdersList1 = new ArrayList<>(shareholdersPage.getShareholderData(10));
                    shareholdersPage.navigateBack();
                    break;
                case 1:
                    shareholdersList2 = new ArrayList<>(shareholdersPage.getShareholderData(10));
                    shareholdersPage.navigateBack();
                    break;

                case 2:
                    shareholdersList3 = new ArrayList<>(shareholdersPage.getShareholderData(10));

                    shareholdersPage.navigateBack();
                    break;
            }

        }
        shareholdersList.add(shareholdersList1);
        shareholdersList.add(shareholdersList2);
        shareholdersList.add(shareholdersList3);
        Assert.assertTrue(shareholdersPage.isNameRepeated(shareholdersList));


    }
}






