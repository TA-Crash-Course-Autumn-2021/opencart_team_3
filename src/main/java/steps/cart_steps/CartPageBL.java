package steps.cart_steps;

import org.testng.Assert;
import pages.cart_pages.AlertCartPage;
import pages.cart_pages.CartPage;
import datamodel.CartModel;
import repository.CartModelRepository;

public class CartPageBL {
    private AlertCartPage AlertCartPage;
    private CartPage CartPage;

    public CartPageBL() {
        CartPage = new CartPage();
    }

    public CartPageBL cartProducts(int poductNumber, int country, int zone)  throws InterruptedException {
        CartModel cartModel = CartModelRepository.getCartModel();
        inputQuantity("4", poductNumber);
        clickOnUpdateButtons(poductNumber);
        clickOnUseCouponCodeButton();
        inputCoupon(cartModel.getCoupon());
        clickOnApplyCouponCodeButton() ;
        clickOnEstimateShippingAndTaxesButton();
        clickOnCountryInput();
        clickOnCountrySelectionButtons(country);
        clickOnZoneIdInput();
        clickOnZoneIdSelectionButtons(zone);
        inputPostCode(cartModel.getPostCode());
        clickOnUseGiftCertificateButton();
        inputGiftCertificate(cartModel.getQuantity());
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
        CartPage.getRemoveButtons().get(value).click();
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
        CartPage.getCountrySelectionButtons().get(value).click();
    }

    public void clickOnZoneIdInput() {
        CartPage.getZoneIdInput().click();
    }

    private void clickOnZoneIdSelectionButtons(int value) {
        CartPage.getZoneIdSelectionButtons().get(value).click();
    }

    public void clickOnGetQuotesButton() {
        CartPage.getGetQuotesButton().click();
    }

    public void clickOnUseGiftCertificateButton() {
        CartPage.getUseGiftCertificateButton().click();
    }

    public void clickOnApplyGiftCertificateButton() {
        CartPage.getApplyGiftCertificateButton().click();
    }

    public void clickOnContinueShoppingButton() {
        CartPage.getContinueShoppingButton().click();
    }

    public void clickOnCheckoutButton() {
        CartPage.getCheckoutButton().click();
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
}