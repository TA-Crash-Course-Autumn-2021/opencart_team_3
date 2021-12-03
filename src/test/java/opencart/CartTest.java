package opencart;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.RegisterPageBL;

import static enums.URLs.BASE_URL;

public class CartTest extends BaseTest {


    @Test
    public void CartTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        RegisterPageBL registerPageBL = HomePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
        HomePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        HomePageBL.addProductToCart("iPhone");
        HomePageBL.addProductToCart("MacBook");
        HomePageBL.getHeaderPageUnloginedBL().clickOnCartPageButton();
        HomePageBL.getCartPageBl().cartProducts(1,4,3);
    }

    @Test
    public void addToCart1Test() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        HomePageBL.addProductToCart("iPhone");
        HomePageBL.successAddToCartAlert();
    }
    @Test
    public void addToCart2Test() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        HomePageBL.addProductToCart("iPhone");
        HomePageBL.successAddToCartAlert();
        HomePageBL.addProductToCart("MacBook");
        HomePageBL.successAddToCartAlert();
    }
    @Test
    public void addToCart3Test() throws InterruptedException {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        HomePageBL.addProductToCart("iPhone");
        HomePageBL.successAddToCartAlert();
        HomePageBL.addProductToCart("MacBook");
        HomePageBL.successAddToCartAlert();
        HomePageBL.addProductToCart("MacBook");
        HomePageBL.successAddToCartAlert();
    }
}