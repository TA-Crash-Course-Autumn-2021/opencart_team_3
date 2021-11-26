package steps.header_steps;

import pages.header_pages.HeaderPageLogined;
import steps.RegisterPageBL;
import steps.log_steps.LoginPageBL;

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

    public HeaderPageLoginedBL clickOnCurrencyButton() {
        headerPageLogined.getCurrencyButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnEuroButton() {
        headerPageLogined.getEuroButton().click();
        return this;
    }

    public HeaderPageLoginedBL clickOnPoundsButton(){
        headerPageLogined.getPoundsButton().click();
        return this;
    }
    public HeaderPageLoginedBL clickOnDollarButton(){
        headerPageLogined.getDollarButton().click();
        return this;
    }

}
