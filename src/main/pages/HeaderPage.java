package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage{

    @FindBy(xpath = ".//*[@title='Wish List (0)']")
    private WebElement wishListButton;

    public WebElement getWishListButton() {
        return wishListButton;
    }

}
