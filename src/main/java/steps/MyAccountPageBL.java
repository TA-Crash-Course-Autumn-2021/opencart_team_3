package steps;

import pages.MyAccountPage;

public class MyAccountPageBL {

    private MyAccountPage myAccountPage;

    public MyAccountPageBL() {
        myAccountPage = new MyAccountPage();
    }

    public MyAccountPageBL clickOnMyAccountButton() {
        myAccountPage.getMyAccountButton().click();
        return this;
    }

    public MyAccountPageBL clickOnEditAccountButton() {
        myAccountPage.getEditAccountButton().click();
        return this;
    }

    public MyAccountPageBL clickOnPasswordButton() {
        myAccountPage.getPasswordButton().click();
        return this;
    }

    public MyAccountPageBL clickOnWishListButton() {
        myAccountPage.getWishListButton().click();
        return this;
    }

    public MyAccountPageBL clickOnLogoutButton() {
        myAccountPage.getLogoutButton().click();
        return this;
    }

    public MyAccountPageBL clickOnEditAccountInformationButton() {
        myAccountPage.getEditAccountInformationButton().click();
        return this;
    }

    public MyAccountPageBL clickOnChangePasswordButton() {
        myAccountPage.getChangePasswordButton().click();
        return this;
    }

    public MyAccountPageBL clickOnModifyWishListButton() {
        myAccountPage.getModifyWishListButton().click();
        return this;
    }

    public MyAccountPageBL clickOnBackToHomePageButton() {
        myAccountPage.getBackToHomePageButton().click();
        return this;
    }

    public HomePageBL getHomePageBL(){return new HomePageBL();}

    public EditAccountInformationPageBL getEditAccountInformationPageBL() {
        return new EditAccountInformationPageBL();
    }

    public ChangePasswordPageBL getChangePasswordPageBL() {
        return new ChangePasswordPageBL();
    }

}
