package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreWishListPage extends BasePage{

    @FindBy(xpath = ".//*[text()='Continue']")
    private WebElement continueButton;

    @FindBy(id = "input-email")
    private WebElement emailLoginInput;

    @FindBy(id = "input-password")
    private WebElement passwordLoginInput;

    @FindBy(xpath = ".//*[@type = 'submit']")
    private WebElement loginButton;

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getEmailLoginInput() {
        return emailLoginInput;
    }

    public WebElement getPasswordLoginInput() {
        return passwordLoginInput;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

}
