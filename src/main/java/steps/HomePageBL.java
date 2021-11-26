package steps;

import org.testng.Assert;
import pages.HomePage;
import pages.containers.ProductContainer;
import steps.header_steps.HeaderPageLoginedBL;
import steps.header_steps.HeaderPageUnloginedBL;

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


    public HomePageBL clickOnProductImage(String productName) {
        ProductContainer product = homePage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getProductImage().click();
        return this;
    }

    public HomePageBL clickOnProductTitle(String productName) {
        ProductContainer product = homePage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getProductTitleButton().click();
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
        ProductContainer product = homePage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getAddToCartButton().click();
        return this;
    }


    public HomePageBL addProductToWishList(String productName) {
        ProductContainer product = homePage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getAddToWishListButton().click();
        return this;
    }

    public HomePageBL compareProduct(String productName) {
        ProductContainer product = homePage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getCompareButton().click();
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
}
