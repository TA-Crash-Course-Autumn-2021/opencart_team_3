package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//*[@id='content']/div[2]/div[1]/div/div[1]/a/img")
    private WebElement productButtonMacBook;

    public WebElement getProductButtonMacBook() {
        return productButtonMacBook;
    }

}
