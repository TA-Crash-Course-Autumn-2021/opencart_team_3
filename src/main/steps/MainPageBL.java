package steps;

import pages.ComparePage;

public class MainPageBL {

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

    public SearchFieldBL getSearchFieldBL() {
        return new SearchFieldBL();
    }

    public ComparePageBL getComparePageBL() {
        return new ComparePageBL();
    }
}
