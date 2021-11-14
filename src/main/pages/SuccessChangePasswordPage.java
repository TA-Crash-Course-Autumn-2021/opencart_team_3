package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessChangePasswordPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'alert')]")
    private WebElement successTitle;

    public WebElement getSuccessTitle() {
        return successTitle;
    }
}
