package steps.product_page_steps;

import datamodel.AppleCinemaModel;
import org.testng.Assert;
import pages.product_pages.AppleCinemaPage;
import repository.AppleCinemaModelRepository;
import steps.HomePageBL;
import util.DriverUtils;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class AppleCinemaPageBL {

    private AppleCinemaPage appleCinemaPage;

    public AppleCinemaPageBL() {
        appleCinemaPage = new AppleCinemaPage();
    }

    public HomePageBL getHomePageBL() {
        return new HomePageBL();
    }

    public AppleCinemaPageBL orderAppleCinema() {
        AppleCinemaModel appleCinemaModel = AppleCinemaModelRepository.getAppleCinemaModel();
        chooseRadio(appleCinemaModel.getRadio());
        chooseCheckbox(appleCinemaModel.getCheckbox());
        inputText(appleCinemaModel.getText());
        chooseSelectDropdown(appleCinemaModel.getSelect());
        inputTextArea(appleCinemaModel.getTextArea());
        inputDate(appleCinemaModel.getDate());
        inputTime(appleCinemaModel.getTime());
        inputDateAndTime(appleCinemaModel.getDateAndTime());
        inputQuantity(appleCinemaModel.getQuantity());
        uploadFileByButton(appleCinemaModel.getUploadFile());
        clickOnAddToCartButton();
        appleCinemaPage = new AppleCinemaPage();
        return this;
    }

    public void clickOnWishListButton() {
        appleCinemaPage.getAddToWishListButton().click();
    }

    public void clickOnCompareProductButton() {
        appleCinemaPage.getCompareProductButton().click();
    }

    public void clickOnBrandButton() {
        appleCinemaPage.getBrandButton().click();
    }

    private void chooseRadio(int value) {
        new DriverUtils().clickOnElementJS(appleCinemaPage.getRadioButton(value));
    }

    private void chooseCheckbox(int value) {
        new DriverUtils().clickOnElementJS(appleCinemaPage.getCheckbox(value));
    }

    private void clickText() {
        appleCinemaPage.getInputText().click();
    }

    private void clearText() {
        appleCinemaPage.getInputText().clear();
    }

    private void inputText(String str) {
        clickText();
        clearText();
        appleCinemaPage.getInputText().sendKeys(str);
    }

    private void clickSelect() {
        appleCinemaPage.getSelectButton().click();
    }

    private void chooseSelectDropdown(int value) {
        clickSelect();
        appleCinemaPage.chooseSelectOption(value).click();
    }

    private void clickTextArea() {
        appleCinemaPage.getInputTextArea().click();
    }

    private void clearTextArea() {
        appleCinemaPage.getInputTextArea().clear();
    }

    private void inputTextArea(String str) {
        clickTextArea();
        clearTextArea();
        appleCinemaPage.getInputTextArea().sendKeys(str);
    }

    private void clickDate() {
        appleCinemaPage.getInputDate().click();
    }

    private void clearDate() {
        appleCinemaPage.getInputDate().clear();
    }

    private void inputDate(String str) {
        clickDate();
        clearDate();
        appleCinemaPage.getInputDate().sendKeys(str);
    }

    private void clickTime() {
        appleCinemaPage.getInputTime().click();
    }

    private void clearTime() {
        appleCinemaPage.getInputTime().clear();
    }

    private void inputTime(String str) {
        clickTime();
        clearTime();
        appleCinemaPage.getInputTime().sendKeys(str);
    }

    private void clickDateAndTime() {
        appleCinemaPage.getInputDateAndTime().click();
    }

    private void clearDateAndTime() {
        appleCinemaPage.getInputDateAndTime().clear();
    }

    private void inputDateAndTime(String str) {
        clickDateAndTime();
        clearDateAndTime();
        appleCinemaPage.getInputDateAndTime().sendKeys(str);
    }

    private void clickInputQuantity() {
        appleCinemaPage.getInputQuantity().click();
    }

    private void clearInputQuantity() {
        appleCinemaPage.getInputQuantity().clear();
    }

    private void inputQuantity(String qty) {
        clickInputQuantity();
        clearInputQuantity();
        appleCinemaPage.getInputQuantity().sendKeys(qty);
    }

    private void uploadFileByButton(String path) {
        File file = new File(path);
        StringSelection absolutePath = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(absolutePath, null);
        appleCinemaPage.getUploadFileButton().click();      //.sendKeys(path);

        try {
            Robot robot = new Robot();
            robot.delay(3000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    private void clickOnAddToCartButton() {
        appleCinemaPage.getAddToCartButton().click();
    }

    public void verifyOrderingAppleCinema() {
        String expectedMessage = "Success";
        //String nameItem = "Apple Cinema 30";
        Assert.assertTrue(appleCinemaPage.getSuccessTitle().getText().contains(expectedMessage), "Your product was not added to shopping cart");
        //Assert.assertTrue(appleCinemaPage.getSuccessTitle().getText().contains(nameItem), "Other product was added to shopping cart");
    }
}