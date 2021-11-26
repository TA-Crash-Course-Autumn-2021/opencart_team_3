package pages.header_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

public class HeaderPageUnlogined extends BasePage {

    @FindBy(xpath =".//*[@id='form-currency']")
    private WebElement currencyButton;

    @FindBy(xpath ="//*[@name = 'EUR']")
    private WebElement euroButton;

    @FindBy(xpath ="//*[@name = 'GBP']")
    private WebElement poundsButton;

    @FindBy(xpath ="//*[@name = 'USD']")
    private WebElement dollarButton;

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    @FindBy(xpath = ".//*[contains(@href,'account/login')]")
    private WebElement loginButton;

    @FindBy(xpath = "//nav//i[@class='fa fa-share']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//nav//i[@class='fa fa-shopping-cart']")
    private WebElement cartButton;

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getCartButton() {
        return cartButton;
    }

    public WebElement getCurrencyButton() {
        wait.until(ExpectedConditions.visibilityOf(currencyButton));
        return currencyButton;
    }
    public WebElement getEuroButton() { return euroButton; }

    public WebElement getPoundsButton() { return poundsButton; }

    public WebElement getDollarButton() { return dollarButton; }


}
