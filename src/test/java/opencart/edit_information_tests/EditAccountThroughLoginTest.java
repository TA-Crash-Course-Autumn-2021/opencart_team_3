package opencart.edit_information_tests;

import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.MyAccountPageBL;

import static enums.URLs.BASE_URL;

public class EditAccountThroughLoginTest extends BaseTest {

    @BeforeClass
    public void loginMethod() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser();
    }

    @Test
    public void changeUserLastNameThroughLoginTest() {
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnEditAccountInformationButton()
                .getEditAccountInformationPageBL()
                .changeUserLastName().verifyEditAccount();

    }

    @Test
    public void changeUserEmailThroughLoginTest() {
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnEditAccountInformationButton()
                .getEditAccountInformationPageBL()
                .changeUserEmail().verifyEditAccount();

    }

    @Test
    public void changeUserTelephoneThroughLoginTest() {
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnEditAccountInformationButton()
                .getEditAccountInformationPageBL()
                .changeUserTelephone().verifyEditAccount();

    }
}
