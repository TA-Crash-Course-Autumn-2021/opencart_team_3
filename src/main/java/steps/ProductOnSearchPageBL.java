package steps;

import pages.ProductOnSearchPage;
import pages.containers.ProductContainer;

import java.util.stream.Collectors;

public class ProductOnSearchPageBL {

    public ProductOnSearchPage productOnSearchPage;

    public ProductOnSearchPageBL() {
        productOnSearchPage = new ProductOnSearchPage();
    }

    public ProductOnSearchPageBL clickOnProductImage(String productName) {
        ProductContainer product = productOnSearchPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getProductImage().click();
        return this;
    }

    public ProductOnSearchPageBL clickOnProductTitle(String productName) {
        ProductContainer product = productOnSearchPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getProductTitleButton().click();
        return this;
    }


    public ProductOnSearchPageBL getProductPrice(String productName) {

        try {
            ProductContainer product = productOnSearchPage.getProducts()
                    .stream()
                    .filter(e -> e.getTitle().equals(productName))
                    .collect(Collectors.toList())
                    .get(1);
            //.findFirst()
            //.orElseThrow(NullPointerException::new);

            System.out.println(product.getPrice().substring(0, 7));
            //product.getPrice();

        } catch (IndexOutOfBoundsException n) {
        }
        return this;
    }


    public ProductOnSearchPageBL getProductExTax(String productName) {

        try {
            ProductContainer product = productOnSearchPage.getProducts()
                    .stream()
                    .filter(e -> e.getTitle().equals(productName))
                    .collect(Collectors.toList())
                    .get(1);
            //.findFirst()
            //.orElseThrow(NullPointerException::new);

            System.out.println(product.getExTax().substring(8));
            //String extax = product.getExTax();
            //.getText().substring(8);

        } catch (IndexOutOfBoundsException n) {
        }
        return this;
    }


    public ProductOnSearchPageBL addProductToCart(String productName) {
        ProductContainer product = productOnSearchPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getAddToCartButton().click();
        return this;
    }


    public ProductOnSearchPageBL addProductToWishList(String productName) {
        ProductContainer product = productOnSearchPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getAddToWishListButton().click();
        return this;
    }

    public ProductOnSearchPageBL compareProduct(String productName) {
        ProductContainer product = productOnSearchPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getCompareButton().click();
        return this;
    }
}