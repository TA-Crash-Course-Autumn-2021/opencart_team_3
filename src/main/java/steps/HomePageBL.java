package steps;

import pages.HomePage;

public class HomePageBL {

    private HomePage homePage;

    public HomePageBL(){
        homePage = new HomePage();
    }

    public HeaderPageBL getHeaderPageBL(){
        return new HeaderPageBL();
    }

}
