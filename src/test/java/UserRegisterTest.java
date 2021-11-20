import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.RegisterPageBL;

import static enums.URLs.BASE_URL;

public class UserRegisterTest extends BaseTest {

    @Severity(SeverityLevel.NORMAL)
    @Test(description = "Verify user registration", groups = "regression")
    public void registerUserWithValidParametersTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        //Thread.sleep(6000);
        //mainPageBL.getProductExTax("MacBook");
        // mainPageBL.getProductPrice("MacBook");
        //mainPageBL.clickOnProductTitle("Macbook");
        // mainPageBL.addProductToCart("MacBook");
        //Thread.sleep(6000);
        // System.out.println();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registerPageBL.verifyUserRegistration();
    }
}