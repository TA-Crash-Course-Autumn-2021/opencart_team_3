package steps;

import datamodel.LoginModel;
import pages.LoginPage;
import repository.LoginModelRepository;

public class LoginPageBL {

    private LoginPage loginPage;

    public LoginPageBL() {
        loginPage = new LoginPage();
    }

    public LoginPageBL loginUser() {
       LoginModel loginModel = LoginModelRepository.getLoginModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();
        return this;
    }

    private void inputEmail(String email) {
        loginPage.getEmailInput().clear();
        loginPage.getEmailInput().sendKeys(email);
    }

    private void inputPassword(String password) {
        loginPage.getPasswordInput().clear();
        loginPage.getPasswordInput().sendKeys(password);
    }

    private void clickOnLoginButton() {
        loginPage.getLoginButton().click();
    }
}
