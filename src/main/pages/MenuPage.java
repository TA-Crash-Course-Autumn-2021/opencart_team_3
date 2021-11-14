package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;

public class MenuPage extends BasePage{
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]")
    private WebElement desktopsMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]//a[@class = 'see-all")
    private WebElement seeAllDesktopsMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]//li")
    private List<WebElement> desktopsMenuButtons;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]")
    private WebElement laptopsAndNotebooksMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]//a[@class = 'see-all")
    private WebElement seeAllLaptopsAndNotebooksMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]//li")
    private List<WebElement> laptopsAndNotebooksMenuButtons;

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
    private WebElement phoneAndPDAsMenuButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[7]")
    private WebElement camerasMenuButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[8]")
    private WebElement mp3PlayersMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[8]//a[@class = 'see-all")
    private WebElement seeAllMp3PlayersMenuButton;
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[8]//li")
    private List<WebElement> mp3PlayersMenuButtons;

    public WebElement getDesktopsMenuButton() {
        return desktopsMenuButton;
    }
    public WebElement getsSeeAllDesktopsMenuButton() {
        return seeAllDesktopsMenuButton;
    }
    public WebElement getDesktopsMenuButtons(int value) {
            return desktopsMenuButtons.get(value);
    }

    public WebElement getLaptopsAndNetobooksMenuButton() {
        return laptopsAndNotebooksMenuButton;
    }
    public WebElement getSeeAllLaptopsAndNetobooksMenuButton() {
        return seeAllLaptopsAndNotebooksMenuButton;
    }
    public WebElement getLaptopsAndNetobooksMenuButtons(int value) {
        return laptopsAndNotebooksMenuButtons.get(value);
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
    public WebElement getPhoneAndPDAsMenuButton() {
        return phoneAndPDAsMenuButton;
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
