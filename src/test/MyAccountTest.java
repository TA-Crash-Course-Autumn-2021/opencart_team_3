import navigation.Navigation;
import org.testng.annotations.Test;
import steps.EditAccountInformationPageBL;
import steps.MainPageBL;
import steps.MyAccountPageBL;

import static enums.URLs.BASE_URL;

public class MyAccountTest extends BaseTest {


    @Test
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
    public void editUserAccountInformationTest() throws InterruptedException {     //success
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        Thread.sleep(7000);
        mainPageBL.getHeaderPageLoginedBL().clickOnMyAccountButton().clickOnMyAccountButtonDropdown();
        Thread.sleep(7000);
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        EditAccountInformationPageBL editAccountInformationPageBL = myAccountPageBL.clickOnEditAccountInformationButton()
                .getEditAccountInformationPageBL()
                .editAccount();
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
}

