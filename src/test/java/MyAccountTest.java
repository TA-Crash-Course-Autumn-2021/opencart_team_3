import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.*;

import static enums.URLs.BASE_URL;

public class MyAccountTest extends BaseTest {


    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void openMyAccountPageTest() throws InterruptedException {     //success
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        Thread.sleep(7000);
        mainPageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        Thread.sleep(5000);
    }

    @Test
    public void loginTest() throws InterruptedException {     //warning message appears
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginUser();
        Thread.sleep(7000);
    }

    @Test
    public void successfulUserEditAccountTest() throws InterruptedException { //success
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        Thread.sleep(5000);
        mainPageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        EditAccountInformationPageBL editAccountInformationPageBL = myAccountPageBL.clickOnEditAccountInformationButton()
                .getEditAccountInformationPageBL()
                .editAccount();
        Thread.sleep(6000);
        editAccountInformationPageBL.verifyEditAccount();
    }

    @Test
    public void successfulChangePasswordTest() throws InterruptedException {     //success
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        Thread.sleep(5000);
        mainPageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        ChangePasswordPageBL changePasswordPageBL = myAccountPageBL.clickOnChangePasswordButton()
                .getChangePasswordPageBL().changePassword();
        Thread.sleep(6000);
        changePasswordPageBL.verifyChangePassword();
    }
}

