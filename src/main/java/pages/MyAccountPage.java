package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {


    @FindBy(xpath = ".//*[@class = 'list-group']//a[text() = 'My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = ".//*[@class = 'list-group']//a[text() = 'Edit Account']")
    private WebElement editAccountButton;

    @FindBy(xpath = ".//*[@class = 'list-group']//a[text() = 'Password']")
    private WebElement passwordButton;

    @FindBy(xpath = ".//*[@class = 'list-group']//a[text() = 'Address Book']")
    private WebElement addressBookButton;

    @FindBy(xpath = ".//*[@class = 'list-group']//a[text() = 'Wish List']")
    private WebElement wishListButton;

    @FindBy(xpath = ".//*[@class = 'list-group']//a[text() = 'Logout']")
    private WebElement logoutButton;

    @FindBy(xpath = ".//*[@class = 'list-unstyled']//a[contains(text(),'Edit')]")
    private WebElement editAccountInformationButton;

    @FindBy(xpath = ".//*[@class = 'list-unstyled']//a[contains(text(),'Change')]")
    private WebElement changePasswordButton;

    @FindBy(xpath = ".//*[@class = 'list-unstyled']//a[contains(text(),'address')]")
    private WebElement modifyAddressBookButton;

    @FindBy(xpath = ".//*[@class = 'list-unstyled']//a[contains(text(),'wish')]")
    private WebElement modifyWishListButton;


    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public WebElement getChangePasswordButton() {
        return changePasswordButton;
    }

    public WebElement getPasswordButton() {
        return passwordButton;
    }

    public WebElement getEditAccountButton() {
        return editAccountButton;
    }

    public WebElement getEditAccountInformationButton() {
        return editAccountInformationButton;
    }

    public WebElement getModifyWishListButton() {
        return modifyWishListButton;
    }

    public WebElement getWishListButton() {
        return wishListButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }
}


