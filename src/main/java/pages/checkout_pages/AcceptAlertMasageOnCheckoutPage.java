package pages.checkout_pages;

import pages.BasePage;

public class AcceptAlertMasageOnCheckoutPage extends BasePage {
    private   void acceptMassageOk() {
        driver.switchTo().alert().accept();
    }

    public void getAcceptMassageOk(){
        acceptMassageOk();
    }
}