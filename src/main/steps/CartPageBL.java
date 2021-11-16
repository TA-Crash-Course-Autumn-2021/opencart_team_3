package steps;
import pages.CartPage;
import datamodel.CartModel;
import repository.CartModelRepository;
public class CartPageBL {
private CartPage CartPage;
public CartPageBL(){
    CartPage = new CartPage();
}

public CartPageBL cartProducts(int poductNumber, int country, int zone){
    CartModel cartModel = CartModelRepository.getCartModel();
    inputQuantity(cartModel.getGiftCertificate(),poductNumber);
    clickOnUpdateButtons(poductNumber);
    clickOnUseCouponCodeButton();
    inputCoupon(cartModel.getCoupon());
    clickOnUseCouponCodeButton();
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


private void inputPostCode(String postCode){
    CartPage.getPostcodeInput().clear();
    CartPage.getPostcodeInput().sendKeys(postCode);
}
    private void inputGiftCertificate(String giftCertificate){
        CartPage.getUseGiftCertificateInput().clear();
        CartPage.getUseGiftCertificateInput().sendKeys(giftCertificate);
    }
    private void inputQuantity(String quantityInput, int value){
        CartPage.getQuantityInput().clear();
        CartPage.getQuantityInput().get(value).sendKeys(quantityInput);
    }
    private void inputCoupon(String Coupon){
        CartPage.getCouponCodeInput().clear();
        CartPage.getCouponCodeInput().sendKeys(Coupon);
    }

    private void clickOnCheckoutProductsButtons(int value){
        CartPage.getCartProductsButtons().get(value).click();
    }
    private void clickOnUpdateButtons(int value){
    CartPage.getUpdateButtons().get(value).click();
    }
    private void clickOnRemoveButtons(int value){
        CartPage.getRemoveButtons().get(value).click();
    }
    public void clickOnUseCouponCodeButton(){
        CartPage.getUseCouponCodeButton().click();
    }
    public void clickOnApplyCouponCodeButton(){
        CartPage.getApplyCouponCodeButton().click();
    }
    public void clickOnEstimateShippingAndTaxesButton(){
        CartPage.getEstimateShippingAndTaxesButton().click();
    }
    public void clickOnCountryInput(){
        CartPage.getCountryInput().click();
    }
    private void clickOnCountrySelectionButtons(int value){
        CartPage.getCountrySelectionButtons().get(value).click();
    }
    public void clickOnZoneIdInput(){
        CartPage.getZoneIdInput().click();
    }
    private void clickOnZoneIdSelectionButtons(int value){
        CartPage.getZoneIdSelectionButtons().get(value).click();
    }
    public void clickOnGetQuotesButton(){
        CartPage.getGetQuotesButton().click();
    }
    public void clickOnUseGiftCertificateButton(){
        CartPage.getUseGiftCertificateButton().click();
    }
    public void clickOnApplyGiftCertificateButton(){
        CartPage.getApplyGiftCertificateButton().click();
    }
    public void clickOnContinueShoppingButton(){
        CartPage.getContinueShoppingButton().click();
    }
    public void clickOnCheckoutButton(){
        CartPage.getCheckoutButton().click();
    }
}
