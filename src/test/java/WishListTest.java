import models.LoginUserModel;
import models.RegisterUserModel;
import navigation.NavigationPO;
import org.testng.annotations.Test;
import repository.LoginUserModelRepository;
import repository.RegisterUserModelRepository;
import steps.*;

import static enums.URLs.BASE_URL;

public class WishListTest extends BaseTest {

    @Test
    public void viewWishListViaNewCustomer(){
        new NavigationPO().navigateByUrl(BASE_URL);
        HomePageBL homePageBL = new HomePageBL();
        RegisterUserModel registerUserModel = RegisterUserModelRepository.getValidRegisterUser();
        homePageBL.getHeaderPageBL().clickOnWishListButton();
        PreWishListPageBL preWishListPageBL = new PreWishListPageBL();
        preWishListPageBL.clickOnContinueButton();
        RegisterPageBL registerPageBL = new RegisterPageBL();
        registerPageBL.registerNewUser(registerUserModel).verifySuccessfulUserRegistration();
        SuccessfulRegisterPageBL successfulRegisterPageBL = new SuccessfulRegisterPageBL();
        successfulRegisterPageBL.clickOnContinueButtonSuccessfulRegisterPage();
        MyAccountPageBL myAccountPageBL = new MyAccountPageBL();
        myAccountPageBL.clickOnWishListSideButton();
        MyWishListPageBL myWishListPageBL = new MyWishListPageBL();
        myWishListPageBL.verifySuccessfulWishListMessage();
    }

}
