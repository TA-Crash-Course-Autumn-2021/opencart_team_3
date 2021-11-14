package steps;

import pages.SearchField;

public class SearchFieldBL {

    private SearchField searchField;

    public SearchFieldBL() {
        searchField = new SearchField();
    }

    public SearchFieldBL findSearchRequest() {
        inputSearchRequest("iMac");
        clickOnSearchButton();
        return this;
    }

    private void inputSearchRequest(String request) {
        searchField.getSearchInput().clear();
        searchField.getSearchInput().sendKeys(request);
    }

    private void clickOnSearchButton() {
        searchField.getSearchButton().click();
    }
}
