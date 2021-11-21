package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BrandListPage extends BasePage{

    @FindBy(xpath = "//*[@class='col-sm-12']//h2")
    private WebElement productListName;

    public WebElement getProductListName(){ return productListName; }

}


