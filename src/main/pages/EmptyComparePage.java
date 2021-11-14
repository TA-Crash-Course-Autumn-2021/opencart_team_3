package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmptyComparePage extends BasePage {

    @FindBy(xpath = ".//*[text() = 'Continue']")
    private WebElement continueButton;

    public WebElement getContinueButton() {
        return continueButton;
    }
}
