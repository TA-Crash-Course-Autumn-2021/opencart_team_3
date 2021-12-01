package steps.adminUtils_steps;

import datamodel.CheckoutModel;
import datamodel.CouponeModel;
import lombok.SneakyThrows;
import org.testng.Assert;
import pages.adminUtils.AdminCouponePage;
import pages.checkout_pages.AcceptAlertMasageOnCheckoutPage;
import pages.checkout_pages.SuccessOrderPage;
import repository.CheckoutRepository;
import repository.CouponeModelRepository;
import steps.checkout_steps.CheckoutPageLoginedFirstTimeBL;

public class AdminCouponePageBL {
    private AdminCouponePage adminCouponePage;
    public AdminCouponePageBL(){adminCouponePage = new AdminCouponePage();}

    @SneakyThrows
    public AdminCouponePageBL fillCouponeDetails()  {
        CouponeModel couponeModel = CouponeModelRepository.getCuponeModel();
        inputCouponeName(couponeModel.getCouponeName());
        inputCouponeCode(couponeModel.getCouponeCode());
        inputDiscount(couponeModel.getDiscount());
        inputTotalAmount(couponeModel.getTotalAmount());
        return this;
    }
    public void clickOnSaveButton() {
        adminCouponePage.getSaveButton().click();
    }
private void inputCouponeName(String couponeName){
        adminCouponePage.getInputCouponeName().click();
        adminCouponePage.getInputCouponeName().clear();
        adminCouponePage.getInputCouponeName().sendKeys(couponeName);
    }
    private void inputCouponeCode(String couponeCode){
        adminCouponePage.getInputCouponeCode().click();
        adminCouponePage.getInputCouponeCode().clear();
        adminCouponePage.getInputCouponeCode().sendKeys(couponeCode);
    }
    private void inputDiscount(String discount){
        adminCouponePage.getDiscount().click();
        adminCouponePage.getDiscount().clear();
        adminCouponePage.getDiscount().sendKeys(discount);
    }
    private void inputTotalAmount(String totalAmount){
        adminCouponePage.getTotalAmount().click();
        adminCouponePage.getTotalAmount().clear();
        adminCouponePage.getTotalAmount().sendKeys(totalAmount);
    }

    public void successAddingCoupon() {
        String expectedMessage = "Success: You have modified coupons!";
        Assert.assertTrue(adminCouponePage.getSuccessTitle().getText().contains(expectedMessage), "Coupon was not added!");
    }

    }


