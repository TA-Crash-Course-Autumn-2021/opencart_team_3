package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;

    @FindBy(xpath = "//ul[@class='list-inline']/li[5]")
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
    public WebElement getCheckoutButton() {
        return checkoutButton;
    }
}
