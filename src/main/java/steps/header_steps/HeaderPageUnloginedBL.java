package steps.header_steps;

import pages.header_pages.HeaderPageUnlogined;
import steps.RegisterPageBL;
import steps.cart_steps.CartPageBL;
import steps.log_steps.LoginPageBL;
import steps.wish_list_steps.WishListPageUnloginedBL;

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

    public CartPageBL clickOnCartPageButton() {
        headerPageUnlogined.getCartButton().click();
        return new CartPageBL();
    }

    public HeaderPageUnloginedBL clickOnCurrencyButton() {
        headerPageUnlogined.getCurrencyButton().click();
        return this;
    }
    public HeaderPageUnloginedBL clickOnSpecialCurrencyButton(String val) {
        headerPageUnlogined.getCurrencyChoiseButton(val).click();
        return this;
    }

    public WishListPageUnloginedBL clickOnWishListButton() {
        headerPageUnlogined.getWishListButton().click();
        return new WishListPageUnloginedBL();
    }

}

