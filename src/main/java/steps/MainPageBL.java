package steps;

import pages.MainPage;
import pages.containers.ProductContainer;

import java.util.stream.Collectors;

public class MainPageBL {

    public MainPage mainPage;

    public MainPageBL() {
        mainPage = new MainPage();
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


    public MainPageBL clickOnProductImage(String productName) {
        ProductContainer product = mainPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getProductImage().click();
        return this;
    }

    public MainPageBL clickOnProductTitle(String productName) {
        ProductContainer product = mainPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getProductTitleButton().click();
        return this;
    }


    public MainPageBL getProductPrice(String productName) {

        try {
            ProductContainer product = mainPage.getProducts()
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


    public MainPageBL getProductExTax(String productName) {

        try {
            ProductContainer product = mainPage.getProducts()
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

    public MainPageBL addProductToCart(String productName) {
        ProductContainer product = mainPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getAddToCartButton().click();
        return this;
    }


    public MainPageBL addProductToWishList(String productName) {
        ProductContainer product = mainPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getAddToWishListButton().click();
        return this;
    }

    public MainPageBL compareProduct(String productName) {
        ProductContainer product = mainPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getCompareButton().click();
        return this;
    }
}
