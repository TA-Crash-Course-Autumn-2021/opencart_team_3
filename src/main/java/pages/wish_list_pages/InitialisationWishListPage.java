package pages.wish_list_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class InitialisationWishListPage extends BasePage {

    @FindBy(xpath = ".//*[text()='Continue']")
    private WebElement continueButtonToRegister;

    @FindBy(id = "input-email")
    private WebElement emailLoginInput;

    @FindBy(id = "input-password")
    private WebElement passwordLoginInput;

    @FindBy(xpath = ".//*[@type = 'submit']")
    private WebElement loginButtonToWishList;

    public WebElement getContinueButtonToRegister() {
        return continueButtonToRegister;
    }

    public WebElement getEmailLoginInput() {
        return emailLoginInput;
    }

    public WebElement getPasswordLoginInput() {
        return passwordLoginInput;
    }

    public WebElement getLoginButtonToWishList() {
        return loginButtonToWishList;
    }

}
