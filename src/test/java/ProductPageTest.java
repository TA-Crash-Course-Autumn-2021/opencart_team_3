import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.product_page_steps.ProductPageBL;

import static enums.URLs.BASE_URL;

public class ProductPageTest extends BaseTest {

    @Test
    public void OrderAppleCinemaUsingProductPageTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.clickOnProductTitle("Apple Cinema 30" + "\"")
                .getAppleCinemaPageBL()
                .orderAppleCinema()
                .verifyOrderingAppleCinema();
    }

    @Test
    public void AddOneProductToCompareUsingProductPageTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.clickOnProductTitle("iPhone")
                .getProductPageBL()
                .clickOnCompareProductButton()
                .verifyProductCompare();
    }

    @Test
    public void AddTwoProductsToCompareUsingProductPageTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        ProductPageBL productPageBL = new ProductPageBL();
        homePageBL.clickOnProductTitle("iPhone")
                .getProductPageBL()
                .compareProduct("Apple Cinema 30" + "\"");
        Thread.sleep(3000);
        productPageBL
                .clickOnCompareProductButton();
        Thread.sleep(3000);
        productPageBL
                .clickOnProductComparisonButtonInAlert();
        Thread.sleep(3000);                                  //success after 2 retries, or only first
    }                                                             //if without thread sleeps

    @Test
    public void AddSixProductsToCompareUsingProductPageTest() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.clickOnProductTitle("iPhone")
                .getProductPageBL()
                .clickOnCompareProductButton()
                .clickOnBackToHomePageButton();
        homePageBL.getSearchField()
                .findSearchRequest()
                .getProductOnSearchPageBL()
                .clickOnProductTitle("iMac")
                .getProductPageBL().clickOnCompareProductButton()
                .compareProduct("Apple Cinema 30" + "\"")                               //1 retry
                .clickOnBackToSearchPageButton()
                .getProductOnSearchPageBL()
                .clickOnProductTitle("MacBook")
                .getProductPageBL()
                .clickOnCompareProductButton()
                .clickOnBackToSearchPageButton()
                .getProductOnSearchPageBL()
                .clickOnProductTitle("MacBook Air")
                .getProductPageBL()
                .clickOnCompareProductButton()
                .clickOnBackToSearchPageButton()
                .getProductOnSearchPageBL()
                .clickOnProductTitle("MacBook Pro")
                .getProductPageBL()
                .clickOnCompareProductButton()
                .clickOnProductComparisonButtonInAlert();
        Thread.sleep(5000);
    }
}
