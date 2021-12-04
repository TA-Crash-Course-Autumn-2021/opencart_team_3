package opencart.stories.usingSearchPageStories;

import navigation.Navigation;
import opencart.BaseTest;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.RegisterPageBL;

import static enums.URLs.BASE_URL;

public class UsingSearchPageCheckoutAsGuestTest extends BaseTest {
    @Test
    public void orderThreeProductsFromSearchPage(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        RegisterPageBL registerPageBL = HomePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
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
        HomePageBL.getCheckoutPageLoginedFirstTimeBL().checkoutBillingDetails(1,1);
        HomePageBL.getCheckoutPageLoginedFirstTimeBL().acceptMassageOk();
        HomePageBL.getCheckoutPageLoginedFirstTimeBL().clickOnConfirmOrderButton();
        HomePageBL.getCheckoutPageLoginedFirstTimeBL().successCheckout();
    }
}
