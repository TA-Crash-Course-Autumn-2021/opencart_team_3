import navigation.Navigation;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.containers.ProductContainer;
import steps.ChangePasswordPageBL;
import steps.HomePageBL;
import steps.MyAccountPageBL;

import java.util.List;

import static enums.URLs.BASE_URL;

public class ChangeCurrencyTest extends BaseTest {

    @Test
    public void successChangeCurrencyToEuroOnHomePageTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnCurrencyButton()
                .clickOnEuroButton();
        homePageBL.successfulChangeCurrencyCheck("€");
    }

    @Test
    public void successChangeCurrencyToPoundsOnHomePageTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnCurrencyButton()
                .clickOnPoundsButton();
        homePageBL.successfulChangeCurrencyCheck("£");
    }

    @Test
    public void successChangeCurrencyToDollarOnHomePageTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnCurrencyButton()
                .clickOnDollarButton();
        homePageBL.successfulChangeCurrencyCheck("$");
    }
}
