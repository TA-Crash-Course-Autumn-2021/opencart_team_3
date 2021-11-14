package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyWishListPage extends BasePage{

    @FindBy(xpath = "//*[@id='content']/h2")
    private WebElement successfulWishListMessage;

    public WebElement getSuccessfulWishListMessage(){
        return successfulWishListMessage;
    }

}
