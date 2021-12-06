package opencart;

import navigation.Navigation;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import steps.HomePageBL;


import static enums.URLs.BASE_URL;

public class ChangeCurrencyTest extends BaseTest {

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"€"}, {"£"}, {"$"}};
    }

    @BeforeClass
    public void navigate()
    {
        new Navigation().navigateToUrl(BASE_URL.getValue());
    }

    @Test (dataProvider = "data-provider")
    public void successChangeCurrencyOnHomePageTest(String  val)
    {
        HomePageBL homePageBL = new HomePageBL();
        homePageBL.getHeaderPageUnloginedBL()
                .clickOnCurrencyButton()
                .clickOnSpecialCurrencyButton(val);
        homePageBL.successfulChangeCurrencyCheck(val);
    }

}