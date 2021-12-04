package steps.cart_steps;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import pages.cart_pages.AlertCartPage;
import pages.cart_pages.CartPage;
import datamodel.CartModel;
import repository.CartModelRepository;
import repository.CouponeModelRepository;
import util.DriverUtils;


public class CartPageBL {
    private AlertCartPage AlertCartPage;
    private CartPage CartPage;

    public CartPageBL() {
        CartPage = new CartPage();
    }

    public CartPageBL cartProducts(int productNumber, int country, int zone)  {
        CartModel cartModel = CartModelRepository.getCartModel();
        inputQuantity("4", productNumber);
        clickOnUpdateButtons(productNumber);
        clickOnUseCouponCodeButton();
        inputCoupon(cartModel.getCoupon());
        clickOnApplyCouponCodeButton() ;
        clickOnEstimateShippingAndTaxesButton();
        clickOnCountryInput();
        clickOnCountrySelectionButtons(country);
        clickOnZoneIdSelectionButtons(zone);
        inputPostCode(cartModel.getPostCode());
        clickOnUseGiftCertificateButton();
        inputGiftCertificate(cartModel.getGiftCertificate());
        clickOnApplyGiftCertificateButton();
        clickOnCheckoutButton();
        return this;
    }


    private void inputPostCode(String postCode) {
        CartPage.getPostcodeInput().click();
        CartPage.getPostcodeInput().clear();
        CartPage.getPostcodeInput().sendKeys(postCode);
    }

    private void inputGiftCertificate(String giftCertificate) {
        CartPage.getUseGiftCertificateInput().click();
        CartPage.getUseGiftCertificateInput().clear();
        CartPage.getUseGiftCertificateInput().sendKeys(giftCertificate);
    }

    public void inputQuantity(String quantityInput, int value) {
        CartPage.getQuantityInput().get(value).clear();
        CartPage.getQuantityInput().get(value).sendKeys(quantityInput);
    }

    public void inputCoupon(String Coupon) {
        CartPage.getCouponCodeInput().clear();
        CartPage.getCouponCodeInput().sendKeys(Coupon);
    }

    private void clickOnCheckoutProductsButtons(int value) {
        CartPage.getCartProductsButtons().get(value).click();
    }

    private void clickOnUpdateButtons(int value) {
        CartPage.getUpdateButtons().get(value).click();
    }

    private void clickOnRemoveButtons(int value) {
        new DriverUtils().clickOnElementJS(CartPage.getRemoveButtons().get(value));
    }

    public void clickOnUseCouponCodeButton() {
        CartPage.getUseCouponCodeButton().click();
    }

    public void clickOnApplyCouponCodeButton() {
        CartPage.getApplyCouponCodeButton().click();
    }

    public void clickOnEstimateShippingAndTaxesButton() {
        CartPage.getEstimateShippingAndTaxesButton().click();
    }

    public void clickOnCountryInput() {
        CartPage.getCountryInput().click();
    }

    private void clickOnCountrySelectionButtons(int value) {
        CartPage.getCountrySelectionButtons().selectByIndex(value);
    }

    private void clickOnZoneIdSelectionButtons(int value) {
        CartPage.getZoneIdInput().selectByIndex(value);
    }

    public void clickOnGetQuotesButton() {
        CartPage.getGetQuotesButton().click();
    }

    public void clickOnUseGiftCertificateButton() {
        new DriverUtils().clickOnElementJS(CartPage.getUseGiftCertificateButton());
    }

    public void clickOnApplyGiftCertificateButton() {
        CartPage.getApplyGiftCertificateButton().click();
    }

    public void clickOnContinueShoppingButton() {
        CartPage.getContinueShoppingButton().click();
    }

    public void clickOnCheckoutButton() {
        new DriverUtils().clickOnElementJS(CartPage.getCheckoutButton());
    }

    public void inputCouponToOrder() {
        this.clickOnUseCouponCodeButton();
        this.inputCoupon(CouponeModelRepository.getValidCouponMAodel());
        this.clickOnApplyCouponCodeButton();
        this.clickOnCheckoutButton();
    }

    public void successApplyCoupon() {
        Assert.assertEquals(AlertCartPage.getCartAlert(), AlertCartPage.getValidCouponAlert(), "Invalid or disable coupon");
    }

    public void successModifyCoupon() {
        Assert.assertEquals(AlertCartPage.getCartAlert(), AlertCartPage.getSuccessfulModifyAlert(), "Unsuccessful modify");
    }

    public void successApplyGiftCertificate() {
        Assert.assertEquals(AlertCartPage.getCartAlert(), AlertCartPage.getValidGiftCertificateAlert(), "Invalid or disable coupon");
    }

    public void cleanCart(){
        try{
            Assert.assertTrue (CartPage.getEmptyCartAlert().getText().contains("Your shopping cart is empty!"),"Cart is not empty");
        }
        catch (NoSuchElementException e){
            for(int x=CartPage.getRemoveButtons().size();0<x;x--){
                clickOnRemoveButtons(0);
            }
        }
    }

}