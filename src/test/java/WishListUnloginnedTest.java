import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HomePageBL;
import steps.MyAccountPageBL;
import steps.RegisterPageBL;
import steps.wish_list_steps.InitialisationWishListPageBL;
import steps.wish_list_steps.MyWishListPageBL;
import steps.wish_list_steps.SuccessRegisterPageBL;

import static enums.URLs.BASE_URL;

public class WishListUnloginnedTest extends BaseTest{

    @Test
    public void viewWishListViaNewCustomer(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        HomePageBL homePageBL = new HomePageBL();
        //RegisterModel registerModel = RegisterModelRepository.getValidRegisterModel();
        homePageBL.getHeaderPageUnloginedBL().clickOnWishListButton();

        InitialisationWishListPageBL initialisationWishListPageBL = new InitialisationWishListPageBL();
        initialisationWishListPageBL.clickOnContinueButtonToRegister();

        RegisterPageBL registerPageBL = new RegisterPageBL();
        registerPageBL.registerNewValidPerson().verifyUserRegistration();

        SuccessRegisterPageBL successRegisterPageBL = new SuccessRegisterPageBL();
        successRegisterPageBL.clickOnContinueButtonSuccessfulRegisterPage();

        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL.clickOnWishListButton();

        MyWishListPageBL myWishListPageBL = new MyWishListPageBL();
        myWishListPageBL.verifySuccessfulWishListMessage();
    }

}
