package navigation;

import driver.DriverRepository;
import enums.URLs;
import org.openqa.selenium.WebDriver;

public class NavigationPO {

    private WebDriver driver;

    public NavigationPO(){
        driver = DriverRepository.DRIVERS.get();
    }

    public void navigateByUrl(URLs url){
        driver.get(url.getValue());
        driver.manage().window().maximize();
    }

}
