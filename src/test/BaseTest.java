import driver.DriverRepository;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void downloadDriver(){
        DriverRepository.downloadWebDriver();
    }
    @BeforeMethod
    public void instanceWebBrowser(){
        DriverRepository.instanceWebBrowser();
    }

    @AfterMethod
    public  void close(){
        DriverRepository.closeWebBrowser();
    }

}
