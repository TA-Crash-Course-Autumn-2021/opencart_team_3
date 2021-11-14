package steps;

import pages.ProductOnSearchPage;

public class ProductOnSearchPageBL {

    private ProductOnSearchPage productOnSearchPage;

    public ProductOnSearchPageBL() {
        productOnSearchPage = new ProductOnSearchPage();
    }

    public ProductOnSearchPageBL clickOnProductImage(int value) {
        productOnSearchPage.getProductImage(value).click();
        return this;
    }

    public ProductOnSearchPageBL clickOnProductName(int value) {
        productOnSearchPage.getProductName(value).click();
        return this;
    }

    public ProductOnSearchPageBL clickOnAddToCartButton(int value) {
        productOnSearchPage.getProductAddToCartButton(value).click();
        return this;
    }


    public ProductOnSearchPageBL clickOnAddToWishListButton(int value) {
        productOnSearchPage.getProductAddToWishListButton(value).click();
        return this;
    }


    public ProductOnSearchPageBL clickOnCompareButton(int value) {
        productOnSearchPage.getProductCompareButton(value).click();
        return this;
    }
}