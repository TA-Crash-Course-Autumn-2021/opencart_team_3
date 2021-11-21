package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    @FindBy(xpath = "//div[@class='list-group']//a[5]")
    private WebElement wishListSideButton;

    public WebElement getWishListSideButton() {
        return wishListSideButton;
    }

}
