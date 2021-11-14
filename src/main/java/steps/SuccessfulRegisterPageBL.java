package steps;

import pages.SuccessfulRegisterPage;

public class SuccessfulRegisterPageBL {

    private SuccessfulRegisterPage successfulRegisterPage;

    public SuccessfulRegisterPageBL(){
        successfulRegisterPage = new SuccessfulRegisterPage();
    }

    public SuccessfulRegisterPageBL clickOnContinueButtonSuccessfulRegisterPage() {
        successfulRegisterPage.getContinueButtonSuccessfulRegisterPage().click();
        return this;
    }

}
