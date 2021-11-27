import navigation.Navigation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import steps.HomePageBL;
import steps.RegisterPageBL;

import static enums.URLs.BASE_URL;

public class CheckoutTest extends BaseTest {
    @Test
    public void CheckoutTeat() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        RegisterPageBL registerPageBL = HomePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
        HomePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        HomePageBL.addProductToCart("iPhone");
        Thread.sleep(2000);
        HomePageBL.addProductToCart("MacBook");
        Thread.sleep(2000);
        HomePageBL.getHeaderPageLoginedBL().clickOnCheckoutButton();
        Thread.sleep(2000);
        HomePageBL.getCheckotPageLoginedNotFirstTimeBL().checkoutBillingDetails(1,1);
        Thread.sleep(10000);
        //mainPageBL.getCheckotPageLoginedNotFirstTimeBL().acceptMassage();
        HomePageBL.getCheckotPageLoginedNotFirstTimeBL().AcceptMassageOk();
        Thread.sleep(5000);
        HomePageBL.getCheckotPageLoginedNotFirstTimeBL().clickOnConfirmOrderButton();
        Thread.sleep(2000);
        HomePageBL.getCheckotPageLoginedNotFirstTimeBL().successCheckout();
    }
}
