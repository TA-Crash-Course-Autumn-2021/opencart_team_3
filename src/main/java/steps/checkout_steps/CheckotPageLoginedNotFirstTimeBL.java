package steps.checkout_steps;

import datamodel.CheckoutModel;
import driver.DriverRepository;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;
import pages.checkout_pages.CheckoutPageLoginedNotFirstTime;
import pages.checkout_pages.SuccessOrderPage;
import pages.checkout_pages.AcceptAlertMasageOnCheckoutPage;
import repository.CheckoutRepositiry;

public class CheckotPageLoginedNotFirstTimeBL{
    private CheckoutPageLoginedNotFirstTime checkoutPageLoginedNotFirstTime;
    public CheckotPageLoginedNotFirstTimeBL(){
        checkoutPageLoginedNotFirstTime = new CheckoutPageLoginedNotFirstTime();
    }

public CheckotPageLoginedNotFirstTimeBL checkoutBillingDetails(int country,int region) throws InterruptedException {
    CheckoutModel checkoutModel = CheckoutRepositiry.getCheckoutModel();
    //clickOnBillingDetailsButton();
    inputFirstname(checkoutModel.getFirstName());
    inputLastName(checkoutModel.getLastName());
    inputCompany(checkoutModel.getCompany());
    inputAddress1(checkoutModel.getAddress1());
    inputAddress2(checkoutModel.getAddress2());
    inputCity(checkoutModel.getCity());
    inputPostcode(checkoutModel.getPostcode());
    clickOnCountryInputButton();
    clickOnCountryInputButtons(country);
    clickOnRegionInputButton();
    clickOnRegionInputButtons(region);
    clickOnBillingDetailsContinueButton();
    clickOnAddressRadioButton();
    clickOnDeliveryDetailsContinueButton();
    clickOnDeliveryMethodRadioButton();
    inputDeliveryMethodComment(checkoutModel.getDeliveryMethodComment());
    clickOnDeliveryMethodContinueButton();
    clickOnPaymentMethodRadioButton();
    inputPaymentMethodComment(checkoutModel.getPaymentMethodComment());
    clickOnAgreementCheckbox();
    clickOnPaymentMethodContinueButton();
    clickOnConfirmOrderButton();
    //acceptMassage();
    //clickOnConfirmOrderButton();
   //successOrderPage = new SuccessOrderPage();
    return this;
}




    private void inputFirstname(String firstName){
        checkoutPageLoginedNotFirstTime.getFirstNameInput().click();
        checkoutPageLoginedNotFirstTime.getFirstNameInput().clear();
        checkoutPageLoginedNotFirstTime.getFirstNameInput().click();
        checkoutPageLoginedNotFirstTime.getFirstNameInput().sendKeys(firstName);
    }
    private void inputLastName(String lastName){
        checkoutPageLoginedNotFirstTime.getLastNameInput().click();
        checkoutPageLoginedNotFirstTime.getLastNameInput().clear();
        checkoutPageLoginedNotFirstTime.getLastNameInput().sendKeys(lastName);
    }
    private void inputCompany(String company){
        checkoutPageLoginedNotFirstTime.getCompanyInput().click();
        checkoutPageLoginedNotFirstTime.getCompanyInput().clear();
        checkoutPageLoginedNotFirstTime.getCompanyInput().sendKeys(company);
    }
    private void inputAddress1(String address1){
        checkoutPageLoginedNotFirstTime.getAddress1Input().click();
        checkoutPageLoginedNotFirstTime.getAddress1Input().clear();
        checkoutPageLoginedNotFirstTime.getAddress1Input().sendKeys(address1);
    }
    private void inputAddress2(String address2){
        checkoutPageLoginedNotFirstTime.getAddress2Input().click();
        checkoutPageLoginedNotFirstTime.getAddress2Input().clear();
        checkoutPageLoginedNotFirstTime.getAddress2Input().sendKeys(address2);
    }
    private void inputCity(String city){
        checkoutPageLoginedNotFirstTime.getCityInput().click();
        checkoutPageLoginedNotFirstTime.getCityInput().clear();
        checkoutPageLoginedNotFirstTime.getCityInput().sendKeys(city);
    }
    private void inputPostcode(String postcode){
        checkoutPageLoginedNotFirstTime.getPostcodeInput().click();
        checkoutPageLoginedNotFirstTime.getPostcodeInput().clear();
        checkoutPageLoginedNotFirstTime.getPostcodeInput().sendKeys(postcode);
    }
    private void inputDeliveryMethodComment(String DeliveryMethodComment){
        checkoutPageLoginedNotFirstTime.getDeliveryMethodComment().click();
        checkoutPageLoginedNotFirstTime.getDeliveryMethodComment().clear();
        checkoutPageLoginedNotFirstTime.getDeliveryMethodComment().sendKeys(DeliveryMethodComment);
    }
    private void inputPaymentMethodComment(String PaymentMethodComment){
        checkoutPageLoginedNotFirstTime.getPaymentMethodComment().click();
        checkoutPageLoginedNotFirstTime.getPaymentMethodComment().clear();
        checkoutPageLoginedNotFirstTime.getPaymentMethodComment().sendKeys(PaymentMethodComment);
    }

    public void clickOnBillingDetailsButton(){
        checkoutPageLoginedNotFirstTime.getBillingDetailsButton().click();
    }
    public void clickOnCountryInputButton(){
        checkoutPageLoginedNotFirstTime.getCountryInputButton().click();
    }
    public void clickOnCountryInputButtons(int value){
        checkoutPageLoginedNotFirstTime.getCountryInputButtons(value).click();
    }
    public void clickOnRegionInputButton(){
        checkoutPageLoginedNotFirstTime.getRegionInputButton().click();
    }
    public void clickOnRegionInputButtons(int value){
        checkoutPageLoginedNotFirstTime.getRegionInputButtons(value).click();
    }
    public void clickOnBillingDetailsContinueButton(){
        checkoutPageLoginedNotFirstTime.getBillingDetailsContinueButton().click();
    }
    public void clickOnDeliveryDetailsButton(){
        checkoutPageLoginedNotFirstTime.getDeliveryDetailsButton().click();
    }
    public void clickOnAddressRadioButton(){
        checkoutPageLoginedNotFirstTime.getAddressRadioButton().click();
    }
    public void clickOnDeliveryDetailsContinueButton(){
        checkoutPageLoginedNotFirstTime.getDeliveryDetailsContinueButton().click();
    }
    public void clickOnDeliveryMethodButton(){
        checkoutPageLoginedNotFirstTime.getDeliveryMethodButton().click();
    }
    public void clickOnDeliveryMethodRadioButton(){
        checkoutPageLoginedNotFirstTime.getDeliveryMethodRadioButton().click();
    }

    public void clickOnDeliveryMethodComment(){
        checkoutPageLoginedNotFirstTime.getDeliveryMethodComment().click();
    }
    public void clickOnDeliveryMethodContinueButton(){
        checkoutPageLoginedNotFirstTime.getDeliveryMethodContinueButton().click();
    }
    public void clickOnPaymentMethodButton(){
        checkoutPageLoginedNotFirstTime.getPaymentMethodButton().click();
    }
    public void clickOnPaymentMethodRadioButton(){
        checkoutPageLoginedNotFirstTime.getPaymentMethodRadioButton().click();
    }
    public void clickOnPaymentMethodComment(){
        checkoutPageLoginedNotFirstTime.getPaymentMethodComment().click();
    }
    public void clickOnAgreementCheckbox(){
        checkoutPageLoginedNotFirstTime.getAgreementCheckbox().click();
    }
    public void clickOnPaymentMethodContinueButton(){
        checkoutPageLoginedNotFirstTime.getPaymentMethodContinueButton().click();
    }
    public void clickOnConfirmOrderButton(){
        checkoutPageLoginedNotFirstTime.getConfirmOrderButton().click();
    }

    public void successCheckout() {
         SuccessOrderPage successOrderPage = new SuccessOrderPage();
        String expected = "Thanks for shopping with us online!";
       Assert.assertEquals(successOrderPage.getSuccessTitle().getText(),expected,"Successful");
}

public void AcceptMassageOk(){
        AcceptAlertMasageOnCheckoutPage AcceptAlertMasageOnCheckoutPage = new AcceptAlertMasageOnCheckoutPage();
    AcceptAlertMasageOnCheckoutPage.getAcceptMassageOk();
}




}
