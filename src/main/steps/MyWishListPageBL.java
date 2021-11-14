package steps;

import org.testng.Assert;
import pages.MyWishListPage;
import pages.SuccessfulRegisterPage;

public class MyWishListPageBL {

    private MyWishListPage myWishListPage;

    public MyWishListPageBL(){
        myWishListPage = new MyWishListPage();
    }

    public void verifySuccessfulWishListMessage(){
        String expectedMessageWishList = "My Wish List";
        Assert.assertEquals(myWishListPage.getSuccessfulWishListMessage().getText(), expectedMessageWishList,
                "Error!");
        //myWishListPage = new MyWishListPage();
    }

}
