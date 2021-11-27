import navigation.Navigation;
import org.testng.annotations.Test;
import steps.*;

import static enums.URLs.BASE_URL;

public class EditAccountInformationTest extends BaseTest {

    @Test
    public void changeAllAccountThroughRegistrationTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
        Thread.sleep(5000);
        homePageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        EditAccountInformationPageBL editAccountInformationPageBL = myAccountPageBL
                .clickOnEditAccountInformationButton()
                .getEditAccountInformationPageBL()
                .editAllAccount();
        Thread.sleep(6000);
        editAccountInformationPageBL.verifyEditAccount();
    }

    @Test
    public void changeUserFirstNameThroughRegistrationTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
        Thread.sleep(5000);
        homePageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        EditAccountInformationPageBL editAccountInformationPageBL = myAccountPageBL
                .clickOnEditAccountInformationButton()
                .getEditAccountInformationPageBL()
                .changeUserFirstName();
        Thread.sleep(6000);
        editAccountInformationPageBL.verifyEditAccount();
    }

    @Test
    public void changeUserLastNameThroughLoginTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .getMyAccountPageBL()
                .clickOnEditAccountInformationButton()
                .getEditAccountInformationPageBL()
                .changeUserLastName().verifyEditAccount();

    }

    @Test
    public void changeUserEmailThroughLoginTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .getMyAccountPageBL()
                .clickOnEditAccountInformationButton()
                .getEditAccountInformationPageBL()
                .changeUserEmail().verifyEditAccount();

    }

    @Test
    public void changeUserTelephoneThroughLoginTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .getMyAccountPageBL()
                .clickOnEditAccountInformationButton()
                .getEditAccountInformationPageBL()
                .changeUserTelephone().verifyEditAccount();

    }

}

