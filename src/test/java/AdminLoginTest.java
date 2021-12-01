import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import navigation.Navigation;
import org.testng.annotations.Test;

import steps.adminUtils_steps.AdminLoginPageBL;

import static enums.URLs.ADMIN_URL;

public class AdminLoginTest extends BaseTest {
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void loginAdminWithValidAdminTest() throws InterruptedException {
        new Navigation().navigateToUrl(ADMIN_URL.getValue());
        AdminLoginPageBL adminLoginPageBL = new AdminLoginPageBL();
        adminLoginPageBL.loginValidAdmin();
        adminLoginPageBL.successfulLoginCheck();
    }


}