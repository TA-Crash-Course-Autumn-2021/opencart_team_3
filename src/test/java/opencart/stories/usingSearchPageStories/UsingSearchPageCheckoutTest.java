package opencart.stories.usingSearchPageStories;

import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.RegisterPageBL;

import static enums.URLs.BASE_URL;

public class UsingSearchPageCheckoutTest extends BaseTest {
    @Test
    public void orderOneProductFromSearchPage(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        HomePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successfulLoginCheck();
        homePageBL.getHeaderPageLoginedBL().clickOnCartButton();
        homePageBL.getCartPageBl().cleanCart();
        HomePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        homePageBL.getSearchField()
                .inputSearchRequest("MacBook Air")
                .clickOnSearchButton();
        homePageBL.getSearchField().getProductOnSearchPageBL()
                .addProductToCart("MacBook Air");
        homePageBL.getHeaderPageLoginedBL().clickOnCheckoutButton();
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().checkoutBillingDetails();
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().acceptMassageOk();
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().clickOnConfirmOrderButton();
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().successCheckout();



    }

    @Test
    public void orderTwoProductsFromSearchPage(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        HomePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successfulLoginCheck();
        homePageBL.getHeaderPageLoginedBL().clickOnCartButton();
        homePageBL.getCartPageBl().cleanCart();
        HomePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        homePageBL.getSearchField()
                .inputSearchRequest("MacBook Air")
                .clickOnSearchButton();
        homePageBL.getSearchField().getProductOnSearchPageBL()
                .addProductToCart("MacBook Air");
        homePageBL.getSearchField()
                .inputSearchRequest("Iphone")
                .clickOnSearchButton();
        homePageBL.getSearchField().getProductOnSearchPageBL()
                .addProductToCart("iPhone");
        homePageBL.getHeaderPageLoginedBL().clickOnCheckoutButton();
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().checkoutBillingDetails();
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().acceptMassageOk();
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().clickOnConfirmOrderButton();
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().successCheckout();



    }

    @Test
    public void orderThreeProductsFromSearchPage(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        HomePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginValidUser()
                .successfulLoginCheck();
        homePageBL.getHeaderPageLoginedBL().clickOnCartButton();
        homePageBL.getCartPageBl().cleanCart();
        HomePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        homePageBL.getSearchField()
                .inputSearchRequest("MacBook Air")
                .clickOnSearchButton();
        homePageBL.getSearchField().getProductOnSearchPageBL()
                .addProductToCart("MacBook Air");
        homePageBL.getSearchField()
                .inputSearchRequest("Iphone")
                .clickOnSearchButton();
        homePageBL.getSearchField().getProductOnSearchPageBL()
                .addProductToCart("iPhone");
        homePageBL.getSearchField()
                .inputSearchRequest("Samsung")
                .clickOnSearchButton();
        homePageBL.getSearchField().getProductOnSearchPageBL()
                .addProductToCart("Samsung SyncMaster 941BW");
        homePageBL.getHeaderPageLoginedBL().clickOnCheckoutButton();
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().checkoutBillingDetails();
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().acceptMassageOk();
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().clickOnConfirmOrderButton();
        HomePageBL.getCheckoutPageLoginedNotFirstTimeBL().successCheckout();
    }
}
