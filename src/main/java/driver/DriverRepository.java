package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverRepository {

    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();
    private static WebDriver driver;

    private DriverRepository(){

    }

    public static void downloadWebDriver(){
        WebDriverManager.chromedriver().setup();
    }

    public static void instanceWebBrowser(){
        driver = new ChromeDriver();
        DRIVERS.set(driver);
    }

    public static void closeWebBrowser(){
        driver.quit();
    }

}
