package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

        @FindBy(xpath = ".//*[@data-original-title='Add to Wish List']")
        private WebElement productAddToWishListButton;

        @FindBy(xpath = ".//*[@data-original-title='Compare this Product']")
        private WebElement productCompareButton;

        @FindBy(xpath = "//*[@id='product-product']/div[1]/i")
        private WebElement productAlert;

        @FindBy(xpath = ".//*[@id='button-cart']")
        private WebElement productAddToCart;

        @FindBy(xpath = "//*[@id='content']/div/div[2]/ul[1]/li[1]/a")
        private WebElement productBrandButton;

        public WebElement getProductAddToWishListButton() {
            return productAddToWishListButton;
        }

        public WebElement getProductCompareButton() {
            return productCompareButton;
        }

        public WebElement getProductAlert() {
        return productAlert;
    }

        public WebElement getProductAddToCart() {
        return productAddToCart;
    }

        public WebElement getProductBrandButton(){ return productBrandButton; }

}

