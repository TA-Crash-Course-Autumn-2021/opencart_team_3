package steps;

import datamodel.EditAccountModel;
import pages.EditAccountInformationPage;
import repository.EditAccountModelRepository;

public class EditAccountInformationPageBL {

    private EditAccountInformationPage editAccountInformationPage;

    public EditAccountInformationPageBL() {
        editAccountInformationPage = new EditAccountInformationPage();
    }

    public EditAccountInformationPageBL editAccount() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputFirstName(editAccountModel.getFirstName());
        inputLastName(editAccountModel.getLastName());
        inputEmail(editAccountModel.getEmail());
        inputTelephone(editAccountModel.getTelephone());
        clickOnContinueButton();
        return this;
    }

    private void inputFirstName(String firstName) {
        editAccountInformationPage.getFirstNameInput().clear();
        editAccountInformationPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        editAccountInformationPage.getLastNameInput().clear();
        editAccountInformationPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        editAccountInformationPage.getEmailInput().clear();
        editAccountInformationPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        editAccountInformationPage.getTelephoneInput().clear();
        editAccountInformationPage.getTelephoneInput().sendKeys(telephone);
    }

    private void clickOnContinueButton() {
        editAccountInformationPage.getContinueButton().click();
    }

    private void clickOnBackButton() {
        editAccountInformationPage.getBackButton().click();
    }

}
