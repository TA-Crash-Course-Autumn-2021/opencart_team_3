package steps;

public class MainPageBL {
    public HeaderPageUnloginedBL getHeaderPageUnloginedBL() {
        return new HeaderPageUnloginedBL();
    }
    public HeaderPageLoginedBL getHeaderPageLoginedBL() {
        return new HeaderPageLoginedBL();
    }

    public SearchFieldBL getSearchField() {
        return new SearchFieldBL();
    }

    public ComparePageBL getComparePageBL() {
        return new ComparePageBL();
    }
}
