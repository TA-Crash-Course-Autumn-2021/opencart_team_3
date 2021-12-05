package steps.adminUtils_steps;

import datamodel.CouponeModel;
import lombok.SneakyThrows;
import org.testng.Assert;
import pages.adminUtils.AdminCouponPage;
import repository.CouponeModelRepository;

public class AdminCouponPageBL {
    private AdminCouponPage adminCouponPage;

    public AdminCouponPageBL() {
        adminCouponPage = new AdminCouponPage();
    }

    @SneakyThrows
    public AdminCouponPageBL fillCouponeDetails() {
        CouponeModel couponeModel = CouponeModelRepository.getCuponeModel();
        inputCouponeName(couponeModel.getCouponeName());
        inputCouponeCode(couponeModel.getCouponeCode());
        inputDiscount(couponeModel.getDiscount());
        inputTotalAmount(couponeModel.getTotalAmount());
        return this;
    }

    public void clickOnSaveButton() {
        adminCouponPage.getSaveButton().click();
    }

    private void inputCouponeName(String couponeName) {
        adminCouponPage.getInputCouponeName().click();
        adminCouponPage.getInputCouponeName().clear();
        adminCouponPage.getInputCouponeName().sendKeys(couponeName);
    }

    private void inputCouponeCode(String couponeCode) {
        adminCouponPage.getInputCouponeCode().click();
        adminCouponPage.getInputCouponeCode().clear();
        adminCouponPage.getInputCouponeCode().sendKeys(couponeCode);
    }

    private void inputDiscount(String discount) {
        adminCouponPage.getDiscount().click();
        adminCouponPage.getDiscount().clear();
        adminCouponPage.getDiscount().sendKeys(discount);
    }

    private void inputTotalAmount(String totalAmount) {
        adminCouponPage.getTotalAmount().click();
        adminCouponPage.getTotalAmount().clear();
        adminCouponPage.getTotalAmount().sendKeys(totalAmount);
    }

    public void successAddingCoupon() {
        String expectedMessage = "Success: You have modified coupons!";
        Assert.assertTrue(adminCouponPage.getSuccessTitle().getText().contains(expectedMessage), "Coupon was not added!");
    }

}

