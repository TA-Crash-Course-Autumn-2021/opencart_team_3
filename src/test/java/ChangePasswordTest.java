import navigation.Navigation;
import org.testng.annotations.Test;
import steps.ChangePasswordPageBL;
import steps.HomePageBL;
import steps.MyAccountPageBL;

import static enums.URLs.BASE_URL;

public class ChangePasswordTest extends BaseTest {

    @Test
    public void successfulChangePasswordThroughRegistrationPositiveTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
        Thread.sleep(5000);
        homePageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        ChangePasswordPageBL changePasswordPageBL = myAccountPageBL.clickOnChangePasswordButton()
                .getChangePasswordPageBL().successfulChangePassword();
        Thread.sleep(6000);
        changePasswordPageBL.verifyChangePassword();
    }

    @Test
    public void unsuccessfulChangePasswordThroughRegistrationNegativeTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
        Thread.sleep(3000);
        homePageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        ChangePasswordPageBL changePasswordPageBL = myAccountPageBL.clickOnChangePasswordButton()
                .getChangePasswordPageBL().unsuccessfulChangePassword();
        Thread.sleep(6000);
        changePasswordPageBL.verifyChangePasswordsNotMatch();
    }

    @Test
    public void successfulChangePasswordThroughLoginPositiveTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .getMyAccountPageBL()
                .clickOnChangePasswordButton()
                .getChangePasswordPageBL()
                .successfulChangePassword().verifyChangePassword();

    }

    //Negative testing shows how your application handles invalid data.

    @Test
    public void unsuccessfulChangePasswordThroughLoginNegativeTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .getMyAccountPageBL()
                .clickOnChangePasswordButton()
                .getChangePasswordPageBL()
                .unsuccessfulChangePassword().verifyChangePasswordsNotMatch();

    }

}
