package opencart.stories.using_product_page_stories;

import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.checkout_steps.CheckoutPageLoginedFirstTimeBL;
import steps.product_page_steps.ProductPageBL;

import static enums.URLs.BASE_URL;

public class UsingProductPageAsGuestTest extends BaseTest {

    @BeforeClass
    public void registrationMethod() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
    }


    @Test
    public void MakeOrderWithOneProductAsGuestUserTest() {
        HomePageBL homePageBL = new HomePageBL();
        CheckoutPageLoginedFirstTimeBL checkotPageLoginedFirstTimeBL = new CheckoutPageLoginedFirstTimeBL();
        ProductPageBL productPageBL = new ProductPageBL();
        homePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        homePageBL.getMenuPageBL().clickOnDesktopsMenuButton()
                .clickOnSeeAllDesktopsMenuButton()
                .getDesktopsPageBL()
                .clickOnProductTitle("HP LP3065")
                .getProductPageBL()
                .orderProductWithDeliveryField();
        productPageBL
                .getHeaderPageLoginedBL()
                .clickOnCheckoutButton()
                .getCheckotPageLoginedNotFirstTimeBL();
        checkotPageLoginedFirstTimeBL
                .checkoutBillingDetails(1, 1)
                .acceptMassageOk();
        checkotPageLoginedFirstTimeBL.clickOnConfirmOrderButton();
        checkotPageLoginedFirstTimeBL.successCheckout();
    }


    @Test
    public void MakeOrderWithOneProductAsGuestUserNegativeTest() {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        homePageBL.clickOnProductTitle("Canon EOS 5D")
                .getProductPageBL()
                .orderProductWithSelectField()
                .verifySelectAlert();
    }

}
