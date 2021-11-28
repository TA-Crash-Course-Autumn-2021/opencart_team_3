package stories;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.RegisterPageBL;
import steps.checkout_steps.CheckoutPageLiginedNotFirstTimeBL;
import steps.checkout_steps.CheckoutPageLoginedFirstTimeBL;
import steps.product_page_steps.ProductPageBL;

import static enums.URLs.BASE_URL;

public class UsingProductPageTest extends StoriesBaseTest {

    @Test
    public void MakeOrderWithOneProductAsLoginedUserTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        CheckoutPageLiginedNotFirstTimeBL checkotPageLoginedNotFirstTimeBL = new CheckoutPageLiginedNotFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .getMyAccountPageBL()
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct();
        Thread.sleep(5000);
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        Thread.sleep(2000);
        checkotPageLoginedNotFirstTimeBL
                .checkoutBillingDetails();
        Thread.sleep(10000);
        checkotPageLoginedNotFirstTimeBL
                .AcceptMassageOk();
        Thread.sleep(6000);
        checkotPageLoginedNotFirstTimeBL.clickOnConfirmOrderButton();
        Thread.sleep(5000);
        checkotPageLoginedNotFirstTimeBL.successCheckout();
    }

    @Test
    public void MakeOrderWithTwoProductsAsLoginedUserTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        CheckoutPageLiginedNotFirstTimeBL checkotPageLoginedNotFirstTimeBL = new CheckoutPageLiginedNotFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .getMyAccountPageBL()
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct()
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("MacBook")
                .getProductPageBL()
                .orderUsualProduct();
        Thread.sleep(5000);
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        Thread.sleep(2000);
        checkotPageLoginedNotFirstTimeBL
                .checkoutBillingDetails();
        Thread.sleep(10000);
        checkotPageLoginedNotFirstTimeBL
                .AcceptMassageOk();
        Thread.sleep(6000);
        checkotPageLoginedNotFirstTimeBL.clickOnConfirmOrderButton();
        Thread.sleep(5000);
        checkotPageLoginedNotFirstTimeBL.successCheckout();
    }


    @Test
    public void MakeOrderWithThreeProductsAsLoginedUserTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        CheckoutPageLiginedNotFirstTimeBL checkotPageLoginedNotFirstTimeBL = new CheckoutPageLiginedNotFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .getMyAccountPageBL()
                .clickOnBackToHomePageButton()
                .getHomePageBL()
                .clickOnProductTitle("iPhone")
                .getProductPageBL()
                .orderUsualProduct()
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
        Thread.sleep(5000);
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        Thread.sleep(2000);
        checkotPageLoginedNotFirstTimeBL
                .checkoutBillingDetails();
        Thread.sleep(10000);
        checkotPageLoginedNotFirstTimeBL
                .AcceptMassageOk();
        Thread.sleep(6000);
        checkotPageLoginedNotFirstTimeBL.clickOnConfirmOrderButton();
        Thread.sleep(5000);
        checkotPageLoginedNotFirstTimeBL.successCheckout();
    }

    @Test
    public void MakeOrderWithOneProductAsGuestUserTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        CheckoutPageLoginedFirstTimeBL checkotPageLoginedFirstTimeBL = new CheckoutPageLoginedFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        RegisterPageBL registerPageBL = homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
        homePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        homePageBL.clickOnProductTitle("Canon EOS 5D")
                .getProductPageBL()
                .orderProductWithSelectField();
        Thread.sleep(5000);
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        Thread.sleep(2000);
        checkotPageLoginedFirstTimeBL
                .checkoutBillingDetails(1,1);
        Thread.sleep(10000);
        checkotPageLoginedFirstTimeBL
                .AcceptMassageOk();
        Thread.sleep(6000);
        checkotPageLoginedFirstTimeBL.clickOnConfirmOrderButton();
        Thread.sleep(5000);
        checkotPageLoginedFirstTimeBL.successCheckout();
    }


}
