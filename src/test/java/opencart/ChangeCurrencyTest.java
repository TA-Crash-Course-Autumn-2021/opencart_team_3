package opencart;

import navigation.Navigation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageBL;


import static enums.URLs.BASE_URL;

public class ChangeCurrencyTest extends BaseTest {
    @BeforeClass
    public void navigate()
    {
        new Navigation().navigateToUrl(BASE_URL.getValue());
    }

    @Test
    public void successChangeCurrencyToEuroOnHomePageTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnCurrencyButton()
                .clickOnEuroButton();
        homePageBL.successfulChangeCurrencyCheck("€");
    }

    @Test
    public void successChangeCurrencyToPoundsOnHomePageTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnCurrencyButton()
                .clickOnPoundsButton();
        homePageBL.successfulChangeCurrencyCheck("£");
    }

    @Test
    public void successChangeCurrencyToDollarOnHomePageTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnCurrencyButton()
                .clickOnDollarButton();
        homePageBL.successfulChangeCurrencyCheck("$");
    }
}