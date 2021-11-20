package steps;

import pages.SmallCartPage;

public class SmallCartPgeBL {
    private SmallCartPage SmallCartPage;
    public SmallCartPgeBL(){
        SmallCartPage = new SmallCartPage();
    }
    public SmallCartPgeBL clickOnSmallCartPageButton (){
        SmallCartPage.getSmallCartPageButton().click();
        return this;
    }

    public SmallCartPgeBL clickOnRemoveProductButtons (int value){
        SmallCartPage.getRemoveProductButtons(value).click();
        return this;
    }

    public SmallCartPgeBL clickOnProductButtons (int value){
        SmallCartPage.getProductButtons(value).click();
        return this;
    }

    public SmallCartPgeBL clickOnProductImageButtons (int value){
        SmallCartPage.getProductImageButtons(value).click();
        return this;
    }
    public SmallCartPgeBL clickOnViewCartButton(){
        SmallCartPage.getViewCartButton().click();
        return this;
    }
    public SmallCartPgeBL clickOnCheckoutButton(){
        SmallCartPage.getCheckoutButton().click();
        return this;
    }
}
