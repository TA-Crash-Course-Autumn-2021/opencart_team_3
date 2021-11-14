package steps;

import models.LoginUserModel;
import models.RegisterUserModel;
import org.testng.Assert;
import pages.PreWishListPage;
import pages.SuccessfulRegisterPage;

public class PreWishListPageBL {

    private PreWishListPage preWishListPage;

    public PreWishListPageBL(){
        preWishListPage = new PreWishListPage();
    }

    public PreWishListPageBL clickOnContinueButton() {
        preWishListPage.getContinueButton().click();
        return this;
    }

    public PreWishListPageBL loginNewUser(LoginUserModel loginUserModel){

        inputEmailLogin(loginUserModel.getEmailLogin());
        inputPasswordLogin(loginUserModel.getPasswordLogin());
        clickOnLoginButton();
        return this;
    }

    private void inputEmailLogin(String email) {
        preWishListPage.getEmailLoginInput().clear();
        preWishListPage.getEmailLoginInput().sendKeys(email);
    }

    private void inputPasswordLogin(String password) {
        preWishListPage.getPasswordLoginInput().clear();
        preWishListPage.getPasswordLoginInput().sendKeys(password);
    }

    private void clickOnLoginButton() {
        preWishListPage.getLoginButton().click();
    }

}
