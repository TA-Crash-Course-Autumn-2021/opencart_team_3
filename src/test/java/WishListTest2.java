import models.LoginUserModel;
import models.RegisterUserModel;
import navigation.NavigationPO;
import org.testng.annotations.Test;
import repository.LoginUserModelRepository;
import repository.RegisterUserModelRepository;
import steps.*;

import static enums.URLs.BASE_URL;

public class WishListTest2 extends BaseTest {

    @Test
    public void viewWishListViaExistingUser(){
        new NavigationPO().navigateByUrl(BASE_URL);
        HomePageBL homePageBL = new HomePageBL();
        LoginUserModel loginUserModel = LoginUserModelRepository.getValidLoginUser();
        homePageBL.getHeaderPageBL().clickOnWishListButton();
        PreWishListPageBL preWishListPageBL = new PreWishListPageBL();
        preWishListPageBL.loginNewUser(loginUserModel);
        MyWishListPageBL myWishListPageBL = new MyWishListPageBL();
        myWishListPageBL.verifySuccessfulWishListMessage();
        System.out.println();
    }

}
