package steps;
import pages.MenuPage;
public class MenuPageBL {
private MenuPage MenuPage;

public MenuPageBL(){ MenuPage = new MenuPage(); }

    public MenuPageBL clickOnDesktoopsMenuButton (){
    MenuPage.getDesktoopsMenuButton().click();
    return this;
    }
    public MenuPageBL clickOnDesktoopsMenuButtons (int value){
        MenuPage.getDesktoopsMenuButtons(value).click();
        return this;
    }
    public MenuPageBL clickOnSeeAllDesktoopsMenuButton (){
        MenuPage.getsSeeAllDesktoopsMenuButton().click();
        return this;
    }

    public MenuPageBL clickOnLaptopsAndNetobooksMenuButton (){
        MenuPage.getLaptopsAndNetobooksMenuButton().click();
        return this;
    }
    public MenuPageBL clickOnLaptopsAndNetobooksMenuButtons (int value){
        MenuPage.getLaptopsAndNetobooksMenuButtons(value).click();
        return this;
    }
    public MenuPageBL clickOnSeeAllLaptopsAndNetobooksMenuButton (){
        MenuPage.getsSeeAllLaptopsAndNetobooksMenuButton().click();
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
