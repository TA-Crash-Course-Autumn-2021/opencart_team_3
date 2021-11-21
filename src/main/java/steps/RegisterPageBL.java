package steps;

import models.RegisterUserModel;
import org.testng.Assert;
import pages.RegisterPage;
import pages.SuccessfulRegisterPage;

public class RegisterPageBL {

    private RegisterPage registerPage;
    private SuccessfulRegisterPage successfulRegisterPage;

    public RegisterPageBL(){
        registerPage = new RegisterPage();
    }

    public RegisterPageBL registerNewUser(RegisterUserModel registerUserModel){

        inputFirstName(registerUserModel.getFirstName());
        inputLastName(registerUserModel.getLastName());
        inputEmail(registerUserModel.getEmail());
        inputTelephone(registerUserModel.getTelephone());
        inputPassword(registerUserModel.getPassword());
        inputPasswordConfirm(registerUserModel.getPasswordConfirm());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();
        successfulRegisterPage = new SuccessfulRegisterPage();
        return this;
    }

    private void inputFirstName(String firstName) {
        registerPage.getFirstNameInput().clear();
        registerPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        registerPage.getLastNameInput().clear();
        registerPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        registerPage.getEmailInput().clear();
        registerPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        registerPage.getTelephoneInput().clear();
        registerPage.getTelephoneInput().sendKeys(telephone);
    }

    private void inputPassword(String password) {
        registerPage.getPasswordInput().clear();
        registerPage.getPasswordInput().sendKeys(password);
    }

    private void inputPasswordConfirm(String password){
        registerPage.getPasswordConfirmInput().clear();
        registerPage.getPasswordConfirmInput().sendKeys(password);
    }

    private void chooseSubscribe(int value) {
        registerPage.getSubscribeRadioButton(value).click();
    }

    private void clickPolicyCheckbox() {
        registerPage.getPrivacyPolicyCheckBox().click();
    }

    private void clickOnContinueButton() {
        registerPage.getContinueButton().click();
    }

    public void verifySuccessfulUserRegistration(){
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(successfulRegisterPage.getSuccessfulRegistrationMessage().getText(), expectedMessage,
                "Error - user has not been registered!");
    }

}
