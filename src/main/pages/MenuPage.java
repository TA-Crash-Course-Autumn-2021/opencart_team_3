package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;

public class MenuPage extends BasePage{
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]")
    private WebElement desktoopsMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]//a[@class = 'see-all")
    private WebElement seeAllDesktoopsMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]//li")
    private List<WebElement> desktoopsMenuButtons;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]")
    private WebElement laptopsAndNetobooksMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]//a[@class = 'see-all")
    private WebElement seeAllLaptopsAndNetobooksMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]//li")
    private List<WebElement> laptopsAndNetobooksMenuButtons;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[3]")
    private WebElement componentsMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[3]//a[@class = 'see-all")
    private WebElement seeAllComponentsMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[3]//li")
    private List<WebElement> componentsMenuButtons;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[4]")
    private WebElement tabletsMenuButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[5]")
    private WebElement softwareMenuButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[6]")
    private WebElement phoneaAndPdasMenuButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[7]")
    private WebElement camerasMenuButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[8]")
    private WebElement mp3PlayersMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[8]//a[@class = 'see-all")
    private WebElement seeAllMp3PlayersMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[8]//li")
    private List<WebElement> mp3PlayersMenuButtons;

    public WebElement getDesktoopsMenuButton() {
        return desktoopsMenuButton;
    }
    public WebElement getsSeeAllDesktoopsMenuButton() {
        return seeAllDesktoopsMenuButton;
    }
    public WebElement getDesktoopsMenuButtons(int value) {
            return desktoopsMenuButtons.get(value);
    }

    public WebElement getLaptopsAndNetobooksMenuButton() {
        return laptopsAndNetobooksMenuButton;
    }
    public WebElement getsSeeAllLaptopsAndNetobooksMenuButton() {
        return seeAllLaptopsAndNetobooksMenuButton;
    }
    public WebElement getLaptopsAndNetobooksMenuButtons(int value) {
        return laptopsAndNetobooksMenuButtons.get(value);
    }

    public WebElement getComponentsMenuButton() {
        return componentsMenuButton;
    }
    public WebElement getSeeAllComponentsMenuButton() {
        return seeAllComponentsMenuButton;
    }
    public WebElement getComponentsMenuButtons(int value) {
        return componentsMenuButtons.get(value);
    }

    public WebElement getTabletsMenuButton() {
        return tabletsMenuButton;
    }

    public WebElement getSoftwareMenuButton() {
        return softwareMenuButton;
    }

    public WebElement getCamerasMenuButton() {
        return camerasMenuButton;
    }

    public WebElement getMp3PlayersMenuButton() {
        return mp3PlayersMenuButton;
    }
    public WebElement getSeeAllMp3PlayersMenuButton() {
        return seeAllMp3PlayersMenuButton;
    }
    public WebElement getMp3PlayersMenuButtons(int value) {
        return mp3PlayersMenuButtons.get(value);
    }

}
