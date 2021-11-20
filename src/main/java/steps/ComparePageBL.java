package steps;

import pages.ComparePage;
import pages.EmptyComparePage;
import pages.SuccessfulAddingToComparePageAlertPage;

public class ComparePageBL {

    private ComparePage comparePage;
    private EmptyComparePage emptyComparePage;
    SuccessfulAddingToComparePageAlertPage successfulAddingToComparePageAlertPage;

    public ComparePageBL() {
        comparePage = new ComparePage();
        successfulAddingToComparePageAlertPage = new SuccessfulAddingToComparePageAlertPage();
    }

    public ComparePageBL operationsOnProducts() {
        clickOnProductComparisonButton();
        clickOnAddToCartButton("iPhone");
        clickOnRemoveButton("iPhone");
        return this;
    }

    private void clickOnAddToCartButton(int productIndex) {
        comparePage.getAddToCartButtons().get(productIndex).click();
    }

    private void clickOnAddToCartButton(String productName) {

        for (int i = 0; i < comparePage.getProducts().size(); i++) {
            if (comparePage.getProducts().get(i).getText().equals(productName)) {
                comparePage.getAddToCartButtons().get(i).click();
                break;
            }
        }
    }

    private void clickOnRemoveButton(int productIndex) {
        comparePage.getRemoveButtons().get(productIndex).click();
        isComparePageEmpty();
    }

    private void clickOnRemoveButton(String productName) {

        for (int i = 0; i < comparePage.getProducts().size(); i++) {
            if (comparePage.getProducts().get(i).getText().equals(productName)) {
                comparePage.getRemoveButtons().get(i).click();
                isComparePageEmpty();
                break;
            }
        }
    }

    private void clickOnProductComparisonButton() {
        successfulAddingToComparePageAlertPage.getProductComparisonButton().click();
    }

    private ComparePageBL isComparePageEmpty() {

        if (comparePage.getProducts().size() == 0) {
            emptyComparePage = new EmptyComparePage();
            emptyComparePage.getContinueButton().click();
        }
        return this;
    }
}
