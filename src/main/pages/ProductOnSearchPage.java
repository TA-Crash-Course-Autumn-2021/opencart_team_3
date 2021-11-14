package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductOnSearchPage extends BasePage {

    @FindBy(xpath = "//div[@class='image']")
    private List<WebElement> productImages;

    @FindBy(xpath = "//h4/a")
    private List<WebElement> productNames;

    @FindBy(xpath = "//p[contains(text(),'$')]")
    private List<WebElement> productPrices;

    @FindBy(xpath = "//*[@class='price-tax']")
    private List<WebElement> productExTaxes;

    @FindBy(xpath = "//button[contains(@onclick,'cart.add')]")
    private List<WebElement> productAddToCartButtons;

    @FindBy(xpath = "//button[contains(@data-original-title,'Add')]")
    private List<WebElement> productAddToWishListButtons;

    @FindBy(xpath = "//button[contains(@data-original-title,'Compare')]")
    private List<WebElement> productCompareButtons;

    public WebElement getProductImage(int value) {
        return productImages.get(value);
    }

    public WebElement getProductName(int value) {
        return productNames.get(value);
    }

    public WebElement getProductPrice(int value) {
        return productPrices.get(value);
    }

    public WebElement getProductExTax(int value) {
        return productExTaxes.get(value);
    }

    public WebElement getProductAddToCartButton(int value) {
        return productAddToCartButtons.get(value);
    }

    public WebElement getProductAddToWishListButton(int value) {
        return productAddToWishListButtons.get(value);
    }

    public WebElement getProductCompareButton(int value) {
        return productCompareButtons.get(value);
    }

}