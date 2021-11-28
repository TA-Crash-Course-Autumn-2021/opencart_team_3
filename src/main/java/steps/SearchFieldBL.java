package steps;

import pages.SearchField;
import steps.product_page_steps.ProductPageBL;

public class SearchFieldBL {

    private SearchField searchField;

    public SearchFieldBL() {
        searchField = new SearchField();
    }

    public SearchFieldBL findSearchRequest() {
        inputSearchRequest("mac");
        clickOnSearchButton();
        return this;
    }

    public ProductOnSearchPageBL getProductOnSearchPageBL() {return new ProductOnSearchPageBL();}


    private void inputSearchRequest(String request) {
        searchField.getSearchInput().clear();
        searchField.getSearchInput().sendKeys(request);
    }

    private void clickOnSearchButton() {
        searchField.getSearchButton().click();
    }
}