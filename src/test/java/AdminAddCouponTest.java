import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.adminUtils_steps.AdminCouponePageBL;
import steps.adminUtils_steps.AdminLoginPageBL;
import steps.adminUtils_steps.AdminMenuPanelBL;

import static enums.URLs.ADMIN_URL;

public class AdminAddCouponTest extends BaseTest {
//@BeforeTest
//public void loginAdmin() {
//    new Navigation().navigateToUrl(ADMIN_URL.getValue());
//        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
//        adminLoginPageBL.loginValidAdmin();
//        adminLoginPageBL.successfulLoginCheck();
//}


    @Severity(SeverityLevel.NORMAL)
    @Test
    public void addNewCouponTest() throws InterruptedException {
        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginValidAdmin();
        adminLoginPageBL.successfulLoginCheck();
        AdminMenuPanelBL adminMenuPanelBL = new AdminMenuPanelBL();
        adminMenuPanelBL
                .clickOnMarketingDropdown()
                .clickOnCouponsButton()
                .clickOnAddCouponsButton();
        AdminCouponePageBL adminCouponePageBL = new AdminCouponePageBL();
        adminCouponePageBL.fillCouponeDetails().clickOnSaveButton();
        adminCouponePageBL.successAddingCoupon();
    }
}