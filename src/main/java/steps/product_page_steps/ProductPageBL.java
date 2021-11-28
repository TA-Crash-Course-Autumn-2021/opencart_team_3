package steps.product_page_steps;

import datamodel.AppleCinemaModel;
import datamodel.ProductPageModel;
import org.testng.Assert;
import pages.containers.ProductContainer;
import pages.product_pages.AppleCinemaPage;
import pages.product_pages.ProductPage;
import repository.AppleCinemaModelRepository;
import repository.ProductPageModelRepository;
import steps.HomePageBL;
import steps.ProductOnSearchPageBL;
import steps.header_steps.HeaderPageLoginedBL;

import java.util.stream.Collectors;

public class ProductPageBL {

    private ProductPage productPage;

    public ProductPageBL() {
        productPage = new ProductPage();
    }

    public HomePageBL getHomePageBL() {
        return new HomePageBL();
    }

    public HeaderPageLoginedBL getHeaderPageLoginedBL(){
        return new HeaderPageLoginedBL();
    }

    public ProductPageBL orderUsualProduct() {
        ProductPageModel productPageModel = ProductPageModelRepository.orderUsualProductModel();
        inputQuantity(productPageModel.getQuantity());
        clickOnAddToCartButton();
        productPage = new ProductPage();
        return this;
    }

    public ProductPageBL orderProductWithSelectField() {
        ProductPageModel productPageModel = ProductPageModelRepository.orderProductWithSelectFieldModel();
        chooseSelectDropdown(productPageModel.getSelect());
        inputQuantity(productPageModel.getQuantity());
        clickOnAddToCartButton();
        productPage = new ProductPage();
        return this;
    }

    public ProductPageBL orderProductWithSizeField() {
        ProductPageModel productPageModel = ProductPageModelRepository.orderProductWithSizeFieldModel();
        chooseSizeDropdown(productPageModel.getSize());
        inputQuantity(productPageModel.getQuantity());
        clickOnAddToCartButton();
        productPage = new ProductPage();
        return this;
    }

    public ProductPageBL orderProductWithDeliveryField() {
        ProductPageModel productPageModel = ProductPageModelRepository.orderProductWithDeliveryDateFieldModel();
        inputDeliveryDate(productPageModel.getDeliveryDate());
        inputQuantity(productPageModel.getQuantity());
        clickOnAddToCartButton();
        productPage = new ProductPage();
        return this;
    }


    public void clickOnWishListButton() {
        productPage.getAddToWishListButton().click();
    }

    public ProductPageBL clickOnCompareProductButton() {
        productPage.getCompareProductButton().click();
        return this;
    }

    public void clickOnBrandButton() {
        productPage.getBrandButton().click();
    }

    public ProductPageBL clickOnBackToSearchPageButton() {
        productPage.getBackToSearchPageButton().click();
        return this;
    }

    public ProductPageBL clickOnBackToHomePageButton() {
        productPage.getBackToHomePageButton().click();
        return this;
    }

    public ProductOnSearchPageBL getProductOnSearchPageBL() {return new ProductOnSearchPageBL();}

    private void clickSelect() {
        productPage.getSelectButton().click();
    }

    private void chooseSelectDropdown(int value) {
        clickSelect();
        productPage.chooseSelectOption(value).click();
    }

    private void clickSize() {
        productPage.getSizeButton().click();
    }

    private void chooseSizeDropdown(int value) {
        clickSize();
        productPage.chooseSizeOption(value).click();
    }

    private void clickDeliveryDate() {
        productPage.getInputDeliveryDate().click();
    }

    private void clearDeliveryDate() {
        productPage.getInputDeliveryDate().clear();
    }

    private void inputDeliveryDate(String str) {
        clickDeliveryDate();
        clearDeliveryDate();
        productPage.getInputDeliveryDate().sendKeys(str);
    }


    private void clickInputQuantity() {
        productPage.getInputQuantity().click();
    }

    private void clearInputQuantity() {
        productPage.getInputQuantity().clear();
    }

    private void inputQuantity(String qty) {
        clickInputQuantity();
        clearInputQuantity();
        productPage.getInputQuantity().sendKeys(qty);
    }

    private void clickOnAddToCartButton() {
        productPage.getAddToCartButton().click();
    }

    public void clickOnShoppingCartButtonInAlert() {
        productPage.getShoppingCartButtonInAlert().click();
    }

    public void clickOnProductComparisonButtonInAlert() {
        productPage.getProductComparisonButtonInAlert().click();
    }

    public void verifyProductOrdering() {
        String expectedMessage = "Success";
        Assert.assertTrue(productPage.getSuccessTitle().getText().contains(expectedMessage), "Your product was not added to shopping cart");
    }

    public void verifyProductCompare() {
        String expectedMessage = "Success";
        Assert.assertTrue(productPage.getSuccessTitle().getText().contains(expectedMessage), "Your product was not added to product comparison");
    }

    //Related Products Section

    public ProductPageBL clickOnProductImage(String productName) {
        ProductContainer product = productPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getProductImage().click();
        return this;
    }

    public ProductPageBL clickOnProductTitle(String productName) {
        ProductContainer product = productPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getProductTitleButton().click();
        return this;
    }


    public ProductPageBL getProductPrice(String productName) {

        try {
            ProductContainer product = productPage.getProducts()
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


    public ProductPageBL getProductExTax(String productName) {

        try {
            ProductContainer product = productPage.getProducts()
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


    public ProductPageBL addProductToCart(String productName) {
        ProductContainer product = productPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getAddToCartButton().click();
        return this;
    }


    public ProductPageBL addProductToWishList(String productName) {
        ProductContainer product = productPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getAddToWishListButton().click();
        return this;
    }

    public ProductPageBL compareProduct(String productName) {
        ProductContainer product = productPage.getProducts()
                .stream()
                .filter(e -> e.getTitle().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);


        product.getCompareButton().click();
        return this;
    }

}
