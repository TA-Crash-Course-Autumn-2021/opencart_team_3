import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.MyAccountPageBL;
import steps.cart_steps.CartPageBL;
import steps.checkout_steps.CheckoutPageLiginedNotFirstTimeBL;
import steps.header_steps.HeaderPageLoginedBL;

import static enums.URLs.BASE_URL;

public class OrderOneProductWithCouponTest extends BaseTest{
    public static HomePageBL loginUser()
    {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successfulLoginCheck();
        return homePageBL;
    }

    public static void addProductIntoCart()
    {
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct();
    }

    @Test
    public void MakeOrderWithOneProductAsLoginedUserWithCouponTest() throws InterruptedException {
        HomePageBL homePageBL = loginUser();
        addProductIntoCart();
        HeaderPageLoginedBL headerPageLoginedBL = new HeaderPageLoginedBL();
        CartPageBL cartPageBL = headerPageLoginedBL
                .clickOnCartButton();
        cartPageBL.inputQuantity("1",0);
        cartPageBL.inputCouponToOrder();
                homePageBL.getCheckoutPageLoginedNotFirstTimeBL()
                        .completeCheckout();
    }
}
