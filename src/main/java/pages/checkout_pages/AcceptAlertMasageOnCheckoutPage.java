package pages.checkout_pages;

import lombok.SneakyThrows;
import pages.BasePage;

public class AcceptAlertMasageOnCheckoutPage extends BasePage {
    private   void acceptMassageOk() {
        driver.switchTo().alert().accept();
    }

    @SneakyThrows
    public void getAcceptMassageOk(){
        Thread.sleep(5000);
        acceptMassageOk();
    }
}