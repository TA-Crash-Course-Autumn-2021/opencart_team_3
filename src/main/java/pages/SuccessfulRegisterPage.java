package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessfulRegisterPage extends BasePage{

    @FindBy(xpath = "//div[@class='col-sm-9'][1]//h1")
    private WebElement successfulRegistrationMessage;

    @FindBy(xpath = "//div[@class='pull-right'][1]")
    private WebElement continueButtonSuccessfulRegisterPage;

    public WebElement getSuccessfulRegistrationMessage(){
        return successfulRegistrationMessage;
    }
    public WebElement getContinueButtonSuccessfulRegisterPage() {
        return continueButtonSuccessfulRegisterPage;
    }

}
