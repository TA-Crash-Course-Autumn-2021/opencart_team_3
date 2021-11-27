package steps.wish_list_steps;

import pages.register_pages.SuccessRegisterPage;

public class SuccessRegisterPageBL {

    private SuccessRegisterPage successRegisterPage;

    public SuccessRegisterPageBL(){ successRegisterPage = new SuccessRegisterPage(); }

    public SuccessRegisterPageBL clickOnContinueButtonSuccessfulRegisterPage() {
        successRegisterPage.getContinueButtonSuccessRegisterPage().click();
        return this;
    }

}
