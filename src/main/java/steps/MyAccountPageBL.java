package steps;

import pages.MyAccountPage;
import pages.PreWishListPage;

public class MyAccountPageBL {

    private MyAccountPage myAccountPage;

    public MyAccountPageBL(){
        myAccountPage = new MyAccountPage();
    }

    public MyAccountPageBL clickOnWishListSideButton() {
        myAccountPage.getWishListSideButton().click();
        return this;
    }

}
