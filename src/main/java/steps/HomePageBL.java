package steps;

import org.testng.Assert;
import pages.HomePage;
import pages.containers.ProductContainer;
import steps.cart_steps.CartPageBL;
import steps.checkout_steps.CheckoutPageLiginedNotFirstTimeBL;
import steps.header_steps.HeaderPageLoginedBL;
import steps.header_steps.HeaderPageUnloginedBL;
import steps.checkout_steps.CheckoutPageLoginedFirstTimeBL;
import steps.product_page_steps.AppleCinemaPageBL;
import steps.product_page_steps.ProductPageBL;
import steps.search_steps.SearchFieldBL;
import util.DriverUtils;

import java.util.stream.Collectors;

public class HomePageBL {

    public HomePage homePage;

    public HomePageBL() {
        homePage = new HomePage();
    }

    public HeaderPageUnloginedBL getHeaderPageUnloginedBL() {
        return new HeaderPageUnloginedBL();
    }

    public HeaderPageLoginedBL getHeaderPageLoginedBL() {
        return new HeaderPageLoginedBL();
    }

    public SearchFieldBL getSearchField() {
        return new SearchFieldBL();
    }

    public ComparePageBL getComparePageBL() {
        return new ComparePageBL();
    }

    public CartPageBL getCartPageBl(){return new CartPageBL();}

    public CheckoutPageLoginedFirstTimeBL getCheckoutPageLoginedFirstTimeBL(){return new CheckoutPageLoginedFirstTimeBL();}
    public CheckoutPageLiginedNotFirstTimeBL getCheckoutPageLoginedNotFirstTimeBL(){return new CheckoutPageLiginedNotFirstTimeBL();}

    public AppleCinemaPageBL getAppleCinemaPageBL(){return new AppleCinemaPageBL();}

    public ProductPageBL getProductPageBL() {return new ProductPageBL();}


    private ProductContainer productMethod(String productName){
        ProductContainer product = homePage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        return product;
    }

    public HomePageBL clickOnProductImage(String productName) {
        productMethod(productName).getProductImage().click();
        return this;
    }


    public HomePageBL clickOnProductTitle(String productName) {
        productMethod(productName).getProductTitleButton().click();
        return this;
    }


    public HomePageBL getProductPrice(String productName) {

        try {
            ProductContainer product = homePage.getProducts()
                    .stream()
                    .filter(e -> e.getTitle().equals(productName))
                    .collect(Collectors.toList())
                    .get(0);
            //.findFirst()
            //.orElseThrow(NullPointerException::new);

            System.out.println(product.getPrice().substring(0, 7));
            //product.getPrice();

        } catch (IndexOutOfBoundsException n ){}
        return this;
    }


    public HomePageBL getProductExTax(String productName) {

        try {
            ProductContainer product = homePage.getProducts()
                    .stream()
                    .filter(e -> e.getTitle().equals(productName))
                    .collect(Collectors.toList())
                    .get(0);
            //.findFirst()
            //.orElseThrow(NullPointerException::new);

            System.out.println(product.getExTax().substring(8));
            //String extax = product.getExTax();
            //.getText().substring(8);

        } catch (IndexOutOfBoundsException n ) {}
        return this;
    }

    public HomePageBL addProductToCart(String productName) {
        new DriverUtils().clickOnElementJS(productMethod(productName).getAddToCartButton());
        return this;
    }


    public HomePageBL addProductToWishList(String productName) {
        productMethod(productName).getAddToWishListButton().click();
        return this;
    }

    public HomePageBL compareProduct(String productName) {
        productMethod(productName).getCompareButton().click();
        return this;
    }

    public  boolean CurrencyIsChanged(String currencyCode)
    {
        boolean check = false;

        for (ProductContainer x:homePage.getProducts()) {
            if(x.getPrice().contains(currencyCode))
                check = true;
            else {check = false; break;}
        }
        return check;
    }

    public HomePageBL successfulChangeCurrencyCheck(String currencyCode) {
        boolean actual = CurrencyIsChanged(currencyCode);
        Assert.assertEquals(true, actual,"Currency is not changed!");
        return new HomePageBL();
    }

    public void successAddToCartAlert() {
        String expectedMessage = "Success";
        Assert.assertTrue(homePage.getSuccessAddToCartAlert().getText().contains(expectedMessage), "Your product was not added to product comparison");
    }
}
