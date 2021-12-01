package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.containers.ProductContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage {

    @FindBy(xpath = ".//*[contains(@class,'product-layout')]")
    private List<WebElement> products;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successAddToCartAlert;

    public List<ProductContainer> getProducts() {

        List<ProductContainer> productContainers = new ArrayList<>();
        for (WebElement element : products){
            productContainers.add(new ProductContainer(element));
        }
        return productContainers;
        //return products.stream().map(ProductContainer::new).collect(Collectors.toList());
    }

    public WebElement getSuccessAddToCartAlert() {
        wait.until(ExpectedConditions.visibilityOf(successAddToCartAlert));
        return successAddToCartAlert;
    }
}


