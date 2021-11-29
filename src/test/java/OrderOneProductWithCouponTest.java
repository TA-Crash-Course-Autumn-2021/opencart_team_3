import navigation.Navigation;
import org.testng.annotations.Test;
import pages.checkout_pages.CheckoutPageLoginedNotFirstTime;
import steps.HomePageBL;
import steps.MyAccountPageBL;
import steps.cart_steps.CartPageBL;
import steps.checkout_steps.CheckoutPageLiginedNotFirstTimeBL;
import steps.header_steps.HeaderPageLoginedBL;

import static enums.URLs.BASE_URL;

public class OrderOneProductWithCouponTest extends BaseTest{
    @Test
    public void MakeOrderWithOneProductAsLoginedUserWithCouponTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successfulLoginCheck();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct();
        HeaderPageLoginedBL headerPageLoginedBL = new HeaderPageLoginedBL();
        CartPageBL cartPageBL = headerPageLoginedBL
                .clickOnCartButton();
                cartPageBL.inputQuantity("1",0);
                cartPageBL.clickOnUseCouponCodeButton();
                cartPageBL.inputCoupon("2222");
                cartPageBL.clickOnApplyCouponCodeButton();
                cartPageBL.clickOnCheckoutButton();
                Thread.sleep(3000);
        CheckoutPageLiginedNotFirstTimeBL checkoutPageLoginedNotFirstTime =
                homePageBL.getCheckoutPageLoginedNotFirstTimeBL();
        checkoutPageLoginedNotFirstTime.checkoutBillingDetails();
        checkoutPageLoginedNotFirstTime.AcceptMassageOk();
        checkoutPageLoginedNotFirstTime.clickOnConfirmOrderButton();
        checkoutPageLoginedNotFirstTime.successCheckout();
    }
}
