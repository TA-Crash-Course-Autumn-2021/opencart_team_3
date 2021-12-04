package opencart.stories.using_product_page_stories;

import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.MyAccountPageBL;
import steps.checkout_steps.CheckoutPageLiginedNotFirstTimeBL;
import steps.product_page_steps.ProductPageBL;

import static enums.URLs.BASE_URL;

public class UsingProductPageLoginedTest extends BaseTest {

    @BeforeClass
    public void loginMethod() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser();
    }

    @Test
    public void MakeOrderWithOneProductAsLoginedUserTest() {
        CheckoutPageLiginedNotFirstTimeBL checkotPageLoginedNotFirstTimeBL = new CheckoutPageLiginedNotFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct();
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        checkotPageLoginedNotFirstTimeBL
                .checkoutBillingDetails()
                .acceptMassageOk();
        checkotPageLoginedNotFirstTimeBL.clickOnConfirmOrderButton();
        checkotPageLoginedNotFirstTimeBL.successCheckout();
    }

    @Test
    public void MakeOrderWithTwoProductsAsLoginedUserTest() {
        CheckoutPageLiginedNotFirstTimeBL checkotPageLoginedNotFirstTimeBL = new CheckoutPageLiginedNotFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct();
        productPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("MacBook")
                .getProductPageBL()
                .orderUsualProduct();
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        checkotPageLoginedNotFirstTimeBL
                .checkoutBillingDetails()
                .acceptMassageOk();
        checkotPageLoginedNotFirstTimeBL.clickOnConfirmOrderButton();
        checkotPageLoginedNotFirstTimeBL.successCheckout();
    }


    @Test
    public void MakeOrderWithThreeProductsAsLoginedUserTest() {
        CheckoutPageLiginedNotFirstTimeBL checkotPageLoginedNotFirstTimeBL = new CheckoutPageLiginedNotFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct();
        productPageBL
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("MacBook")
                .getProductPageBL()
                .orderUsualProduct()
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("Apple Cinema 30" + "\"")
                .getAppleCinemaPageBL()
                .orderAppleCinema();
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        checkotPageLoginedNotFirstTimeBL
                .checkoutBillingDetails()
                .acceptMassageOk();
        checkotPageLoginedNotFirstTimeBL.clickOnConfirmOrderButton();
        checkotPageLoginedNotFirstTimeBL.successCheckout();
    }

}
