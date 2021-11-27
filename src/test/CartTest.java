import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.HomePageBL;
import steps.RegisterPageBL;

import static enums.URLs.BASE_URL;

public class CartTest extends BaseTest{


    @Test
    public void OpenCartPageTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        RegisterPageBL registerPageBL = HomePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
        registerPageBL.verifyUserRegistration();
        HomePageBL.addProductToCart("iPhone");
        Thread.sleep(2000);
        HomePageBL.addProductToCart("MacBook");
        Thread.sleep(2000);
        HomePageBL.getHeaderPageUnloginedBL().clickOnCartPageButton();
        Thread.sleep(2000);
        HomePageBL.getCartPageBl().cartProducts(1,4,3);
    }

}
