package steps;
import pages.MenuPage;
public class MenuPageBL {
private MenuPage MenuPage;

public MenuPageBL(){ MenuPage = new MenuPage(); }

    public MenuPageBL clickOnDesktopsMenuButton (){
    MenuPage.getDesktopsMenuButton().click();
    return this;
    }
    public MenuPageBL clickOnDesktopsMenuButtons (int value){
        MenuPage.getDesktopsMenuButtons(value).click();
        return this;
    }
    public MenuPageBL clickOnSeeAllDesktopsMenuButton (){
        MenuPage.getsSeeAllDesktopsMenuButton().click();
        return this;
    }

    public MenuPageBL clickOnLaptopsAndNotebooksMenuButton (){
        MenuPage.getLaptopsAndNetobooksMenuButton().click();
        return this;
    }
    public MenuPageBL clickOnLaptopsAndNotebooksMenuButtons (int value){
        MenuPage.getLaptopsAndNetobooksMenuButtons(value).click();
        return this;
    }
    public MenuPageBL clickOnSeeAllLaptopsAndNotebooksMenuButton (){
        MenuPage.getSeeAllLaptopsAndNetobooksMenuButton().click();
        return this;
    }

    public MenuPageBL clickOnComponentsMenuButton(){
        MenuPage.getComponentsMenuButton().click();
        return this;
    }
    public MenuPageBL clickOnComponentsMenuButtons (int value){
        MenuPage.getComponentsMenuButtons(value).click();
        return this;
    }
    public MenuPageBL clickOnSeeAllComponentsMenuButton (){
        MenuPage.getSeeAllComponentsMenuButton().click();
        return this;
    }

    public MenuPageBL clickOnTabletsMenuButton(){
        MenuPage.getTabletsMenuButton().click();
        return this;
    }

    public MenuPageBL clickOnSoftwareMenuButton(){
        MenuPage.getSoftwareMenuButton().click();
        return this;
    }
    public MenuPageBL clickOnPhoneAndPDAsMenuButton(){
        MenuPage.getPhoneAndPDAsMenuButton().click();
        return this;
    }

    public MenuPageBL clickOnCamerasMenuButton(){
        MenuPage.getCamerasMenuButton().click();
        return this;
    }

    public MenuPageBL clickOnMp3PlayersMenuButton(){
        MenuPage.getMp3PlayersMenuButton().click();
        return this;
    }
    public MenuPageBL clickOnMp3PlayersMenuButtons (int value){
        MenuPage.getMp3PlayersMenuButtons(value).click();
        return this;
    }
    public MenuPageBL clickOnSeeAllMp3PlayersMenuButton (){
        MenuPage.getSeeAllMp3PlayersMenuButton().click();
        return this;
    }

}
