package opencart.change_password_tests;


import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.ChangePasswordPageBL;
import steps.HomePageBL;
import steps.MyAccountPageBL;

import static enums.URLs.BASE_URL;

public class ChangePasswordThroughRegistrationTest extends BaseTest {

    @BeforeClass
    public void registrationMethod(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
    }

    @Test
    public void successfulChangePasswordThroughRegistrationPositiveTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        ChangePasswordPageBL changePasswordPageBL = myAccountPageBL.clickOnChangePasswordButton()
                .getChangePasswordPageBL().successfulChangePassword();
        changePasswordPageBL.verifyChangePassword();
    }

    @Test
    public void unsuccessfulChangePasswordThroughRegistrationNegativeTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        ChangePasswordPageBL changePasswordPageBL = myAccountPageBL.clickOnChangePasswordButton()
                .getChangePasswordPageBL().unsuccessfulChangePassword();
        changePasswordPageBL.verifyChangePasswordsNotMatch();
    }
}
