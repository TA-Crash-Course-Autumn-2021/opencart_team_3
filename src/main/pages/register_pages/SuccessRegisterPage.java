package pages.register_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SuccessRegisterPage extends BasePage {

    @FindBy(xpath = ".//*[@id='content']/h1")
    private WebElement successTitle;

    @FindBy(xpath = "//div[@class='pull-right'][1]")
    private WebElement continueButtonSuccessfulRegisterPage;

    public WebElement getSuccessTitle() {
        return successTitle;
    }
    public WebElement getContinueButtonSuccessRegisterPage() {
        return continueButtonSuccessfulRegisterPage;
    }

}