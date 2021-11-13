package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(name = "email")
    private WebElement emailAddressInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement loginButton;


    public WebElement getEmailInput() {
        return emailAddressInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

}
