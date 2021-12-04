package opencart;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.HomePageBL;
import steps.RegisterPageBL;

import static enums.URLs.BASE_URL;

public class CartTest extends BaseTest {


    @Test
    public void cartTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        RegisterPageBL registerPageBL = HomePageBL.getHeaderPageUnloginedBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewValidPerson();
        HomePageBL.getHeaderPageLoginedBL().clickOnMainPageButton();
        HomePageBL.addProductToCart("iPhone");
        HomePageBL.successAddToCartAlert("iPhone");
        HomePageBL.addProductToCart("MacBook");
        HomePageBL.successAddToCartAlert("MacBook");
        HomePageBL.getHeaderPageLoginedBL().clickOnCartButton();
        HomePageBL.getCartPageBl().cartProducts(1,1,1);
    }
    @Test
    public void addToCart1Test(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        HomePageBL.addProductToCart("iPhone");
       // HomePageBL.successAddToCartAlert();
    }
    @Test
    public void addToCart2Test(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        HomePageBL.addProductToCart("iPhone");
        HomePageBL.successAddToCartAlert("iPhone");
        HomePageBL.addProductToCart("MacBook");
       HomePageBL.successAddToCartAlert("MacBook");
    }
    @Test
    public void addToCart3Test(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL HomePageBL = new HomePageBL();
        HomePageBL.addProductToCart("iPhone");
        HomePageBL.successAddToCartAlert("iPhone");
        HomePageBL.addProductToCart("MacBook");
        HomePageBL.successAddToCartAlert("MacBook");
        HomePageBL.addProductToCart("MacBook");
        HomePageBL.successAddToCartAlert("MacBook");
    }
}