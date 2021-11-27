package steps.wish_list_steps;

import datamodel.LoginModel;
import pages.wish_list_pages.InitialisationWishListPage;

public class InitialisationWishListPageBL {

    private InitialisationWishListPage initialisationWishListPage;

    public InitialisationWishListPageBL(){
        initialisationWishListPage = new InitialisationWishListPage();
    }

    public InitialisationWishListPageBL clickOnContinueButtonToRegister() {
        initialisationWishListPage.getContinueButtonToRegister().click();
        return this;
    }

    public InitialisationWishListPageBL loginUser(LoginModel loginModel){
        inputEmailLogin(loginModel.getEmail());
        inputPasswordLogin(loginModel.getPassword());
        clickOnLoginButtonToWishList();
        return this;
    }

    private void inputEmailLogin(String email) {
        initialisationWishListPage.getEmailLoginInput().clear();
        initialisationWishListPage.getEmailLoginInput().sendKeys(email);
    }

    private void inputPasswordLogin(String password) {
        initialisationWishListPage.getPasswordLoginInput().clear();
        initialisationWishListPage.getPasswordLoginInput().sendKeys(password);
    }

    private void clickOnLoginButtonToWishList() {
        initialisationWishListPage.getLoginButtonToWishList().click();
    }

}
