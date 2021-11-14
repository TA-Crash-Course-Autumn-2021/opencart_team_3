package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessfulAddingToComparePageAlertPage extends BasePage {

    @FindBy(xpath = ".//*[text() = 'product comparison']")
    WebElement productComparisonButton;

    public WebElement getProductComparisonButton() {
        return productComparisonButton;
    }
}
