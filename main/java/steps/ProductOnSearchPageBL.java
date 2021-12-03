package steps;

import pages.ProductOnSearchPage;
import pages.containers.ProductContainer;
import steps.product_page_steps.ProductPageBL;

import java.util.stream.Collectors;

public class ProductOnSearchPageBL {

    public ProductOnSearchPage productOnSearchPage;

    public ProductOnSearchPageBL() {
        productOnSearchPage = new ProductOnSearchPage();
    }

    private ProductContainer productMethod(String productName) {
        ProductContainer product = productOnSearchPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        return product;
    }

    public ProductOnSearchPageBL clickOnProductImage(String productName) {
        productMethod(productName).getProductImage().click();
        return this;
    }


    public ProductOnSearchPageBL clickOnProductTitle(String productName) {
        productMethod(productName).getProductTitleButton().click();
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
        productMethod(productName).getAddToCartButton().click();
        return this;
    }


    public ProductOnSearchPageBL addProductToWishList(String productName) {
        productMethod(productName).getAddToWishListButton().click();
        return this;
    }

    public ProductOnSearchPageBL compareProduct(String productName) {
        productMethod(productName).getCompareButton().click();
        return this;
    }

    public String getProductTitle(String productName) {
        String str = productMethod(productName).getTitle();
        return str;
    }

    public ProductPageBL getProductPageBL() {
        return new ProductPageBL();
    }
}