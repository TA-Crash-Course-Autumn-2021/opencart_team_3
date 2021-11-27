package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductContainer {

    private WebElement rootElement;

    public ProductContainer(WebElement rootelement) {
        this.rootElement = rootelement;
    }


    public String getTitle() {
        return rootElement.findElement(By.xpath(".//h4/a")).getText();
    }

    public WebElement getProductTitleButton() {
        return rootElement.findElement(By.xpath(".//h4/a"));
    }

    public WebElement getProductImage(){
        return rootElement.findElement(By.xpath(".//div[@class='image']"));
    }


    public String getPrice(){ return rootElement.findElement(By.className("price")).getText();
    }

    public String getExTax(){
        return rootElement.findElement(By.xpath(".//*[@class='price-tax']")).getText();
    }

    public WebElement getAddToCartButton(){
        return rootElement.findElement(By.xpath(".//button[contains(@onclick,'cart.add')]"));
    }

    public WebElement getAddToWishListButton() {
        return rootElement.findElement(By.xpath(".//button[contains(@data-original-title,'Add')]"));
    }

    public WebElement getCompareButton(){
        return rootElement.findElement(By.xpath(".//button[contains(@data-original-title,'Compare')]"));
    }
}
