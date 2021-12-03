package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//img[@title='Your Store']")
    private WebElement backToHomePageButton;

    public WebElement getBackToHomePageButton() {
        return backToHomePageButton;
    }

    public WebElement getTextListGroup(String text) {
        WebElement element = driver.findElement(By.xpath(".//*[@class = 'list-group']//a[text() = '" + text + "']"));
        return element;
    }

    public WebElement getTextUnstyledGroup(String text) {
        WebElement element = driver.findElement(By.xpath(".//*[@class = 'list-unstyled']//a[contains(text(),'" + text + "')]"));
        return element;
    }

}


