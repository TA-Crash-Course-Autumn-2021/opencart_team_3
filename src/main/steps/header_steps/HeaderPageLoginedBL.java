package steps.header_steps;

import pages.header_pages.HeaderPageLogined;

public class HeaderPageLoginedBL {

    private HeaderPageLogined headerPageLogined;

    public HeaderPageLoginedBL() { headerPageLogined = new HeaderPageLogined();}

    public HeaderPageLoginedBL clickOnMyAccountButton() {
        headerPageLogined.getMyAccountButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnMyAccountButtonDropdown() {
        headerPageLogined.getMyAccountButtonDropdown().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnOrderHistory() {
        headerPageLogined.getOrderHistoryButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnTransactionsButton() {
        headerPageLogined.getTransactionsButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnDownloadsButton() {
        headerPageLogined.getDownloadsButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnLogoutButton() {
        headerPageLogined.getLogoutButton().click();
        return this;
    }
    public HeaderPageLoginedBL clickOnCheckoutButton(){
        headerPageLogined.getCheckoutButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnMainPageButton(){
        headerPageLogined.getMainPageButton().click();
        return this;
    }

}
