package steps.wish_list_steps;

import org.testng.Assert;
import pages.wish_list_pages.MyWishListPage;

public class MyWishListPageBL {

    private MyWishListPage myWishListPage;

    public MyWishListPageBL(){ myWishListPage = new MyWishListPage(); }

    public void verifySuccessfulWishListMessage(){
        String expectedMessageWishList = "My Wish List";
        Assert.assertEquals(myWishListPage.getSuccessfulWishListMessage().getText(), expectedMessageWishList,
                "Error!");
    }

}
