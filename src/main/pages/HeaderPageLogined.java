package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPageLogined extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown')]//a[text() = 'My Account']")
    private WebElement myAccountButtonDropdown;

    @FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown')]//a[text() = 'Order History']")
    private WebElement orderHistoryButton;

    @FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown')]//a[text() = 'Transactions']")
    private WebElement transactionsButton;

    @FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown')]//a[text() = 'Downloads']")
    private WebElement downloadsButton;

    @FindBy(xpath = "//ul[contains(@class,'dropdown-menu dropdown')]//a[text() = 'Logout']")
    private WebElement logoutButton;

    @FindBy(xpath = "//nav//i[@class='fa fa-share']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//nav//i[@class='fa fa-shopping-cart']")
    private WebElement cartButton;


    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }

    public WebElement getMyAccountButtonDropdown() {
        return myAccountButtonDropdown;
    }

    public WebElement getOrderHistoryButton() {
        return orderHistoryButton;
    }

    public WebElement getTransactionsButton() {
        return transactionsButton;
    }

    public WebElement getDownloadsButton() {
        return downloadsButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getCartButton() {
        return cartButton;
    }
}
