package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.ProductContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage {

    @FindBy(xpath = ".//*[contains(@class,'product-layout')]")
    private List<WebElement> products;

    public List<ProductContainer> getProducts() {

        List<ProductContainer> productContainers = new ArrayList<>();
        for (WebElement element : products){
            productContainers.add(new ProductContainer(element));
        }
        return productContainers;
        //return products.stream().map(ProductContainer::new).collect(Collectors.toList());
    }
}


