package opencart;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HomePageBL;


import static enums.URLs.BASE_URL;

public class ChangeCurrencyTest extends BaseTest {

    @Test
    public void successChangeCurrencyToEuroOnHomePageTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnCurrencyButton()
                .clickOnEuroButton();
        homePageBL.successfulChangeCurrencyCheck("€");
    }

    @Test
    public void successChangeCurrencyToPoundsOnHomePageTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnCurrencyButton()
                .clickOnPoundsButton();
        homePageBL.successfulChangeCurrencyCheck("£");
    }

    @Test
    public void successChangeCurrencyToDollarOnHomePageTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnCurrencyButton()
                .clickOnDollarButton();
        homePageBL.successfulChangeCurrencyCheck("$");
    }
}