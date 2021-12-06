package opencart.stories.usingCoupons;

import lombok.SneakyThrows;
import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.cart_steps.CartPageBL;
import steps.header_steps.HeaderPageLoginedBL;

import static enums.URLs.BASE_URL;

public class OrderOneProductWithCouponTest extends BaseTest {
    @BeforeClass
    public void loginUser() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginTestUser()
                .successfulLoginCheck();
    }

    @SneakyThrows
    @Test
    public void MakeOrderWithOneProductAsLoginedUserWithCouponTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getProductPageBL().addProductIntoCart();
        HeaderPageLoginedBL headerPageLoginedBL = new HeaderPageLoginedBL();
        CartPageBL cartPageBL = headerPageLoginedBL
                .clickOnCartButton();
        cartPageBL.inputCouponToOrder();
        cartPageBL.clickOnCheckoutButton();
        homePageBL.getCheckoutPageLoginedNotFirstTimeBL()
                .completeCheckout();
    }
}