import datamodel.LoginModel;
import navigation.Navigation;
import org.testng.annotations.Test;
import repository.LoginModelRepository;
import steps.HomePageBL;
import steps.wish_list_steps.InitialisationWishListPageBL;
import steps.wish_list_steps.MyWishListPageBL;

import static enums.URLs.BASE_URL;

public class WishListToLoginTest extends BaseTest{

    @Test
    public void viewWishListViaExistingCustomer() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        LoginModel loginModel = LoginModelRepository.getValidLoginModel();
        homePageBL.getHeaderPageUnloginedBL().clickOnWishListButton();

        InitialisationWishListPageBL initialisationWishListPageBL = new InitialisationWishListPageBL();
        initialisationWishListPageBL.loginUser(loginModel);

        MyWishListPageBL myWishListPageBL = new MyWishListPageBL();
        myWishListPageBL.verifySuccessfulWishListMessage();
    }

}
