package steps.header_steps;

import pages.header_pages.HeaderPageUnlogined;
import steps.RegisterPageBL;
import steps.log_steps.LoginPageBL;

public class HeaderPageUnloginedBL {

    private HeaderPageUnlogined headerPageUnlogined;

    public HeaderPageUnloginedBL() {
        headerPageUnlogined = new HeaderPageUnlogined();
    }

    public HeaderPageUnloginedBL clickOnMyAccountButton() {
        headerPageUnlogined.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPageUnlogined.getRegisterButton().click();
        return new RegisterPageBL();
    }

    public LoginPageBL clickOnLoginButton(){
        headerPageUnlogined.getLoginButton().click();
        return new LoginPageBL();
    }
    public HeaderPageUnloginedBL clickOnCurrencyButton() {
        headerPageUnlogined.getCurrencyButton().click();
        return this;
    }

    public HeaderPageUnloginedBL clickOnEuroButton() {
        headerPageUnlogined.getEuroButton().click();
        return this;
    }

    public HeaderPageUnloginedBL clickOnPoundsButton(){
        headerPageUnlogined.getPoundsButton().click();
        return this;
    }
    public HeaderPageUnloginedBL clickOnDollarButton(){
        headerPageUnlogined.getDollarButton().click();
        return this;
    }

    public HeaderPageUnloginedBL clickOnWishListButton() {
        headerPageUnlogined.getWishListButton().click();
        return this;
    }

}

