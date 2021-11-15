package steps;

import datamodel.ChangePasswordModel;
import org.testng.Assert;
import pages.ChangePasswordPage;
import pages.SuccessChangePasswordPage;
import repository.ChangePasswordModelRepository;

public class ChangePasswordPageBL {

    private ChangePasswordPage changePasswordPage;
    private SuccessChangePasswordPage successChangePasswordPage;

    public ChangePasswordPageBL() {
        changePasswordPage = new ChangePasswordPage();
    }

    public ChangePasswordPageBL changePassword() {
        ChangePasswordModel changePasswordModel = ChangePasswordModelRepository.getChangePasswordModel();
        inputPassword(changePasswordModel.getPassword());
        clickOnContinueButton();

        successChangePasswordPage = new SuccessChangePasswordPage();
        return this;
    }

    private void inputPassword(String password) {
        changePasswordPage.getPasswordInput().clear();
        changePasswordPage.getPasswordInput().sendKeys(password);
        changePasswordPage.getPasswordConfirmInput().clear();
        changePasswordPage.getPasswordConfirmInput().sendKeys(password);
    }

    private void clickOnContinueButton() {
        changePasswordPage.getContinueButton().click();
    }

    private void clickOnBackButton() {
        changePasswordPage.getBackButton().click();
    }

    public void verifyChangePassword() {
        String expectedMessage = "Success: Your password has been successfully updated.";
        Assert.assertEquals(successChangePasswordPage.getSuccessTitle().getText(), expectedMessage, "Incorrect page title");
    }

}

