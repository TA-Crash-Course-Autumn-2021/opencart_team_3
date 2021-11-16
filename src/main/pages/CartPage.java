package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(xpath = "//table[@class='table table-bordered']//td[@class='text-left']/a")
    private List<WebElement> checkoutProductsButtons;

    @FindBy(xpath = "//input[contains(@name,'quantity')]")
    private List<WebElement> quantityInput;

    @FindBy(xpath = "//button[@data-original-title = 'Update']")
    private List<WebElement> updateButtons;

    @FindBy(xpath = "//button[@data-original-title = 'Remove']")
    private List<WebElement> removeButtons;

    @FindBy(xpath = "//a[@href = '#collapse-coupon']")
    private WebElement useCouponCodeButton;
    @FindBy(xpath = "//input[@name = 'coupon']")
    private WebElement couponCodeInput;
    @FindBy(xpath = "//input[@value = 'Apply Coupon']")
    private WebElement applyCouponCodeButton;

    @FindBy(xpath = "//a[@href = '#collapse-shipping']")
    private WebElement EstimateShippingAndTaxesButton;
    @FindBy(xpath = "//select[@name = 'country_id']")
    private WebElement countryInput;
    @FindBy(xpath = "//select[@name = 'country_id']//option")
    private List<WebElement> countrySelectionButtons;
    @FindBy(xpath = "//select[@name = 'zone_id']")
    private WebElement zoneIdInput;
    @FindBy(xpath = "//select[@name = 'zone_id']//option")
    private List<WebElement> zoneIdSelectionButtons;
    @FindBy(xpath = "//select[@name = 'postcode']")
    private WebElement postcodeInput;
    @FindBy(xpath = "//button[@id = 'button-quote']")
    private WebElement GetQuotesButton;

    @FindBy(xpath = "//a[@href = '#collapse-voucher']")
    private WebElement UseGiftCertificateButton;
    @FindBy(xpath = "//input[@id = 'input-voucher']")
    private WebElement UseGiftCertificateInput;
    @FindBy(xpath = "//input[@id = 'button-voucher']")
    private WebElement applyGiftCertificateButton;

    @FindBy(xpath = "//a[@class = 'btn btn-default']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//a[@class = 'btn btn-primary']")
    private WebElement CheckoutButton;


    public List<WebElement> getCartProductsButtons() {
        return checkoutProductsButtons;
    }

    public List<WebElement> getQuantityInput() {
        return quantityInput;
    }

    public List<WebElement> getUpdateButtons() {
        return updateButtons;
    }

    public List<WebElement> getRemoveButtons() {
        return removeButtons;
    }

    public WebElement getUseCouponCodeButton() {
        return useCouponCodeButton;
    }

    public WebElement getCouponCodeInput() {
        return couponCodeInput;
    }
    public WebElement getApplyCouponCodeButton() {
        return applyCouponCodeButton;
    }


    public WebElement getEstimateShippingAndTaxesButton() {
        return EstimateShippingAndTaxesButton;
    }

    public WebElement getCountryInput() {
        return countryInput;
    }

    public List<WebElement> getCountrySelectionButtons() {
        return countrySelectionButtons;
    }

    public WebElement getZoneIdInput() {
        return zoneIdInput;
    }

    public List<WebElement> getZoneIdSelectionButtons() {
        return zoneIdSelectionButtons;
    }

    public WebElement getPostcodeInput() {
        return postcodeInput;
    }

    public WebElement getGetQuotesButton() {
        return GetQuotesButton;
    }

    public WebElement getUseGiftCertificateButton() {
        return UseGiftCertificateButton;
    }

    public WebElement getUseGiftCertificateInput() {
        return UseGiftCertificateInput;
    }

    public WebElement getApplyGiftCertificateButton() {
        return applyGiftCertificateButton;
    }

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }

    public WebElement getCheckoutButton() {
        return CheckoutButton;
    }
}

